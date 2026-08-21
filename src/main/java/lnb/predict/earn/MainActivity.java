package lnb.predict.earn;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import lnb.predict.earn.worker.LotoUpdateWorker;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\t"}, d2 = {"Llnb/predict/earn/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupBackgroundWork", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class MainActivity extends Hilt_MainActivity {
    public static final int $stable = 8;

    @Override // lnb.predict.earn.Hilt_MainActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupBackgroundWork();
        ComponentActivityKt.setContent$default(this, null, ComposableSingletons$MainActivityKt.INSTANCE.m8640getLambda$200125977$app_debug(), 1, null);
    }

    private final void setupBackgroundWork() {
        PeriodicWorkRequest workRequest = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) LotoUpdateWorker.class, 15L, TimeUnit.MINUTES).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build();
        WorkManager.INSTANCE.getInstance(this).enqueueUniquePeriodicWork("LotoUpdateWork", ExistingPeriodicWorkPolicy.KEEP, workRequest);
    }
}
