package lnb.predict.earn.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import lnb.predict.earn.data.local.AnalysisDao;
import lnb.predict.earn.data.local.AppDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class DatabaseModule_ProvideAnalysisDaoFactory implements Factory<AnalysisDao> {
    private final Provider<AppDatabase> databaseProvider;

    private DatabaseModule_ProvideAnalysisDaoFactory(Provider<AppDatabase> databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AnalysisDao get() {
        return provideAnalysisDao(this.databaseProvider.get());
    }

    public static DatabaseModule_ProvideAnalysisDaoFactory create(Provider<AppDatabase> databaseProvider) {
        return new DatabaseModule_ProvideAnalysisDaoFactory(databaseProvider);
    }

    public static AnalysisDao provideAnalysisDao(AppDatabase database) {
        return (AnalysisDao) Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideAnalysisDao(database));
    }
}
