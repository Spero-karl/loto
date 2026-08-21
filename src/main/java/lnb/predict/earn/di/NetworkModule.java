package lnb.predict.earn.di;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lnb.predict.earn.data.remote.LotoApiService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Llnb/predict/earn/di/NetworkModule;", "", "<init>", "()V", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideGson", "Lcom/google/gson/Gson;", "provideLotoApiService", "Llnb/predict/earn/data/remote/LotoApiService;", "okHttpClient", "gson", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class NetworkModule {
    public static final int $stable = 0;
    public static final NetworkModule INSTANCE = new NetworkModule();

    private NetworkModule() {
    }

    @Provides
    @Singleton
    public final OkHttpClient provideOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        return builder.addInterceptor(httpLoggingInterceptor).build();
    }

    @Provides
    @Singleton
    public final Gson provideGson() {
        return new Gson();
    }

    @Provides
    @Singleton
    public final LotoApiService provideLotoApiService(OkHttpClient okHttpClient, Gson gson) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Object objCreate = new Retrofit.Builder().baseUrl("https://www.lnbloto.bj/").client(okHttpClient).addConverterFactory(GsonConverterFactory.create(gson)).build().create(LotoApiService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (LotoApiService) objCreate;
    }
}
