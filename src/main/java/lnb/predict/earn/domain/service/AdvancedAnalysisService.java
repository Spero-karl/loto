package lnb.predict.earn.domain.service;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import lnb.predict.earn.data.local.PredictionEntity;
import lnb.predict.earn.data.local.WeightEntity;
import lnb.predict.earn.domain.model.AssociationStats;
import lnb.predict.earn.domain.model.BacktestReport;
import lnb.predict.earn.domain.model.BacktestStep;
import lnb.predict.earn.domain.model.Companion;
import lnb.predict.earn.domain.model.DelayStats;
import lnb.predict.earn.domain.model.Draw;
import lnb.predict.earn.domain.model.FrequencyStats;
import lnb.predict.earn.domain.model.GlobalAnalysis;
import lnb.predict.earn.domain.model.HourlyStats;
import lnb.predict.earn.domain.model.PairStats;
import lnb.predict.earn.domain.model.RepetitionStats;
import lnb.predict.earn.domain.model.Transition;
import lnb.predict.earn.domain.model.TransitionStats;
import lnb.predict.earn.domain.model.TripletStats;

/* JADX INFO: compiled from: AdvancedAnalysisService.kt */
/* JADX INFO: loaded from: classes8.dex */
@Singleton
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bJ\u001c\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0011\u001a\u00020\nJ\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0017¨\u0006\u0018"}, d2 = {"Llnb/predict/earn/domain/service/AdvancedAnalysisService;", "", "<init>", "()V", "performFullAnalysis", "Llnb/predict/earn/domain/model/GlobalAnalysis;", "draws", "", "Llnb/predict/earn/domain/model/Draw;", "weights", "Llnb/predict/earn/data/local/WeightEntity;", "evaluate", "Llnb/predict/earn/data/local/PredictionEntity;", "prediction", "actualDraw", "learn", "evaluatedPredictions", "currentWeights", "createEmptyAnalysis", "performBacktest", "Llnb/predict/earn/domain/model/BacktestReport;", "allDraws", "limit", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AdvancedAnalysisService {
    public static final int $stable = 0;

    @Inject
    public AdvancedAnalysisService() {
    }

    public static /* synthetic */ GlobalAnalysis performFullAnalysis$default(AdvancedAnalysisService advancedAnalysisService, List list, WeightEntity weightEntity, int i, Object obj) {
        if ((i & 2) != 0) {
            weightEntity = null;
        }
        return advancedAnalysisService.performFullAnalysis(list, weightEntity);
    }

    /* JADX WARN: Code duplicated, block: B:290:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:298:0x0acd A[PHI: r3 r7
  0x0acd: PHI (r3v58 int) = (r3v57 int), (r3v57 int), (r3v57 int), (r3v52 int), (r3v52 int), (r3v52 int) binds: [B:292:0x0a9d, B:294:0x0aaf, B:296:0x0ac5, B:282:0x0a59, B:284:0x0a6d, B:286:0x0a83] A[DONT_GENERATE, DONT_INLINE]
  0x0acd: PHI (r7v20 int) = (r7v18 int), (r7v18 int), (r7v18 int), (r7v21 int), (r7v21 int), (r7v21 int) binds: [B:292:0x0a9d, B:294:0x0aaf, B:296:0x0ac5, B:282:0x0a59, B:284:0x0a6d, B:286:0x0a83] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:389:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:87:0x01da  */
    public final GlobalAnalysis performFullAnalysis(List<Draw> draws, WeightEntity weights) {
        int i;
        double percentage;
        List<Transition> tPlus1;
        int i2;
        int num;
        List repetitions;
        int t1Hits;
        int t2Hits;
        Integer num2;
        int i3;
        int i4;
        Iterable iterable;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        boolean z3;
        LocalDate now;
        int i9;
        List<Draw> draws2 = draws;
        Intrinsics.checkNotNullParameter(draws2, "draws");
        if (draws2.isEmpty()) {
            return createEmptyAnalysis();
        }
        List sortedDraws = CollectionsKt.sortedWith(draws2, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performFullAnalysis$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((Draw) t).getDate(), ((Draw) t2).getDate());
            }
        });
        LocalDate now2 = LocalDate.now();
        Iterable intRange = new IntRange(1, 90);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            Iterable iterable2 = draws2;
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                i3 = 0;
            } else {
                int i10 = 0;
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    if (((Draw) it2.next()).getNumbers().contains(Integer.valueOf(iNextInt))) {
                        i10++;
                        if (i10 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                i3 = i10;
            }
            Iterable<Draw> iterable3 = draws2;
            if ((iterable3 instanceof Collection) && ((Collection) iterable3).isEmpty()) {
                iterable = intRange;
                i4 = 0;
            } else {
                i4 = 0;
                for (Draw draw : iterable3) {
                    if (draw.getNumbers().contains(Integer.valueOf(iNextInt))) {
                        intRange = intRange;
                        iterable3 = iterable3;
                        z = draw.getDate().isAfter(now2.minusDays(30L));
                        if (!z) {
                            i4++;
                            if (i4 < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    } else {
                        intRange = intRange;
                        iterable3 = iterable3;
                    }
                    if (!z) {
                        i4++;
                        if (i4 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                iterable = intRange;
            }
            List<Draw> list = draws;
            int i11 = 0;
            if ((list instanceof Collection) && list.isEmpty()) {
                i5 = 0;
            } else {
                int i12 = 0;
                for (Draw draw2 : list) {
                    list = list;
                    i11 = i11;
                    if (draw2.getNumbers().contains(Integer.valueOf(iNextInt))) {
                        i6 = i12;
                        z2 = draw2.getDate().isAfter(now2.minusDays(90L));
                        if (z2) {
                            i12 = i6 + 1;
                            if (i12 < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        } else {
                            i12 = i6;
                        }
                    } else {
                        i6 = i12;
                    }
                    if (z2) {
                        i12 = i6 + 1;
                        if (i12 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    } else {
                        i12 = i6;
                    }
                }
                i5 = i12;
            }
            List<Draw> list2 = draws;
            int i13 = 0;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i7 = 0;
            } else {
                int i14 = 0;
                for (Draw draw3 : list2) {
                    list2 = list2;
                    i13 = i13;
                    if (draw3.getNumbers().contains(Integer.valueOf(iNextInt))) {
                        i8 = i14;
                        z3 = draw3.getDate().isAfter(now2.minusDays(180L));
                        if (z3) {
                            i14 = i8 + 1;
                            if (i14 < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        } else {
                            i14 = i8;
                        }
                    } else {
                        i8 = i14;
                    }
                    if (z3) {
                        i14 = i8 + 1;
                        if (i14 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    } else {
                        i14 = i8;
                    }
                }
                i7 = i14;
            }
            List<Draw> list3 = draws;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                now = now2;
                i9 = 0;
            } else {
                int i15 = 0;
                for (Draw draw4 : list3) {
                    list3 = list3;
                    now2 = now2;
                    if (draw4.getNumbers().contains(Integer.valueOf(iNextInt)) && draw4.getYear() == now2.getYear()) {
                        i15++;
                        if (i15 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                now = now2;
                i9 = i15;
            }
            arrayList.add(new FrequencyStats(iNextInt, i3, i4, i5, i7, i9));
            draws2 = draws;
            intRange = iterable;
            now2 = now;
        }
        List frequencies = (List) arrayList;
        Iterable intRange2 = new IntRange(1, 90);
        int i16 = 0;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange2, 10));
        Iterable iterable4 = intRange2;
        Iterator<Integer> it3 = iterable4.iterator();
        while (it3.hasNext()) {
            int iNextInt2 = ((IntIterator) it3).nextInt();
            Iterable indices = CollectionsKt.getIndices(sortedDraws);
            Collection arrayList3 = new ArrayList();
            for (Integer num3 : indices) {
                Iterable iterable5 = intRange2;
                int i17 = i16;
                Iterable iterable6 = iterable4;
                if (((Draw) sortedDraws.get(num3.intValue())).getNumbers().contains(Integer.valueOf(iNextInt2))) {
                    arrayList3.add(num3);
                }
                intRange2 = iterable5;
                i16 = i17;
                iterable4 = iterable6;
            }
            Iterable iterable7 = intRange2;
            int i18 = i16;
            Iterable iterable8 = iterable4;
            List list4 = (List) arrayList3;
            int size = list4.isEmpty() ? draws.size() : (sortedDraws.size() - 1) - ((Number) CollectionsKt.last(list4)).intValue();
            List arrayList4 = new ArrayList();
            int size2 = list4.size();
            for (int i19 = 1; i19 < size2; i19++) {
                arrayList4.add(Integer.valueOf((((Number) list4.get(i19)).intValue() - ((Number) list4.get(i19 - 1)).intValue()) - 1));
            }
            arrayList2.add(new DelayStats(iNextInt2, size, arrayList4.isEmpty() ? size : CollectionsKt.averageOfInt(arrayList4), (arrayList4.isEmpty() || (num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList4)) == null) ? size : num2.intValue()));
            intRange2 = iterable7;
            i16 = i18;
            iterable4 = iterable8;
        }
        List delays = (List) arrayList2;
        List repetitions2 = new ArrayList();
        Map transitionsMap = new LinkedHashMap();
        int num4 = 1;
        while (true) {
            if (num4 >= 91) {
                break;
            }
            Iterable indices2 = CollectionsKt.getIndices(sortedDraws);
            Collection arrayList5 = new ArrayList();
            for (Integer num5 : indices2) {
                if (((Draw) sortedDraws.get(num5.intValue())).getNumbers().contains(Integer.valueOf(num4))) {
                    arrayList5.add(num5);
                }
            }
            List appIndices = (List) arrayList5;
            if (appIndices.isEmpty()) {
                int num6 = num4;
                repetitions2.add(new RepetitionStats(num6, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d));
                repetitions = repetitions2;
                num = num6;
            } else {
                int num7 = num4;
                int t1Hits2 = 0;
                int t2Hits2 = 0;
                int t3Hits = 0;
                int t4Hits = 0;
                int t5Hits = 0;
                Map t1Transitions = new LinkedHashMap();
                Map t2Transitions = new LinkedHashMap();
                Map t3Transitions = new LinkedHashMap();
                List list5 = appIndices;
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    int iIntValue = ((Number) it4.next()).intValue();
                    List appIndices2 = appIndices;
                    Iterable iterable9 = list5;
                    if (iIntValue + 1 < sortedDraws.size()) {
                        if (((Draw) sortedDraws.get(iIntValue + 1)).getNumbers().contains(Integer.valueOf(num7))) {
                            t1Hits2++;
                        }
                        Iterable numbers = ((Draw) sortedDraws.get(iIntValue + 1)).getNumbers();
                        Iterator it5 = numbers.iterator();
                        while (it5.hasNext()) {
                            int iIntValue2 = ((Number) it5.next()).intValue();
                            int t1Hits3 = t1Hits2;
                            Integer numValueOf = Integer.valueOf(iIntValue2);
                            Iterable iterable10 = numbers;
                            Integer num8 = (Integer) t1Transitions.get(Integer.valueOf(iIntValue2));
                            t1Transitions.put(numValueOf, Integer.valueOf((num8 != null ? num8.intValue() : 0) + 1));
                            t1Hits2 = t1Hits3;
                            numbers = iterable10;
                        }
                    }
                    if (iIntValue + 2 < sortedDraws.size()) {
                        if (((Draw) sortedDraws.get(iIntValue + 2)).getNumbers().contains(Integer.valueOf(num7))) {
                            t2Hits2++;
                        }
                        Iterator it6 = ((Draw) sortedDraws.get(iIntValue + 2)).getNumbers().iterator();
                        while (it6.hasNext()) {
                            int iIntValue3 = ((Number) it6.next()).intValue();
                            int t1Hits4 = t1Hits2;
                            Integer numValueOf2 = Integer.valueOf(iIntValue3);
                            int t2Hits3 = t2Hits2;
                            Integer num9 = (Integer) t2Transitions.get(Integer.valueOf(iIntValue3));
                            t2Transitions.put(numValueOf2, Integer.valueOf((num9 != null ? num9.intValue() : 0) + 1));
                            t1Hits2 = t1Hits4;
                            t2Hits2 = t2Hits3;
                        }
                        t1Hits = t1Hits2;
                    } else {
                        t1Hits = t1Hits2;
                    }
                    int t1Hits5 = iIntValue + 3;
                    if (t1Hits5 < sortedDraws.size()) {
                        if (((Draw) sortedDraws.get(iIntValue + 3)).getNumbers().contains(Integer.valueOf(num7))) {
                            t3Hits++;
                        }
                        Iterable numbers2 = ((Draw) sortedDraws.get(iIntValue + 3)).getNumbers();
                        Iterator it7 = numbers2.iterator();
                        while (it7.hasNext()) {
                            int iIntValue4 = ((Number) it7.next()).intValue();
                            Iterable iterable11 = numbers2;
                            Integer numValueOf3 = Integer.valueOf(iIntValue4);
                            int t2Hits4 = t2Hits2;
                            Integer num10 = (Integer) t3Transitions.get(Integer.valueOf(iIntValue4));
                            t3Transitions.put(numValueOf3, Integer.valueOf((num10 != null ? num10.intValue() : 0) + 1));
                            numbers2 = iterable11;
                            t2Hits2 = t2Hits4;
                        }
                        t2Hits = t2Hits2;
                    } else {
                        t2Hits = t2Hits2;
                    }
                    if (iIntValue + 4 < sortedDraws.size() && ((Draw) sortedDraws.get(iIntValue + 4)).getNumbers().contains(Integer.valueOf(num7))) {
                        t4Hits++;
                    }
                    if (iIntValue + 5 < sortedDraws.size() && ((Draw) sortedDraws.get(iIntValue + 5)).getNumbers().contains(Integer.valueOf(num7))) {
                        t5Hits++;
                    }
                    appIndices = appIndices2;
                    list5 = iterable9;
                    t1Hits2 = t1Hits;
                    t2Hits2 = t2Hits;
                }
                double count = appIndices.size();
                Map t1Transitions2 = t1Transitions;
                num = num7;
                repetitions2.add(new RepetitionStats(num7, (((double) t1Hits2) / count) * 100.0d, (((double) t2Hits2) / count) * 100.0d, (((double) t3Hits) / count) * 100.0d, (((double) t4Hits) / count) * 100.0d, (((double) t5Hits) / count) * 100.0d));
                Integer numValueOf4 = Integer.valueOf(num);
                int t2Hits5 = t1Transitions2.size();
                Collection arrayList6 = new ArrayList(t2Hits5);
                Map map = t1Transitions2;
                for (Map.Entry entry : map.entrySet()) {
                    arrayList6.add(new Transition(((Number) entry.getKey()).intValue(), (((Number) entry.getValue()).doubleValue() / count) * 100.0d));
                    map = map;
                    t3Transitions = t3Transitions;
                    t1Transitions2 = t1Transitions2;
                    count = count;
                }
                Map t3Transitions2 = t3Transitions;
                double count2 = count;
                List listTake = CollectionsKt.take(CollectionsKt.sortedWith((List) arrayList6, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performFullAnalysis$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Double.valueOf(((Transition) t2).getPercentage()), Double.valueOf(((Transition) t).getPercentage()));
                    }
                }), 10);
                Map map2 = t2Transitions;
                int i20 = 0;
                Collection arrayList7 = new ArrayList(map2.size());
                Map map3 = map2;
                int i21 = 0;
                for (Map.Entry entry2 : map3.entrySet()) {
                    arrayList7.add(new Transition(((Number) entry2.getKey()).intValue(), (((Number) entry2.getValue()).doubleValue() / count2) * 100.0d));
                    map2 = map2;
                    map3 = map3;
                    i20 = i20;
                    i21 = i21;
                }
                List listTake2 = CollectionsKt.take(CollectionsKt.sortedWith((List) arrayList7, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performFullAnalysis$$inlined$sortedByDescending$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Double.valueOf(((Transition) t2).getPercentage()), Double.valueOf(((Transition) t).getPercentage()));
                    }
                }), 10);
                Map map4 = t3Transitions2;
                Collection arrayList8 = new ArrayList(map4.size());
                for (Map.Entry entry3 : map4.entrySet()) {
                    int t3Hits2 = t3Hits;
                    int t3Hits3 = ((Number) entry3.getKey()).intValue();
                    arrayList8.add(new Transition(t3Hits3, (((Number) entry3.getValue()).doubleValue() / count2) * 100.0d));
                    map4 = map4;
                    repetitions2 = repetitions2;
                    t3Hits = t3Hits2;
                    t4Hits = t4Hits;
                }
                repetitions = repetitions2;
                transitionsMap.put(numValueOf4, new TransitionStats(num, listTake, listTake2, CollectionsKt.take(CollectionsKt.sortedWith((List) arrayList8, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performFullAnalysis$$inlined$sortedByDescending$3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Double.valueOf(((Transition) t2).getPercentage()), Double.valueOf(((Transition) t).getPercentage()));
                    }
                }), 10)));
            }
            num4 = num + 1;
            repetitions2 = repetitions;
        }
        List repetitions3 = repetitions2;
        Map associationsMap = new LinkedHashMap();
        int num11 = 1;
        for (i = 91; num11 < i; i = 91) {
            Map companions = new LinkedHashMap();
            List<Draw> list6 = draws;
            Collection arrayList9 = new ArrayList();
            for (Object obj : list6) {
                Iterable iterable12 = list6;
                if (((Draw) obj).getNumbers().contains(Integer.valueOf(num11))) {
                    arrayList9.add(obj);
                }
                list6 = iterable12;
            }
            List numDraws = (List) arrayList9;
            List list7 = numDraws;
            int i22 = 0;
            Iterator it8 = list7.iterator();
            while (it8.hasNext()) {
                Iterable numbers3 = ((Draw) it8.next()).getNumbers();
                List numDraws2 = numDraws;
                Collection arrayList10 = new ArrayList();
                for (Object obj2 : numbers3) {
                    Iterable iterable13 = list7;
                    int i23 = i22;
                    if ((((Number) obj2).intValue() != num11 ? 1 : 0) != 0) {
                        arrayList10.add(obj2);
                    }
                    list7 = iterable13;
                    i22 = i23;
                }
                Iterable iterable14 = list7;
                int i24 = i22;
                Iterable iterable15 = (List) arrayList10;
                int i25 = 0;
                Iterator it9 = iterable15.iterator();
                while (it9.hasNext()) {
                    int iIntValue5 = ((Number) it9.next()).intValue();
                    Iterable iterable16 = iterable15;
                    Integer numValueOf5 = Integer.valueOf(iIntValue5);
                    int i26 = i25;
                    Integer num12 = (Integer) companions.get(Integer.valueOf(iIntValue5));
                    companions.put(numValueOf5, Integer.valueOf((num12 != null ? num12.intValue() : 0) + 1));
                    iterable15 = iterable16;
                    i25 = i26;
                }
                numDraws = numDraws2;
                list7 = iterable14;
                i22 = i24;
            }
            double count3 = numDraws.size();
            Integer numValueOf6 = Integer.valueOf(num11);
            Map map5 = companions;
            int i27 = 0;
            Collection arrayList11 = new ArrayList(map5.size());
            for (Map.Entry entry4 : map5.entrySet()) {
                double count4 = count3;
                arrayList11.add(new Companion(((Number) entry4.getKey()).intValue(), ((Number) entry4.getValue()).intValue(), (((Number) entry4.getValue()).doubleValue() / count4) * 100.0d));
                companions = companions;
                map5 = map5;
                count3 = count4;
                i27 = i27;
            }
            associationsMap.put(numValueOf6, new AssociationStats(num11, CollectionsKt.take(CollectionsKt.sortedWith((List) arrayList11, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performFullAnalysis$$inlined$sortedByDescending$4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((Companion) t2).getCount()), Integer.valueOf(((Companion) t).getCount()));
                }
            }), 10)));
            num11++;
        }
        Iterable intRange3 = new IntRange(1, 90);
        int i28 = 0;
        Collection arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange3, 10));
        Iterable iterable17 = intRange3;
        int i29 = 0;
        Iterator<Integer> it10 = iterable17.iterator();
        while (it10.hasNext()) {
            int iNextInt3 = ((IntIterator) it10).nextInt();
            int i30 = 0;
            Iterable indices3 = CollectionsKt.getIndices(sortedDraws);
            Collection arrayList13 = new ArrayList();
            for (Integer num13 : indices3) {
                Iterable iterable18 = intRange3;
                int i31 = i28;
                Iterable iterable19 = iterable17;
                if (((Draw) sortedDraws.get(num13.intValue())).getNumbers().contains(Integer.valueOf(iNextInt3))) {
                    arrayList13.add(num13);
                }
                intRange3 = iterable18;
                i28 = i31;
                iterable17 = iterable19;
            }
            Iterable iterable20 = intRange3;
            int i32 = i28;
            Iterable iterable21 = iterable17;
            Iterable iterable22 = (List) arrayList13;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            Iterator it11 = iterable22.iterator();
            int i38 = 0;
            int i39 = i29;
            int i40 = 0;
            while (it11.hasNext()) {
                Map associationsMap2 = associationsMap;
                int iIntValue6 = ((Number) it11.next()).intValue();
                String drawName = ((Draw) sortedDraws.get(iIntValue6)).getDrawName();
                Iterator<Integer> it12 = it10;
                int i41 = iNextInt3;
                switch (drawName.hashCode()) {
                    case -1452316247:
                        i2 = i30;
                        if (drawName.equals("Fortune 11H")) {
                            i37++;
                            if (iIntValue6 + 1 < sortedDraws.size() && Intrinsics.areEqual(((Draw) sortedDraws.get(iIntValue6 + 1)).getDrawName(), "Fortune 14H") && ((Draw) sortedDraws.get(iIntValue6 + 1)).getNumbers().contains(Integer.valueOf(iNextInt3))) {
                                i33++;
                            }
                            if (iIntValue6 + 2 < sortedDraws.size() && Intrinsics.areEqual(((Draw) sortedDraws.get(iIntValue6 + 2)).getDrawName(), "Fortune 18H") && ((Draw) sortedDraws.get(iIntValue6 + 2)).getNumbers().contains(Integer.valueOf(iNextInt3))) {
                                i34++;
                            }
                        }
                        break;
                    case -1452316154:
                        if (drawName.equals("Fortune 14H")) {
                            i38++;
                            if (iIntValue6 + 1 < sortedDraws.size() && Intrinsics.areEqual(((Draw) sortedDraws.get(iIntValue6 + 1)).getDrawName(), "Fortune 18H") && ((Draw) sortedDraws.get(iIntValue6 + 1)).getNumbers().contains(Integer.valueOf(iNextInt3))) {
                                i35++;
                                i2 = i30;
                            } else {
                                i2 = i30;
                            }
                        } else {
                            i2 = i30;
                        }
                        break;
                    case -1452316030:
                        if (drawName.equals("Fortune 18H")) {
                            i40++;
                            if (iIntValue6 + 1 < sortedDraws.size() && Intrinsics.areEqual(((Draw) sortedDraws.get(iIntValue6 + 1)).getDrawName(), "Digital 21H") && ((Draw) sortedDraws.get(iIntValue6 + 1)).getNumbers().contains(Integer.valueOf(iNextInt3))) {
                                i36++;
                                i2 = i30;
                            } else {
                                i2 = i30;
                            }
                        } else {
                            i2 = i30;
                        }
                        break;
                    default:
                        i2 = i30;
                        break;
                }
                associationsMap = associationsMap2;
                it10 = it12;
                iNextInt3 = i41;
                i30 = i2;
            }
            Map associationsMap3 = associationsMap;
            Iterator<Integer> it13 = it10;
            arrayList12.add(new HourlyStats(iNextInt3, i37 > 0 ? (((double) i33) / ((double) i37)) * 100.0d : 0.0d, i37 > 0 ? (((double) i34) / ((double) i37)) * 100.0d : 0.0d, i38 > 0 ? (((double) i35) / ((double) i38)) * 100.0d : 0.0d, i40 > 0 ? (((double) i36) / ((double) i40)) * 100.0d : 0.0d));
            i29 = i39;
            intRange3 = iterable20;
            i28 = i32;
            iterable17 = iterable21;
            associationsMap = associationsMap3;
            it10 = it13;
        }
        Map associationsMap4 = associationsMap;
        List hourly = (List) arrayList12;
        Map pairsCount = new LinkedHashMap();
        Map tripletsCount = new LinkedHashMap();
        List<Draw> list8 = draws;
        int i42 = 0;
        Iterator it14 = list8.iterator();
        while (it14.hasNext()) {
            List listSorted = CollectionsKt.sorted(((Draw) it14.next()).getNumbers());
            int i43 = 0;
            int size3 = listSorted.size();
            while (i43 < size3) {
                List sortedDraws2 = sortedDraws;
                int size4 = listSorted.size();
                Iterable iterable23 = list8;
                int i44 = i43 + 1;
                while (i44 < size4) {
                    int i45 = size4;
                    int i46 = i42;
                    Iterator it15 = it14;
                    Pair pair = new Pair(listSorted.get(i43), listSorted.get(i44));
                    Integer num14 = (Integer) pairsCount.get(pair);
                    pairsCount.put(pair, Integer.valueOf((num14 != null ? num14.intValue() : 0) + 1));
                    int i47 = i44 + 1;
                    int size5 = listSorted.size();
                    while (i47 < size5) {
                        Pair pair2 = pair;
                        Map pairsCount2 = pairsCount;
                        int i48 = size5;
                        int i49 = i44;
                        Triple triple = new Triple(listSorted.get(i43), listSorted.get(i44), listSorted.get(i47));
                        Integer num15 = (Integer) tripletsCount.get(triple);
                        tripletsCount.put(triple, Integer.valueOf((num15 != null ? num15.intValue() : 0) + 1));
                        i47++;
                        pair = pair2;
                        pairsCount = pairsCount2;
                        size5 = i48;
                        i44 = i49;
                    }
                    i44++;
                    size4 = i45;
                    i42 = i46;
                    it14 = it15;
                }
                i43++;
                sortedDraws = sortedDraws2;
                list8 = iterable23;
            }
        }
        Map map6 = pairsCount;
        Collection arrayList14 = new ArrayList(map6.size());
        Map map7 = map6;
        int i50 = 0;
        for (Map.Entry entry5 : map7.entrySet()) {
            arrayList14.add(new PairStats(((Number) ((Pair) entry5.getKey()).getFirst()).intValue(), ((Number) ((Pair) entry5.getKey()).getSecond()).intValue(), ((Number) entry5.getValue()).intValue(), (((Number) entry5.getValue()).doubleValue() / ((double) draws.size())) * 100.0d));
            map6 = map6;
            map7 = map7;
            i50 = i50;
        }
        List pairs = CollectionsKt.take(CollectionsKt.sortedWith((List) arrayList14, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performFullAnalysis$$inlined$sortedByDescending$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((PairStats) t2).getCount()), Integer.valueOf(((PairStats) t).getCount()));
            }
        }), 100);
        Map map8 = tripletsCount;
        int i51 = 0;
        Collection arrayList15 = new ArrayList(map8.size());
        Map map9 = map8;
        int i52 = 0;
        for (Map.Entry entry6 : map9.entrySet()) {
            arrayList15.add(new TripletStats(((Number) ((Triple) entry6.getKey()).getFirst()).intValue(), ((Number) ((Triple) entry6.getKey()).getSecond()).intValue(), ((Number) ((Triple) entry6.getKey()).getThird()).intValue(), ((Number) entry6.getValue()).intValue()));
            map8 = map8;
            i51 = i51;
            map9 = map9;
            i52 = i52;
        }
        List triplets = CollectionsKt.take(CollectionsKt.sortedWith((List) arrayList15, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performFullAnalysis$$inlined$sortedByDescending$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((TripletStats) t2).getCount()), Integer.valueOf(((TripletStats) t).getCount()));
            }
        }), 50);
        WeightEntity w = weights == null ? new WeightEntity("default", 0.4f, 0.3f, 0.2f, 0.05f, 0.05f, 0L) : weights;
        Iterable intRange4 = new IntRange(1, 90);
        Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(intRange4, 10)), 16));
        for (Integer num16 : intRange4) {
            int iIntValue7 = num16.intValue();
            Iterable iterable24 = intRange4;
            List frequencies2 = frequencies;
            double last30 = ((double) (((FrequencyStats) frequencies.get(iIntValue7 - 1)).getLast30() * w.getFreqWeight())) * 10.0d;
            double current = ((double) (((DelayStats) delays.get(iIntValue7 - 1)).getCurrent() * w.getDelayWeight())) * 1.5d;
            List repetitions4 = repetitions3;
            double tPlus2 = ((RepetitionStats) repetitions4.get(iIntValue7 - 1)).getTPlus1() * ((double) w.getRepetitionWeight()) * 0.5d;
            double hourlyWeight = ((double) w.getHourlyWeight()) * (((HourlyStats) hourly.get(iIntValue7 - 1)).getFrom11To14() + ((HourlyStats) hourly.get(iIntValue7 - 1)).getFrom18To21());
            TransitionStats transitionStats = (TransitionStats) transitionsMap.get(Integer.valueOf(iIntValue7));
            if (transitionStats == null || (tPlus1 = transitionStats.getTPlus1()) == null) {
                percentage = 0.0d;
            } else {
                Iterator<T> it16 = tPlus1.iterator();
                percentage = 0.0d;
                while (it16.hasNext()) {
                    percentage += ((Transition) it16.next()).getPercentage();
                }
            }
            linkedHashMap.put(num16, Double.valueOf(((((last30 + current) + tPlus2) + hourlyWeight) + ((percentage * ((double) w.getTransitionWeight())) * 0.01d)) / 10.0d));
            intRange4 = iterable24;
            frequencies = frequencies2;
            repetitions3 = repetitions4;
        }
        return new GlobalAnalysis(CollectionsKt.sortedWith(frequencies, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performFullAnalysis$$inlined$sortedByDescending$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((FrequencyStats) t2).getTotal()), Integer.valueOf(((FrequencyStats) t).getTotal()));
            }
        }), CollectionsKt.sortedWith(delays, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performFullAnalysis$$inlined$sortedByDescending$8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((DelayStats) t2).getCurrent()), Integer.valueOf(((DelayStats) t).getCurrent()));
            }
        }), repetitions3, associationsMap4, transitionsMap, hourly, pairs, triplets, linkedHashMap, CollectionsKt.emptyList());
    }

    public final PredictionEntity evaluate(PredictionEntity prediction, Draw actualDraw) {
        Intrinsics.checkNotNullParameter(prediction, "prediction");
        Intrinsics.checkNotNullParameter(actualDraw, "actualDraw");
        Set actualNums = CollectionsKt.toSet(actualDraw.getNumbers());
        Iterable iterableSplit$default = StringsKt.split$default((CharSequence) prediction.getPredictedNumbers(), new String[]{","}, false, 0, 6, (Object) null);
        Collection arrayList = new ArrayList();
        Iterator it = iterableSplit$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        Set predNums = CollectionsKt.toSet((List) arrayList);
        Set matches = CollectionsKt.intersect(predNums, actualNums);
        return PredictionEntity.copy$default(prediction, 0L, 0L, null, null, null, null, CollectionsKt.joinToString$default(actualDraw.getNumbers(), ",", null, null, 0, null, null, 62, null), matches.size(), true, 63, null);
    }

    public final WeightEntity learn(List<PredictionEntity> evaluatedPredictions, WeightEntity currentWeights) {
        Intrinsics.checkNotNullParameter(evaluatedPredictions, "evaluatedPredictions");
        Intrinsics.checkNotNullParameter(currentWeights, "currentWeights");
        if (evaluatedPredictions.isEmpty()) {
            return currentWeights;
        }
        float deltaFreq = 0.0f;
        float deltaDelay = 0.0f;
        float deltaTrans = 0.0f;
        for (PredictionEntity predictionEntity : evaluatedPredictions) {
            float fCoerceAtLeast = RangesKt.coerceAtLeast(predictionEntity.getMatchCount() - 1, -1) * 0.01f;
            if (predictionEntity.getMatchCount() >= 2) {
                deltaFreq += 0.02f;
                deltaDelay += 0.01f;
                deltaTrans += 0.01f;
            } else if (predictionEntity.getMatchCount() == 0) {
                deltaFreq -= 0.01f;
                deltaDelay -= 0.01f;
            }
        }
        WeightEntity newWeights = WeightEntity.copy$default(currentWeights, null, RangesKt.coerceIn(currentWeights.getFreqWeight() + deltaFreq, 0.1f, 0.7f), RangesKt.coerceIn(currentWeights.getDelayWeight() + deltaDelay, 0.1f, 0.5f), RangesKt.coerceIn(currentWeights.getTransitionWeight() + deltaTrans, 0.05f, 0.4f), 0.0f, 0.0f, System.currentTimeMillis(), 49, null);
        float total = newWeights.getFreqWeight() + newWeights.getDelayWeight() + newWeights.getTransitionWeight() + newWeights.getHourlyWeight() + newWeights.getRepetitionWeight();
        return WeightEntity.copy$default(newWeights, null, newWeights.getFreqWeight() / total, newWeights.getDelayWeight() / total, newWeights.getTransitionWeight() / total, newWeights.getHourlyWeight() / total, newWeights.getRepetitionWeight() / total, 0L, 65, null);
    }

    private final GlobalAnalysis createEmptyAnalysis() {
        return new GlobalAnalysis(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), MapsKt.emptyMap(), MapsKt.emptyMap(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), MapsKt.emptyMap(), CollectionsKt.emptyList());
    }

    public static /* synthetic */ BacktestReport performBacktest$default(AdvancedAnalysisService advancedAnalysisService, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 50;
        }
        return advancedAnalysisService.performBacktest(list, i);
    }

    public final BacktestReport performBacktest(List<Draw> allDraws, int limit) {
        double dAverageOfInt;
        Intrinsics.checkNotNullParameter(allDraws, "allDraws");
        List sorted = CollectionsKt.sortedWith(allDraws, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performBacktest$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((Draw) t).getDate(), ((Draw) t2).getDate());
            }
        });
        if (sorted.size() < 20) {
            return new BacktestReport(0, 0.0d, 0, CollectionsKt.emptyList());
        }
        List<Draw> testDraws = CollectionsKt.takeLast(sorted, RangesKt.coerceAtMost(limit, sorted.size() - 10));
        List steps = new ArrayList();
        for (Draw draw : testDraws) {
            Collection arrayList = new ArrayList();
            Iterator it = sorted.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Draw draw2 = (Draw) next;
                if (!draw2.getDate().isBefore(draw.getDate()) && (!Intrinsics.areEqual(draw2.getDate(), draw.getDate()) || draw2.getId().compareTo(draw.getId()) >= 0)) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            GlobalAnalysis globalAnalysisPerformFullAnalysis$default = performFullAnalysis$default(this, list, null, 2, null);
            Iterable intRange = new IntRange(1, 90);
            List sorted2 = sorted;
            List testDraws2 = testDraws;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterable iterable = intRange;
            Iterator<Integer> it2 = iterable.iterator();
            while (it2.hasNext()) {
                int iNextInt = ((IntIterator) it2).nextInt();
                Iterable iterable2 = intRange;
                Integer numValueOf = Integer.valueOf(iNextInt);
                Iterable iterable3 = iterable;
                List list2 = list;
                Double d = globalAnalysisPerformFullAnalysis$default.getScores().get(Integer.valueOf(iNextInt));
                arrayList2.add(TuplesKt.to(numValueOf, Double.valueOf(d != null ? d.doubleValue() : 0.0d)));
                intRange = iterable2;
                iterable = iterable3;
                list = list2;
            }
            Iterable iterableTake = CollectionsKt.take(CollectionsKt.sortedWith((List) arrayList2, new Comparator() { // from class: lnb.predict.earn.domain.service.AdvancedAnalysisService$performBacktest$lambda$45$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Double) ((Pair) t2).getSecond(), (Double) ((Pair) t).getSecond());
                }
            }), 20);
            Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableTake, 10));
            Iterator it3 = iterableTake.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(((Number) ((Pair) it3.next()).getFirst()).intValue()));
            }
            List list3 = (List) arrayList3;
            int size = CollectionsKt.intersect(list3, CollectionsKt.toSet(draw.getNumbers())).size();
            String string = draw.getDate().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            steps.add(new BacktestStep(string, draw.getDrawName(), list3, draw.getNumbers(), size));
            sorted = sorted2;
            testDraws = testDraws2;
        }
        int size2 = steps.size();
        if (steps.isEmpty()) {
            dAverageOfInt = 0.0d;
        } else {
            List list4 = steps;
            Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Integer.valueOf(((BacktestStep) it4.next()).getHits()));
            }
            dAverageOfInt = CollectionsKt.averageOfInt((List) arrayList4);
        }
        List list5 = steps;
        Collection arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
        Iterator it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList5.add(Integer.valueOf(((BacktestStep) it5.next()).getHits()));
        }
        Integer num = (Integer) CollectionsKt.maxOrNull(arrayList5);
        return new BacktestReport(size2, dAverageOfInt, num != null ? num.intValue() : 0, CollectionsKt.reversed(steps));
    }
}
