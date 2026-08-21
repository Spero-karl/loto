package lnb.predict.earn.domain.service;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes8.dex */
public final class AdvancedAnalysisService_Factory implements Factory<AdvancedAnalysisService> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AdvancedAnalysisService get() {
        return newInstance();
    }

    public static AdvancedAnalysisService_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AdvancedAnalysisService newInstance() {
        return new AdvancedAnalysisService();
    }

    private static final class InstanceHolder {
        static final AdvancedAnalysisService_Factory INSTANCE = new AdvancedAnalysisService_Factory();

        private InstanceHolder() {
        }
    }
}
