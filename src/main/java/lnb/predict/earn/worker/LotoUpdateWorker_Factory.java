package lnb.predict.earn.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.Provider;
import lnb.predict.earn.data.repository.LotoRepository;

/* JADX INFO: loaded from: classes6.dex */
public final class LotoUpdateWorker_Factory {
    private final Provider<LotoRepository> repositoryProvider;

    private LotoUpdateWorker_Factory(Provider<LotoRepository> repositoryProvider) {
        this.repositoryProvider = repositoryProvider;
    }

    public LotoUpdateWorker get(Context context, WorkerParameters params) {
        return newInstance(context, params, this.repositoryProvider.get());
    }

    public static LotoUpdateWorker_Factory create(Provider<LotoRepository> repositoryProvider) {
        return new LotoUpdateWorker_Factory(repositoryProvider);
    }

    public static LotoUpdateWorker newInstance(Context context, WorkerParameters params, LotoRepository repository) {
        return new LotoUpdateWorker(context, params, repository);
    }
}
