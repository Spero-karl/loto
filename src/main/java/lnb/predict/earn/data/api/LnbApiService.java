package lnb.predict.earn.data.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lnb.predict.earn.data.model.LotoResponse;
import retrofit2.http.GET;

/* JADX INFO: compiled from: LnbApiService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Llnb/predict/earn/data/api/LnbApiService;", "", "getResults", "Llnb/predict/earn/data/model/LotoResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface LnbApiService {
    @GET("api/results")
    Object getResults(Continuation<? super LotoResponse> continuation);
}
