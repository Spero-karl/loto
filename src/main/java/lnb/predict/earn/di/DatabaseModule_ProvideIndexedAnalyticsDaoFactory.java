package lnb.predict.earn.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import lnb.predict.earn.data.local.AppDatabase;
import lnb.predict.earn.data.local.IndexedAnalyticsDao;

/* JADX INFO: loaded from: classes6.dex */
public final class DatabaseModule_ProvideIndexedAnalyticsDaoFactory implements Factory<IndexedAnalyticsDao> {
    private final Provider<AppDatabase> databaseProvider;

    private DatabaseModule_ProvideIndexedAnalyticsDaoFactory(Provider<AppDatabase> databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public IndexedAnalyticsDao get() {
        return provideIndexedAnalyticsDao(this.databaseProvider.get());
    }

    public static DatabaseModule_ProvideIndexedAnalyticsDaoFactory create(Provider<AppDatabase> databaseProvider) {
        return new DatabaseModule_ProvideIndexedAnalyticsDaoFactory(databaseProvider);
    }

    public static IndexedAnalyticsDao provideIndexedAnalyticsDao(AppDatabase database) {
        return (IndexedAnalyticsDao) Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideIndexedAnalyticsDao(database));
    }
}
