package lnb.predict.earn.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import lnb.predict.earn.data.remote.LotoApiService;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes6.dex */
public final class NetworkModule_ProvideLotoApiServiceFactory implements Factory<LotoApiService> {
    private final Provider<Gson> gsonProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;

    private NetworkModule_ProvideLotoApiServiceFactory(Provider<OkHttpClient> okHttpClientProvider, Provider<Gson> gsonProvider) {
        this.okHttpClientProvider = okHttpClientProvider;
        this.gsonProvider = gsonProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LotoApiService get() {
        return provideLotoApiService(this.okHttpClientProvider.get(), this.gsonProvider.get());
    }

    public static NetworkModule_ProvideLotoApiServiceFactory create(Provider<OkHttpClient> okHttpClientProvider, Provider<Gson> gsonProvider) {
        return new NetworkModule_ProvideLotoApiServiceFactory(okHttpClientProvider, gsonProvider);
    }

    public static LotoApiService provideLotoApiService(OkHttpClient okHttpClient, Gson gson) {
        return (LotoApiService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideLotoApiService(okHttpClient, gson));
    }
}
