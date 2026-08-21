package lnb.predict.earn.ui.viewmodel;

import android.util.LruCache;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.android.material.timepicker.TimeModel;
import com.google.gson.Gson;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
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
import lnb.predict.earn.data.local.AnalyticsMetadataEntity;
import lnb.predict.earn.data.local.BacktestResultEntity;
import lnb.predict.earn.data.local.MonthlyAnalyticsEntity;
import lnb.predict.earn.data.local.PredictionEntity;
import lnb.predict.earn.data.local.WeightEntity;
import lnb.predict.earn.data.repository.AnalysisRepository;
import lnb.predict.earn.data.repository.IndexedAnalyticsRepository;
import lnb.predict.earn.data.repository.LotoRepository;
import lnb.predict.earn.domain.model.AssociationStats;
import lnb.predict.earn.domain.model.BacktestReport;
import lnb.predict.earn.domain.model.DelayStats;
import lnb.predict.earn.domain.model.Draw;
import lnb.predict.earn.domain.model.FrequencyStats;
import lnb.predict.earn.domain.model.GlobalAnalysis;
import lnb.predict.earn.domain.model.HourlyStats;
import lnb.predict.earn.domain.model.NumberProfile;
import lnb.predict.earn.domain.model.PredictionResult;
import lnb.predict.earn.domain.model.RepetitionStats;
import lnb.predict.earn.domain.service.AdvancedAnalysisService;

/* JADX INFO: compiled from: AnalysisViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u00107\u001a\u000208H\u0002J\u0006\u00109\u001a\u000208J\b\u0010:\u001a\u000208H\u0002J\b\u0010;\u001a\u000208H\u0002J.\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020\u00102\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u001c2\b\u0010@\u001a\u0004\u0018\u00010$H\u0082@¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u0011H\u0002J\u000e\u0010D\u001a\u0002082\u0006\u0010=\u001a\u00020\u0010J\b\u0010E\u001a\u000208H\u0002J\b\u0010F\u001a\u000208H\u0002J\u001c\u0010G\u001a\u0002082\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u001cH\u0082@¢\u0006\u0002\u0010HJ\u000e\u0010I\u001a\u0002082\u0006\u0010J\u001a\u00020\u0010J\u000e\u0010K\u001a\u0002082\u0006\u0010L\u001a\u00020\u0010J\u0015\u0010M\u001a\u0002082\b\u0010N\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010OR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001c0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001c0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0015¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0016\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0017R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0017R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u001c0\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0017R\u0019\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0017¨\u0006P"}, d2 = {"Llnb/predict/earn/ui/viewmodel/AnalysisViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Llnb/predict/earn/data/repository/LotoRepository;", "analysisRepository", "Llnb/predict/earn/data/repository/AnalysisRepository;", "indexedRepository", "Llnb/predict/earn/data/repository/IndexedAnalyticsRepository;", "analysisService", "Llnb/predict/earn/domain/service/AdvancedAnalysisService;", "gson", "Lcom/google/gson/Gson;", "<init>", "(Llnb/predict/earn/data/repository/LotoRepository;Llnb/predict/earn/data/repository/AnalysisRepository;Llnb/predict/earn/data/repository/IndexedAnalyticsRepository;Llnb/predict/earn/domain/service/AdvancedAnalysisService;Lcom/google/gson/Gson;)V", "cache", "Landroid/util/LruCache;", "", "Llnb/predict/earn/domain/model/GlobalAnalysis;", "_currentTab", "Lkotlinx/coroutines/flow/MutableStateFlow;", "currentTab", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentTab", "()Lkotlinx/coroutines/flow/StateFlow;", "_selectedPeriod", "selectedPeriod", "getSelectedPeriod", "_availablePeriods", "", "availablePeriods", "getAvailablePeriods", "_selectedNumber", "", "selectedNumber", "getSelectedNumber", "_weights", "Llnb/predict/earn/data/local/WeightEntity;", "weights", "getWeights", "_analysisState", "globalAnalysis", "getGlobalAnalysis", "_backtestReport", "Llnb/predict/earn/domain/model/BacktestReport;", "backtestReport", "getBacktestReport", "_isBacktesting", "", "isBacktesting", "predictions", "Llnb/predict/earn/data/local/PredictionEntity;", "getPredictions", "predictionResult", "Llnb/predict/earn/domain/model/PredictionResult;", "getPredictionResult", "loadLatestBacktest", "", "runBacktest", "observeDrawsForPeriods", "observePeriodChange", "loadAnalysis", "period", "draws", "Llnb/predict/earn/domain/model/Draw;", "w", "(Ljava/lang/String;Ljava/util/List;Llnb/predict/earn/data/local/WeightEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculatePredictionResult", "analysis", "setPeriod", "loadWeights", "observeDrawsForLearning", "evaluateAndLearn", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateAndSavePrediction", "drawName", "setTab", "tab", "selectNumber", "num", "(Ljava/lang/Integer;)V", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AnalysisViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<GlobalAnalysis> _analysisState;
    private final MutableStateFlow<List<String>> _availablePeriods;
    private final MutableStateFlow<BacktestReport> _backtestReport;
    private final MutableStateFlow<String> _currentTab;
    private final MutableStateFlow<Boolean> _isBacktesting;
    private final MutableStateFlow<Integer> _selectedNumber;
    private final MutableStateFlow<String> _selectedPeriod;
    private final MutableStateFlow<WeightEntity> _weights;
    private final AnalysisRepository analysisRepository;
    private final AdvancedAnalysisService analysisService;
    private final StateFlow<List<String>> availablePeriods;
    private final StateFlow<BacktestReport> backtestReport;
    private final LruCache<String, GlobalAnalysis> cache;
    private final StateFlow<String> currentTab;
    private final StateFlow<GlobalAnalysis> globalAnalysis;
    private final Gson gson;
    private final IndexedAnalyticsRepository indexedRepository;
    private final StateFlow<Boolean> isBacktesting;
    private final StateFlow<PredictionResult> predictionResult;
    private final StateFlow<List<PredictionEntity>> predictions;
    private final LotoRepository repository;
    private final StateFlow<Integer> selectedNumber;
    private final StateFlow<String> selectedPeriod;
    private final StateFlow<WeightEntity> weights;

    /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$evaluateAndLearn$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnalysisViewModel.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel", f = "AnalysisViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3}, l = {189, 197, ComposerKt.providerValuesKey, 205}, m = "evaluateAndLearn", n = {"draws", "draws", "unevaluated", "evaluated", "$this$forEach\\1", "element\\1", "pred\\2", "result\\2", "actual\\2", "$i$f$forEach\\1\\193", "$i$a$-forEach-AnalysisViewModel$evaluateAndLearn$2\\2\\235\\0", "draws", "unevaluated", "evaluated", "draws", "unevaluated", "evaluated", "currentW", "newW"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
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
            return AnalysisViewModel.this.evaluateAndLearn(null, this);
        }
    }

    /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$loadAnalysis$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalysisViewModel.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel", f = "AnalysisViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {127, 134}, m = "loadAnalysis", n = {"period", "draws", "w", "cacheKey", "cached", "period", "draws", "w", "cacheKey", "cached"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class C08111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C08111(Continuation<? super C08111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalysisViewModel.this.loadAnalysis(null, null, null, this);
        }
    }

    @Inject
    public AnalysisViewModel(LotoRepository repository, AnalysisRepository analysisRepository, IndexedAnalyticsRepository indexedRepository, AdvancedAnalysisService analysisService, Gson gson) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analysisRepository, "analysisRepository");
        Intrinsics.checkNotNullParameter(indexedRepository, "indexedRepository");
        Intrinsics.checkNotNullParameter(analysisService, "analysisService");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.repository = repository;
        this.analysisRepository = analysisRepository;
        this.indexedRepository = indexedRepository;
        this.analysisService = analysisService;
        this.gson = gson;
        this.cache = new LruCache<>(12);
        this._currentTab = StateFlowKt.MutableStateFlow("Fréquences");
        this.currentTab = FlowKt.asStateFlow(this._currentTab);
        this._selectedPeriod = StateFlowKt.MutableStateFlow("Global");
        this.selectedPeriod = FlowKt.asStateFlow(this._selectedPeriod);
        this._availablePeriods = StateFlowKt.MutableStateFlow(CollectionsKt.listOf("Global"));
        this.availablePeriods = FlowKt.asStateFlow(this._availablePeriods);
        this._selectedNumber = StateFlowKt.MutableStateFlow(null);
        this.selectedNumber = FlowKt.asStateFlow(this._selectedNumber);
        this._weights = StateFlowKt.MutableStateFlow(null);
        this.weights = FlowKt.asStateFlow(this._weights);
        this._analysisState = StateFlowKt.MutableStateFlow(null);
        this.globalAnalysis = FlowKt.asStateFlow(this._analysisState);
        this._backtestReport = StateFlowKt.MutableStateFlow(null);
        this.backtestReport = FlowKt.asStateFlow(this._backtestReport);
        this._isBacktesting = StateFlowKt.MutableStateFlow(false);
        this.isBacktesting = FlowKt.asStateFlow(this._isBacktesting);
        this.predictions = FlowKt.stateIn(this.analysisRepository.getAllPredictions(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), CollectionsKt.emptyList());
        final Flow flow = this._analysisState;
        this.predictionResult = FlowKt.stateIn(new Flow<PredictionResult>() { // from class: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AnalysisViewModel this$0;

                /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel$special$$inlined$map$1$2", f = "AnalysisViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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

                public AnonymousClass2(FlowCollector flowCollector, AnalysisViewModel analysisViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = analysisViewModel;
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
                            GlobalAnalysis globalAnalysis = (GlobalAnalysis) value;
                            PredictionResult predictionResultCalculatePredictionResult = globalAnalysis == null ? null : this.this$0.calculatePredictionResult(globalAnalysis);
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable($completion2);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(value);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable($this$map_u24lambda_u245);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if ($this$map_u24lambda_u245.emit(predictionResultCalculatePredictionResult, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super PredictionResult> flowCollector, Continuation $completion) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), $completion);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), null);
        loadWeights();
        loadLatestBacktest();
        observeDrawsForPeriods();
        observePeriodChange();
        observeDrawsForLearning();
    }

    public final StateFlow<String> getCurrentTab() {
        return this.currentTab;
    }

    public final StateFlow<String> getSelectedPeriod() {
        return this.selectedPeriod;
    }

    public final StateFlow<List<String>> getAvailablePeriods() {
        return this.availablePeriods;
    }

    public final StateFlow<Integer> getSelectedNumber() {
        return this.selectedNumber;
    }

    public final StateFlow<WeightEntity> getWeights() {
        return this.weights;
    }

    public final StateFlow<GlobalAnalysis> getGlobalAnalysis() {
        return this.globalAnalysis;
    }

    public final StateFlow<BacktestReport> getBacktestReport() {
        return this.backtestReport;
    }

    public final StateFlow<Boolean> isBacktesting() {
        return this.isBacktesting;
    }

    public final StateFlow<List<PredictionEntity>> getPredictions() {
        return this.predictions;
    }

    public final StateFlow<PredictionResult> getPredictionResult() {
        return this.predictionResult;
    }

    /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$loadLatestBacktest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalysisViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel$loadLatestBacktest$1", f = "AnalysisViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class C08121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C08121(Continuation<? super C08121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnalysisViewModel.this.new C08121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object latestBacktest;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    latestBacktest = AnalysisViewModel.this.analysisRepository.getLatestBacktest(this);
                    if (latestBacktest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    latestBacktest = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BacktestResultEntity entity = (BacktestResultEntity) latestBacktest;
            if (entity != null) {
                AnalysisViewModel.this._backtestReport.setValue(AnalysisViewModel.this.gson.fromJson(entity.getJsonContent(), BacktestReport.class));
            }
            return Unit.INSTANCE;
        }
    }

    private final void loadLatestBacktest() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08121(null), 3, null);
    }

    public final void runBacktest() {
        if (this._isBacktesting.getValue().booleanValue()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C08171(null), 2, null);
    }

    /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$runBacktest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalysisViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel$runBacktest$1", f = "AnalysisViewModel.kt", i = {1, 1}, l = {87, 90}, m = "invokeSuspend", n = {"draws", "report"}, s = {"L$0", "L$1"})
    static final class C08171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C08171(Continuation<? super C08171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnalysisViewModel.this.new C08171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x007e  */
        /* JADX WARN: Code duplicated, block: B:18:0x009e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x009f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            BacktestReport report;
            AnalysisRepository analysisRepository;
            String json;
            Draw draw;
            String id;
            String str;
            BacktestReport report2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    AnalysisViewModel.this._isBacktesting.setValue(Boxing.boxBoolean(true));
                    this.label = 1;
                    objFirst = FlowKt.first(AnalysisViewModel.this.repository.getAllDraws(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List draws = (List) objFirst;
                    report = AdvancedAnalysisService.performBacktest$default(AnalysisViewModel.this.analysisService, draws, 0, 2, null);
                    analysisRepository = AnalysisViewModel.this.analysisRepository;
                    json = AnalysisViewModel.this.gson.toJson(report);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    draw = (Draw) CollectionsKt.lastOrNull(draws);
                    if (draw != null || (id = draw.getId()) == null) {
                        id = "";
                    }
                    str = null;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(draws);
                    this.L$1 = report;
                    this.label = 2;
                    if (analysisRepository.saveBacktest(new BacktestResultEntity(str, json, id, System.currentTimeMillis(), 1, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    report2 = report;
                    AnalysisViewModel.this._backtestReport.setValue(report2);
                    AnalysisViewModel.this._isBacktesting.setValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    List draws2 = (List) objFirst;
                    report = AdvancedAnalysisService.performBacktest$default(AnalysisViewModel.this.analysisService, draws2, 0, 2, null);
                    analysisRepository = AnalysisViewModel.this.analysisRepository;
                    json = AnalysisViewModel.this.gson.toJson(report);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    draw = (Draw) CollectionsKt.lastOrNull(draws2);
                    if (draw != null) {
                        id = "";
                    } else {
                        id = "";
                    }
                    str = null;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(draws2);
                    this.L$1 = report;
                    this.label = 2;
                    if (analysisRepository.saveBacktest(new BacktestResultEntity(str, json, id, System.currentTimeMillis(), 1, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    report2 = report;
                    AnalysisViewModel.this._backtestReport.setValue(report2);
                    AnalysisViewModel.this._isBacktesting.setValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                case 2:
                    report2 = (BacktestReport) this.L$1;
                    ResultKt.throwOnFailure($result);
                    AnalysisViewModel.this._backtestReport.setValue(report2);
                    AnalysisViewModel.this._isBacktesting.setValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$observeDrawsForPeriods$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalysisViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "draws", "", "Llnb/predict/earn/domain/model/Draw;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel$observeDrawsForPeriods$1", f = "AnalysisViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C08151 extends SuspendLambda implements Function2<List<? extends Draw>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C08151(Continuation<? super C08151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08151 c08151 = AnalysisViewModel.this.new C08151(continuation);
            c08151.L$0 = obj;
            return c08151;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends Draw> list, Continuation<? super Unit> continuation) {
            return invoke2((List<Draw>) list, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<Draw> list, Continuation<? super Unit> continuation) {
            return ((C08151) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            List draws = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (draws.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    List<Draw> list = draws;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (Draw draw : list) {
                        int year = draw.getYear();
                        String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Boxing.boxInt(draw.getMonth())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        arrayList.add(year + "_" + str);
                    }
                    List months = CollectionsKt.sortedDescending(CollectionsKt.distinct((List) arrayList));
                    AnalysisViewModel.this._availablePeriods.setValue(CollectionsKt.plus((Collection) CollectionsKt.listOf("Global"), (Iterable) months));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void observeDrawsForPeriods() {
        FlowKt.launchIn(FlowKt.onEach(this.repository.getAllDraws(), new C08151(null)), ViewModelKt.getViewModelScope(this));
    }

    /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$observePeriodChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalysisViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "", "", "Llnb/predict/earn/domain/model/Draw;", "Llnb/predict/earn/data/local/WeightEntity;", "period", "draws", "w"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel$observePeriodChange$1", f = "AnalysisViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C08161 extends SuspendLambda implements Function4<String, List<? extends Draw>, WeightEntity, Continuation<? super Triple<? extends String, ? extends List<? extends Draw>, ? extends WeightEntity>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        C08161(Continuation<? super C08161> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(String str, List<? extends Draw> list, WeightEntity weightEntity, Continuation<? super Triple<? extends String, ? extends List<? extends Draw>, ? extends WeightEntity>> continuation) {
            return invoke2(str, (List<Draw>) list, weightEntity, (Continuation<? super Triple<String, ? extends List<Draw>, WeightEntity>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(String str, List<Draw> list, WeightEntity weightEntity, Continuation<? super Triple<String, ? extends List<Draw>, WeightEntity>> continuation) {
            C08161 c08161 = new C08161(continuation);
            c08161.L$0 = str;
            c08161.L$1 = list;
            c08161.L$2 = weightEntity;
            return c08161.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            String period = (String) this.L$0;
            List draws = (List) this.L$1;
            WeightEntity w = (WeightEntity) this.L$2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return new Triple(period, draws, w);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void observePeriodChange() {
        FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(this._selectedPeriod, this.repository.getAllDraws(), this._weights, new C08161(null)), new AnonymousClass2(null)), ViewModelKt.getViewModelScope(this));
    }

    /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$observePeriodChange$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnalysisViewModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Triple;", "", "", "Llnb/predict/earn/domain/model/Draw;", "Llnb/predict/earn/data/local/WeightEntity;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel$observePeriodChange$2", f = "AnalysisViewModel.kt", i = {0, 0, 0, 0}, l = {113}, m = "invokeSuspend", n = {"<destruct>", "period", "draws", "w"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Triple<? extends String, ? extends List<? extends Draw>, ? extends WeightEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = AnalysisViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Triple<? extends String, ? extends List<? extends Draw>, ? extends WeightEntity> triple, Continuation<? super Unit> continuation) {
            return invoke2((Triple<String, ? extends List<Draw>, WeightEntity>) triple, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Triple<String, ? extends List<Draw>, WeightEntity> triple, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(triple, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Triple triple = (Triple) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    String period = (String) triple.component1();
                    List draws = (List) triple.component2();
                    WeightEntity w = (WeightEntity) triple.component3();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(triple);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(period);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(draws);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(w);
                    this.label = 1;
                    if (AnalysisViewModel.this.loadAnalysis(period, draws, w, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:45:0x014d A[LOOP:0: B:43:0x0147->B:45:0x014d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0199  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public final Object loadAnalysis(String period, List<Draw> list, WeightEntity w, Continuation<? super Unit> continuation) {
        C08111 c08111;
        String cacheKey;
        Object monthly;
        Object metadata;
        AnalyticsMetadataEntity metadata2;
        String globalJsonContent;
        GlobalAnalysis analysis;
        MonthlyAnalyticsEntity monthly2;
        Collection arrayList;
        Iterator it;
        int year;
        Collection arrayList2;
        Draw draw;
        boolean z;
        String period2 = period;
        List<Draw> list2 = list;
        WeightEntity w2 = w;
        if (continuation instanceof C08111) {
            c08111 = (C08111) continuation;
            if ((c08111.label & Integer.MIN_VALUE) != 0) {
                c08111.label -= Integer.MIN_VALUE;
            } else {
                c08111 = new C08111(continuation);
            }
        } else {
            c08111 = new C08111(continuation);
        }
        Object $result = c08111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c08111.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                cacheKey = period2 + "_" + (w2 != null ? w2.hashCode() : 0);
                GlobalAnalysis cached = this.cache.get(cacheKey);
                if (cached != null) {
                    this._analysisState.setValue(cached);
                    return Unit.INSTANCE;
                }
                boolean zAreEqual = Intrinsics.areEqual(period2, "Global");
                IndexedAnalyticsRepository indexedAnalyticsRepository = this.indexedRepository;
                if (zAreEqual) {
                    c08111.L$0 = SpillingKt.nullOutSpilledVariable(period2);
                    c08111.L$1 = list2;
                    c08111.L$2 = w2;
                    c08111.L$3 = cacheKey;
                    c08111.L$4 = SpillingKt.nullOutSpilledVariable(cached);
                    c08111.label = 1;
                    metadata = indexedAnalyticsRepository.getMetadata(c08111);
                    if (metadata == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    metadata2 = (AnalyticsMetadataEntity) metadata;
                    if (metadata2 != null) {
                        globalJsonContent = metadata2.getGlobalJsonContent();
                    } else {
                        globalJsonContent = null;
                    }
                    if (globalJsonContent != null) {
                        analysis = (GlobalAnalysis) this.gson.fromJson(metadata2.getGlobalJsonContent(), GlobalAnalysis.class);
                    } else {
                        analysis = this.analysisService.performFullAnalysis(list2, w2);
                    }
                    if (analysis != null) {
                        this.cache.put(cacheKey, analysis);
                        this._analysisState.setValue(analysis);
                    }
                    return Unit.INSTANCE;
                }
                c08111.L$0 = period2;
                c08111.L$1 = list2;
                c08111.L$2 = w2;
                c08111.L$3 = cacheKey;
                c08111.L$4 = SpillingKt.nullOutSpilledVariable(cached);
                c08111.label = 2;
                monthly = indexedAnalyticsRepository.getMonthly(period2, c08111);
                if (monthly == coroutine_suspended) {
                    return coroutine_suspended;
                }
                monthly2 = (MonthlyAnalyticsEntity) monthly;
                if (monthly2 != null) {
                    analysis = (GlobalAnalysis) this.gson.fromJson(monthly2.getJsonContent(), GlobalAnalysis.class);
                } else {
                    Iterable iterableSplit$default = StringsKt.split$default((CharSequence) period2, new String[]{"_"}, false, 0, 6, (Object) null);
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableSplit$default, 10));
                    it = iterableSplit$default.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boxing.boxInt(Integer.parseInt((String) it.next())));
                    }
                    ArrayList arrayList3 = (List) arrayList;
                    year = ((Number) arrayList3.get(0)).intValue();
                    int month = ((Number) arrayList3.get(1)).intValue();
                    arrayList2 = new ArrayList();
                    for (Object obj : list2) {
                        draw = (Draw) obj;
                        if (draw.getYear() == year || draw.getMonth() != month) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            arrayList2.add(obj);
                        }
                    }
                    List monthDraws = (List) arrayList2;
                    analysis = this.analysisService.performFullAnalysis(monthDraws, w2);
                }
                if (analysis != null) {
                    this.cache.put(cacheKey, analysis);
                    this._analysisState.setValue(analysis);
                }
                return Unit.INSTANCE;
            case 1:
                cacheKey = (String) c08111.L$3;
                w2 = (WeightEntity) c08111.L$2;
                list2 = (List) c08111.L$1;
                ResultKt.throwOnFailure($result);
                metadata = $result;
                metadata2 = (AnalyticsMetadataEntity) metadata;
                if (metadata2 != null) {
                    globalJsonContent = metadata2.getGlobalJsonContent();
                } else {
                    globalJsonContent = null;
                }
                if (globalJsonContent != null) {
                    analysis = (GlobalAnalysis) this.gson.fromJson(metadata2.getGlobalJsonContent(), GlobalAnalysis.class);
                } else {
                    analysis = this.analysisService.performFullAnalysis(list2, w2);
                }
                if (analysis != null) {
                    this.cache.put(cacheKey, analysis);
                    this._analysisState.setValue(analysis);
                }
                return Unit.INSTANCE;
            case 2:
                cacheKey = (String) c08111.L$3;
                w2 = (WeightEntity) c08111.L$2;
                list2 = (List) c08111.L$1;
                period2 = (String) c08111.L$0;
                ResultKt.throwOnFailure($result);
                monthly = $result;
                monthly2 = (MonthlyAnalyticsEntity) monthly;
                if (monthly2 != null) {
                    analysis = (GlobalAnalysis) this.gson.fromJson(monthly2.getJsonContent(), GlobalAnalysis.class);
                } else {
                    Iterable iterableSplit$default2 = StringsKt.split$default((CharSequence) period2, new String[]{"_"}, false, 0, 6, (Object) null);
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableSplit$default2, 10));
                    it = iterableSplit$default2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boxing.boxInt(Integer.parseInt((String) it.next())));
                    }
                    ArrayList arrayList4 = (List) arrayList;
                    year = ((Number) arrayList4.get(0)).intValue();
                    int month2 = ((Number) arrayList4.get(1)).intValue();
                    arrayList2 = new ArrayList();
                    while (r18.hasNext()) {
                        draw = (Draw) obj;
                        if (draw.getYear() == year) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList2.add(obj);
                        }
                    }
                    List monthDraws2 = (List) arrayList2;
                    analysis = this.analysisService.performFullAnalysis(monthDraws2, w2);
                }
                if (analysis != null) {
                    this.cache.put(cacheKey, analysis);
                    this._analysisState.setValue(analysis);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PredictionResult calculatePredictionResult(GlobalAnalysis analysis) {
        Object obj;
        Object next;
        Iterable intRange = new IntRange(1, 90);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            Double d = analysis.getScores().get(Integer.valueOf(iNextInt));
            double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
            Iterator<T> it2 = analysis.getFrequencies().iterator();
            do {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((FrequencyStats) next).getNumber() == iNextInt));
            FrequencyStats frequencyStats = (FrequencyStats) next;
            FrequencyStats frequencyStats2 = frequencyStats == null ? new FrequencyStats(iNextInt, 0, 0, 0, 0, 0) : frequencyStats;
            for (Object obj2 : analysis.getDelays()) {
                if (((DelayStats) obj2).getNumber() == iNextInt) {
                    obj = obj2;
                    break;
                }
            }
            DelayStats delayStats = (DelayStats) obj;
            DelayStats delayStats2 = delayStats == null ? new DelayStats(iNextInt, 0, 0.0d, 0) : delayStats;
            RepetitionStats repetitionStats = (RepetitionStats) CollectionsKt.getOrNull(analysis.getRepetitions(), iNextInt - 1);
            if (repetitionStats == null) {
                repetitionStats = new RepetitionStats(iNextInt, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
            }
            RepetitionStats repetitionStats2 = repetitionStats;
            AssociationStats associationStats = analysis.getAssociations().get(Integer.valueOf(iNextInt));
            if (associationStats == null) {
                associationStats = new AssociationStats(iNextInt, CollectionsKt.emptyList());
            }
            AssociationStats associationStats2 = associationStats;
            HourlyStats hourlyStats = (HourlyStats) CollectionsKt.getOrNull(analysis.getHourly(), iNextInt - 1);
            if (hourlyStats == null) {
                hourlyStats = new HourlyStats(iNextInt, 0.0d, 0.0d, 0.0d, 0.0d);
            }
            arrayList.add(new NumberProfile(iNextInt, frequencyStats2, delayStats2, repetitionStats2, associationStats2, hourlyStats, dDoubleValue));
        }
        List sortedProfiles = CollectionsKt.sortedWith((List) arrayList, new Comparator() { // from class: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$calculatePredictionResult$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Double.valueOf(((NumberProfile) t2).getScore()), Double.valueOf(((NumberProfile) t).getScore()));
            }
        });
        return new PredictionResult(CollectionsKt.take(sortedProfiles, 5), CollectionsKt.take(sortedProfiles, 10), CollectionsKt.take(sortedProfiles, 20), 0L, 8, null);
    }

    public final void setPeriod(String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this._selectedPeriod.setValue(period);
    }

    /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$loadWeights$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalysisViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel$loadWeights$1", f = "AnalysisViewModel.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    static final class C08131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C08131(Continuation<? super C08131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnalysisViewModel.this.new C08131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object weights;
            MutableStateFlow mutableStateFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    MutableStateFlow mutableStateFlow2 = AnalysisViewModel.this._weights;
                    this.L$0 = mutableStateFlow2;
                    this.label = 1;
                    weights = AnalysisViewModel.this.analysisRepository.getWeights(this);
                    if (weights == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableStateFlow = mutableStateFlow2;
                    break;
                    break;
                case 1:
                    mutableStateFlow = (MutableStateFlow) this.L$0;
                    ResultKt.throwOnFailure($result);
                    weights = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow.setValue(weights);
            return Unit.INSTANCE;
        }
    }

    private final void loadWeights() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08131(null), 3, null);
    }

    /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$observeDrawsForLearning$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalysisViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "draws", "", "Llnb/predict/earn/domain/model/Draw;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel$observeDrawsForLearning$1", f = "AnalysisViewModel.kt", i = {0}, l = {184}, m = "invokeSuspend", n = {"draws"}, s = {"L$0"})
    static final class C08141 extends SuspendLambda implements Function2<List<? extends Draw>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C08141(Continuation<? super C08141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08141 c08141 = AnalysisViewModel.this.new C08141(continuation);
            c08141.L$0 = obj;
            return c08141;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends Draw> list, Continuation<? super Unit> continuation) {
            return invoke2((List<Draw>) list, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<Draw> list, Continuation<? super Unit> continuation) {
            return ((C08141) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            List draws = (List) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (draws.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable(draws);
                    this.label = 1;
                    if (AnalysisViewModel.this.evaluateAndLearn(draws, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    private final void observeDrawsForLearning() {
        FlowKt.launchIn(FlowKt.onEach(this.repository.getAllDraws(), new C08141(null)), ViewModelKt.getViewModelScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:32:0x0112  */
    /* JADX WARN: Code duplicated, block: B:35:0x0122  */
    /* JADX WARN: Code duplicated, block: B:38:0x0128 A[LOOP:0: B:28:0x00f0->B:38:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0171 -> B:46:0x0176). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017f -> B:48:0x0183). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object evaluateAndLearn(java.util.List<lnb.predict.earn.domain.model.Draw> r23, kotlin.coroutines.Continuation<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lnb.predict.earn.ui.viewmodel.AnalysisViewModel.evaluateAndLearn(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void generateAndSavePrediction(String drawName) {
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        PredictionResult result = this.predictionResult.getValue();
        if (result == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08101(drawName, result.getTop20(), this, null), 3, null);
    }

    /* JADX INFO: renamed from: lnb.predict.earn.ui.viewmodel.AnalysisViewModel$generateAndSavePrediction$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnalysisViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.ui.viewmodel.AnalysisViewModel$generateAndSavePrediction$1", f = "AnalysisViewModel.kt", i = {0}, l = {222}, m = "invokeSuspend", n = {"prediction"}, s = {"L$0"})
    static final class C08101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $drawName;
        final /* synthetic */ List<NumberProfile> $top20;
        Object L$0;
        int label;
        final /* synthetic */ AnalysisViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08101(String str, List<NumberProfile> list, AnalysisViewModel analysisViewModel, Continuation<? super C08101> continuation) {
            super(2, continuation);
            this.$drawName = str;
            this.$top20 = list;
            this.this$0 = analysisViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C08101(this.$drawName, this.$top20, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String string = LocalDate.now().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    String str = this.$drawName;
                    Iterable iterable = this.$top20;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boxing.boxInt(((NumberProfile) it.next()).getNumber()));
                    }
                    String str2 = ",";
                    String strJoinToString$default = CollectionsKt.joinToString$default((List) arrayList, ",", null, null, 0, null, null, 62, null);
                    Iterable iterable2 = this.$top20;
                    Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        String str3 = str2;
                        String str4 = String.format("%.2f", Arrays.copyOf(new Object[]{Boxing.boxDouble(((NumberProfile) it2.next()).getScore())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                        arrayList2.add(str4);
                        str2 = str3;
                    }
                    long j = 0;
                    String str5 = null;
                    int i = 0;
                    PredictionEntity prediction = new PredictionEntity(j, jCurrentTimeMillis, string, str, strJoinToString$default, CollectionsKt.joinToString$default((List) arrayList2, str2, null, null, 0, null, null, 62, null), str5, i, false, 449, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(prediction);
                    this.label = 1;
                    if (this.this$0.analysisRepository.savePrediction(prediction, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public final void setTab(String tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this._currentTab.setValue(tab);
    }

    public final void selectNumber(Integer num) {
        this._selectedNumber.setValue(num);
    }
}
