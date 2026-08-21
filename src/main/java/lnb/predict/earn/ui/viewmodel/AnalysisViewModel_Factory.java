package lnb.predict.earn.ui.viewmodel;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Provider;
import lnb.predict.earn.data.repository.AnalysisRepository;
import lnb.predict.earn.data.repository.IndexedAnalyticsRepository;
import lnb.predict.earn.data.repository.LotoRepository;
import lnb.predict.earn.domain.service.AdvancedAnalysisService;

/* JADX INFO: loaded from: classes13.dex */
public final class AnalysisViewModel_Factory implements Factory<AnalysisViewModel> {
    private final Provider<AnalysisRepository> analysisRepositoryProvider;
    private final Provider<AdvancedAnalysisService> analysisServiceProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<IndexedAnalyticsRepository> indexedRepositoryProvider;
    private final Provider<LotoRepository> repositoryProvider;

    private AnalysisViewModel_Factory(Provider<LotoRepository> repositoryProvider, Provider<AnalysisRepository> analysisRepositoryProvider, Provider<IndexedAnalyticsRepository> indexedRepositoryProvider, Provider<AdvancedAnalysisService> analysisServiceProvider, Provider<Gson> gsonProvider) {
        this.repositoryProvider = repositoryProvider;
        this.analysisRepositoryProvider = analysisRepositoryProvider;
        this.indexedRepositoryProvider = indexedRepositoryProvider;
        this.analysisServiceProvider = analysisServiceProvider;
        this.gsonProvider = gsonProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AnalysisViewModel get() {
        return newInstance(this.repositoryProvider.get(), this.analysisRepositoryProvider.get(), this.indexedRepositoryProvider.get(), this.analysisServiceProvider.get(), this.gsonProvider.get());
    }

    public static AnalysisViewModel_Factory create(Provider<LotoRepository> repositoryProvider, Provider<AnalysisRepository> analysisRepositoryProvider, Provider<IndexedAnalyticsRepository> indexedRepositoryProvider, Provider<AdvancedAnalysisService> analysisServiceProvider, Provider<Gson> gsonProvider) {
        return new AnalysisViewModel_Factory(repositoryProvider, analysisRepositoryProvider, indexedRepositoryProvider, analysisServiceProvider, gsonProvider);
    }

    public static AnalysisViewModel newInstance(LotoRepository repository, AnalysisRepository analysisRepository, IndexedAnalyticsRepository indexedRepository, AdvancedAnalysisService analysisService, Gson gson) {
        return new AnalysisViewModel(repository, analysisRepository, indexedRepository, analysisService, gson);
    }
}
