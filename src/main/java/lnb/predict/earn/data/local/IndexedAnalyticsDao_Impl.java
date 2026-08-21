package lnb.predict.earn.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
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

/* JADX INFO: compiled from: IndexedAnalyticsDao_Impl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0014J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0096@¢\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0096@¢\u0006\u0002\u0010\u0018J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0096@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020\"H\u0096@¢\u0006\u0002\u0010#J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0096@¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0096@¢\u0006\u0002\u0010%J\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010(\u001a\u00020)H\u0096@¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0002\u0010%J\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0\u0016H\u0096@¢\u0006\u0002\u0010\u0018J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0\u0016H\u0096@¢\u0006\u0002\u0010\u0018J*\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0\u00162\u0006\u0010(\u001a\u00020)H\u0096@¢\u0006\u0002\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Llnb/predict/earn/data/local/IndexedAnalyticsDao_Impl;", "Llnb/predict/earn/data/local/IndexedAnalyticsDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertionAdapterOfMonthlyAnalyticsEntity", "Landroidx/room/EntityInsertionAdapter;", "Llnb/predict/earn/data/local/MonthlyAnalyticsEntity;", "__insertionAdapterOfPairIndexEntity", "Llnb/predict/earn/data/local/PairIndexEntity;", "__insertionAdapterOfTripletIndexEntity", "Llnb/predict/earn/data/local/TripletIndexEntity;", "__insertionAdapterOfTransitionIndexEntity", "Llnb/predict/earn/data/local/TransitionIndexEntity;", "__insertionAdapterOfAnalyticsMetadataEntity", "Llnb/predict/earn/data/local/AnalyticsMetadataEntity;", "saveMonthlyAnalytics", "", "analytics", "(Llnb/predict/earn/data/local/MonthlyAnalyticsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePairs", "", "pairs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveTriplets", "triplets", "saveTransitions", "transitions", "saveMetadata", "metadata", "(Llnb/predict/earn/data/local/AnalyticsMetadataEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMonthlyAnalytics", "periodKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopPairs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopTriplets", "getTransitions", "type", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetadata", "getPairs", "keys", "getTriplets", "getTransitionsByKeys", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class IndexedAnalyticsDao_Impl implements IndexedAnalyticsDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<AnalyticsMetadataEntity> __insertionAdapterOfAnalyticsMetadataEntity;
    private final EntityInsertionAdapter<MonthlyAnalyticsEntity> __insertionAdapterOfMonthlyAnalyticsEntity;
    private final EntityInsertionAdapter<PairIndexEntity> __insertionAdapterOfPairIndexEntity;
    private final EntityInsertionAdapter<TransitionIndexEntity> __insertionAdapterOfTransitionIndexEntity;
    private final EntityInsertionAdapter<TripletIndexEntity> __insertionAdapterOfTripletIndexEntity;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public IndexedAnalyticsDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertionAdapterOfMonthlyAnalyticsEntity = new EntityInsertionAdapter<MonthlyAnalyticsEntity>(__db) { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `monthly_analytics` (`periodKey`,`jsonContent`,`lastDrawId`,`timestamp`) VALUES (?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, MonthlyAnalyticsEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindString(1, entity.getPeriodKey());
                statement.bindString(2, entity.getJsonContent());
                statement.bindString(3, entity.getLastDrawId());
                statement.bindLong(4, entity.getTimestamp());
            }
        };
        this.__insertionAdapterOfPairIndexEntity = new EntityInsertionAdapter<PairIndexEntity>(__db) { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `pair_index` (`pairKey`,`count`,`lastSeen`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, PairIndexEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindString(1, entity.getPairKey());
                statement.bindLong(2, entity.getCount());
                statement.bindString(3, entity.getLastSeen());
            }
        };
        this.__insertionAdapterOfTripletIndexEntity = new EntityInsertionAdapter<TripletIndexEntity>(__db) { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `triplet_index` (`tripletKey`,`count`,`lastSeen`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, TripletIndexEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindString(1, entity.getTripletKey());
                statement.bindLong(2, entity.getCount());
                statement.bindString(3, entity.getLastSeen());
            }
        };
        this.__insertionAdapterOfTransitionIndexEntity = new EntityInsertionAdapter<TransitionIndexEntity>(__db) { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `transition_index` (`transitionKey`,`count`,`tType`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, TransitionIndexEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindString(1, entity.getTransitionKey());
                statement.bindLong(2, entity.getCount());
                statement.bindLong(3, entity.getTType());
            }
        };
        this.__insertionAdapterOfAnalyticsMetadataEntity = new EntityInsertionAdapter<AnalyticsMetadataEntity>(__db) { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `analytics_metadata` (`id`,`lastProcessedDrawId`,`globalJsonContent`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, AnalyticsMetadataEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindString(1, entity.getId());
                String _tmpLastProcessedDrawId = entity.getLastProcessedDrawId();
                if (_tmpLastProcessedDrawId == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, _tmpLastProcessedDrawId);
                }
                String _tmpGlobalJsonContent = entity.getGlobalJsonContent();
                if (_tmpGlobalJsonContent == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, _tmpGlobalJsonContent);
                }
            }
        };
    }

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object saveMonthlyAnalytics(final MonthlyAnalyticsEntity analytics, Continuation<? super Long> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<Long>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.saveMonthlyAnalytics.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                IndexedAnalyticsDao_Impl.this.__db.beginTransaction();
                try {
                    long _result = IndexedAnalyticsDao_Impl.this.__insertionAdapterOfMonthlyAnalyticsEntity.insertAndReturnId(analytics);
                    IndexedAnalyticsDao_Impl.this.__db.setTransactionSuccessful();
                    return Long.valueOf(_result);
                } finally {
                    IndexedAnalyticsDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object savePairs(final List<PairIndexEntity> list, Continuation<? super List<Long>> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<List<? extends Long>>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.savePairs.2
            @Override // java.util.concurrent.Callable
            public List<? extends Long> call() {
                IndexedAnalyticsDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> listInsertAndReturnIdsList = IndexedAnalyticsDao_Impl.this.__insertionAdapterOfPairIndexEntity.insertAndReturnIdsList(list);
                    IndexedAnalyticsDao_Impl.this.__db.setTransactionSuccessful();
                    return listInsertAndReturnIdsList;
                } finally {
                    IndexedAnalyticsDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object saveTriplets(final List<TripletIndexEntity> list, Continuation<? super List<Long>> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<List<? extends Long>>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.saveTriplets.2
            @Override // java.util.concurrent.Callable
            public List<? extends Long> call() {
                IndexedAnalyticsDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> listInsertAndReturnIdsList = IndexedAnalyticsDao_Impl.this.__insertionAdapterOfTripletIndexEntity.insertAndReturnIdsList(list);
                    IndexedAnalyticsDao_Impl.this.__db.setTransactionSuccessful();
                    return listInsertAndReturnIdsList;
                } finally {
                    IndexedAnalyticsDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object saveTransitions(final List<TransitionIndexEntity> list, Continuation<? super List<Long>> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<List<? extends Long>>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.saveTransitions.2
            @Override // java.util.concurrent.Callable
            public List<? extends Long> call() {
                IndexedAnalyticsDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> listInsertAndReturnIdsList = IndexedAnalyticsDao_Impl.this.__insertionAdapterOfTransitionIndexEntity.insertAndReturnIdsList(list);
                    IndexedAnalyticsDao_Impl.this.__db.setTransactionSuccessful();
                    return listInsertAndReturnIdsList;
                } finally {
                    IndexedAnalyticsDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object saveMetadata(final AnalyticsMetadataEntity metadata, Continuation<? super Long> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<Long>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.saveMetadata.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                IndexedAnalyticsDao_Impl.this.__db.beginTransaction();
                try {
                    long _result = IndexedAnalyticsDao_Impl.this.__insertionAdapterOfAnalyticsMetadataEntity.insertAndReturnId(metadata);
                    IndexedAnalyticsDao_Impl.this.__db.setTransactionSuccessful();
                    return Long.valueOf(_result);
                } finally {
                    IndexedAnalyticsDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object getMonthlyAnalytics(String periodKey, Continuation<? super MonthlyAnalyticsEntity> continuation) {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM monthly_analytics WHERE periodKey = ?", 1);
        _statement.bindString(1, periodKey);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<MonthlyAnalyticsEntity>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.getMonthlyAnalytics.2
            @Override // java.util.concurrent.Callable
            public MonthlyAnalyticsEntity call() {
                MonthlyAnalyticsEntity _result;
                Cursor _cursor = DBUtil.query(IndexedAnalyticsDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfPeriodKey = CursorUtil.getColumnIndexOrThrow(_cursor, "periodKey");
                    int _cursorIndexOfJsonContent = CursorUtil.getColumnIndexOrThrow(_cursor, "jsonContent");
                    int _cursorIndexOfLastDrawId = CursorUtil.getColumnIndexOrThrow(_cursor, "lastDrawId");
                    int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
                    if (_cursor.moveToFirst()) {
                        String _tmpPeriodKey = _cursor.getString(_cursorIndexOfPeriodKey);
                        Intrinsics.checkNotNullExpressionValue(_tmpPeriodKey, "getString(...)");
                        String _tmpJsonContent = _cursor.getString(_cursorIndexOfJsonContent);
                        Intrinsics.checkNotNullExpressionValue(_tmpJsonContent, "getString(...)");
                        String _tmpLastDrawId = _cursor.getString(_cursorIndexOfLastDrawId);
                        Intrinsics.checkNotNullExpressionValue(_tmpLastDrawId, "getString(...)");
                        long _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
                        _result = new MonthlyAnalyticsEntity(_tmpPeriodKey, _tmpJsonContent, _tmpLastDrawId, _tmpTimestamp);
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

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object getTopPairs(Continuation<? super List<PairIndexEntity>> continuation) {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM pair_index ORDER BY count DESC LIMIT 200", 0);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<List<? extends PairIndexEntity>>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.getTopPairs.2
            @Override // java.util.concurrent.Callable
            public List<? extends PairIndexEntity> call() {
                Cursor _cursor = DBUtil.query(IndexedAnalyticsDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfPairKey = CursorUtil.getColumnIndexOrThrow(_cursor, "pairKey");
                    int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
                    int _cursorIndexOfLastSeen = CursorUtil.getColumnIndexOrThrow(_cursor, "lastSeen");
                    List _result = new ArrayList(_cursor.getCount());
                    while (_cursor.moveToNext()) {
                        String _tmpPairKey = _cursor.getString(_cursorIndexOfPairKey);
                        Intrinsics.checkNotNullExpressionValue(_tmpPairKey, "getString(...)");
                        int _tmpCount = _cursor.getInt(_cursorIndexOfCount);
                        String _tmpLastSeen = _cursor.getString(_cursorIndexOfLastSeen);
                        Intrinsics.checkNotNullExpressionValue(_tmpLastSeen, "getString(...)");
                        PairIndexEntity _item = new PairIndexEntity(_tmpPairKey, _tmpCount, _tmpLastSeen);
                        _result.add(_item);
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

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object getTopTriplets(Continuation<? super List<TripletIndexEntity>> continuation) {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM triplet_index ORDER BY count DESC LIMIT 100", 0);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<List<? extends TripletIndexEntity>>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.getTopTriplets.2
            @Override // java.util.concurrent.Callable
            public List<? extends TripletIndexEntity> call() {
                Cursor _cursor = DBUtil.query(IndexedAnalyticsDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfTripletKey = CursorUtil.getColumnIndexOrThrow(_cursor, "tripletKey");
                    int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
                    int _cursorIndexOfLastSeen = CursorUtil.getColumnIndexOrThrow(_cursor, "lastSeen");
                    List _result = new ArrayList(_cursor.getCount());
                    while (_cursor.moveToNext()) {
                        String _tmpTripletKey = _cursor.getString(_cursorIndexOfTripletKey);
                        Intrinsics.checkNotNullExpressionValue(_tmpTripletKey, "getString(...)");
                        int _tmpCount = _cursor.getInt(_cursorIndexOfCount);
                        String _tmpLastSeen = _cursor.getString(_cursorIndexOfLastSeen);
                        Intrinsics.checkNotNullExpressionValue(_tmpLastSeen, "getString(...)");
                        TripletIndexEntity _item = new TripletIndexEntity(_tmpTripletKey, _tmpCount, _tmpLastSeen);
                        _result.add(_item);
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

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object getTransitions(int type, Continuation<? super List<TransitionIndexEntity>> continuation) {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM transition_index WHERE tType = ?", 1);
        _statement.bindLong(1, type);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<List<? extends TransitionIndexEntity>>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.getTransitions.2
            @Override // java.util.concurrent.Callable
            public List<? extends TransitionIndexEntity> call() {
                Cursor _cursor = DBUtil.query(IndexedAnalyticsDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfTransitionKey = CursorUtil.getColumnIndexOrThrow(_cursor, "transitionKey");
                    int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
                    int _cursorIndexOfTType = CursorUtil.getColumnIndexOrThrow(_cursor, "tType");
                    List _result = new ArrayList(_cursor.getCount());
                    while (_cursor.moveToNext()) {
                        String _tmpTransitionKey = _cursor.getString(_cursorIndexOfTransitionKey);
                        Intrinsics.checkNotNullExpressionValue(_tmpTransitionKey, "getString(...)");
                        int _tmpCount = _cursor.getInt(_cursorIndexOfCount);
                        int _tmpTType = _cursor.getInt(_cursorIndexOfTType);
                        TransitionIndexEntity _item = new TransitionIndexEntity(_tmpTransitionKey, _tmpCount, _tmpTType);
                        _result.add(_item);
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

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object getMetadata(Continuation<? super AnalyticsMetadataEntity> continuation) {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM analytics_metadata WHERE id = 'singleton'", 0);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<AnalyticsMetadataEntity>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.getMetadata.2
            @Override // java.util.concurrent.Callable
            public AnalyticsMetadataEntity call() {
                AnalyticsMetadataEntity _result;
                String _tmpLastProcessedDrawId;
                String _tmpGlobalJsonContent;
                Cursor _cursor = DBUtil.query(IndexedAnalyticsDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
                    int _cursorIndexOfLastProcessedDrawId = CursorUtil.getColumnIndexOrThrow(_cursor, "lastProcessedDrawId");
                    int _cursorIndexOfGlobalJsonContent = CursorUtil.getColumnIndexOrThrow(_cursor, "globalJsonContent");
                    if (_cursor.moveToFirst()) {
                        String _tmpId = _cursor.getString(_cursorIndexOfId);
                        Intrinsics.checkNotNullExpressionValue(_tmpId, "getString(...)");
                        if (_cursor.isNull(_cursorIndexOfLastProcessedDrawId)) {
                            _tmpLastProcessedDrawId = null;
                        } else {
                            _tmpLastProcessedDrawId = _cursor.getString(_cursorIndexOfLastProcessedDrawId);
                        }
                        if (_cursor.isNull(_cursorIndexOfGlobalJsonContent)) {
                            _tmpGlobalJsonContent = null;
                        } else {
                            _tmpGlobalJsonContent = _cursor.getString(_cursorIndexOfGlobalJsonContent);
                        }
                        _result = new AnalyticsMetadataEntity(_tmpId, _tmpLastProcessedDrawId, _tmpGlobalJsonContent);
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

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object getPairs(List<String> list, Continuation<? super List<PairIndexEntity>> continuation) {
        StringBuilder _stringBuilder = StringUtil.newStringBuilder();
        _stringBuilder.append("SELECT * FROM pair_index WHERE pairKey IN (");
        int _inputSize = list.size();
        StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
        _stringBuilder.append(")");
        String _sql = _stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(_sql, "toString(...)");
        int _argCount = _inputSize + 0;
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire(_sql, _argCount);
        int _argIndex = 1;
        for (String _item : list) {
            _statement.bindString(_argIndex, _item);
            _argIndex++;
        }
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<List<? extends PairIndexEntity>>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.getPairs.2
            @Override // java.util.concurrent.Callable
            public List<? extends PairIndexEntity> call() {
                Cursor _cursor = DBUtil.query(IndexedAnalyticsDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfPairKey = CursorUtil.getColumnIndexOrThrow(_cursor, "pairKey");
                    int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
                    int _cursorIndexOfLastSeen = CursorUtil.getColumnIndexOrThrow(_cursor, "lastSeen");
                    List _result = new ArrayList(_cursor.getCount());
                    while (_cursor.moveToNext()) {
                        String _tmpPairKey = _cursor.getString(_cursorIndexOfPairKey);
                        Intrinsics.checkNotNullExpressionValue(_tmpPairKey, "getString(...)");
                        int _tmpCount = _cursor.getInt(_cursorIndexOfCount);
                        String _tmpLastSeen = _cursor.getString(_cursorIndexOfLastSeen);
                        Intrinsics.checkNotNullExpressionValue(_tmpLastSeen, "getString(...)");
                        PairIndexEntity _item_1 = new PairIndexEntity(_tmpPairKey, _tmpCount, _tmpLastSeen);
                        _result.add(_item_1);
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

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object getTriplets(List<String> list, Continuation<? super List<TripletIndexEntity>> continuation) {
        StringBuilder _stringBuilder = StringUtil.newStringBuilder();
        _stringBuilder.append("SELECT * FROM triplet_index WHERE tripletKey IN (");
        int _inputSize = list.size();
        StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
        _stringBuilder.append(")");
        String _sql = _stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(_sql, "toString(...)");
        int _argCount = _inputSize + 0;
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire(_sql, _argCount);
        int _argIndex = 1;
        for (String _item : list) {
            _statement.bindString(_argIndex, _item);
            _argIndex++;
        }
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<List<? extends TripletIndexEntity>>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.getTriplets.2
            @Override // java.util.concurrent.Callable
            public List<? extends TripletIndexEntity> call() {
                Cursor _cursor = DBUtil.query(IndexedAnalyticsDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfTripletKey = CursorUtil.getColumnIndexOrThrow(_cursor, "tripletKey");
                    int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
                    int _cursorIndexOfLastSeen = CursorUtil.getColumnIndexOrThrow(_cursor, "lastSeen");
                    List _result = new ArrayList(_cursor.getCount());
                    while (_cursor.moveToNext()) {
                        String _tmpTripletKey = _cursor.getString(_cursorIndexOfTripletKey);
                        Intrinsics.checkNotNullExpressionValue(_tmpTripletKey, "getString(...)");
                        int _tmpCount = _cursor.getInt(_cursorIndexOfCount);
                        String _tmpLastSeen = _cursor.getString(_cursorIndexOfLastSeen);
                        Intrinsics.checkNotNullExpressionValue(_tmpLastSeen, "getString(...)");
                        TripletIndexEntity _item_1 = new TripletIndexEntity(_tmpTripletKey, _tmpCount, _tmpLastSeen);
                        _result.add(_item_1);
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

    @Override // lnb.predict.earn.data.local.IndexedAnalyticsDao
    public Object getTransitionsByKeys(List<String> list, int type, Continuation<? super List<TransitionIndexEntity>> continuation) {
        StringBuilder _stringBuilder = StringUtil.newStringBuilder();
        _stringBuilder.append("SELECT * FROM transition_index WHERE transitionKey IN (");
        int _inputSize = list.size();
        StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
        _stringBuilder.append(") AND tType = ");
        _stringBuilder.append("?");
        String _sql = _stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(_sql, "toString(...)");
        int _argCount = _inputSize + 1;
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire(_sql, _argCount);
        int _argIndex = 1;
        for (String _item : list) {
            _statement.bindString(_argIndex, _item);
            _argIndex++;
        }
        int _argIndex2 = _inputSize + 1;
        _statement.bindLong(_argIndex2, type);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<List<? extends TransitionIndexEntity>>() { // from class: lnb.predict.earn.data.local.IndexedAnalyticsDao_Impl.getTransitionsByKeys.2
            @Override // java.util.concurrent.Callable
            public List<? extends TransitionIndexEntity> call() {
                Cursor _cursor = DBUtil.query(IndexedAnalyticsDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfTransitionKey = CursorUtil.getColumnIndexOrThrow(_cursor, "transitionKey");
                    int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
                    int _cursorIndexOfTType = CursorUtil.getColumnIndexOrThrow(_cursor, "tType");
                    List _result = new ArrayList(_cursor.getCount());
                    while (_cursor.moveToNext()) {
                        String _tmpTransitionKey = _cursor.getString(_cursorIndexOfTransitionKey);
                        Intrinsics.checkNotNullExpressionValue(_tmpTransitionKey, "getString(...)");
                        int _tmpCount = _cursor.getInt(_cursorIndexOfCount);
                        int _tmpTType = _cursor.getInt(_cursorIndexOfTType);
                        TransitionIndexEntity _item_1 = new TransitionIndexEntity(_tmpTransitionKey, _tmpCount, _tmpTType);
                        _result.add(_item_1);
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

    /* JADX INFO: compiled from: IndexedAnalyticsDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Llnb/predict/earn/data/local/IndexedAnalyticsDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Ljava/lang/Class;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
