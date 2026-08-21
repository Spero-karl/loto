package lnb.predict.earn.domain.service;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes8.dex */
public final class StatisticsService_Factory implements Factory<StatisticsService> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public StatisticsService get() {
        return newInstance();
    }

    public static StatisticsService_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static StatisticsService newInstance() {
        return new StatisticsService();
    }

    private static final class InstanceHolder {
        static final StatisticsService_Factory INSTANCE = new StatisticsService_Factory();

        private InstanceHolder() {
        }
    }
}
