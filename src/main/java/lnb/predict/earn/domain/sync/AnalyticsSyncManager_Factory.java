package lnb.predict.earn.domain.sync;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Provider;
import lnb.predict.earn.data.repository.IndexedAnalyticsRepository;
import lnb.predict.earn.data.repository.LotoRepository;
import lnb.predict.earn.domain.service.AdvancedAnalysisService;

/* JADX INFO: loaded from: classes8.dex */
public final class AnalyticsSyncManager_Factory implements Factory<AnalyticsSyncManager> {
    private final Provider<AdvancedAnalysisService> analysisServiceProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<IndexedAnalyticsRepository> indexedRepositoryProvider;
    private final Provider<LotoRepository> lotoRepositoryProvider;

    private AnalyticsSyncManager_Factory(Provider<LotoRepository> lotoRepositoryProvider, Provider<IndexedAnalyticsRepository> indexedRepositoryProvider, Provider<AdvancedAnalysisService> analysisServiceProvider, Provider<Gson> gsonProvider) {
        this.lotoRepositoryProvider = lotoRepositoryProvider;
        this.indexedRepositoryProvider = indexedRepositoryProvider;
        this.analysisServiceProvider = analysisServiceProvider;
        this.gsonProvider = gsonProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AnalyticsSyncManager get() {
        return newInstance(this.lotoRepositoryProvider.get(), this.indexedRepositoryProvider.get(), this.analysisServiceProvider.get(), this.gsonProvider.get());
    }

    public static AnalyticsSyncManager_Factory create(Provider<LotoRepository> lotoRepositoryProvider, Provider<IndexedAnalyticsRepository> indexedRepositoryProvider, Provider<AdvancedAnalysisService> analysisServiceProvider, Provider<Gson> gsonProvider) {
        return new AnalyticsSyncManager_Factory(lotoRepositoryProvider, indexedRepositoryProvider, analysisServiceProvider, gsonProvider);
    }

    public static AnalyticsSyncManager newInstance(LotoRepository lotoRepository, IndexedAnalyticsRepository indexedRepository, AdvancedAnalysisService analysisService, Gson gson) {
        return new AnalyticsSyncManager(lotoRepository, indexedRepository, analysisService, gson);
    }
}
