package lnb.predict.earn;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.work.Configuration;
import dagger.hilt.android.HiltAndroidApp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoApp.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llnb/predict/earn/LotoApp;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "<init>", "()V", "workerFactory", "Landroidx/hilt/work/HiltWorkerFactory;", "getWorkerFactory", "()Landroidx/hilt/work/HiltWorkerFactory;", "setWorkerFactory", "(Landroidx/hilt/work/HiltWorkerFactory;)V", "workManagerConfiguration", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@HiltAndroidApp
public final class LotoApp extends Hilt_LotoApp implements Configuration.Provider {
    public static final int $stable = 8;

    @Inject
    public HiltWorkerFactory workerFactory;

    public final HiltWorkerFactory getWorkerFactory() {
        HiltWorkerFactory hiltWorkerFactory = this.workerFactory;
        if (hiltWorkerFactory != null) {
            return hiltWorkerFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("workerFactory");
        return null;
    }

    public final void setWorkerFactory(HiltWorkerFactory hiltWorkerFactory) {
        Intrinsics.checkNotNullParameter(hiltWorkerFactory, "<set-?>");
        this.workerFactory = hiltWorkerFactory;
    }

    @Override // androidx.work.Configuration.Provider
    public Configuration getWorkManagerConfiguration() {
        return new Configuration.Builder().setWorkerFactory(getWorkerFactory()).build();
    }
}
