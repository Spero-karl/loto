package lnb.predict.earn.data.local;

import android.database.Cursor;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: StatisticsDao_Impl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Llnb/predict/earn/data/local/StatisticsDao_Impl;", "Llnb/predict/earn/data/local/StatisticsDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertionAdapterOfStatisticsEntity", "Landroidx/room/EntityInsertionAdapter;", "Llnb/predict/earn/data/local/StatisticsEntity;", "insertStats", "", "stats", "(Llnb/predict/earn/data/local/StatisticsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGlobalStats", "Lkotlinx/coroutines/flow/Flow;", "Companion", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class StatisticsDao_Impl implements StatisticsDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<StatisticsEntity> __insertionAdapterOfStatisticsEntity;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public StatisticsDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertionAdapterOfStatisticsEntity = new EntityInsertionAdapter<StatisticsEntity>(__db) { // from class: lnb.predict.earn.data.local.StatisticsDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `statistics` (`id`,`jsonContent`,`lastUpdated`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, StatisticsEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindString(1, entity.getId());
                statement.bindString(2, entity.getJsonContent());
                statement.bindLong(3, entity.getLastUpdated());
            }
        };
    }

    @Override // lnb.predict.earn.data.local.StatisticsDao
    public Object insertStats(final StatisticsEntity stats, Continuation<? super Long> continuation) {
        return CoroutinesRoom.INSTANCE.execute(this.__db, true, new Callable<Long>() { // from class: lnb.predict.earn.data.local.StatisticsDao_Impl.insertStats.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                StatisticsDao_Impl.this.__db.beginTransaction();
                try {
                    long _result = StatisticsDao_Impl.this.__insertionAdapterOfStatisticsEntity.insertAndReturnId(stats);
                    StatisticsDao_Impl.this.__db.setTransactionSuccessful();
                    return Long.valueOf(_result);
                } finally {
                    StatisticsDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // lnb.predict.earn.data.local.StatisticsDao
    public Flow<StatisticsEntity> getGlobalStats() {
        final RoomSQLiteQuery _statement = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM statistics WHERE id = 'global_stats'", 0);
        return CoroutinesRoom.INSTANCE.createFlow(this.__db, false, new String[]{"statistics"}, new Callable<StatisticsEntity>() { // from class: lnb.predict.earn.data.local.StatisticsDao_Impl.getGlobalStats.1
            @Override // java.util.concurrent.Callable
            public StatisticsEntity call() {
                StatisticsEntity _result;
                Cursor _cursor = DBUtil.query(StatisticsDao_Impl.this.__db, _statement, false, null);
                try {
                    int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
                    int _cursorIndexOfJsonContent = CursorUtil.getColumnIndexOrThrow(_cursor, "jsonContent");
                    int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
                    if (_cursor.moveToFirst()) {
                        String _tmpId = _cursor.getString(_cursorIndexOfId);
                        Intrinsics.checkNotNullExpressionValue(_tmpId, "getString(...)");
                        String _tmpJsonContent = _cursor.getString(_cursorIndexOfJsonContent);
                        Intrinsics.checkNotNullExpressionValue(_tmpJsonContent, "getString(...)");
                        long _tmpLastUpdated = _cursor.getLong(_cursorIndexOfLastUpdated);
                        _result = new StatisticsEntity(_tmpId, _tmpJsonContent, _tmpLastUpdated);
                    } else {
                        _result = null;
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

    /* JADX INFO: compiled from: StatisticsDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Llnb/predict/earn/data/local/StatisticsDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Ljava/lang/Class;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
