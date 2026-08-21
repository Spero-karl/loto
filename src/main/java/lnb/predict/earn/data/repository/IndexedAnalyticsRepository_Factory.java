package lnb.predict.earn.data.repository;

import dagger.internal.Factory;
import dagger.internal.Provider;
import lnb.predict.earn.data.local.IndexedAnalyticsDao;

/* JADX INFO: loaded from: classes5.dex */
public final class IndexedAnalyticsRepository_Factory implements Factory<IndexedAnalyticsRepository> {
    private final Provider<IndexedAnalyticsDao> daoProvider;

    private IndexedAnalyticsRepository_Factory(Provider<IndexedAnalyticsDao> daoProvider) {
        this.daoProvider = daoProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public IndexedAnalyticsRepository get() {
        return newInstance(this.daoProvider.get());
    }

    public static IndexedAnalyticsRepository_Factory create(Provider<IndexedAnalyticsDao> daoProvider) {
        return new IndexedAnalyticsRepository_Factory(daoProvider);
    }

    public static IndexedAnalyticsRepository newInstance(IndexedAnalyticsDao dao) {
        return new IndexedAnalyticsRepository(dao);
    }
}
