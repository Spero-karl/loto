package lnb.predict.earn.ui.viewmodel;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes13.dex */
public final class LotoViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static LotoViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return LotoViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final LotoViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LotoViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
