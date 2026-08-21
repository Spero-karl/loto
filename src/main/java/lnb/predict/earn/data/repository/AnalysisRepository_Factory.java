package lnb.predict.earn.data.repository;

import dagger.internal.Factory;
import dagger.internal.Provider;
import lnb.predict.earn.data.local.AnalysisDao;

/* JADX INFO: loaded from: classes5.dex */
public final class AnalysisRepository_Factory implements Factory<AnalysisRepository> {
    private final Provider<AnalysisDao> analysisDaoProvider;

    private AnalysisRepository_Factory(Provider<AnalysisDao> analysisDaoProvider) {
        this.analysisDaoProvider = analysisDaoProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AnalysisRepository get() {
        return newInstance(this.analysisDaoProvider.get());
    }

    public static AnalysisRepository_Factory create(Provider<AnalysisDao> analysisDaoProvider) {
        return new AnalysisRepository_Factory(analysisDaoProvider);
    }

    public static AnalysisRepository newInstance(AnalysisDao analysisDao) {
        return new AnalysisRepository(analysisDao);
    }
}
