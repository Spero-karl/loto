package lnb.predict.earn.domain.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import lnb.predict.earn.data.local.AnalyticsMetadataEntity;
import lnb.predict.earn.data.repository.IndexedAnalyticsRepository;
import lnb.predict.earn.data.repository.LotoRepository;
import lnb.predict.earn.domain.model.Draw;
import lnb.predict.earn.domain.service.AdvancedAnalysisService;

/* JADX INFO: compiled from: AnalyticsSyncManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Singleton
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0002\u0010\u0014J*\u0010\u0015\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Llnb/predict/earn/domain/sync/AnalyticsSyncManager;", "", "lotoRepository", "Llnb/predict/earn/data/repository/LotoRepository;", "indexedRepository", "Llnb/predict/earn/data/repository/IndexedAnalyticsRepository;", "analysisService", "Llnb/predict/earn/domain/service/AdvancedAnalysisService;", "gson", "Lcom/google/gson/Gson;", "<init>", "(Llnb/predict/earn/data/repository/LotoRepository;Llnb/predict/earn/data/repository/IndexedAnalyticsRepository;Llnb/predict/earn/domain/service/AdvancedAnalysisService;Lcom/google/gson/Gson;)V", "sync", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePersistentIndexes", "newDraws", "", "Llnb/predict/earn/domain/model/Draw;", "allDraws", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMonthlyAnalytics", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AnalyticsSyncManager {
    public static final int $stable = 8;
    private final AdvancedAnalysisService analysisService;
    private final Gson gson;
    private final IndexedAnalyticsRepository indexedRepository;
    private final LotoRepository lotoRepository;

    /* JADX INFO: renamed from: lnb.predict.earn.domain.sync.AnalyticsSyncManager$updateMonthlyAnalytics$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnalyticsSyncManager.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.domain.sync.AnalyticsSyncManager", f = "AnalyticsSyncManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {98}, m = "updateMonthlyAnalytics", n = {"newDraws", "allDraws", "affectedMonths", "$this$forEach\\4", "element\\4", "periodKey\\5", "monthDraws\\5", "analysis\\5", "$i$f$forEach\\4\\94", "$i$a$-forEach-AnalyticsSyncManager$updateMonthlyAnalytics$2\\5\\112\\0", "year\\5", "month\\5"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3"})
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalyticsSyncManager.this.updateMonthlyAnalytics(null, null, this);
        }
    }

    /* JADX INFO: renamed from: lnb.predict.earn.domain.sync.AnalyticsSyncManager$updatePersistentIndexes$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalyticsSyncManager.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.domain.sync.AnalyticsSyncManager", f = "AnalyticsSyncManager.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {72, 73, 89}, m = "updatePersistentIndexes", n = {"newDraws", "allDraws", "pairCounts", "pairDates", "tripletCounts", "tripletDates", "newDraws", "allDraws", "pairCounts", "pairDates", "tripletCounts", "tripletDates", "newDraws", "allDraws", "pairCounts", "pairDates", "tripletCounts", "tripletDates", "transitionCounts"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
    static final class C08091 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C08091(Continuation<? super C08091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalyticsSyncManager.this.updatePersistentIndexes(null, null, this);
        }
    }

    @Inject
    public AnalyticsSyncManager(LotoRepository lotoRepository, IndexedAnalyticsRepository indexedRepository, AdvancedAnalysisService analysisService, Gson gson) {
        Intrinsics.checkNotNullParameter(lotoRepository, "lotoRepository");
        Intrinsics.checkNotNullParameter(indexedRepository, "indexedRepository");
        Intrinsics.checkNotNullParameter(analysisService, "analysisService");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.lotoRepository = lotoRepository;
        this.indexedRepository = indexedRepository;
        this.analysisService = analysisService;
        this.gson = gson;
    }

    /* JADX INFO: renamed from: lnb.predict.earn.domain.sync.AnalyticsSyncManager$sync$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnalyticsSyncManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.domain.sync.AnalyticsSyncManager$sync$2", f = "AnalyticsSyncManager.kt", i = {1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, l = {24, 25, 38, 41, 44}, m = "invokeSuspend", n = {"metadata", "metadata", "allDraws", "lastProcessedId", "newDraws", "startIndex", "metadata", "allDraws", "lastProcessedId", "newDraws", "startIndex", "metadata", "allDraws", "lastProcessedId", "newDraws", "startIndex"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnalyticsSyncManager.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x009a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x009b  */
        /* JADX WARN: Code duplicated, block: B:20:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:22:0x00b5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e2 A[LOOP:0: B:29:0x00c9->B:34:0x00e2, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:43:0x011c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x0141 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x0194 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x0195  */
        /* JADX WARN: Code duplicated, block: B:53:0x00e8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x00e6 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object metadata;
            AnalyticsMetadataEntity metadata2;
            Object objFirst;
            AnalyticsMetadataEntity metadata3;
            List allDraws;
            String lastProcessedDrawId;
            String lastProcessedId;
            int i;
            Iterator it;
            int startIndex;
            List newDraws;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    metadata = AnalyticsSyncManager.this.indexedRepository.getMetadata(this);
                    if (metadata == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    metadata2 = (AnalyticsMetadataEntity) metadata;
                    this.L$0 = metadata2;
                    this.label = 2;
                    objFirst = FlowKt.first(AnalyticsSyncManager.this.lotoRepository.getAllDraws(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    metadata3 = metadata2;
                    allDraws = CollectionsKt.sortedWith((Iterable) objFirst, new Comparator() { // from class: lnb.predict.earn.domain.sync.AnalyticsSyncManager$sync$2$invokeSuspend$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(((Draw) t).getDate(), ((Draw) t2).getDate());
                        }
                    });
                    if (allDraws.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    if (metadata3 != null) {
                        lastProcessedDrawId = metadata3.getLastProcessedDrawId();
                    } else {
                        lastProcessedDrawId = null;
                    }
                    lastProcessedId = lastProcessedDrawId;
                    if (lastProcessedId == null) {
                        startIndex = 0;
                    } else {
                        i = 0;
                        it = allDraws.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                            } else if (!Intrinsics.areEqual(((Draw) it.next()).getId(), lastProcessedId)) {
                                i++;
                            }
                        }
                        startIndex = i + 1;
                    }
                    if (startIndex >= allDraws.size()) {
                        return Unit.INSTANCE;
                    }
                    newDraws = allDraws.subList(startIndex, allDraws.size());
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = allDraws;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = newDraws;
                    this.I$0 = startIndex;
                    this.label = 3;
                    if (AnalyticsSyncManager.this.updatePersistentIndexes(newDraws, allDraws, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = allDraws;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(newDraws);
                    this.I$0 = startIndex;
                    this.label = 4;
                    if (AnalyticsSyncManager.this.updateMonthlyAnalytics(newDraws, allDraws, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(allDraws);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(newDraws);
                    this.I$0 = startIndex;
                    this.label = 5;
                    if (AnalyticsSyncManager.this.indexedRepository.saveMetadata(new AnalyticsMetadataEntity(null, ((Draw) CollectionsKt.last(allDraws)).getId(), AnalyticsSyncManager.this.gson.toJson(AdvancedAnalysisService.performFullAnalysis$default(AnalyticsSyncManager.this.analysisService, allDraws, null, 2, null)), 1, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    metadata = $result;
                    metadata2 = (AnalyticsMetadataEntity) metadata;
                    this.L$0 = metadata2;
                    this.label = 2;
                    objFirst = FlowKt.first(AnalyticsSyncManager.this.lotoRepository.getAllDraws(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    metadata3 = metadata2;
                    allDraws = CollectionsKt.sortedWith((Iterable) objFirst, new Comparator() { // from class: lnb.predict.earn.domain.sync.AnalyticsSyncManager$sync$2$invokeSuspend$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(((Draw) t).getDate(), ((Draw) t2).getDate());
                        }
                    });
                    if (allDraws.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    if (metadata3 != null) {
                        lastProcessedDrawId = metadata3.getLastProcessedDrawId();
                    } else {
                        lastProcessedDrawId = null;
                    }
                    lastProcessedId = lastProcessedDrawId;
                    if (lastProcessedId == null) {
                        startIndex = 0;
                    } else {
                        i = 0;
                        it = allDraws.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                            } else if (!Intrinsics.areEqual(((Draw) it.next()).getId(), lastProcessedId)) {
                                i++;
                            }
                        }
                        startIndex = i + 1;
                    }
                    if (startIndex >= allDraws.size()) {
                        return Unit.INSTANCE;
                    }
                    newDraws = allDraws.subList(startIndex, allDraws.size());
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = allDraws;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = newDraws;
                    this.I$0 = startIndex;
                    this.label = 3;
                    if (AnalyticsSyncManager.this.updatePersistentIndexes(newDraws, allDraws, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = allDraws;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(newDraws);
                    this.I$0 = startIndex;
                    this.label = 4;
                    if (AnalyticsSyncManager.this.updateMonthlyAnalytics(newDraws, allDraws, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(allDraws);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(newDraws);
                    this.I$0 = startIndex;
                    this.label = 5;
                    if (AnalyticsSyncManager.this.indexedRepository.saveMetadata(new AnalyticsMetadataEntity(null, ((Draw) CollectionsKt.last(allDraws)).getId(), AnalyticsSyncManager.this.gson.toJson(AdvancedAnalysisService.performFullAnalysis$default(AnalyticsSyncManager.this.analysisService, allDraws, null, 2, null)), 1, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    AnalyticsMetadataEntity metadata4 = (AnalyticsMetadataEntity) this.L$0;
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    metadata3 = metadata4;
                    allDraws = CollectionsKt.sortedWith((Iterable) objFirst, new Comparator() { // from class: lnb.predict.earn.domain.sync.AnalyticsSyncManager$sync$2$invokeSuspend$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(((Draw) t).getDate(), ((Draw) t2).getDate());
                        }
                    });
                    if (allDraws.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    if (metadata3 != null) {
                        lastProcessedDrawId = metadata3.getLastProcessedDrawId();
                    } else {
                        lastProcessedDrawId = null;
                    }
                    lastProcessedId = lastProcessedDrawId;
                    if (lastProcessedId == null) {
                        startIndex = 0;
                    } else {
                        i = 0;
                        it = allDraws.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                            } else if (!Intrinsics.areEqual(((Draw) it.next()).getId(), lastProcessedId)) {
                                i++;
                            }
                        }
                        startIndex = i + 1;
                    }
                    if (startIndex >= allDraws.size()) {
                        return Unit.INSTANCE;
                    }
                    newDraws = allDraws.subList(startIndex, allDraws.size());
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = allDraws;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = newDraws;
                    this.I$0 = startIndex;
                    this.label = 3;
                    if (AnalyticsSyncManager.this.updatePersistentIndexes(newDraws, allDraws, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = allDraws;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(newDraws);
                    this.I$0 = startIndex;
                    this.label = 4;
                    if (AnalyticsSyncManager.this.updateMonthlyAnalytics(newDraws, allDraws, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(allDraws);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(newDraws);
                    this.I$0 = startIndex;
                    this.label = 5;
                    if (AnalyticsSyncManager.this.indexedRepository.saveMetadata(new AnalyticsMetadataEntity(null, ((Draw) CollectionsKt.last(allDraws)).getId(), AnalyticsSyncManager.this.gson.toJson(AdvancedAnalysisService.performFullAnalysis$default(AnalyticsSyncManager.this.analysisService, allDraws, null, 2, null)), 1, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                    startIndex = this.I$0;
                    newDraws = (List) this.L$3;
                    lastProcessedId = (String) this.L$2;
                    allDraws = (List) this.L$1;
                    metadata3 = (AnalyticsMetadataEntity) this.L$0;
                    ResultKt.throwOnFailure($result);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = allDraws;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(newDraws);
                    this.I$0 = startIndex;
                    this.label = 4;
                    if (AnalyticsSyncManager.this.updateMonthlyAnalytics(newDraws, allDraws, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(allDraws);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(newDraws);
                    this.I$0 = startIndex;
                    this.label = 5;
                    if (AnalyticsSyncManager.this.indexedRepository.saveMetadata(new AnalyticsMetadataEntity(null, ((Draw) CollectionsKt.last(allDraws)).getId(), AnalyticsSyncManager.this.gson.toJson(AdvancedAnalysisService.performFullAnalysis$default(AnalyticsSyncManager.this.analysisService, allDraws, null, 2, null)), 1, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 4:
                    startIndex = this.I$0;
                    newDraws = (List) this.L$3;
                    lastProcessedId = (String) this.L$2;
                    allDraws = (List) this.L$1;
                    metadata3 = (AnalyticsMetadataEntity) this.L$0;
                    ResultKt.throwOnFailure($result);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(metadata3);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(allDraws);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lastProcessedId);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(newDraws);
                    this.I$0 = startIndex;
                    this.label = 5;
                    if (AnalyticsSyncManager.this.indexedRepository.saveMetadata(new AnalyticsMetadataEntity(null, ((Draw) CollectionsKt.last(allDraws)).getId(), AnalyticsSyncManager.this.gson.toJson(AdvancedAnalysisService.performFullAnalysis$default(AnalyticsSyncManager.this.analysisService, allDraws, null, 2, null)), 1, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    int i2 = this.I$0;
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object sync(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x0214  */
    /* JADX WARN: Code duplicated, block: B:48:0x023b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0240  */
    /* JADX WARN: Code duplicated, block: B:54:0x0258  */
    /* JADX WARN: Code duplicated, block: B:57:0x0271  */
    /* JADX WARN: Code duplicated, block: B:60:0x028e A[LOOP:1: B:55:0x026b->B:60:0x028e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x030b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0310  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:81:0x034f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0385 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0386  */
    /* JADX WARN: Code duplicated, block: B:87:0x038f  */
    /* JADX WARN: Code duplicated, block: B:91:0x033a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x029e A[SYNTHETIC] */
    public final Object updatePersistentIndexes(List<Draw> list, List<Draw> list2, Continuation<? super Unit> continuation) {
        C08091 c08091;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        List<Draw> list3;
        Map<String, Integer> map;
        Map<String, Integer> map2;
        List<Draw> list4;
        IndexedAnalyticsRepository indexedAnalyticsRepository;
        Map transitionCounts;
        List<Draw> list5;
        List newDraws;
        Map<String, String> map3;
        IndexedAnalyticsRepository indexedAnalyticsRepository2;
        int i;
        Iterator<Draw> it;
        List newDraws2;
        Iterable iterable;
        Draw draw;
        Iterable numbers;
        Iterator it2;
        int iIntValue;
        Iterator it3;
        Integer num;
        int iIntValue2;
        List newDraws3 = list;
        if (continuation instanceof C08091) {
            c08091 = (C08091) continuation;
            if ((c08091.label & Integer.MIN_VALUE) != 0) {
                c08091.label -= Integer.MIN_VALUE;
            } else {
                c08091 = new C08091(continuation);
            }
        } else {
            c08091 = new C08091(continuation);
        }
        Object $result = c08091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c08091.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                linkedHashMap = new LinkedHashMap();
                linkedHashMap2 = new LinkedHashMap();
                linkedHashMap3 = new LinkedHashMap();
                linkedHashMap4 = new LinkedHashMap();
                List<Draw> list6 = newDraws3;
                int i2 = 0;
                for (Draw draw2 : list6) {
                    List listSorted = CollectionsKt.sorted(draw2.getNumbers());
                    int size = listSorted.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object $result2 = $result;
                        int size2 = listSorted.size();
                        int i4 = size;
                        int i5 = i3 + 1;
                        while (i5 < size2) {
                            int i6 = size2;
                            Iterable iterable2 = list6;
                            int i7 = i2;
                            String str = listSorted.get(i3) + "_" + listSorted.get(i5);
                            Integer num2 = linkedHashMap.get(str);
                            linkedHashMap.put(str, Boxing.boxInt((num2 != null ? num2.intValue() : 0) + 1));
                            linkedHashMap2.put(str, draw2.getDate().toString());
                            int i8 = i5 + 1;
                            int size3 = listSorted.size();
                            while (i8 < size3) {
                                String str2 = str;
                                int i9 = i3;
                                int i10 = i5;
                                List list7 = listSorted;
                                String str3 = listSorted.get(i3) + "_" + listSorted.get(i5) + "_" + listSorted.get(i8);
                                Integer num3 = linkedHashMap3.get(str3);
                                linkedHashMap3.put(str3, Boxing.boxInt((num3 != null ? num3.intValue() : 0) + 1));
                                linkedHashMap4.put(str3, draw2.getDate().toString());
                                i8++;
                                str = str2;
                                i3 = i9;
                                i5 = i10;
                                listSorted = list7;
                            }
                            i5++;
                            size2 = i6;
                            list6 = iterable2;
                            i2 = i7;
                        }
                        i3++;
                        $result = $result2;
                        size = i4;
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    list3 = list2;
                } else {
                    IndexedAnalyticsRepository indexedAnalyticsRepository3 = this.indexedRepository;
                    c08091.L$0 = newDraws3;
                    c08091.L$1 = list2;
                    c08091.L$2 = SpillingKt.nullOutSpilledVariable(linkedHashMap);
                    c08091.L$3 = SpillingKt.nullOutSpilledVariable(linkedHashMap2);
                    c08091.L$4 = linkedHashMap3;
                    c08091.L$5 = linkedHashMap4;
                    c08091.label = 1;
                    if (indexedAnalyticsRepository3.updatePairs(linkedHashMap, linkedHashMap2, c08091) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list3 = list2;
                }
                if (linkedHashMap3.isEmpty()) {
                    map = linkedHashMap3;
                    map2 = linkedHashMap;
                    list4 = list3;
                } else {
                    indexedAnalyticsRepository = this.indexedRepository;
                    c08091.L$0 = newDraws3;
                    c08091.L$1 = list3;
                    c08091.L$2 = SpillingKt.nullOutSpilledVariable(linkedHashMap);
                    c08091.L$3 = SpillingKt.nullOutSpilledVariable(linkedHashMap2);
                    c08091.L$4 = SpillingKt.nullOutSpilledVariable(linkedHashMap3);
                    c08091.L$5 = SpillingKt.nullOutSpilledVariable(linkedHashMap4);
                    c08091.label = 2;
                    if (indexedAnalyticsRepository.updateTriplets(linkedHashMap3, linkedHashMap4, c08091) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map = linkedHashMap3;
                    map2 = linkedHashMap;
                    list4 = list3;
                }
                transitionCounts = new LinkedHashMap();
                list5 = newDraws3;
                for (Draw draw3 : list5) {
                    i = 0;
                    it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            newDraws2 = newDraws3;
                            iterable = list5;
                            if (!Intrinsics.areEqual(((Draw) it.next()).getId(), draw3.getId())) {
                                i++;
                                newDraws3 = newDraws2;
                                list5 = iterable;
                            }
                        } else {
                            newDraws2 = newDraws3;
                            iterable = list5;
                            i = -1;
                        }
                    }
                    if (i > 0) {
                        draw = list4.get(i - 1);
                        numbers = draw.getNumbers();
                        it2 = numbers.iterator();
                        while (it2.hasNext()) {
                            Draw draw4 = draw;
                            iIntValue = ((Number) it2.next()).intValue();
                            it3 = draw3.getNumbers().iterator();
                            while (it3.hasNext()) {
                                Iterable iterable3 = numbers;
                                Map<String, String> map4 = linkedHashMap4;
                                String str4 = iIntValue + "_" + ((Number) it3.next()).intValue();
                                num = (Integer) transitionCounts.get(str4);
                                if (num != null) {
                                    iIntValue2 = num.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                transitionCounts.put(str4, Boxing.boxInt(iIntValue2 + 1));
                                numbers = iterable3;
                                linkedHashMap4 = map4;
                                iIntValue = iIntValue;
                            }
                            draw = draw4;
                        }
                    }
                    newDraws3 = newDraws2;
                    list5 = iterable;
                    linkedHashMap4 = linkedHashMap4;
                }
                newDraws = newDraws3;
                map3 = linkedHashMap4;
                if (transitionCounts.isEmpty()) {
                    return Unit.INSTANCE;
                }
                indexedAnalyticsRepository2 = this.indexedRepository;
                c08091.L$0 = SpillingKt.nullOutSpilledVariable(newDraws);
                c08091.L$1 = SpillingKt.nullOutSpilledVariable(list4);
                c08091.L$2 = SpillingKt.nullOutSpilledVariable(map2);
                c08091.L$3 = SpillingKt.nullOutSpilledVariable(linkedHashMap2);
                c08091.L$4 = SpillingKt.nullOutSpilledVariable(map);
                c08091.L$5 = SpillingKt.nullOutSpilledVariable(map3);
                c08091.L$6 = SpillingKt.nullOutSpilledVariable(transitionCounts);
                c08091.label = 3;
                if (indexedAnalyticsRepository2.updateTransitions(transitionCounts, 1, c08091) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                linkedHashMap4 = (Map) c08091.L$5;
                linkedHashMap3 = (Map) c08091.L$4;
                linkedHashMap2 = (Map) c08091.L$3;
                linkedHashMap = (Map) c08091.L$2;
                list3 = (List) c08091.L$1;
                newDraws3 = (List) c08091.L$0;
                ResultKt.throwOnFailure($result);
                if (linkedHashMap3.isEmpty()) {
                    indexedAnalyticsRepository = this.indexedRepository;
                    c08091.L$0 = newDraws3;
                    c08091.L$1 = list3;
                    c08091.L$2 = SpillingKt.nullOutSpilledVariable(linkedHashMap);
                    c08091.L$3 = SpillingKt.nullOutSpilledVariable(linkedHashMap2);
                    c08091.L$4 = SpillingKt.nullOutSpilledVariable(linkedHashMap3);
                    c08091.L$5 = SpillingKt.nullOutSpilledVariable(linkedHashMap4);
                    c08091.label = 2;
                    if (indexedAnalyticsRepository.updateTriplets(linkedHashMap3, linkedHashMap4, c08091) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map = linkedHashMap3;
                    map2 = linkedHashMap;
                    list4 = list3;
                } else {
                    map = linkedHashMap3;
                    map2 = linkedHashMap;
                    list4 = list3;
                }
                transitionCounts = new LinkedHashMap();
                list5 = newDraws3;
                while (r13.hasNext()) {
                    i = 0;
                    it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            newDraws2 = newDraws3;
                            iterable = list5;
                            if (!Intrinsics.areEqual(((Draw) it.next()).getId(), draw3.getId())) {
                                i++;
                                newDraws3 = newDraws2;
                                list5 = iterable;
                            }
                        } else {
                            newDraws2 = newDraws3;
                            iterable = list5;
                            i = -1;
                        }
                    }
                    if (i > 0) {
                        draw = list4.get(i - 1);
                        numbers = draw.getNumbers();
                        it2 = numbers.iterator();
                        while (it2.hasNext()) {
                            Draw draw5 = draw;
                            iIntValue = ((Number) it2.next()).intValue();
                            it3 = draw3.getNumbers().iterator();
                            while (it3.hasNext()) {
                                Iterable iterable4 = numbers;
                                Map<String, String> map5 = linkedHashMap4;
                                String str5 = iIntValue + "_" + ((Number) it3.next()).intValue();
                                num = (Integer) transitionCounts.get(str5);
                                if (num != null) {
                                    iIntValue2 = num.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                transitionCounts.put(str5, Boxing.boxInt(iIntValue2 + 1));
                                numbers = iterable4;
                                linkedHashMap4 = map5;
                                iIntValue = iIntValue;
                            }
                            draw = draw5;
                        }
                    }
                    newDraws3 = newDraws2;
                    list5 = iterable;
                    linkedHashMap4 = linkedHashMap4;
                }
                newDraws = newDraws3;
                map3 = linkedHashMap4;
                if (transitionCounts.isEmpty()) {
                    return Unit.INSTANCE;
                }
                indexedAnalyticsRepository2 = this.indexedRepository;
                c08091.L$0 = SpillingKt.nullOutSpilledVariable(newDraws);
                c08091.L$1 = SpillingKt.nullOutSpilledVariable(list4);
                c08091.L$2 = SpillingKt.nullOutSpilledVariable(map2);
                c08091.L$3 = SpillingKt.nullOutSpilledVariable(linkedHashMap2);
                c08091.L$4 = SpillingKt.nullOutSpilledVariable(map);
                c08091.L$5 = SpillingKt.nullOutSpilledVariable(map3);
                c08091.L$6 = SpillingKt.nullOutSpilledVariable(transitionCounts);
                c08091.label = 3;
                if (indexedAnalyticsRepository2.updateTransitions(transitionCounts, 1, c08091) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                linkedHashMap4 = (Map) c08091.L$5;
                linkedHashMap3 = (Map) c08091.L$4;
                linkedHashMap2 = (Map) c08091.L$3;
                linkedHashMap = (Map) c08091.L$2;
                list3 = (List) c08091.L$1;
                newDraws3 = (List) c08091.L$0;
                ResultKt.throwOnFailure($result);
                map = linkedHashMap3;
                map2 = linkedHashMap;
                list4 = list3;
                transitionCounts = new LinkedHashMap();
                list5 = newDraws3;
                while (r13.hasNext()) {
                    i = 0;
                    it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            newDraws2 = newDraws3;
                            iterable = list5;
                            if (!Intrinsics.areEqual(((Draw) it.next()).getId(), draw3.getId())) {
                                i++;
                                newDraws3 = newDraws2;
                                list5 = iterable;
                            }
                        } else {
                            newDraws2 = newDraws3;
                            iterable = list5;
                            i = -1;
                        }
                    }
                    if (i > 0) {
                        draw = list4.get(i - 1);
                        numbers = draw.getNumbers();
                        it2 = numbers.iterator();
                        while (it2.hasNext()) {
                            Draw draw6 = draw;
                            iIntValue = ((Number) it2.next()).intValue();
                            it3 = draw3.getNumbers().iterator();
                            while (it3.hasNext()) {
                                Iterable iterable5 = numbers;
                                Map<String, String> map6 = linkedHashMap4;
                                String str6 = iIntValue + "_" + ((Number) it3.next()).intValue();
                                num = (Integer) transitionCounts.get(str6);
                                if (num != null) {
                                    iIntValue2 = num.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                transitionCounts.put(str6, Boxing.boxInt(iIntValue2 + 1));
                                numbers = iterable5;
                                linkedHashMap4 = map6;
                                iIntValue = iIntValue;
                            }
                            draw = draw6;
                        }
                    }
                    newDraws3 = newDraws2;
                    list5 = iterable;
                    linkedHashMap4 = linkedHashMap4;
                }
                newDraws = newDraws3;
                map3 = linkedHashMap4;
                if (transitionCounts.isEmpty()) {
                    return Unit.INSTANCE;
                }
                indexedAnalyticsRepository2 = this.indexedRepository;
                c08091.L$0 = SpillingKt.nullOutSpilledVariable(newDraws);
                c08091.L$1 = SpillingKt.nullOutSpilledVariable(list4);
                c08091.L$2 = SpillingKt.nullOutSpilledVariable(map2);
                c08091.L$3 = SpillingKt.nullOutSpilledVariable(linkedHashMap2);
                c08091.L$4 = SpillingKt.nullOutSpilledVariable(map);
                c08091.L$5 = SpillingKt.nullOutSpilledVariable(map3);
                c08091.L$6 = SpillingKt.nullOutSpilledVariable(transitionCounts);
                c08091.label = 3;
                if (indexedAnalyticsRepository2.updateTransitions(transitionCounts, 1, c08091) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x010c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0150 A[LOOP:0: B:21:0x014a->B:23:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x019f  */
    /* JADX WARN: Code duplicated, block: B:29:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:34:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0241 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0242  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0242 -> B:41:0x0256). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object updateMonthlyAnalytics(java.util.List<lnb.predict.earn.domain.model.Draw> r28, java.util.List<lnb.predict.earn.domain.model.Draw> r29, kotlin.coroutines.Continuation<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lnb.predict.earn.domain.sync.AnalyticsSyncManager.updateMonthlyAnalytics(java.util.List, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
