package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.RoomDatabase;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppDatabase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Llnb/predict/earn/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "drawDao", "Llnb/predict/earn/data/local/DrawDao;", "statisticsDao", "Llnb/predict/earn/data/local/StatisticsDao;", "analysisDao", "Llnb/predict/earn/data/local/AnalysisDao;", "indexedAnalyticsDao", "Llnb/predict/earn/data/local/IndexedAnalyticsDao;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class AppDatabase extends RoomDatabase {
    public static final int $stable = 8;

    public abstract AnalysisDao analysisDao();

    public abstract DrawDao drawDao();

    public abstract IndexedAnalyticsDao indexedAnalyticsDao();

    public abstract StatisticsDao statisticsDao();
}
