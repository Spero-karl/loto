package lnb.predict.earn.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class SyncWorker_AssistedFactory_Impl implements SyncWorker_AssistedFactory {
    private final SyncWorker_Factory delegateFactory;

    SyncWorker_AssistedFactory_Impl(SyncWorker_Factory delegateFactory) {
        this.delegateFactory = delegateFactory;
    }

    @Override // androidx.hilt.work.WorkerAssistedFactory
    public SyncWorker create(Context p0, WorkerParameters p1) {
        return this.delegateFactory.get(p0, p1);
    }

    public static Provider<SyncWorker_AssistedFactory> create(SyncWorker_Factory delegateFactory) {
        return InstanceFactory.create(new SyncWorker_AssistedFactory_Impl(delegateFactory));
    }

    public static dagger.internal.Provider<SyncWorker_AssistedFactory> createFactoryProvider(SyncWorker_Factory delegateFactory) {
        return InstanceFactory.create(new SyncWorker_AssistedFactory_Impl(delegateFactory));
    }
}
