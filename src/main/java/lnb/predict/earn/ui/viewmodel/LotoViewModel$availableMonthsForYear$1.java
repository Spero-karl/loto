package lnb.predict.earn.ui.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import lnb.predict.earn.domain.model.Draw;

/* JADX INFO: compiled from: LotoViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "", "list", "Llnb/predict/earn/domain/model/Draw;", "year"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.LotoViewModel$availableMonthsForYear$1", f = "LotoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class LotoViewModel$availableMonthsForYear$1 extends SuspendLambda implements Function3<List<? extends Draw>, Integer, Continuation<? super List<? extends Integer>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    LotoViewModel$availableMonthsForYear$1(Continuation<? super LotoViewModel$availableMonthsForYear$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Draw> list, Integer num, Continuation<? super List<? extends Integer>> continuation) {
        return invoke2((List<Draw>) list, num, (Continuation<? super List<Integer>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<Draw> list, Integer num, Continuation<? super List<Integer>> continuation) {
        LotoViewModel$availableMonthsForYear$1 lotoViewModel$availableMonthsForYear$1 = new LotoViewModel$availableMonthsForYear$1(continuation);
        lotoViewModel$availableMonthsForYear$1.L$0 = list;
        lotoViewModel$availableMonthsForYear$1.L$1 = num;
        return lotoViewModel$availableMonthsForYear$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Iterable list = (List) this.L$0;
        Integer year = (Integer) this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (year == null) {
                    return CollectionsKt.emptyList();
                }
                Collection arrayList = new ArrayList();
                for (Object obj : list) {
                    if (year != null && ((Draw) obj).getYear() == year.intValue()) {
                        arrayList.add(obj);
                    }
                }
                Iterable iterable = (List) arrayList;
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Boxing.boxInt(((Draw) it.next()).getMonth()));
                }
                return CollectionsKt.sorted(CollectionsKt.distinct((List) arrayList2));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
