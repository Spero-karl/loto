package lnb.predict.earn.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes13.dex */
public final class AnalysisViewModel_HiltModules {
    private AnalysisViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(AnalysisViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(AnalysisViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(AnalysisViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
