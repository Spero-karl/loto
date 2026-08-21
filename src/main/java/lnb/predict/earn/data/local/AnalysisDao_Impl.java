package lnb.predict.earn.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: AnalysisDao_Impl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0012J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001d0\u001cH\u0016J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0096@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0002\u0010\u001fJ\u0010\u0010!\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Llnb/predict/earn/data/local/AnalysisDao_Impl;", "Llnb/predict/earn/data/local/AnalysisDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertionAdapterOfPredictionEntity", "Landroidx/room/EntityInsertionAdapter;", "Llnb/predict/earn/data/local/PredictionEntity;", "__insertionAdapterOfWeightEntity", "Llnb/predict/earn/data/local/WeightEntity;", "__insertionAdapterOfBacktestResultEntity", "Llnb/predict/earn/data/local/BacktestResultEntity;", "__updateAdapterOfPredictionEntity", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "insertPrediction", "", "prediction", "(Llnb/predict/earn/data/local/PredictionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveWeights", "weights", "(Llnb/predict/earn/data/local/WeightEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveBacktest", "result", "(Llnb/predict/earn/data/local/BacktestResultEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePrediction", "", "getAllPredictions", "Lkotlinx/coroutines/flow/Flow;", "", "getUnevaluatedPredictions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeights", "getLatestBacktest", "Companion", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AnalysisDao_Impl implements AnalysisDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<BacktestResultEntity> __insertionAdapterOfBacktestResultEntity;
    private final EntityInsertionAdapter<PredictionEntity> __insertionAdapterOfPredictionEntity;
    private final EntityInsertionAdapter<WeightEntity> __insertionAdapterOfWeightEntity;
    private final EntityDeletionOrUpdateAdapter<PredictionEntity> __updateAdapterOfPredictionEntity;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AnalysisDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertionAdapterOfPredictionEntity = new EntityInsertionAdapter<PredictionEntity>(__db) { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `predictions` (`id`,`timestamp`,`date`,`drawName`,`predictedNumbers`,`predictedScores`,`actualNumbers`,`matchCount`,`evaluated`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, PredictionEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getTimestamp());
                statement.bindString(3, entity.getDate());
                statement.bindString(4, entity.getDrawName());
                statement.bindString(5, entity.getPredictedNumbers());
                statement.bindString(6, entity.getPredictedScores());
                String actualNumbers = entity.getActualNumbers();
                if (actualNumbers == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, actualNumbers);
                }
                statement.bindLong(8, entity.getMatchCount());
                statement.bindLong(9, entity.getEvaluated() ? 1L : 0L);
            }
        };
        this.__insertionAdapterOfWeightEntity = new EntityInsertionAdapter<WeightEntity>(__db) { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `analysis_weights` (`id`,`freqWeight`,`delayWeight`,`transitionWeight`,`hourlyWeight`,`repetitionWeight`,`lastUpdate`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, WeightEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindString(1, entity.getId());
                statement.bindDouble(2, entity.getFreqWeight());
                statement.bindDouble(3, entity.getDelayWeight());
                statement.bindDouble(4, entity.getTransitionWeight());
                statement.bindDouble(5, entity.getHourlyWeight());
                statement.bindDouble(6, entity.getRepetitionWeight());
                statement.bindLong(7, entity.getLastUpdate());
            }
        };
        this.__insertionAdapterOfBacktestResultEntity = new EntityInsertionAdapter<BacktestResultEntity>(__db) { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `backtest_results` (`id`,`jsonContent`,`lastDrawId`,`timestamp`) VALUES (?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, BacktestResultEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindString(1, entity.getId());
                statement.bindString(2, entity.getJsonContent());
                statement.bindString(3, entity.getLastDrawId());
                statement.bindLong(4, entity.getTimestamp());
            }
        };
        this.__updateAdapterOfPredictionEntity = new EntityDeletionOrUpdateAdapter<PredictionEntity>(__db) { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.4
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR ABORT `predictions` SET `id` = ?,`timestamp` = ?,`date` = ?,`drawName` = ?,`predictedNumbers` = ?,`predictedScores` = ?,`actualNumbers` = ?,`matchCount` = ?,`evaluated` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement statement, PredictionEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getTimestamp());
                statement.bindString(3, entity.getDate());
                statement.bindString(4, entity.getDrawName());
                statement.bindString(5, entity.getPredictedNumbers());
                statement.bindString(6, entity.getPredictedScores());
                String actualNumbers = entity.getActualNumbers();
                if (actualNumbers == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, actualNumbers);
                }
                statement.bindLong(8, entity.getMatchCount());
                statement.bindLong(9, entity.getEvaluated() ? 1L : 0L);
                statement.bindLong(10, entity.getId());
            }
        };
    }

    @Override // lnb.predict.earn.data.local.AnalysisDao
    public Object insertPrediction(final PredictionEntity prediction, Continuation<? super Long> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<Long>() { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.insertPrediction.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                AnalysisDao_Impl.this.__db.beginTransaction();
                try {
                    long _result = AnalysisDao_Impl.this.__insertionAdapterOfPredictionEntity.insertAndReturnId(prediction);
                    AnalysisDao_Impl.this.__db.setTransactionSuccessful();
                    return Long.valueOf(_result);
                } finally {
                    AnalysisDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.AnalysisDao
    public Object saveWeights(final WeightEntity weights, Continuation<? super Long> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<Long>() { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.saveWeights.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                AnalysisDao_Impl.this.__db.beginTransaction();
                try {
                    long _result = AnalysisDao_Impl.this.__insertionAdapterOfWeightEntity.insertAndReturnId(weights);
                    AnalysisDao_Impl.this.__db.setTransactionSuccessful();
                    return Long.valueOf(_result);
                } finally {
                    AnalysisDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.AnalysisDao
    public Object saveBacktest(final BacktestResultEntity result, Continuation<? super Long> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<Long>() { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.saveBacktest.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                AnalysisDao_Impl.this.__db.beginTransaction();
                try {
                    long _result = AnalysisDao_Impl.this.__insertionAdapterOfBacktestResultEntity.insertAndReturnId(result);
                    AnalysisDao_Impl.this.__db.setTransactionSuccessful();
                    return Long.valueOf(_result);
                } finally {
                    AnalysisDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.AnalysisDao
    public Object updatePrediction(final PredictionEntity prediction, Continuation<? super Integer> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<Integer>() { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.updatePrediction.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() {
                AnalysisDao_Impl.this.__db.beginTransaction();
                try {
                    int _total = 0 + AnalysisDao_Impl.this.__updateAdapterOfPredictionEntity.handle(prediction);
                    AnalysisDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(_total);
                } finally {
                    AnalysisDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.AnalysisDao
    public Flow<List<PredictionEntity>> getAllPredictions() {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM predictions ORDER BY timestamp DESC", 0);
        return CoroutinesRoom.INSTANCE.createFlow(this.__db, false, new String[]{"predictions"}, new Callable<List<? extends PredictionEntity>>() { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.getAllPredictions.1
            @Override // java.util.concurrent.Callable
            public List<? extends PredictionEntity> call() {
                String _tmpActualNumbers;
                Cursor _cursor = DBUtil.query(AnalysisDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
                    int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
                    int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
                    int _cursorIndexOfDrawName = CursorUtil.getColumnIndexOrThrow(_cursor, "drawName");
                    int _cursorIndexOfPredictedNumbers = CursorUtil.getColumnIndexOrThrow(_cursor, "predictedNumbers");
                    int _cursorIndexOfPredictedScores = CursorUtil.getColumnIndexOrThrow(_cursor, "predictedScores");
                    int _cursorIndexOfActualNumbers = CursorUtil.getColumnIndexOrThrow(_cursor, "actualNumbers");
                    int _cursorIndexOfMatchCount = CursorUtil.getColumnIndexOrThrow(_cursor, "matchCount");
                    int _cursorIndexOfEvaluated = CursorUtil.getColumnIndexOrThrow(_cursor, "evaluated");
                    List _result = new ArrayList(_cursor.getCount());
                    while (_cursor.moveToNext()) {
                        long _tmpId = _cursor.getLong(_cursorIndexOfId);
                        long _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
                        String _tmpDate = _cursor.getString(_cursorIndexOfDate);
                        Intrinsics.checkNotNullExpressionValue(_tmpDate, "getString(...)");
                        String _tmpDrawName = _cursor.getString(_cursorIndexOfDrawName);
                        Intrinsics.checkNotNullExpressionValue(_tmpDrawName, "getString(...)");
                        String _tmpPredictedNumbers = _cursor.getString(_cursorIndexOfPredictedNumbers);
                        Intrinsics.checkNotNullExpressionValue(_tmpPredictedNumbers, "getString(...)");
                        String _tmpPredictedScores = _cursor.getString(_cursorIndexOfPredictedScores);
                        Intrinsics.checkNotNullExpressionValue(_tmpPredictedScores, "getString(...)");
                        if (_cursor.isNull(_cursorIndexOfActualNumbers)) {
                            _tmpActualNumbers = null;
                        } else {
                            String _tmpActualNumbers2 = _cursor.getString(_cursorIndexOfActualNumbers);
                            _tmpActualNumbers = _tmpActualNumbers2;
                        }
                        int _tmpMatchCount = _cursor.getInt(_cursorIndexOfMatchCount);
                        int _tmp = _cursor.getInt(_cursorIndexOfEvaluated);
                        boolean _tmpEvaluated = _tmp != 0;
                        PredictionEntity _item = new PredictionEntity(_tmpId, _tmpTimestamp, _tmpDate, _tmpDrawName, _tmpPredictedNumbers, _tmpPredictedScores, _tmpActualNumbers, _tmpMatchCount, _tmpEvaluated);
                        _result.add(_item);
                    }
                    return _result;
                } finally {
                    _cursor.close();
                }
            }

            protected final void finalize() {
                _statement.release();
            }
        });
    }

    @Override // lnb.predict.earn.data.local.AnalysisDao
    public Object getUnevaluatedPredictions(Continuation<? super List<PredictionEntity>> continuation) {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM predictions WHERE evaluated = 0", 0);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<List<? extends PredictionEntity>>() { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.getUnevaluatedPredictions.2
            @Override // java.util.concurrent.Callable
            public List<? extends PredictionEntity> call() {
                String _tmpActualNumbers;
                Cursor _cursor = DBUtil.query(AnalysisDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
                    int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
                    int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
                    int _cursorIndexOfDrawName = CursorUtil.getColumnIndexOrThrow(_cursor, "drawName");
                    int _cursorIndexOfPredictedNumbers = CursorUtil.getColumnIndexOrThrow(_cursor, "predictedNumbers");
                    int _cursorIndexOfPredictedScores = CursorUtil.getColumnIndexOrThrow(_cursor, "predictedScores");
                    int _cursorIndexOfActualNumbers = CursorUtil.getColumnIndexOrThrow(_cursor, "actualNumbers");
                    int _cursorIndexOfMatchCount = CursorUtil.getColumnIndexOrThrow(_cursor, "matchCount");
                    int _cursorIndexOfEvaluated = CursorUtil.getColumnIndexOrThrow(_cursor, "evaluated");
                    List _result = new ArrayList(_cursor.getCount());
                    while (_cursor.moveToNext()) {
                        long _tmpId = _cursor.getLong(_cursorIndexOfId);
                        long _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
                        String _tmpDate = _cursor.getString(_cursorIndexOfDate);
                        Intrinsics.checkNotNullExpressionValue(_tmpDate, "getString(...)");
                        String _tmpDrawName = _cursor.getString(_cursorIndexOfDrawName);
                        Intrinsics.checkNotNullExpressionValue(_tmpDrawName, "getString(...)");
                        String _tmpPredictedNumbers = _cursor.getString(_cursorIndexOfPredictedNumbers);
                        Intrinsics.checkNotNullExpressionValue(_tmpPredictedNumbers, "getString(...)");
                        String _tmpPredictedScores = _cursor.getString(_cursorIndexOfPredictedScores);
                        Intrinsics.checkNotNullExpressionValue(_tmpPredictedScores, "getString(...)");
                        if (_cursor.isNull(_cursorIndexOfActualNumbers)) {
                            _tmpActualNumbers = null;
                        } else {
                            String _tmpActualNumbers2 = _cursor.getString(_cursorIndexOfActualNumbers);
                            _tmpActualNumbers = _tmpActualNumbers2;
                        }
                        int _tmpMatchCount = _cursor.getInt(_cursorIndexOfMatchCount);
                        int _tmp = _cursor.getInt(_cursorIndexOfEvaluated);
                        boolean _tmpEvaluated = _tmp != 0;
                        PredictionEntity _item = new PredictionEntity(_tmpId, _tmpTimestamp, _tmpDate, _tmpDrawName, _tmpPredictedNumbers, _tmpPredictedScores, _tmpActualNumbers, _tmpMatchCount, _tmpEvaluated);
                        _result.add(_item);
                    }
                    return _result;
                } finally {
                    _cursor.close();
                    _statement.release();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.AnalysisDao
    public Object getWeights(Continuation<? super WeightEntity> continuation) {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM analysis_weights WHERE id = 'current_weights'", 0);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<WeightEntity>() { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.getWeights.2
            @Override // java.util.concurrent.Callable
            public WeightEntity call() {
                WeightEntity _result;
                Cursor _cursor = DBUtil.query(AnalysisDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
                    int _cursorIndexOfFreqWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "freqWeight");
                    int _cursorIndexOfDelayWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "delayWeight");
                    int _cursorIndexOfTransitionWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "transitionWeight");
                    int _cursorIndexOfHourlyWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "hourlyWeight");
                    int _cursorIndexOfRepetitionWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "repetitionWeight");
                    int _cursorIndexOfLastUpdate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdate");
                    if (_cursor.moveToFirst()) {
                        String _tmpId = _cursor.getString(_cursorIndexOfId);
                        Intrinsics.checkNotNullExpressionValue(_tmpId, "getString(...)");
                        float _tmpFreqWeight = _cursor.getFloat(_cursorIndexOfFreqWeight);
                        float _tmpDelayWeight = _cursor.getFloat(_cursorIndexOfDelayWeight);
                        float _tmpTransitionWeight = _cursor.getFloat(_cursorIndexOfTransitionWeight);
                        float _tmpHourlyWeight = _cursor.getFloat(_cursorIndexOfHourlyWeight);
                        float _tmpRepetitionWeight = _cursor.getFloat(_cursorIndexOfRepetitionWeight);
                        long _tmpLastUpdate = _cursor.getLong(_cursorIndexOfLastUpdate);
                        _result = new WeightEntity(_tmpId, _tmpFreqWeight, _tmpDelayWeight, _tmpTransitionWeight, _tmpHourlyWeight, _tmpRepetitionWeight, _tmpLastUpdate);
                    } else {
                        _result = null;
                    }
                    _cursor.close();
                    _statement.release();
                    return _result;
                } catch (Throwable th) {
                    _cursor.close();
                    _statement.release();
                    throw th;
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.AnalysisDao
    public Object getLatestBacktest(Continuation<? super BacktestResultEntity> continuation) {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM backtest_results WHERE id = 'latest'", 0);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<BacktestResultEntity>() { // from class: lnb.predict.earn.data.local.AnalysisDao_Impl.getLatestBacktest.2
            @Override // java.util.concurrent.Callable
            public BacktestResultEntity call() {
                BacktestResultEntity _result;
                Cursor _cursor = DBUtil.query(AnalysisDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
                    int _cursorIndexOfJsonContent = CursorUtil.getColumnIndexOrThrow(_cursor, "jsonContent");
                    int _cursorIndexOfLastDrawId = CursorUtil.getColumnIndexOrThrow(_cursor, "lastDrawId");
                    int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
                    if (_cursor.moveToFirst()) {
                        String _tmpId = _cursor.getString(_cursorIndexOfId);
                        Intrinsics.checkNotNullExpressionValue(_tmpId, "getString(...)");
                        String _tmpJsonContent = _cursor.getString(_cursorIndexOfJsonContent);
                        Intrinsics.checkNotNullExpressionValue(_tmpJsonContent, "getString(...)");
                        String _tmpLastDrawId = _cursor.getString(_cursorIndexOfLastDrawId);
                        Intrinsics.checkNotNullExpressionValue(_tmpLastDrawId, "getString(...)");
                        long _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
                        _result = new BacktestResultEntity(_tmpId, _tmpJsonContent, _tmpLastDrawId, _tmpTimestamp);
                    } else {
                        _result = null;
                    }
                    _cursor.close();
                    _statement.release();
                    return _result;
                } catch (Throwable th) {
                    _cursor.close();
                    _statement.release();
                    throw th;
                }
            }
        }, continuation);
    }

    /* JADX INFO: compiled from: AnalysisDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Llnb/predict/earn/data/local/AnalysisDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Ljava/lang/Class;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final List<Class<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }

    @JvmStatic
    public static final List<Class<?>> getRequiredConverters() {
        return INSTANCE.getRequiredConverters();
    }
}
