package lnb.predict.earn.ui.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lnb.predict.earn.domain.model.Draw;

/* JADX INFO: compiled from: LotoViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\n"}, d2 = {"<anonymous>", "", "Llnb/predict/earn/domain/model/Draw;", "list", "year", "", "month", "type", "", "query"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.LotoViewModel$filteredDraws$1", f = "LotoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class LotoViewModel$filteredDraws$1 extends SuspendLambda implements Function6<List<? extends Draw>, Integer, Integer, String, String, Continuation<? super List<? extends Draw>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;

    LotoViewModel$filteredDraws$1(Continuation<? super LotoViewModel$filteredDraws$1> continuation) {
        super(6, continuation);
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Draw> list, Integer num, Integer num2, String str, String str2, Continuation<? super List<? extends Draw>> continuation) {
        return invoke2((List<Draw>) list, num, num2, str, str2, (Continuation<? super List<Draw>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<Draw> list, Integer num, Integer num2, String str, String str2, Continuation<? super List<Draw>> continuation) {
        LotoViewModel$filteredDraws$1 lotoViewModel$filteredDraws$1 = new LotoViewModel$filteredDraws$1(continuation);
        lotoViewModel$filteredDraws$1.L$0 = list;
        lotoViewModel$filteredDraws$1.L$1 = num;
        lotoViewModel$filteredDraws$1.L$2 = num2;
        lotoViewModel$filteredDraws$1.L$3 = str;
        lotoViewModel$filteredDraws$1.L$4 = str2;
        return lotoViewModel$filteredDraws$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        List list;
        boolean z;
        boolean z2;
        List list2 = (List) this.L$0;
        Integer year = (Integer) this.L$1;
        Integer month = (Integer) this.L$2;
        String type = (String) this.L$3;
        String query = (String) this.L$4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (list2.isEmpty()) {
                    return CollectionsKt.emptyList();
                }
                Collection arrayList = new ArrayList();
                for (Object obj : list2) {
                    Draw draw = (Draw) obj;
                    if (year != null && draw.getYear() != year.intValue()) {
                        list = list2;
                    } else if (month != null && draw.getMonth() != month.intValue()) {
                        list = list2;
                    } else if (type == null || Intrinsics.areEqual(draw.getDrawType(), type)) {
                        if (StringsKt.isBlank(query)) {
                            list = list2;
                        } else {
                            list = list2;
                            if (!StringsKt.contains((CharSequence) draw.getDrawName(), (CharSequence) query, true)) {
                                Iterable numbers = draw.getNumbers();
                                int i = 0;
                                if ((numbers instanceof Collection) && ((Collection) numbers).isEmpty()) {
                                    z2 = false;
                                } else {
                                    Iterator it = numbers.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Iterable iterable = numbers;
                                            int i2 = i;
                                            if (Intrinsics.areEqual(String.valueOf(((Number) it.next()).intValue()), StringsKt.trim((CharSequence) query).toString())) {
                                                z2 = true;
                                            } else {
                                                numbers = iterable;
                                                i = i2;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                }
                                if (z2) {
                                }
                                if (z) {
                                    arrayList.add(obj);
                                }
                                list2 = list;
                            }
                        }
                        z = true;
                        if (z) {
                            arrayList.add(obj);
                        }
                        list2 = list;
                    } else {
                        list = list2;
                    }
                    z = false;
                    if (z) {
                        arrayList.add(obj);
                    }
                    list2 = list;
                }
                return CollectionsKt.sortedWith((List) arrayList, new Comparator() { // from class: lnb.predict.earn.ui.viewmodel.LotoViewModel$filteredDraws$1$invokeSuspend$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((Draw) t2).getDate(), ((Draw) t).getDate());
                    }
                });
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
