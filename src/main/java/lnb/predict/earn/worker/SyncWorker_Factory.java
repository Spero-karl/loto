package lnb.predict.earn.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.Provider;
import lnb.predict.earn.domain.sync.SyncManager;

/* JADX INFO: loaded from: classes6.dex */
public final class SyncWorker_Factory {
    private final Provider<SyncManager> syncManagerProvider;

    private SyncWorker_Factory(Provider<SyncManager> syncManagerProvider) {
        this.syncManagerProvider = syncManagerProvider;
    }

    public SyncWorker get(Context context, WorkerParameters params) {
        return newInstance(context, params, this.syncManagerProvider.get());
    }

    public static SyncWorker_Factory create(Provider<SyncManager> syncManagerProvider) {
        return new SyncWorker_Factory(syncManagerProvider);
    }

    public static SyncWorker newInstance(Context context, WorkerParameters params, SyncManager syncManager) {
        return new SyncWorker(context, params, syncManager);
    }
}
