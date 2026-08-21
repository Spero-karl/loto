package lnb.predict.earn.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import lnb.predict.earn.data.local.AppDatabase;
import lnb.predict.earn.data.local.DrawDao;

/* JADX INFO: loaded from: classes6.dex */
public final class DatabaseModule_ProvideDrawDaoFactory implements Factory<DrawDao> {
    private final Provider<AppDatabase> databaseProvider;

    private DatabaseModule_ProvideDrawDaoFactory(Provider<AppDatabase> databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DrawDao get() {
        return provideDrawDao(this.databaseProvider.get());
    }

    public static DatabaseModule_ProvideDrawDaoFactory create(Provider<AppDatabase> databaseProvider) {
        return new DatabaseModule_ProvideDrawDaoFactory(databaseProvider);
    }

    public static DrawDao provideDrawDao(AppDatabase database) {
        return (DrawDao) Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDrawDao(database));
    }
}
