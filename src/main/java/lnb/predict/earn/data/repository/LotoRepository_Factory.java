package lnb.predict.earn.data.repository;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Provider;
import lnb.predict.earn.data.local.DrawDao;
import lnb.predict.earn.data.local.StatisticsDao;
import lnb.predict.earn.data.remote.LotoApiService;

/* JADX INFO: loaded from: classes5.dex */
public final class LotoRepository_Factory implements Factory<LotoRepository> {
    private final Provider<LotoApiService> apiServiceProvider;
    private final Provider<DrawDao> drawDaoProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<StatisticsDao> statisticsDaoProvider;

    private LotoRepository_Factory(Provider<LotoApiService> apiServiceProvider, Provider<DrawDao> drawDaoProvider, Provider<StatisticsDao> statisticsDaoProvider, Provider<Gson> gsonProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.drawDaoProvider = drawDaoProvider;
        this.statisticsDaoProvider = statisticsDaoProvider;
        this.gsonProvider = gsonProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LotoRepository get() {
        return newInstance(this.apiServiceProvider.get(), this.drawDaoProvider.get(), this.statisticsDaoProvider.get(), this.gsonProvider.get());
    }

    public static LotoRepository_Factory create(Provider<LotoApiService> apiServiceProvider, Provider<DrawDao> drawDaoProvider, Provider<StatisticsDao> statisticsDaoProvider, Provider<Gson> gsonProvider) {
        return new LotoRepository_Factory(apiServiceProvider, drawDaoProvider, statisticsDaoProvider, gsonProvider);
    }

    public static LotoRepository newInstance(LotoApiService apiService, DrawDao drawDao, StatisticsDao statisticsDao, Gson gson) {
        return new LotoRepository(apiService, drawDao, statisticsDao, gson);
    }
}
