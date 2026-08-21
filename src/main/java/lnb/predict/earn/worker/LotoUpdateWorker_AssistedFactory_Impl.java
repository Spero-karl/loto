package lnb.predict.earn.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class LotoUpdateWorker_AssistedFactory_Impl implements LotoUpdateWorker_AssistedFactory {
    private final LotoUpdateWorker_Factory delegateFactory;

    LotoUpdateWorker_AssistedFactory_Impl(LotoUpdateWorker_Factory delegateFactory) {
        this.delegateFactory = delegateFactory;
    }

    @Override // androidx.hilt.work.WorkerAssistedFactory
    public LotoUpdateWorker create(Context p0, WorkerParameters p1) {
        return this.delegateFactory.get(p0, p1);
    }

    public static Provider<LotoUpdateWorker_AssistedFactory> create(LotoUpdateWorker_Factory delegateFactory) {
        return InstanceFactory.create(new LotoUpdateWorker_AssistedFactory_Impl(delegateFactory));
    }

    public static dagger.internal.Provider<LotoUpdateWorker_AssistedFactory> createFactoryProvider(LotoUpdateWorker_Factory delegateFactory) {
        return InstanceFactory.create(new LotoUpdateWorker_AssistedFactory_Impl(delegateFactory));
    }
}
