package lnb.predict.earn.di;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.Room;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lnb.predict.earn.data.local.AnalysisDao;
import lnb.predict.earn.data.local.AppDatabase;
import lnb.predict.earn.data.local.DrawDao;
import lnb.predict.earn.data.local.IndexedAnalyticsDao;
import lnb.predict.earn.data.local.StatisticsDao;

/* JADX INFO: compiled from: DatabaseModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u0011"}, d2 = {"Llnb/predict/earn/di/DatabaseModule;", "", "<init>", "()V", "provideDatabase", "Llnb/predict/earn/data/local/AppDatabase;", "context", "Landroid/content/Context;", "provideDrawDao", "Llnb/predict/earn/data/local/DrawDao;", "database", "provideStatisticsDao", "Llnb/predict/earn/data/local/StatisticsDao;", "provideAnalysisDao", "Llnb/predict/earn/data/local/AnalysisDao;", "provideIndexedAnalyticsDao", "Llnb/predict/earn/data/local/IndexedAnalyticsDao;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class DatabaseModule {
    public static final int $stable = 0;
    public static final DatabaseModule INSTANCE = new DatabaseModule();

    private DatabaseModule() {
    }

    @Provides
    @Singleton
    public final AppDatabase provideDatabase(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (AppDatabase) Room.databaseBuilder(context, AppDatabase.class, "loto_database").fallbackToDestructiveMigration().build();
    }

    @Provides
    public final DrawDao provideDrawDao(AppDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.drawDao();
    }

    @Provides
    public final StatisticsDao provideStatisticsDao(AppDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.statisticsDao();
    }

    @Provides
    public final AnalysisDao provideAnalysisDao(AppDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.analysisDao();
    }

    @Provides
    public final IndexedAnalyticsDao provideIndexedAnalyticsDao(AppDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.indexedAnalyticsDao();
    }
}
