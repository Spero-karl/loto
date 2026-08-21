package lnb.predict.earn.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class NetworkModule_ProvideGsonFactory implements Factory<Gson> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Gson get() {
        return provideGson();
    }

    public static NetworkModule_ProvideGsonFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Gson provideGson() {
        return (Gson) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideGson());
    }

    private static final class InstanceHolder {
        static final NetworkModule_ProvideGsonFactory INSTANCE = new NetworkModule_ProvideGsonFactory();

        private InstanceHolder() {
        }
    }
}
