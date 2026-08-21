package lnb.predict.earn.domain.sync;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Provider;
import lnb.predict.earn.data.local.StatisticsDao;
import lnb.predict.earn.data.repository.LotoRepository;
import lnb.predict.earn.domain.service.StatisticsService;

/* JADX INFO: loaded from: classes8.dex */
public final class SyncManager_Factory implements Factory<SyncManager> {
    private final Provider<AnalyticsSyncManager> analyticsSyncManagerProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<LotoRepository> repositoryProvider;
    private final Provider<StatisticsDao> statisticsDaoProvider;
    private final Provider<StatisticsService> statisticsServiceProvider;

    private SyncManager_Factory(Provider<LotoRepository> repositoryProvider, Provider<AnalyticsSyncManager> analyticsSyncManagerProvider, Provider<StatisticsService> statisticsServiceProvider, Provider<StatisticsDao> statisticsDaoProvider, Provider<Gson> gsonProvider) {
        this.repositoryProvider = repositoryProvider;
        this.analyticsSyncManagerProvider = analyticsSyncManagerProvider;
        this.statisticsServiceProvider = statisticsServiceProvider;
        this.statisticsDaoProvider = statisticsDaoProvider;
        this.gsonProvider = gsonProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public SyncManager get() {
        return newInstance(this.repositoryProvider.get(), this.analyticsSyncManagerProvider.get(), this.statisticsServiceProvider.get(), this.statisticsDaoProvider.get(), this.gsonProvider.get());
    }

    public static SyncManager_Factory create(Provider<LotoRepository> repositoryProvider, Provider<AnalyticsSyncManager> analyticsSyncManagerProvider, Provider<StatisticsService> statisticsServiceProvider, Provider<StatisticsDao> statisticsDaoProvider, Provider<Gson> gsonProvider) {
        return new SyncManager_Factory(repositoryProvider, analyticsSyncManagerProvider, statisticsServiceProvider, statisticsDaoProvider, gsonProvider);
    }

    public static SyncManager newInstance(LotoRepository repository, AnalyticsSyncManager analyticsSyncManager, StatisticsService statisticsService, StatisticsDao statisticsDao, Gson gson) {
        return new SyncManager(repository, analyticsSyncManager, statisticsService, statisticsDao, gson);
    }
}
