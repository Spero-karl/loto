package lnb.predict.earn.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes6.dex */
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public OkHttpClient get() {
        return provideOkHttpClient();
    }

    public static NetworkModule_ProvideOkHttpClientFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OkHttpClient provideOkHttpClient() {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkHttpClient());
    }

    private static final class InstanceHolder {
        static final NetworkModule_ProvideOkHttpClientFactory INSTANCE = new NetworkModule_ProvideOkHttpClientFactory();

        private InstanceHolder() {
        }
    }
}
