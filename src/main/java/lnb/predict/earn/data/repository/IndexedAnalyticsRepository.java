package lnb.predict.earn.data.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import lnb.predict.earn.data.local.AnalyticsMetadataEntity;
import lnb.predict.earn.data.local.IndexedAnalyticsDao;
import lnb.predict.earn.data.local.MonthlyAnalyticsEntity;
import lnb.predict.earn.data.local.PairIndexEntity;
import lnb.predict.earn.data.local.TransitionIndexEntity;
import lnb.predict.earn.data.local.TripletIndexEntity;

/* JADX INFO: compiled from: IndexedAnalyticsRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Singleton
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0086@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0086@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0019J6\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001dH\u0086@¢\u0006\u0002\u0010 J6\u0010!\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001dH\u0086@¢\u0006\u0002\u0010 J*\u0010\"\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010#\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Llnb/predict/earn/data/repository/IndexedAnalyticsRepository;", "", "dao", "Llnb/predict/earn/data/local/IndexedAnalyticsDao;", "<init>", "(Llnb/predict/earn/data/local/IndexedAnalyticsDao;)V", "getMonthly", "Llnb/predict/earn/data/local/MonthlyAnalyticsEntity;", "periodKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMonthly", "", "analytics", "(Llnb/predict/earn/data/local/MonthlyAnalyticsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopPairs", "", "Llnb/predict/earn/data/local/PairIndexEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopTriplets", "Llnb/predict/earn/data/local/TripletIndexEntity;", "getMetadata", "Llnb/predict/earn/data/local/AnalyticsMetadataEntity;", "saveMetadata", "metadata", "(Llnb/predict/earn/data/local/AnalyticsMetadataEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePairs", "", "counts", "", "", "dates", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTriplets", "updateTransitions", "type", "(Ljava/util/Map;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class IndexedAnalyticsRepository {
    public static final int $stable = 8;
    private final IndexedAnalyticsDao dao;

    /* JADX INFO: renamed from: lnb.predict.earn.data.repository.IndexedAnalyticsRepository$updatePairs$1, reason: invalid class name */
    /* JADX INFO: compiled from: IndexedAnalyticsRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.data.repository.IndexedAnalyticsRepository", f = "IndexedAnalyticsRepository.kt", i = {0, 0, 1, 1, 1, 1}, l = {21, 28}, m = "updatePairs", n = {"counts", "dates", "counts", "dates", "existing", "newEntities"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IndexedAnalyticsRepository.this.updatePairs(null, null, this);
        }
    }

    /* JADX INFO: renamed from: lnb.predict.earn.data.repository.IndexedAnalyticsRepository$updateTransitions$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: IndexedAnalyticsRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.data.repository.IndexedAnalyticsRepository", f = "IndexedAnalyticsRepository.kt", i = {0, 0, 1, 1, 1, 1}, l = {43, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "updateTransitions", n = {"counts", "type", "counts", "existing", "newEntities", "type"}, s = {"L$0", "I$0", "L$0", "L$1", "L$2", "I$0"})
    static final class C08071 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C08071(Continuation<? super C08071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IndexedAnalyticsRepository.this.updateTransitions(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: lnb.predict.earn.data.repository.IndexedAnalyticsRepository$updateTriplets$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: IndexedAnalyticsRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.data.repository.IndexedAnalyticsRepository", f = "IndexedAnalyticsRepository.kt", i = {0, 0, 1, 1, 1, 1}, l = {32, 39}, m = "updateTriplets", n = {"counts", "dates", "counts", "dates", "existing", "newEntities"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
    static final class C08081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C08081(Continuation<? super C08081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IndexedAnalyticsRepository.this.updateTriplets(null, null, this);
        }
    }

    @Inject
    public IndexedAnalyticsRepository(IndexedAnalyticsDao dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
    }

    public final Object getMonthly(String periodKey, Continuation<? super MonthlyAnalyticsEntity> continuation) {
        return this.dao.getMonthlyAnalytics(periodKey, continuation);
    }

    public final Object saveMonthly(MonthlyAnalyticsEntity analytics, Continuation<? super Long> continuation) {
        return this.dao.saveMonthlyAnalytics(analytics, continuation);
    }

    public final Object getTopPairs(Continuation<? super List<PairIndexEntity>> continuation) {
        return this.dao.getTopPairs(continuation);
    }

    public final Object getTopTriplets(Continuation<? super List<TripletIndexEntity>> continuation) {
        return this.dao.getTopTriplets(continuation);
    }

    public final Object getMetadata(Continuation<? super AnalyticsMetadataEntity> continuation) {
        return this.dao.getMetadata(continuation);
    }

    public final Object saveMetadata(AnalyticsMetadataEntity metadata, Continuation<? super Long> continuation) {
        return this.dao.saveMetadata(metadata, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009e A[LOOP:0: B:19:0x0098->B:21:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:30:0x0102  */
    /* JADX WARN: Code duplicated, block: B:31:0x010e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0160 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0161  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object updatePairs(Map<String, Integer> map, Map<String, String> map2, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Map<String, Integer> map3;
        Object obj;
        Map<String, String> map4;
        Map existing;
        Collection arrayList;
        List newEntities;
        IndexedAnalyticsDao indexedAnalyticsDao;
        String key;
        int iIntValue;
        PairIndexEntity pairIndexEntity;
        String str;
        String str2;
        PairIndexEntity pairIndexEntityCopy$default;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object $result = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                IndexedAnalyticsDao indexedAnalyticsDao2 = this.dao;
                List<String> list = CollectionsKt.toList(map.keySet());
                anonymousClass1.L$0 = map;
                anonymousClass1.L$1 = map2;
                anonymousClass1.label = 1;
                Object pairs = indexedAnalyticsDao2.getPairs(list, anonymousClass1);
                if (pairs == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map3 = map;
                obj = pairs;
                map4 = map2;
                Iterable iterable = (Iterable) obj;
                existing = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
                for (Object obj2 : iterable) {
                    existing.put(((PairIndexEntity) obj2).getPairKey(), obj2);
                }
                Map<String, Integer> map5 = map3;
                arrayList = new ArrayList(map5.size());
                for (Map.Entry<String, Integer> entry : map5.entrySet()) {
                    key = entry.getKey();
                    Object $result2 = $result;
                    iIntValue = entry.getValue().intValue();
                    pairIndexEntity = (PairIndexEntity) existing.get(key);
                    str = map4.get(key);
                    if (str == null) {
                        str = "";
                    }
                    str2 = str;
                    if (pairIndexEntity == null) {
                        pairIndexEntityCopy$default = new PairIndexEntity(key, iIntValue, str2);
                    } else {
                        pairIndexEntityCopy$default = PairIndexEntity.copy$default(pairIndexEntity, null, pairIndexEntity.getCount() + iIntValue, str2, 1, null);
                    }
                    arrayList.add(pairIndexEntityCopy$default);
                    map3 = map3;
                    map4 = map4;
                    $result = $result2;
                }
                newEntities = (List) arrayList;
                indexedAnalyticsDao = this.dao;
                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(map3);
                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(map4);
                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(existing);
                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(newEntities);
                anonymousClass1.label = 2;
                if (indexedAnalyticsDao.savePairs(newEntities, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                map4 = (Map) anonymousClass1.L$1;
                map3 = (Map) anonymousClass1.L$0;
                ResultKt.throwOnFailure($result);
                obj = $result;
                Iterable iterable2 = (Iterable) obj;
                existing = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable2, 10)), 16));
                while (r13.hasNext()) {
                    existing.put(((PairIndexEntity) obj2).getPairKey(), obj2);
                }
                Map<String, Integer> map6 = map3;
                arrayList = new ArrayList(map6.size());
                while (r13.hasNext()) {
                    key = entry.getKey();
                    Object $result3 = $result;
                    iIntValue = entry.getValue().intValue();
                    pairIndexEntity = (PairIndexEntity) existing.get(key);
                    str = map4.get(key);
                    if (str == null) {
                        str = "";
                    }
                    str2 = str;
                    if (pairIndexEntity == null) {
                        pairIndexEntityCopy$default = new PairIndexEntity(key, iIntValue, str2);
                    } else {
                        pairIndexEntityCopy$default = PairIndexEntity.copy$default(pairIndexEntity, null, pairIndexEntity.getCount() + iIntValue, str2, 1, null);
                    }
                    arrayList.add(pairIndexEntityCopy$default);
                    map3 = map3;
                    map4 = map4;
                    $result = $result3;
                }
                newEntities = (List) arrayList;
                indexedAnalyticsDao = this.dao;
                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(map3);
                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(map4);
                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(existing);
                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(newEntities);
                anonymousClass1.label = 2;
                if (indexedAnalyticsDao.savePairs(newEntities, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009e A[LOOP:0: B:19:0x0098->B:21:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:30:0x0102  */
    /* JADX WARN: Code duplicated, block: B:31:0x010e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0160 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0161  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object updateTriplets(Map<String, Integer> map, Map<String, String> map2, Continuation<? super Unit> continuation) {
        C08081 c08081;
        Map<String, Integer> map3;
        Object obj;
        Map<String, String> map4;
        Map existing;
        Collection arrayList;
        List newEntities;
        IndexedAnalyticsDao indexedAnalyticsDao;
        String key;
        int iIntValue;
        TripletIndexEntity tripletIndexEntity;
        String str;
        String str2;
        TripletIndexEntity tripletIndexEntityCopy$default;
        if (continuation instanceof C08081) {
            c08081 = (C08081) continuation;
            if ((c08081.label & Integer.MIN_VALUE) != 0) {
                c08081.label -= Integer.MIN_VALUE;
            } else {
                c08081 = new C08081(continuation);
            }
        } else {
            c08081 = new C08081(continuation);
        }
        Object $result = c08081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c08081.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                IndexedAnalyticsDao indexedAnalyticsDao2 = this.dao;
                List<String> list = CollectionsKt.toList(map.keySet());
                c08081.L$0 = map;
                c08081.L$1 = map2;
                c08081.label = 1;
                Object triplets = indexedAnalyticsDao2.getTriplets(list, c08081);
                if (triplets == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map3 = map;
                obj = triplets;
                map4 = map2;
                Iterable iterable = (Iterable) obj;
                existing = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
                for (Object obj2 : iterable) {
                    existing.put(((TripletIndexEntity) obj2).getTripletKey(), obj2);
                }
                Map<String, Integer> map5 = map3;
                arrayList = new ArrayList(map5.size());
                for (Map.Entry<String, Integer> entry : map5.entrySet()) {
                    key = entry.getKey();
                    Object $result2 = $result;
                    iIntValue = entry.getValue().intValue();
                    tripletIndexEntity = (TripletIndexEntity) existing.get(key);
                    str = map4.get(key);
                    if (str == null) {
                        str = "";
                    }
                    str2 = str;
                    if (tripletIndexEntity == null) {
                        tripletIndexEntityCopy$default = new TripletIndexEntity(key, iIntValue, str2);
                    } else {
                        tripletIndexEntityCopy$default = TripletIndexEntity.copy$default(tripletIndexEntity, null, tripletIndexEntity.getCount() + iIntValue, str2, 1, null);
                    }
                    arrayList.add(tripletIndexEntityCopy$default);
                    map3 = map3;
                    map4 = map4;
                    $result = $result2;
                }
                newEntities = (List) arrayList;
                indexedAnalyticsDao = this.dao;
                c08081.L$0 = SpillingKt.nullOutSpilledVariable(map3);
                c08081.L$1 = SpillingKt.nullOutSpilledVariable(map4);
                c08081.L$2 = SpillingKt.nullOutSpilledVariable(existing);
                c08081.L$3 = SpillingKt.nullOutSpilledVariable(newEntities);
                c08081.label = 2;
                if (indexedAnalyticsDao.saveTriplets(newEntities, c08081) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                map4 = (Map) c08081.L$1;
                map3 = (Map) c08081.L$0;
                ResultKt.throwOnFailure($result);
                obj = $result;
                Iterable iterable2 = (Iterable) obj;
                existing = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable2, 10)), 16));
                while (r13.hasNext()) {
                    existing.put(((TripletIndexEntity) obj2).getTripletKey(), obj2);
                }
                Map<String, Integer> map6 = map3;
                arrayList = new ArrayList(map6.size());
                while (r13.hasNext()) {
                    key = entry.getKey();
                    Object $result3 = $result;
                    iIntValue = entry.getValue().intValue();
                    tripletIndexEntity = (TripletIndexEntity) existing.get(key);
                    str = map4.get(key);
                    if (str == null) {
                        str = "";
                    }
                    str2 = str;
                    if (tripletIndexEntity == null) {
                        tripletIndexEntityCopy$default = new TripletIndexEntity(key, iIntValue, str2);
                    } else {
                        tripletIndexEntityCopy$default = TripletIndexEntity.copy$default(tripletIndexEntity, null, tripletIndexEntity.getCount() + iIntValue, str2, 1, null);
                    }
                    arrayList.add(tripletIndexEntityCopy$default);
                    map3 = map3;
                    map4 = map4;
                    $result = $result3;
                }
                newEntities = (List) arrayList;
                indexedAnalyticsDao = this.dao;
                c08081.L$0 = SpillingKt.nullOutSpilledVariable(map3);
                c08081.L$1 = SpillingKt.nullOutSpilledVariable(map4);
                c08081.L$2 = SpillingKt.nullOutSpilledVariable(existing);
                c08081.L$3 = SpillingKt.nullOutSpilledVariable(newEntities);
                c08081.label = 2;
                if (indexedAnalyticsDao.saveTriplets(newEntities, c08081) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0099 A[LOOP:0: B:19:0x0093->B:21:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:32:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final Object updateTransitions(Map<String, Integer> map, int type, Continuation<? super Unit> continuation) {
        C08071 c08071;
        Object obj;
        Map<String, Integer> map2;
        Map existing;
        Collection arrayList;
        List newEntities;
        IndexedAnalyticsDao indexedAnalyticsDao;
        String key;
        int iIntValue;
        TransitionIndexEntity transitionIndexEntity;
        TransitionIndexEntity transitionIndexEntityCopy$default;
        int type2 = type;
        if (continuation instanceof C08071) {
            c08071 = (C08071) continuation;
            if ((c08071.label & Integer.MIN_VALUE) != 0) {
                c08071.label -= Integer.MIN_VALUE;
            } else {
                c08071 = new C08071(continuation);
            }
        } else {
            c08071 = new C08071(continuation);
        }
        Object $result = c08071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c08071.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                IndexedAnalyticsDao indexedAnalyticsDao2 = this.dao;
                List<String> list = CollectionsKt.toList(map.keySet());
                c08071.L$0 = map;
                c08071.I$0 = type2;
                c08071.label = 1;
                Object transitionsByKeys = indexedAnalyticsDao2.getTransitionsByKeys(list, type2, c08071);
                if (transitionsByKeys == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = transitionsByKeys;
                map2 = map;
                Iterable iterable = (Iterable) obj;
                existing = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
                for (Object obj2 : iterable) {
                    existing.put(((TransitionIndexEntity) obj2).getTransitionKey(), obj2);
                }
                Map<String, Integer> map3 = map2;
                arrayList = new ArrayList(map3.size());
                for (Map.Entry<String, Integer> entry : map3.entrySet()) {
                    key = entry.getKey();
                    Object $result2 = $result;
                    iIntValue = entry.getValue().intValue();
                    transitionIndexEntity = (TransitionIndexEntity) existing.get(key);
                    if (transitionIndexEntity == null) {
                        transitionIndexEntityCopy$default = new TransitionIndexEntity(key, iIntValue, type2);
                    } else {
                        transitionIndexEntityCopy$default = TransitionIndexEntity.copy$default(transitionIndexEntity, null, transitionIndexEntity.getCount() + iIntValue, 0, 5, null);
                    }
                    arrayList.add(transitionIndexEntityCopy$default);
                    map2 = map2;
                    $result = $result2;
                }
                newEntities = (List) arrayList;
                indexedAnalyticsDao = this.dao;
                c08071.L$0 = SpillingKt.nullOutSpilledVariable(map2);
                c08071.L$1 = SpillingKt.nullOutSpilledVariable(existing);
                c08071.L$2 = SpillingKt.nullOutSpilledVariable(newEntities);
                c08071.I$0 = type2;
                c08071.label = 2;
                if (indexedAnalyticsDao.saveTransitions(newEntities, c08071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                type2 = c08071.I$0;
                map2 = (Map) c08071.L$0;
                ResultKt.throwOnFailure($result);
                obj = $result;
                Iterable iterable2 = (Iterable) obj;
                existing = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable2, 10)), 16));
                while (r13.hasNext()) {
                    existing.put(((TransitionIndexEntity) obj2).getTransitionKey(), obj2);
                }
                Map<String, Integer> map4 = map2;
                arrayList = new ArrayList(map4.size());
                while (r13.hasNext()) {
                    key = entry.getKey();
                    Object $result3 = $result;
                    iIntValue = entry.getValue().intValue();
                    transitionIndexEntity = (TransitionIndexEntity) existing.get(key);
                    if (transitionIndexEntity == null) {
                        transitionIndexEntityCopy$default = new TransitionIndexEntity(key, iIntValue, type2);
                    } else {
                        transitionIndexEntityCopy$default = TransitionIndexEntity.copy$default(transitionIndexEntity, null, transitionIndexEntity.getCount() + iIntValue, 0, 5, null);
                    }
                    arrayList.add(transitionIndexEntityCopy$default);
                    map2 = map2;
                    $result = $result3;
                }
                newEntities = (List) arrayList;
                indexedAnalyticsDao = this.dao;
                c08071.L$0 = SpillingKt.nullOutSpilledVariable(map2);
                c08071.L$1 = SpillingKt.nullOutSpilledVariable(existing);
                c08071.L$2 = SpillingKt.nullOutSpilledVariable(newEntities);
                c08071.I$0 = type2;
                c08071.label = 2;
                if (indexedAnalyticsDao.saveTransitions(newEntities, c08071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                int i = c08071.I$0;
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
