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

/* JADX INFO: compiled from: DrawDao_Impl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0096@¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Llnb/predict/earn/data/local/DrawDao_Impl;", "Llnb/predict/earn/data/local/DrawDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertionAdapterOfDrawEntity", "Landroidx/room/EntityInsertionAdapter;", "Llnb/predict/earn/data/local/DrawEntity;", "insertDraws", "", "", "draws", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDraws", "Lkotlinx/coroutines/flow/Flow;", "getDrawsCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exists", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DrawDao_Impl implements DrawDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<DrawEntity> __insertionAdapterOfDrawEntity;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DrawDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertionAdapterOfDrawEntity = new EntityInsertionAdapter<DrawEntity>(__db) { // from class: lnb.predict.earn.data.local.DrawDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `draws` (`id`,`date`,`year`,`month`,`day`,`drawName`,`drawType`,`numbers`) VALUES (?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, DrawEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindString(1, entity.getId());
                statement.bindString(2, entity.getDate());
                statement.bindLong(3, entity.getYear());
                statement.bindLong(4, entity.getMonth());
                statement.bindLong(5, entity.getDay());
                statement.bindString(6, entity.getDrawName());
                statement.bindString(7, entity.getDrawType());
                statement.bindString(8, entity.getNumbers());
            }
        };
    }

    @Override // lnb.predict.earn.data.local.DrawDao
    public Object insertDraws(final List<DrawEntity> list, Continuation<? super List<Long>> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<List<? extends Long>>() { // from class: lnb.predict.earn.data.local.DrawDao_Impl.insertDraws.2
            @Override // java.util.concurrent.Callable
            public List<? extends Long> call() {
                DrawDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> listInsertAndReturnIdsList = DrawDao_Impl.this.__insertionAdapterOfDrawEntity.insertAndReturnIdsList(list);
                    DrawDao_Impl.this.__db.setTransactionSuccessful();
                    return listInsertAndReturnIdsList;
                } finally {
                    DrawDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.DrawDao
    public Flow<List<DrawEntity>> getAllDraws() {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM draws ORDER BY date DESC, id DESC", 0);
        return CoroutinesRoom.INSTANCE.createFlow(this.__db, false, new String[]{"draws"}, new Callable<List<? extends DrawEntity>>() { // from class: lnb.predict.earn.data.local.DrawDao_Impl.getAllDraws.1
            @Override // java.util.concurrent.Callable
            public List<? extends DrawEntity> call() {
                Cursor _cursor = DBUtil.query(DrawDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
                    int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
                    int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
                    int _cursorIndexOfMonth = CursorUtil.getColumnIndexOrThrow(_cursor, "month");
                    int _cursorIndexOfDay = CursorUtil.getColumnIndexOrThrow(_cursor, "day");
                    int _cursorIndexOfDrawName = CursorUtil.getColumnIndexOrThrow(_cursor, "drawName");
                    int _cursorIndexOfDrawType = CursorUtil.getColumnIndexOrThrow(_cursor, "drawType");
                    int _cursorIndexOfNumbers = CursorUtil.getColumnIndexOrThrow(_cursor, "numbers");
                    List _result = new ArrayList(_cursor.getCount());
                    while (_cursor.moveToNext()) {
                        String _tmpId = _cursor.getString(_cursorIndexOfId);
                        Intrinsics.checkNotNullExpressionValue(_tmpId, "getString(...)");
                        String _tmpDate = _cursor.getString(_cursorIndexOfDate);
                        Intrinsics.checkNotNullExpressionValue(_tmpDate, "getString(...)");
                        int _tmpYear = _cursor.getInt(_cursorIndexOfYear);
                        int _tmpMonth = _cursor.getInt(_cursorIndexOfMonth);
                        int _tmpDay = _cursor.getInt(_cursorIndexOfDay);
                        String _tmpDrawName = _cursor.getString(_cursorIndexOfDrawName);
                        Intrinsics.checkNotNullExpressionValue(_tmpDrawName, "getString(...)");
                        String _tmpDrawType = _cursor.getString(_cursorIndexOfDrawType);
                        Intrinsics.checkNotNullExpressionValue(_tmpDrawType, "getString(...)");
                        String _tmpNumbers = _cursor.getString(_cursorIndexOfNumbers);
                        Intrinsics.checkNotNullExpressionValue(_tmpNumbers, "getString(...)");
                        DrawEntity _item = new DrawEntity(_tmpId, _tmpDate, _tmpYear, _tmpMonth, _tmpDay, _tmpDrawName, _tmpDrawType, _tmpNumbers);
                        _result.add(_item);
                    }
                    _cursor.close();
                    return _result;
                } catch (Throwable th) {
                    _cursor.close();
                    throw th;
                }
            }

            protected final void finalize() {
                _statement.release();
            }
        });
    }

    @Override // lnb.predict.earn.data.local.DrawDao
    public Object getDrawsCount(Continuation<? super Integer> continuation) {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT COUNT(*) FROM draws", 0);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<Integer>() { // from class: lnb.predict.earn.data.local.DrawDao_Impl.getDrawsCount.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() {
                int _result;
                Cursor _cursor = DBUtil.query(DrawDao_Impl.this.__db, _statement, false, null);
                try {
                    if (_cursor.moveToFirst()) {
                        _result = _cursor.getInt(0);
                    } else {
                        _result = 0;
                    }
                    return Integer.valueOf(_result);
                } finally {
                    _cursor.close();
                    _statement.release();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.DrawDao
    public Object exists(String id, Continuation<? super Boolean> continuation) {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT EXISTS(SELECT 1 FROM draws WHERE id = ?)", 1);
        _statement.bindString(1, id);
        CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
        return CoroutinesRoom.INSTANCE.execute(this.__db, false, _cancellationSignal, new Callable<Boolean>() { // from class: lnb.predict.earn.data.local.DrawDao_Impl.exists.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                boolean _result;
                Cursor _cursor = DBUtil.query(DrawDao_Impl.this.__db, _statement, false, null);
                try {
                    if (_cursor.moveToFirst()) {
                        int _tmp = _cursor.getInt(0);
                        _result = _tmp != 0;
                    } else {
                        _result = false;
                    }
                    return Boolean.valueOf(_result);
                } finally {
                    _cursor.close();
                    _statement.release();
                }
            }
        }, continuation);
    }

    /* JADX INFO: compiled from: DrawDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Llnb/predict/earn/data/local/DrawDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Ljava/lang/Class;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
