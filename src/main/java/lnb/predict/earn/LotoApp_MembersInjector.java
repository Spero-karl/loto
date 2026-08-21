package lnb.predict.earn;

import androidx.hilt.work.HiltWorkerFactory;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes13.dex */
public final class LotoApp_MembersInjector implements MembersInjector<LotoApp> {
    private final Provider<HiltWorkerFactory> workerFactoryProvider;

    private LotoApp_MembersInjector(Provider<HiltWorkerFactory> workerFactoryProvider) {
        this.workerFactoryProvider = workerFactoryProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LotoApp instance) {
        injectWorkerFactory(instance, this.workerFactoryProvider.get());
    }

    public static MembersInjector<LotoApp> create(Provider<HiltWorkerFactory> workerFactoryProvider) {
        return new LotoApp_MembersInjector(workerFactoryProvider);
    }

    public static void injectWorkerFactory(LotoApp instance, HiltWorkerFactory workerFactory) {
        instance.workerFactory = workerFactory;
    }
}
