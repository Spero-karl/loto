package lnb.predict.earn.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes13.dex */
public final class LotoViewModel_HiltModules {
    private LotoViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(LotoViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(LotoViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(LotoViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
