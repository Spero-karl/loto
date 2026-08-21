package lnb.predict.earn.data.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import lnb.predict.earn.data.api.LnbApiService;
import lnb.predict.earn.data.model.DailyResult;
import lnb.predict.earn.data.model.DrawDetail;
import lnb.predict.earn.data.model.FlatDraw;
import lnb.predict.earn.data.model.LotoResponse;
import lnb.predict.earn.data.model.WeeklyResult;

/* JADX INFO: compiled from: LnbRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Llnb/predict/earn/data/repository/LnbRepository;", "", "apiService", "Llnb/predict/earn/data/api/LnbApiService;", "<init>", "(Llnb/predict/earn/data/api/LnbApiService;)V", "getDraws", "", "Llnb/predict/earn/data/model/FlatDraw;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flattenResponse", "response", "Llnb/predict/earn/data/model/LotoResponse;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LnbRepository {
    public static final int $stable = 8;
    private final LnbApiService apiService;

    public LnbRepository(LnbApiService apiService) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.apiService = apiService;
    }

    /* JADX INFO: renamed from: lnb.predict.earn.data.repository.LnbRepository$getDraws$2, reason: invalid class name */
    /* JADX INFO: compiled from: LnbRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Llnb/predict/earn/data/model/FlatDraw;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.data.repository.LnbRepository$getDraws$2", f = "LnbRepository.kt", i = {}, l = {12}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends FlatDraw>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LnbRepository.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends FlatDraw>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<FlatDraw>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<FlatDraw>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object results;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    results = LnbRepository.this.apiService.getResults(this);
                    if (results == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    results = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LotoResponse response = (LotoResponse) results;
            return LnbRepository.this.flattenResponse(response);
        }
    }

    public final Object getDraws(Continuation<? super List<FlatDraw>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FlatDraw> flattenResponse(LotoResponse response) {
        List flattenedList = new ArrayList();
        Iterable drawsResultsWeekly = response.getDrawsResultsWeekly();
        int i = 0;
        Iterator it = drawsResultsWeekly.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            for (DailyResult dailyResult : ((WeeklyResult) next).getDrawResultsDaily()) {
                for (DrawDetail drawDetail : dailyResult.getDrawResults().getStandardDraws()) {
                    flattenedList.add(new FlatDraw(dailyResult.getDate(), drawDetail.getDrawName(), drawDetail.getWinningNumbers()));
                    drawsResultsWeekly = drawsResultsWeekly;
                    i = i;
                    it = it;
                    next = next;
                }
                Iterable iterable = drawsResultsWeekly;
                int i2 = i;
                Iterator it2 = it;
                Object obj = next;
                Iterable nightDraws = dailyResult.getDrawResults().getNightDraws();
                int i3 = 0;
                for (Iterator it3 = nightDraws.iterator(); it3.hasNext(); it3 = it3) {
                    DrawDetail drawDetail2 = (DrawDetail) it3.next();
                    flattenedList.add(new FlatDraw(dailyResult.getDate(), drawDetail2.getDrawName(), drawDetail2.getWinningNumbers()));
                    nightDraws = nightDraws;
                    i3 = i3;
                }
                drawsResultsWeekly = iterable;
                i = i2;
                it = it2;
                next = obj;
            }
        }
        return flattenedList;
    }
}
