package lnb.predict.earn.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import lnb.predict.earn.data.local.AppDatabase;
import lnb.predict.earn.data.local.StatisticsDao;

/* JADX INFO: loaded from: classes6.dex */
public final class DatabaseModule_ProvideStatisticsDaoFactory implements Factory<StatisticsDao> {
    private final Provider<AppDatabase> databaseProvider;

    private DatabaseModule_ProvideStatisticsDaoFactory(Provider<AppDatabase> databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public StatisticsDao get() {
        return provideStatisticsDao(this.databaseProvider.get());
    }

    public static DatabaseModule_ProvideStatisticsDaoFactory create(Provider<AppDatabase> databaseProvider) {
        return new DatabaseModule_ProvideStatisticsDaoFactory(databaseProvider);
    }

    public static StatisticsDao provideStatisticsDao(AppDatabase database) {
        return (StatisticsDao) Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideStatisticsDao(database));
    }
}
