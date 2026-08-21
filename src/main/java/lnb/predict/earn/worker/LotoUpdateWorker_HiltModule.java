package lnb.predict.earn.worker;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

/* JADX INFO: loaded from: classes6.dex */
@Module
public interface LotoUpdateWorker_HiltModule {
    @Binds
    @StringKey("lnb.predict.earn.worker.LotoUpdateWorker")
    @IntoMap
    WorkerAssistedFactory<? extends ListenableWorker> bind(LotoUpdateWorker_AssistedFactory factory);
}
