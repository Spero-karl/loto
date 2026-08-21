package lnb.predict.earn.data.remote;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: compiled from: LotoApiService.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001a\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Llnb/predict/earn/data/remote/LotoApiService;", "", "getResults", "Llnb/predict/earn/data/remote/LotoResponse;", "monthYear", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface LotoApiService {
    public static final String BASE_URL = "https://www.lnbloto.bj/";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @GET("api/results")
    Object getResults(@Query("monthYear") String str, Continuation<? super LotoResponse> continuation);

    /* JADX INFO: compiled from: LotoApiService.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getResults$default(LotoApiService lotoApiService, String str, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getResults");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return lotoApiService.getResults(str, continuation);
    }

    /* JADX INFO: compiled from: LotoApiService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Llnb/predict/earn/data/remote/LotoApiService$Companion;", "", "<init>", "()V", "BASE_URL", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String BASE_URL = "https://www.lnbloto.bj/";

        private Companion() {
        }
    }
}
