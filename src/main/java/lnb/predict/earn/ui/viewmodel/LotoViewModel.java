package lnb.predict.earn.ui.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lnb.predict.earn.data.repository.LotoRepository;
import lnb.predict.earn.domain.model.Draw;
import lnb.predict.earn.domain.model.GlobalStatistics;
import lnb.predict.earn.domain.model.NumberStats;
import lnb.predict.earn.domain.service.StatisticsService;
import lnb.predict.earn.domain.sync.SyncManager;

/* JADX INFO: compiled from: LotoViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010>\u001a\u00020?J\u0015\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010BJ\u0015\u0010C\u001a\u00020?2\b\u0010D\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010BJ\u0010\u0010E\u001a\u00020?2\b\u0010F\u001a\u0004\u0018\u00010\u0018J\u000e\u0010G\u001a\u00020?2\u0006\u0010H\u001a\u00020\u0018J\u000e\u0010I\u001a\u00020?2\u0006\u0010H\u001a\u00020\u0018J\u0006\u0010J\u001a\u00020?J\u000e\u0010K\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0013R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0013R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0%0\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0013R\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0%0\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0013R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180%0\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0013R\u0019\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0013R\u0016\u00103\u001a\n \f*\u0004\u0018\u00010404X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\n \f*\u0004\u0018\u00010404X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080%0\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0013R%\u0010:\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000f\u0018\u00010;0\u0011¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0013¨\u0006L"}, d2 = {"Llnb/predict/earn/ui/viewmodel/LotoViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Llnb/predict/earn/data/repository/LotoRepository;", "syncManager", "Llnb/predict/earn/domain/sync/SyncManager;", "statisticsService", "Llnb/predict/earn/domain/service/StatisticsService;", "<init>", "(Llnb/predict/earn/data/repository/LotoRepository;Llnb/predict/earn/domain/sync/SyncManager;Llnb/predict/earn/domain/service/StatisticsService;)V", "now", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "_selectedYear", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "selectedYear", "Lkotlinx/coroutines/flow/StateFlow;", "getSelectedYear", "()Lkotlinx/coroutines/flow/StateFlow;", "_selectedMonth", "selectedMonth", "getSelectedMonth", "_selectedDrawType", "", "selectedDrawType", "getSelectedDrawType", "_searchQuery", "searchQuery", "getSearchQuery", "_statSearchQuery", "statSearchQuery", "getStatSearchQuery", "_isSyncing", "", "isSyncing", "draws", "", "Llnb/predict/earn/domain/model/Draw;", "getDraws", "filteredDraws", "getFilteredDraws", "availableYears", "getAvailableYears", "availableMonthsForYear", "getAvailableMonthsForYear", "availableDrawTypes", "getAvailableDrawTypes", "globalStats", "Llnb/predict/earn/domain/model/GlobalStatistics;", "getGlobalStats", "DAY_FORMATTER", "Ljava/time/format/DateTimeFormatter;", "MONTH_FORMATTER", "DRAW_ORDER", "hierarchicalDraws", "Llnb/predict/earn/ui/viewmodel/YearGroup;", "getHierarchicalDraws", "searchedNumberStats", "Lkotlin/Pair;", "Llnb/predict/earn/domain/model/NumberStats;", "getSearchedNumberStats", "startSync", "", "setYear", "year", "(Ljava/lang/Integer;)V", "setMonth", "month", "setDrawType", "type", "updateSearchQuery", "query", "updateStatSearchQuery", "refresh", "monthName", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LotoViewModel extends ViewModel {
    public static final int $stable = 8;
    private final DateTimeFormatter DAY_FORMATTER;
    private final List<String> DRAW_ORDER;
    private final DateTimeFormatter MONTH_FORMATTER;
    private final MutableStateFlow<Boolean> _isSyncing;
    private final MutableStateFlow<String> _searchQuery;
    private final MutableStateFlow<String> _selectedDrawType;
    private final MutableStateFlow<Integer> _selectedMonth;
    private final MutableStateFlow<Integer> _selectedYear;
    private final MutableStateFlow<String> _statSearchQuery;
    private final StateFlow<List<String>> availableDrawTypes;
    private final StateFlow<List<Integer>> availableMonthsForYear;
    private final StateFlow<List<Integer>> availableYears;
    private final StateFlow<List<Draw>> draws;
    private final StateFlow<List<Draw>> filteredDraws;
    private final StateFlow<GlobalStatistics> globalStats;
    private final StateFlow<List<YearGroup>> hierarchicalDraws;
    private final StateFlow<Boolean> isSyncing;
    private final LocalDate now;
    private final LotoRepository repository;
    private final StateFlow<String> searchQuery;
    private final StateFlow<Pair<NumberStats, Integer>> searchedNumberStats;
    private final StateFlow<String> selectedDrawType;
    private final StateFlow<Integer> selectedMonth;
    private final StateFlow<Integer> selectedYear;
    private final StateFlow<String> statSearchQuery;
    private final StatisticsService statisticsService;
    private final SyncManager syncManager;

    @Inject
    public LotoViewModel(LotoRepository repository, SyncManager syncManager, StatisticsService statisticsService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(syncManager, "syncManager");
        Intrinsics.checkNotNullParameter(statisticsService, "statisticsService");
        this.repository = repository;
        this.syncManager = syncManager;
        this.statisticsService = statisticsService;
        this.now = LocalDate.now();
        this._selectedYear = StateFlowKt.MutableStateFlow(Integer.valueOf(this.now.getYear()));
        this.selectedYear = FlowKt.asStateFlow(this._selectedYear);
        this._selectedMonth = StateFlowKt.MutableStateFlow(Integer.valueOf(this.now.getMonthValue()));
        this.selectedMonth = FlowKt.asStateFlow(this._selectedMonth);
        this._selectedDrawType = StateFlowKt.MutableStateFlow(null);
        this.selectedDrawType = FlowKt.asStateFlow(this._selectedDrawType);
        this._searchQuery = StateFlowKt.MutableStateFlow("");
        this.searchQuery = FlowKt.asStateFlow(this._searchQuery);
        this._statSearchQuery = StateFlowKt.MutableStateFlow("");
        this.statSearchQuery = FlowKt.asStateFlow(this._statSearchQuery);
        this._isSyncing = StateFlowKt.MutableStateFlow(false);
        this.isSyncing = FlowKt.asStateFlow(this._isSyncing);
        this.draws = FlowKt.stateIn(FlowKt.flowOn(this.repository.getAllDraws(), Dispatchers.getDefault()), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), CollectionsKt.emptyList());
        this.filteredDraws = FlowKt.stateIn(FlowKt.flowOn(FlowKt.combine(this.draws, this._selectedYear, this._selectedMonth, this._selectedDrawType, this._searchQuery, new LotoViewModel$filteredDraws$1(null)), Dispatchers.getDefault()), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), CollectionsKt.emptyList());
        final Flow flow = this.draws;
        this.availableYears = FlowKt.stateIn(FlowKt.flowOn(new Flow<List<? extends Integer>>() { // from class: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$1$2", f = "LotoViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                                arrayList.add(Boxing.boxInt(((Draw) it.next()).getYear()));
                            }
                            List listSortedDescending = CollectionsKt.sortedDescending(CollectionsKt.distinct((List) arrayList));
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable($completion2);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable($this$map_u24lambda_u245);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if ($this$map_u24lambda_u245.emit(listSortedDescending, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends Integer>> flowCollector, Continuation $completion) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), $completion);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getDefault()), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), CollectionsKt.emptyList());
        this.availableMonthsForYear = FlowKt.stateIn(FlowKt.flowOn(FlowKt.combine(this.draws, this._selectedYear, new LotoViewModel$availableMonthsForYear$1(null)), Dispatchers.getDefault()), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), CollectionsKt.emptyList());
        final Flow flow2 = this.draws;
        this.availableDrawTypes = FlowKt.stateIn(FlowKt.flowOn(new Flow<List<? extends String>>() { // from class: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$2$2", f = "LotoViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                                arrayList.add(((Draw) it.next()).getDrawType());
                            }
                            List listSorted = CollectionsKt.sorted(CollectionsKt.distinct((List) arrayList));
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable($completion2);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable($this$map_u24lambda_u245);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if ($this$map_u24lambda_u245.emit(listSorted, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends String>> flowCollector, Continuation $completion) {
                Object objCollect = flow2.collect(new AnonymousClass2(flowCollector), $completion);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getDefault()), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), CollectionsKt.emptyList());
        final Flow flow3 = this.filteredDraws;
        this.globalStats = FlowKt.stateIn(FlowKt.flowOn(new Flow<GlobalStatistics>() { // from class: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ LotoViewModel this$0;

                /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$3$2", f = "LotoViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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

                public AnonymousClass2(FlowCollector flowCollector, LotoViewModel lotoViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = lotoViewModel;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
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
                            List<Draw> list = (List) value;
                            GlobalStatistics globalStatisticsCalculate = list.isEmpty() ? null : this.this$0.statisticsService.calculate(list);
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable($completion2);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable($this$map_u24lambda_u245);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if ($this$map_u24lambda_u245.emit(globalStatisticsCalculate, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            break;
                        case 1:
                            int i = anonymousClass1.I$0;
                            Object obj = anonymousClass1.L$2;
                            Object value2 = anonymousClass1.L$0;
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
                Object objCollect = flow3.collect(new AnonymousClass2(flowCollector, this), $completion);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getDefault()), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), null);
        this.DAY_FORMATTER = DateTimeFormatter.ofPattern("EEEE dd MMMM", Locale.FRENCH);
        this.MONTH_FORMATTER = DateTimeFormatter.ofPattern("MMMM yyyy", Locale.FRENCH);
        this.DRAW_ORDER = CollectionsKt.listOf((Object[]) new String[]{"Digital 00H", "Fortune 11H", "Fortune 14H", "Fortune 18H", "Digital 21H"});
        final Flow flow4 = this.filteredDraws;
        this.hierarchicalDraws = FlowKt.stateIn(FlowKt.flowOn(new Flow<List<? extends YearGroup>>() { // from class: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$4
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends YearGroup>> flowCollector, Continuation $completion) {
                Object objCollect = flow4.collect(new AnonymousClass2(flowCollector, this), $completion);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$4$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ LotoViewModel this$0;

                /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$4$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$4$2", f = "LotoViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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

                public AnonymousClass2(FlowCollector flowCollector, LotoViewModel lotoViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = lotoViewModel;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object value, Continuation $completion) {
                    AnonymousClass1 anonymousClass1;
                    Object value2;
                    Object obj;
                    Continuation $completion2;
                    List listEmptyList;
                    Object arrayList;
                    Object arrayList2;
                    Object arrayList3;
                    AnonymousClass2<T> anonymousClass2 = this;
                    if ($completion instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) $completion;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = anonymousClass2.new AnonymousClass1($completion);
                        }
                    } else {
                        anonymousClass1 = anonymousClass2.new AnonymousClass1($completion);
                    }
                    Object $result = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (anonymousClass1.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            FlowCollector flowCollector = anonymousClass2.$this_unsafeFlow;
                            Continuation $completion3 = anonymousClass1;
                            Object value3 = value;
                            Continuation continuation = anonymousClass1;
                            List list = (List) value3;
                            int i = 0;
                            if (list.isEmpty()) {
                                listEmptyList = CollectionsKt.emptyList();
                                obj = coroutine_suspended;
                                value2 = value3;
                                $completion2 = $completion3;
                            } else {
                                Map linkedHashMap = new LinkedHashMap();
                                for (Object obj2 : list) {
                                    Integer numBoxInt = Boxing.boxInt(((Draw) obj2).getYear());
                                    Object obj3 = $result;
                                    Object obj4 = linkedHashMap.get(numBoxInt);
                                    if (obj4 == null) {
                                        arrayList3 = new ArrayList();
                                        linkedHashMap.put(numBoxInt, arrayList3);
                                    } else {
                                        arrayList3 = obj4;
                                    }
                                    ((List) arrayList3).add(obj2);
                                    $result = obj3;
                                    value3 = value3;
                                }
                                value2 = value3;
                                Iterable iterableSortedWith = CollectionsKt.sortedWith(MapsKt.toList(linkedHashMap), 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e6: INVOKE (r1v4 'iterableSortedWith' java.lang.Iterable) = 
                                      (wrap java.lang.Iterable:0x00d3: INVOKE (r15v1 'linkedHashMap' java.util.Map) STATIC call: kotlin.collections.MapsKt.toList(java.util.Map):java.util.List A[MD:<K, V>:(java.util.Map<? extends K, ? extends V>):java.util.List<kotlin.Pair<K, V>> (m), WRAPPED] (LINE:68))
                                      (wrap java.util.Comparator:0x00dd: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:70) call: lnb.predict.earn.ui.viewmodel.LotoViewModel$hierarchicalDraws$lambda$18$$inlined$sortedByDescending$1.<init>():void type: CONSTRUCTOR)
                                     STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:70) in method: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$4.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes13.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: lnb.predict.earn.ui.viewmodel.LotoViewModel$hierarchicalDraws$lambda$18$$inlined$sortedByDescending$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 27 more
                                    */
                                /*
                                    Method dump skipped, instruction units count: 1180
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: lnb.predict.earn.ui.viewmodel.LotoViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }
                    }, Dispatchers.getDefault()), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), CollectionsKt.emptyList());
                    this.searchedNumberStats = FlowKt.stateIn(FlowKt.combine(this.globalStats, this._statSearchQuery, new LotoViewModel$searchedNumberStats$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), null);
                    startSync();
                }

                public final StateFlow<Integer> getSelectedYear() {
                    return this.selectedYear;
                }

                public final StateFlow<Integer> getSelectedMonth() {
                    return this.selectedMonth;
                }

                public final StateFlow<String> getSelectedDrawType() {
                    return this.selectedDrawType;
                }

                public final StateFlow<String> getSearchQuery() {
                    return this.searchQuery;
                }

                public final StateFlow<String> getStatSearchQuery() {
                    return this.statSearchQuery;
                }

                public final StateFlow<Boolean> isSyncing() {
                    return this.isSyncing;
                }

                public final StateFlow<List<Draw>> getDraws() {
                    return this.draws;
                }

                public final StateFlow<List<Draw>> getFilteredDraws() {
                    return this.filteredDraws;
                }

                public final StateFlow<List<Integer>> getAvailableYears() {
                    return this.availableYears;
                }

                public final StateFlow<List<Integer>> getAvailableMonthsForYear() {
                    return this.availableMonthsForYear;
                }

                public final StateFlow<List<String>> getAvailableDrawTypes() {
                    return this.availableDrawTypes;
                }

                public final StateFlow<GlobalStatistics> getGlobalStats() {
                    return this.globalStats;
                }

                public final StateFlow<List<YearGroup>> getHierarchicalDraws() {
                    return this.hierarchicalDraws;
                }

                public final StateFlow<Pair<NumberStats, Integer>> getSearchedNumberStats() {
                    return this.searchedNumberStats;
                }

                /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.LotoViewModel$startSync$1, reason: invalid class name */
                /* JADX INFO: compiled from: LotoViewModel.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.LotoViewModel$startSync$1", f = "LotoViewModel.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;

                    AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return LotoViewModel.this.new AnonymousClass1(continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object $result) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        try {
                            switch (this.label) {
                                case 0:
                                    ResultKt.throwOnFailure($result);
                                    LotoViewModel.this._isSyncing.setValue(Boxing.boxBoolean(true));
                                    this.label = 1;
                                    if (LotoViewModel.this.syncManager.performSync(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    break;
                                case 1:
                                    ResultKt.throwOnFailure($result);
                                    break;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            LotoViewModel.this._isSyncing.setValue(Boxing.boxBoolean(false));
                        }
                        return Unit.INSTANCE;
                    }
                }

                public final void startSync() {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
                }

                public final void setYear(Integer year) {
                    this._selectedYear.setValue(year);
                    this._selectedMonth.setValue(null);
                }

                public final void setMonth(Integer month) {
                    this._selectedMonth.setValue(month);
                }

                public final void setDrawType(String type) {
                    this._selectedDrawType.setValue(type);
                }

                public final void updateSearchQuery(String query) {
                    Intrinsics.checkNotNullParameter(query, "query");
                    this._searchQuery.setValue(query);
                }

                public final void updateStatSearchQuery(String query) {
                    Intrinsics.checkNotNullParameter(query, "query");
                    this._statSearchQuery.setValue(query);
                }

                public final void refresh() {
                    startSync();
                }

                public final String monthName(int month) {
                    switch (month) {
                        case 1:
                            return "Janvier";
                        case 2:
                            return "Février";
                        case 3:
                            return "Mars";
                        case 4:
                            return "Avril";
                        case 5:
                            return "Mai";
                        case 6:
                            return "Juin";
                        case 7:
                            return "Juillet";
                        case 8:
                            return "Août";
                        case 9:
                            return "Septembre";
                        case 10:
                            return "Octobre";
                        case 11:
                            return "Novembre";
                        case 12:
                            return "Décembre";
                        default:
                            return "";
                    }
                }
            }
