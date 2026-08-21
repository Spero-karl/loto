package lnb.predict.earn;

import android.app.Application;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Hilt_LotoApp extends Application implements GeneratedComponentManagerHolder {
    private boolean injected = false;
    private final ApplicationComponentManager componentManager = new ApplicationComponentManager(new ComponentSupplier() { // from class: lnb.predict.earn.Hilt_LotoApp.1
        @Override // dagger.hilt.android.internal.managers.ComponentSupplier
        public Object get() {
            return DaggerLotoApp_HiltComponents_SingletonC.builder().applicationContextModule(new ApplicationContextModule(Hilt_LotoApp.this)).build();
        }
    });

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final ApplicationComponentManager componentManager() {
        return this.componentManager;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    protected void hiltInternalInject() {
        if (!this.injected) {
            this.injected = true;
            ((LotoApp_GeneratedInjector) generatedComponent()).injectLotoApp((LotoApp) UnsafeCasts.unsafeCast(this));
        }
    }
}
