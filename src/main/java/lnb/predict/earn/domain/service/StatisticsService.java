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
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import lnb.predict.earn.domain.model.Draw;
import lnb.predict.earn.domain.model.GlobalStatistics;
import lnb.predict.earn.domain.model.NumberStats;

/* JADX INFO: compiled from: StatisticsService.kt */
/* JADX INFO: loaded from: classes8.dex */
@Singleton
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Llnb/predict/earn/domain/service/StatisticsService;", "", "<init>", "()V", "calculate", "Llnb/predict/earn/domain/model/GlobalStatistics;", "allDraws", "", "Llnb/predict/earn/domain/model/Draw;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class StatisticsService {
    public static final int $stable = 0;

    @Inject
    public StatisticsService() {
    }

    public final GlobalStatistics calculate(List<Draw> allDraws) {
        List list;
        int i;
        Object arrayList;
        Intrinsics.checkNotNullParameter(allDraws, "allDraws");
        if (allDraws.isEmpty()) {
            return new GlobalStatistics(0, CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), MapsKt.emptyMap());
        }
        List sortedDraws = CollectionsKt.sortedWith(allDraws, new Comparator() { // from class: lnb.predict.earn.domain.service.StatisticsService$calculate$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((Draw) t2).getDate(), ((Draw) t).getDate());
            }
        });
        LocalDate latestDate = ((Draw) CollectionsKt.first(sortedDraws)).getDate();
        LocalDate thirtyDaysAgo = latestDate.minusDays(30L);
        Map numberToDates = new LinkedHashMap();
        Map numberToHotCount = new LinkedHashMap();
        for (Draw draw : allDraws) {
            boolean z = !draw.getDate().isBefore(thirtyDaysAgo);
            Iterator it = draw.getNumbers().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                Integer numValueOf = Integer.valueOf(iIntValue);
                Object obj = numberToDates.get(numValueOf);
                if (obj == null) {
                    arrayList = new ArrayList();
                    numberToDates.put(numValueOf, arrayList);
                } else {
                    arrayList = obj;
                }
                ((List) arrayList).add(draw.getDate());
                if (z) {
                    Integer numValueOf2 = Integer.valueOf(iIntValue);
                    Integer num = (Integer) numberToHotCount.get(Integer.valueOf(iIntValue));
                    numberToHotCount.put(numValueOf2, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
                sortedDraws = sortedDraws;
            }
        }
        List sortedDraws2 = sortedDraws;
        Map map = numberToDates;
        int i2 = 0;
        Collection arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            List list2 = (List) entry.getValue();
            Map map2 = map;
            List listSortedWith = CollectionsKt.sortedWith(list2, new Comparator() { // from class: lnb.predict.earn.domain.service.StatisticsService$calculate$lambda$6$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((LocalDate) t2, (LocalDate) t);
                }
            });
            int i3 = 0;
            Iterator it2 = sortedDraws2.iterator();
            while (true) {
                list = listSortedWith;
                if (it2.hasNext()) {
                    i = i2;
                    if (((Draw) it2.next()).getNumbers().contains(Integer.valueOf(iIntValue2))) {
                        break;
                    }
                    i3++;
                    listSortedWith = list;
                    i2 = i;
                } else {
                    i = i2;
                    i3 = -1;
                    break;
                }
            }
            int i4 = i3;
            int size = i4 != -1 ? i4 : allDraws.size();
            int size2 = list2.size();
            List listTake = CollectionsKt.take(list, 20);
            Integer num2 = (Integer) numberToHotCount.get(Integer.valueOf(iIntValue2));
            int iIntValue3 = num2 != null ? num2.intValue() : 0;
            Integer num3 = (Integer) numberToHotCount.get(Integer.valueOf(iIntValue2));
            arrayList2.add(new NumberStats(iIntValue2, size2, size, listTake, iIntValue3, num3 != null ? num3.intValue() : 0));
            map = map2;
            i2 = i;
        }
        Iterable iterable = (List) arrayList2;
        Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (Object obj2 : iterable) {
            linkedHashMap.put(Integer.valueOf(((NumberStats) obj2).getNumber()), obj2);
        }
        Iterable statsList = CollectionsKt.toList(linkedHashMap.values());
        return new GlobalStatistics(allDraws.size(), CollectionsKt.sortedWith(statsList, new Comparator() { // from class: lnb.predict.earn.domain.service.StatisticsService$calculate$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((NumberStats) t2).getFrequency()), Integer.valueOf(((NumberStats) t).getFrequency()));
            }
        }), CollectionsKt.sortedWith(statsList, new Comparator() { // from class: lnb.predict.earn.domain.service.StatisticsService$calculate$$inlined$sortedByDescending$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((NumberStats) t2).getDelay()), Integer.valueOf(((NumberStats) t).getDelay()));
            }
        }), CollectionsKt.sortedWith(statsList, new Comparator() { // from class: lnb.predict.earn.domain.service.StatisticsService$calculate$$inlined$sortedByDescending$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((NumberStats) t2).getHotScore()), Integer.valueOf(((NumberStats) t).getHotScore()));
            }
        }), CollectionsKt.sortedWith(statsList, new Comparator() { // from class: lnb.predict.earn.domain.service.StatisticsService$calculate$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((NumberStats) t).getHotScore()), Integer.valueOf(((NumberStats) t2).getHotScore()));
            }
        }), linkedHashMap);
    }
}
