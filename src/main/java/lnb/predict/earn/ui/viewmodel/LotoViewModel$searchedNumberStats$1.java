package lnb.predict.earn.ui.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import lnb.predict.earn.domain.model.GlobalStatistics;
import lnb.predict.earn.domain.model.NumberStats;

/* JADX INFO: compiled from: LotoViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Llnb/predict/earn/domain/model/NumberStats;", "", "stats", "Llnb/predict/earn/domain/model/GlobalStatistics;", "query", ""}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.LotoViewModel$searchedNumberStats$1", f = "LotoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class LotoViewModel$searchedNumberStats$1 extends SuspendLambda implements Function3<GlobalStatistics, String, Continuation<? super Pair<? extends NumberStats, ? extends Integer>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    LotoViewModel$searchedNumberStats$1(Continuation<? super LotoViewModel$searchedNumberStats$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(GlobalStatistics globalStatistics, String str, Continuation<? super Pair<? extends NumberStats, ? extends Integer>> continuation) {
        return invoke2(globalStatistics, str, (Continuation<? super Pair<NumberStats, Integer>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(GlobalStatistics globalStatistics, String str, Continuation<? super Pair<NumberStats, Integer>> continuation) {
        LotoViewModel$searchedNumberStats$1 lotoViewModel$searchedNumberStats$1 = new LotoViewModel$searchedNumberStats$1(continuation);
        lotoViewModel$searchedNumberStats$1.L$0 = globalStatistics;
        lotoViewModel$searchedNumberStats$1.L$1 = str;
        return lotoViewModel$searchedNumberStats$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        NumberStats numberStat;
        GlobalStatistics stats = (GlobalStatistics) this.L$0;
        String query = (String) this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Integer num = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) query).toString());
                if (stats == null || num == null || (numberStat = stats.getAllNumbers().get(num)) == null) {
                    return null;
                }
                int i = 0;
                Iterator<NumberStats> it = stats.getByFrequency().iterator();
                while (it.hasNext()) {
                    if (num != null && ((NumberStats) it.next()).getNumber() == num.intValue()) {
                        int rank = i + 1;
                        return new Pair(numberStat, Boxing.boxInt(rank));
                    }
                    i++;
                }
                i = -1;
                int rank2 = i + 1;
                return new Pair(numberStat, Boxing.boxInt(rank2));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
