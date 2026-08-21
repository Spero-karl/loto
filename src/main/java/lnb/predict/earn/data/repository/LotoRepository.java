package lnb.predict.earn.data.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import lnb.predict.earn.data.local.DrawDao;
import lnb.predict.earn.data.local.DrawEntity;
import lnb.predict.earn.data.local.StatisticsDao;
import lnb.predict.earn.data.local.StatisticsEntity;
import lnb.predict.earn.data.remote.LotoApiService;
import lnb.predict.earn.domain.model.Draw;
import lnb.predict.earn.domain.model.GlobalStatistics;

/* JADX INFO: compiled from: LotoRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Singleton
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0002\u0010\u001aJ\f\u0010\u001b\u001a\u00020\u001c*\u00020\u000fH\u0002J\f\u0010\u001d\u001a\u00020\u000f*\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001e"}, d2 = {"Llnb/predict/earn/data/repository/LotoRepository;", "", "apiService", "Llnb/predict/earn/data/remote/LotoApiService;", "drawDao", "Llnb/predict/earn/data/local/DrawDao;", "statisticsDao", "Llnb/predict/earn/data/local/StatisticsDao;", "gson", "Lcom/google/gson/Gson;", "<init>", "(Llnb/predict/earn/data/remote/LotoApiService;Llnb/predict/earn/data/local/DrawDao;Llnb/predict/earn/data/local/StatisticsDao;Lcom/google/gson/Gson;)V", "allDraws", "Lkotlinx/coroutines/flow/Flow;", "", "Llnb/predict/earn/domain/model/Draw;", "getAllDraws", "()Lkotlinx/coroutines/flow/Flow;", "savedStatistics", "Llnb/predict/earn/domain/model/GlobalStatistics;", "getSavedStatistics", "refreshResults", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveDraws", "draws", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toEntity", "Llnb/predict/earn/data/local/DrawEntity;", "toDomain", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LotoRepository {
    public static final int $stable = 8;
    private final Flow<List<Draw>> allDraws;
    private final LotoApiService apiService;
    private final DrawDao drawDao;
    private final Gson gson;
    private final Flow<GlobalStatistics> savedStatistics;
    private final StatisticsDao statisticsDao;

    /* JADX INFO: renamed from: lnb.predict.earn.data.repository.LotoRepository$refreshResults$1, reason: invalid class name */
    /* JADX INFO: compiled from: LotoRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.data.repository.LotoRepository", f = "LotoRepository.kt", i = {1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {44, 47, 53, 54}, m = "refreshResults", n = {"initialResponse", "initialResponse", "$this$forEach\\1", "element\\1", "monthYear\\2", "$i$f$forEach\\1\\50", "$i$a$-forEach-LotoRepository$refreshResults$2\\2\\90\\0", "initialResponse", "$this$forEach\\1", "element\\1", "monthYear\\2", "response\\2", "$i$f$forEach\\1\\50", "$i$a$-forEach-LotoRepository$refreshResults$2\\2\\90\\0"}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$3", "L$4", "L$5", "I$0", "I$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LotoRepository.this.refreshResults(this);
        }
    }

    @Inject
    public LotoRepository(LotoApiService apiService, DrawDao drawDao, StatisticsDao statisticsDao, Gson gson) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(drawDao, "drawDao");
        Intrinsics.checkNotNullParameter(statisticsDao, "statisticsDao");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.apiService = apiService;
        this.drawDao = drawDao;
        this.statisticsDao = statisticsDao;
        this.gson = gson;
        final Flow<List<DrawEntity>> allDraws = this.drawDao.getAllDraws();
        this.allDraws = FlowKt.distinctUntilChanged(new Flow<List<? extends Draw>>() { // from class: lnb.predict.earn.data.repository.LotoRepository$special$$inlined$map$1

            /* JADX INFO: renamed from: lnb.predict.earn.data.repository.LotoRepository$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ LotoRepository this$0;

                /* JADX INFO: renamed from: lnb.predict.earn.data.repository.LotoRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(c = "lnb.predict.earn.data.repository.LotoRepository$special$$inlined$map$1$2", f = "LotoRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LotoRepository lotoRepository) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = lotoRepository;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object value, Continuation $completion) {
                    AnonymousClass1 anonymousClass1;
                    if ($completion instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) $completion;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1($completion);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1($completion);
                    }
                    Object $result = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (anonymousClass1.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            FlowCollector $this$map_u24lambda_u245 = this.$this_unsafeFlow;
                            Continuation $completion2 = anonymousClass1;
                            Iterable iterable = (List) value;
                            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                            Iterator<T> it = iterable.iterator();
                            while (it.hasNext()) {
                                arrayList.add(this.this$0.toDomain((DrawEntity) it.next()));
                                $result = $result;
                            }
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable($completion2);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable($this$map_u24lambda_u245);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if ($this$map_u24lambda_u245.emit((List) arrayList, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            break;
                        case 1:
                            int i = anonymousClass1.I$0;
                            Object obj = anonymousClass1.L$2;
                            Object obj2 = anonymousClass1.L$0;
                            ResultKt.throwOnFailure($result);
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Draw>> flowCollector, Continuation $completion) {
                Object objCollect = allDraws.collect(new AnonymousClass2(flowCollector, this), $completion);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        final Flow<StatisticsEntity> globalStats = this.statisticsDao.getGlobalStats();
        this.savedStatistics = FlowKt.distinctUntilChanged(new Flow<GlobalStatistics>() { // from class: lnb.predict.earn.data.repository.LotoRepository$special$$inlined$map$2

            /* JADX INFO: renamed from: lnb.predict.earn.data.repository.LotoRepository$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ LotoRepository this$0;

                /* JADX INFO: renamed from: lnb.predict.earn.data.repository.LotoRepository$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(c = "lnb.predict.earn.data.repository.LotoRepository$special$$inlined$map$2$2", f = "LotoRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LotoRepository lotoRepository) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = lotoRepository;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object value, Continuation $completion) {
                    AnonymousClass1 anonymousClass1;
                    GlobalStatistics globalStatistics;
                    Object objM7068constructorimpl;
                    if ($completion instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) $completion;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1($completion);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1($completion);
                    }
                    AnonymousClass1 anonymousClass2 = anonymousClass1;
                    Object $result = anonymousClass2.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (anonymousClass2.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            FlowCollector $this$map_u24lambda_u245 = this.$this_unsafeFlow;
                            StatisticsEntity statisticsEntity = (StatisticsEntity) value;
                            if (statisticsEntity != null) {
                                LotoRepository lotoRepository = this.this$0;
                                try {
                                    Result.Companion companion = Result.INSTANCE;
                                    objM7068constructorimpl = Result.m7068constructorimpl((GlobalStatistics) lotoRepository.gson.fromJson(statisticsEntity.getJsonContent(), (Class) GlobalStatistics.class));
                                } catch (Throwable th) {
                                    Result.Companion companion2 = Result.INSTANCE;
                                    objM7068constructorimpl = Result.m7068constructorimpl(ResultKt.createFailure(th));
                                }
                                globalStatistics = (GlobalStatistics) (Result.m7074isFailureimpl(objM7068constructorimpl) ? null : objM7068constructorimpl);
                            } else {
                                globalStatistics = null;
                            }
                            anonymousClass2.L$0 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass2.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass2);
                            anonymousClass2.L$2 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass2.L$3 = SpillingKt.nullOutSpilledVariable($this$map_u24lambda_u245);
                            anonymousClass2.I$0 = 0;
                            anonymousClass2.label = 1;
                            if ($this$map_u24lambda_u245.emit(globalStatistics, anonymousClass2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            break;
                        case 1:
                            int i = anonymousClass2.I$0;
                            Object obj = anonymousClass2.L$2;
                            Object obj2 = anonymousClass2.L$0;
                            ResultKt.throwOnFailure($result);
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super GlobalStatistics> flowCollector, Continuation $completion) {
                Object objCollect = globalStats.collect(new AnonymousClass2(flowCollector, this), $completion);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public final Flow<List<Draw>> getAllDraws() {
        return this.allDraws;
    }

    public final Flow<GlobalStatistics> getSavedStatistics() {
        return this.savedStatistics;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2 A[Catch: Exception -> 0x0159, TRY_LEAVE, TryCatch #1 {Exception -> 0x0159, blocks: (B:37:0x00bc, B:39:0x00c2), top: B:65:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x010d A[Catch: Exception -> 0x0153, TRY_LEAVE, TryCatch #2 {Exception -> 0x0153, blocks: (B:43:0x0105, B:45:0x010d), top: B:67:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x013e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x013f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x013f -> B:49:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x014a -> B:51:0x0150). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object refreshResults(kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lnb.predict.earn.data.repository.LotoRepository.refreshResults(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveDraws(List<Draw> list, Continuation<? super Unit> continuation) {
        List<Draw> list2 = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toEntity((Draw) it.next()));
        }
        List entities = (List) arrayList;
        Object objInsertDraws = this.drawDao.insertDraws(entities, continuation);
        return objInsertDraws == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertDraws : Unit.INSTANCE;
    }

    private final DrawEntity toEntity(Draw $this$toEntity) {
        String id = $this$toEntity.getId();
        String string = $this$toEntity.getDate().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new DrawEntity(id, string, $this$toEntity.getYear(), $this$toEntity.getMonth(), $this$toEntity.getDay(), $this$toEntity.getDrawName(), $this$toEntity.getDrawType(), CollectionsKt.joinToString$default($this$toEntity.getNumbers(), ",", null, null, 0, null, null, 62, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Draw toDomain(DrawEntity $this$toDomain) {
        String id = $this$toDomain.getId();
        LocalDate localDate = LocalDate.parse($this$toDomain.getDate());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        int year = $this$toDomain.getYear();
        int month = $this$toDomain.getMonth();
        int day = $this$toDomain.getDay();
        String drawName = $this$toDomain.getDrawName();
        String drawType = $this$toDomain.getDrawType();
        Iterable iterableSplit$default = StringsKt.split$default((CharSequence) $this$toDomain.getNumbers(), new String[]{","}, false, 0, 6, (Object) null);
        Collection arrayList = new ArrayList();
        Iterator it = iterableSplit$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
            iterableSplit$default = iterableSplit$default;
        }
        return new Draw(id, localDate, year, month, day, drawName, drawType, (List) arrayList);
    }
}
