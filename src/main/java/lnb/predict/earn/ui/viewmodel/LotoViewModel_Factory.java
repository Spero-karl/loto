package lnb.predict.earn.ui.viewmodel;

import dagger.internal.Factory;
import dagger.internal.Provider;
import lnb.predict.earn.data.repository.LotoRepository;
import lnb.predict.earn.domain.service.StatisticsService;
import lnb.predict.earn.domain.sync.SyncManager;

/* JADX INFO: loaded from: classes13.dex */
public final class LotoViewModel_Factory implements Factory<LotoViewModel> {
    private final Provider<LotoRepository> repositoryProvider;
    private final Provider<StatisticsService> statisticsServiceProvider;
    private final Provider<SyncManager> syncManagerProvider;

    private LotoViewModel_Factory(Provider<LotoRepository> repositoryProvider, Provider<SyncManager> syncManagerProvider, Provider<StatisticsService> statisticsServiceProvider) {
        this.repositoryProvider = repositoryProvider;
        this.syncManagerProvider = syncManagerProvider;
        this.statisticsServiceProvider = statisticsServiceProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LotoViewModel get() {
        return newInstance(this.repositoryProvider.get(), this.syncManagerProvider.get(), this.statisticsServiceProvider.get());
    }

    public static LotoViewModel_Factory create(Provider<LotoRepository> repositoryProvider, Provider<SyncManager> syncManagerProvider, Provider<StatisticsService> statisticsServiceProvider) {
        return new LotoViewModel_Factory(repositoryProvider, syncManagerProvider, statisticsServiceProvider);
    }

    public static LotoViewModel newInstance(LotoRepository repository, SyncManager syncManager, StatisticsService statisticsService) {
        return new LotoViewModel(repository, syncManager, statisticsService);
    }
}
