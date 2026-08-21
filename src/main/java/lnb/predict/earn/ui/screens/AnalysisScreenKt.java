package lnb.predict.earn.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabPosition;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
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
import lnb.predict.earn.domain.model.FrequencyStats;
import lnb.predict.earn.domain.model.GlobalAnalysis;
import lnb.predict.earn.domain.model.HourlyStats;
import lnb.predict.earn.domain.model.NumberProfile;
import lnb.predict.earn.domain.model.PairStats;
import lnb.predict.earn.domain.model.PredictionResult;
import lnb.predict.earn.domain.model.RepetitionStats;
import lnb.predict.earn.domain.model.Transition;
import lnb.predict.earn.domain.model.TransitionStats;
import lnb.predict.earn.domain.model.TripletStats;
import lnb.predict.earn.ui.viewmodel.AnalysisViewModel;

/* JADX INFO: compiled from: AnalysisScreen.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0017\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a'\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001b\u0010\u001a\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015H\u0007¢\u0006\u0002\u0010\u0017\u001a!\u0010\u001c\u001a\u00020\t2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0007¢\u0006\u0002\u0010!\u001a!\u0010\"\u001a\u00020\t2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020#0\u001eH\u0007¢\u0006\u0002\u0010!\u001a\u001b\u0010$\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020%0\u0015H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001b\u0010&\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020'0\u0015H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001b\u0010(\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020)0\u0015H\u0007¢\u0006\u0002\u0010\u0017\u001a'\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u001f2\u0006\u0010,\u001a\u00020-H\u0007¢\u0006\u0002\u0010.\u001a\u001d\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0002\u00103\u001a\u001f\u00104\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0002\u00107\u001a%\u00108\u001a\u00020\t2\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00152\b\u0010;\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0002\u0010=\u001a'\u0010>\u001a\u00020\t2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\b\b\u0002\u0010?\u001a\u00020@H\u0007¢\u0006\u0002\u0010A\u001a\u001d\u0010B\u001a\u00020\t2\u0006\u00100\u001a\u0002012\u0006\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\u0010E\u001a#\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u0002012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020H0\u0015H\u0007¢\u0006\u0002\u0010I\u001a \u0010J\u001a\u00020\t2\u0011\u0010K\u001a\r\u0012\u0004\u0012\u00020\t0L¢\u0006\u0002\bMH\u0007¢\u0006\u0002\u0010N\u001a\u001f\u0010O\u001a\u00020\t2\u0006\u0010P\u001a\u00020\u001f2\b\b\u0002\u0010Q\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010R\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006S²\u0006\f\u0010,\u001a\u0004\u0018\u00010-X\u008a\u0084\u0002²\u0006\n\u0010T\u001a\u000201X\u008a\u0084\u0002²\u0006\f\u0010U\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002²\u0006\f\u00105\u001a\u0004\u0018\u000106X\u008a\u0084\u0002²\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0015X\u008a\u0084\u0002²\u0006\f\u0010;\u001a\u0004\u0018\u00010<X\u008a\u0084\u0002²\u0006\u0010\u0010V\u001a\b\u0012\u0004\u0012\u0002010\u0015X\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u000201X\u008a\u0084\u0002²\u0006\f\u0010X\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\n\u0010Y\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010Z\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010[\u001a\u000201X\u008a\u008e\u0002²\u0006\n\u0010\\\u001a\u00020\u0011X\u008a\u008e\u0002"}, d2 = {"IcyBlue", "Landroidx/compose/ui/graphics/Color;", "J", "AzureMist", "TwilightIndigo", "InkBlack", "GlassWhite", "GlassBorder", "AnalysisScreen", "", "viewModel", "Llnb/predict/earn/ui/viewmodel/AnalysisViewModel;", "(Llnb/predict/earn/ui/viewmodel/AnalysisViewModel;Landroidx/compose/runtime/Composer;II)V", "BacktestView", "report", "Llnb/predict/earn/domain/model/BacktestReport;", "isLoading", "", "(Llnb/predict/earn/ui/viewmodel/AnalysisViewModel;Llnb/predict/earn/domain/model/BacktestReport;ZLandroidx/compose/runtime/Composer;I)V", "FrequencyList", "list", "", "Llnb/predict/earn/domain/model/FrequencyStats;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "DelayList", "Llnb/predict/earn/domain/model/DelayStats;", "RepetitionList", "Llnb/predict/earn/domain/model/RepetitionStats;", "AssociationList", "map", "", "", "Llnb/predict/earn/domain/model/AssociationStats;", "(Ljava/util/Map;Landroidx/compose/runtime/Composer;I)V", "TransitionList", "Llnb/predict/earn/domain/model/TransitionStats;", "HourlyList", "Llnb/predict/earn/domain/model/HourlyStats;", "PairList", "Llnb/predict/earn/domain/model/PairStats;", "TripletList", "Llnb/predict/earn/domain/model/TripletStats;", "ProfileSelector", "selected", "analysis", "Llnb/predict/earn/domain/model/GlobalAnalysis;", "(Llnb/predict/earn/ui/viewmodel/AnalysisViewModel;Ljava/lang/Integer;Llnb/predict/earn/domain/model/GlobalAnalysis;Landroidx/compose/runtime/Composer;I)V", "ProfileRow", "label", "", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "PredictionView", "prediction", "Llnb/predict/earn/domain/model/PredictionResult;", "(Llnb/predict/earn/ui/viewmodel/AnalysisViewModel;Llnb/predict/earn/domain/model/PredictionResult;Landroidx/compose/runtime/Composer;I)V", "PerformanceView", "predictions", "Llnb/predict/earn/data/local/PredictionEntity;", "weights", "Llnb/predict/earn/data/local/WeightEntity;", "(Ljava/util/List;Llnb/predict/earn/data/local/WeightEntity;Landroidx/compose/runtime/Composer;I)V", "StatCard", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WeightBar", "weight", "", "(Ljava/lang/String;FLandroidx/compose/runtime/Composer;I)V", "PredictionGroup", "title", "Llnb/predict/earn/domain/model/NumberProfile;", "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "AnalysisCard", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "NumberBall", "num", "size", "(IILandroidx/compose/runtime/Composer;II)V", "app_debug", "currentTab", "selectedNumber", "availablePeriods", "selectedPeriod", "backtestReport", "isBacktesting", "periodExpanded", "selectedDraw", "expanded"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AnalysisScreenKt {
    private static final long IcyBlue = ColorKt.Color(4289317856L);
    private static final long AzureMist = ColorKt.Color(4293064179L);
    private static final long TwilightIndigo = ColorKt.Color(4281547895L);
    private static final long InkBlack = ColorKt.Color(4278197033L);
    private static final long GlassWhite = ColorKt.Color(4294967295L);
    private static final long GlassBorder = ColorKt.Color(4291945704L);

    static final Unit AnalysisCard$lambda$171(Function2 function2, int i, Composer composer, int i2) {
        AnalysisCard(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit AnalysisScreen$lambda$33(AnalysisViewModel analysisViewModel, int i, int i2, Composer composer, int i3) {
        AnalysisScreen(analysisViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit AssociationList$lambda$64(Map map, int i, Composer composer, int i2) {
        AssociationList(map, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit BacktestView$lambda$44(AnalysisViewModel analysisViewModel, BacktestReport backtestReport, boolean z, int i, Composer composer, int i2) {
        BacktestView(analysisViewModel, backtestReport, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit DelayList$lambda$54(List list, int i, Composer composer, int i2) {
        DelayList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit FrequencyList$lambda$49(List list, int i, Composer composer, int i2) {
        FrequencyList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit HourlyList$lambda$74(List list, int i, Composer composer, int i2) {
        HourlyList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit NumberBall$lambda$173(int i, int i2, int i3, int i4, Composer composer, int i5) {
        NumberBall(i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    static final Unit PairList$lambda$78(List list, int i, Composer composer, int i2) {
        PairList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit PerformanceView$lambda$156(List list, WeightEntity weightEntity, int i, Composer composer, int i2) {
        PerformanceView(list, weightEntity, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit PredictionGroup$lambda$168(String str, List list, int i, Composer composer, int i2) {
        PredictionGroup(str, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$143(AnalysisViewModel analysisViewModel, PredictionResult predictionResult, int i, Composer composer, int i2) {
        PredictionView(analysisViewModel, predictionResult, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ProfileRow$lambda$114(String str, String str2, int i, Composer composer, int i2) {
        ProfileRow(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ProfileSelector$lambda$112(AnalysisViewModel analysisViewModel, Integer num, GlobalAnalysis globalAnalysis, int i, Composer composer, int i2) {
        ProfileSelector(analysisViewModel, num, globalAnalysis, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit RepetitionList$lambda$59(List list, int i, Composer composer, int i2) {
        RepetitionList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit StatCard$lambda$159(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StatCard(str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit TransitionList$lambda$69(Map map, int i, Composer composer, int i2) {
        TransitionList(map, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit TripletList$lambda$82(List list, int i, Composer composer, int i2) {
        TripletList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit WeightBar$lambda$162(String str, float f, int i, Composer composer, int i2) {
        WeightBar(str, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0844  */
    /* JADX WARN: Code duplicated, block: B:116:0x0875  */
    /* JADX WARN: Code duplicated, block: B:118:0x088b  */
    /* JADX WARN: Code duplicated, block: B:119:0x088f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0898  */
    /* JADX WARN: Code duplicated, block: B:123:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:126:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:127:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:129:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:130:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:131:0x0913  */
    /* JADX WARN: Code duplicated, block: B:134:0x091f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0941  */
    /* JADX WARN: Code duplicated, block: B:138:0x094d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0968  */
    /* JADX WARN: Code duplicated, block: B:142:0x0974  */
    /* JADX WARN: Code duplicated, block: B:143:0x0995  */
    /* JADX WARN: Code duplicated, block: B:146:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:154:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:155:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:159:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:162:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:163:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:167:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:172:0x0ad8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void AnalysisScreen(AnalysisViewModel viewModel, Composer $composer, final int $changed, final int i) {
        final AnalysisViewModel viewModel2;
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function1;
        Function0<ComposeUiNode> function2;
        Object obj;
        Function0<ComposeUiNode> function3;
        Composer composer;
        Composer composer2;
        BoxScope boxScope;
        String strAnalysisScreen$lambda$1;
        Composer $composer3 = $composer.startRestartGroup(1572268742);
        ComposerKt.sourceInformation($composer3, "C(AnalysisScreen)35@1446L16,36@1506L16,37@1574L16,38@1640L16,39@1702L16,40@1756L16,41@1828L16,42@1896L16,43@1964L16,44@2030L16,48@2253L34,50@2293L3424:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            if ((i & 1) == 0) {
                viewModel2 = viewModel;
                int i2 = $composer3.changedInstance(viewModel2) ? 4 : 2;
                $dirty |= i2;
            } else {
                viewModel2 = viewModel;
            }
            $dirty |= i2;
        } else {
            viewModel2 = viewModel;
        }
        if (($dirty & 3) == 2 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "34@1382L15");
            if (($changed & 1) != 0 && !$composer3.getDefaultsInvalid()) {
                $composer3.skipToGroupEnd();
                if ((i & 1) != 0) {
                    $dirty &= -15;
                }
            } else if ((i & 1) != 0) {
                $composer3.startReplaceableGroup(1890788296);
                ComposerKt.sourceInformation($composer3, "CC(hiltViewModel)P(1)*45@1969L7,50@2112L47,51@2171L54:HiltViewModel.kt#9mcars");
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer3, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, $composer3, 0 & 14);
                int i3 = (0 & 14) | (0 & 112);
                $composer3.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation($composer3, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                ViewModel viewModel3 = ViewModelKt.viewModel((Class<ViewModel>) AnalysisViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, $composer3, ((i3 << 3) & 896) | 36936, 0);
                $composer3.endReplaceableGroup();
                $composer3.endReplaceableGroup();
                viewModel2 = (AnalysisViewModel) viewModel3;
                $dirty &= -15;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1572268742, $dirty, -1, "lnb.predict.earn.ui.screens.AnalysisScreen (AnalysisScreen.kt:34)");
            }
            State analysis$delegate = SnapshotStateKt.collectAsState(viewModel2.getGlobalAnalysis(), null, $composer3, 0, 1);
            final State currentTab$delegate = SnapshotStateKt.collectAsState(viewModel2.getCurrentTab(), null, $composer3, 0, 1);
            State selectedNumber$delegate = SnapshotStateKt.collectAsState(viewModel2.getSelectedNumber(), null, $composer3, 0, 1);
            State prediction$delegate = SnapshotStateKt.collectAsState(viewModel2.getPredictionResult(), null, $composer3, 0, 1);
            State predictions$delegate = SnapshotStateKt.collectAsState(viewModel2.getPredictions(), null, $composer3, 0, 1);
            State stateCollectAsState = SnapshotStateKt.collectAsState(viewModel2.getWeights(), null, $composer3, 0, 1);
            final State availablePeriods$delegate = SnapshotStateKt.collectAsState(viewModel2.getAvailablePeriods(), null, $composer3, 0, 1);
            final State selectedPeriod$delegate = SnapshotStateKt.collectAsState(viewModel2.getSelectedPeriod(), null, $composer3, 0, 1);
            State backtestReport$delegate = SnapshotStateKt.collectAsState(viewModel2.getBacktestReport(), null, $composer3, 0, 1);
            State isBacktesting$delegate = SnapshotStateKt.collectAsState(viewModel2.isBacktesting(), null, $composer3, 0, 1);
            int $dirty2 = $dirty;
            final List tabs = CollectionsKt.listOf((Object[]) new String[]{"Fréquences", "Retards", "Répétitions", "Associations", "Transitions", "Heures", "Paires", "Triplets", "Profils", "Générateur", "Performances", "Backtest"});
            ComposerKt.sourceInformationMarkerStart($composer3, -878197240, "CC(remember):AnalysisScreen.kt#9igjgp");
            $composer2 = $composer3;
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objRememberedValue);
            }
            final MutableState periodExpanded$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierM227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), AzureMist, null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM227backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int i6 = ((6 >> 6) & 112) | 6;
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -251313885, "C51@2367L1389,88@4032L137,89@4180L341,82@3766L755,99@4531L1180:AnalysisScreen.kt#td928");
            Modifier modifierM673paddingVpY3zN4 = PaddingKt.m673paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6627constructorimpl(16), Dp.m6627constructorimpl(8));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierM673paddingVpY3zN4);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function1 = constructor2;
                $composer2.createNode(function1);
            } else {
                function1 = constructor2;
                $composer2.useNode();
            }
            Composer composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer2);
            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i9 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 1326446247, "C56@2610L92,58@2728L1018:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g("LABORATOIRE", (Modifier) null, TwilightIndigo, TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 200070, 0, 131026);
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer2, modifier);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function2 = constructor3;
                $composer2.createNode(function2);
            } else {
                function2 = constructor3;
                $composer2.useNode();
            }
            Composer composerM3656constructorimpl3 = Updater.m3656constructorimpl($composer2);
            Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i11 = (i10 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i12 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -616018041, "C60@2796L25,64@3038L185,59@2750L473,68@3299L26,68@3327L405,68@3240L492:AnalysisScreen.kt#td928");
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(8));
            PaddingValues paddingValuesM666PaddingValuesYgX7TsA = PaddingKt.m666PaddingValuesYgX7TsA(Dp.m6627constructorimpl(12), Dp.m6627constructorimpl(4));
            Modifier modifierM703height3ABfNKs = SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(36));
            ComposerKt.sourceInformationMarkerStart($composer2, 1919791615, "CC(remember):AnalysisScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda61
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnalysisScreenKt.AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$14$lambda$13(periodExpanded$delegate);
                    }
                };
                $composer2.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ButtonKt.OutlinedButton((Function0) objRememberedValue2, modifierM703height3ABfNKs, false, roundedCornerShapeM955RoundedCornerShape0680j_4, null, null, null, paddingValuesM666PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(-1986513996, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda62
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return AnalysisScreenKt.AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$15(selectedPeriod$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 817889334, 372);
            boolean zAnalysisScreen$lambda$11 = AnalysisScreen$lambda$11(periodExpanded$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1919807712, "CC(remember):AnalysisScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda63
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnalysisScreenKt.AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$17$lambda$16(periodExpanded$delegate);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AndroidMenu_androidKt.m1769DropdownMenuIlH_yew(zAnalysisScreen$lambda$11, (Function0) obj, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(812200609, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda64
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return AnalysisScreenKt.AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$22(availablePeriods$delegate, viewModel2, periodExpanded$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 48, 48, 2044);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            TabRowKt.m2597ScrollableTabRowsKfQg0A(RangesKt.coerceAtLeast(tabs.indexOf(AnalysisScreen$lambda$1(currentTab$delegate)), 0), null, Color.INSTANCE.m4198getTransparent0d7_KjU(), TwilightIndigo, Dp.m6627constructorimpl(16), ComposableLambdaKt.rememberComposableLambda(1257578416, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda65
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return AnalysisScreenKt.AnalysisScreen$lambda$32$lambda$25(tabs, currentTab$delegate, (List) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), ComposableSingletons$AnalysisScreenKt.INSTANCE.getLambda$486716497$app_debug(), ComposableLambdaKt.rememberComposableLambda(-197513808, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda66
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.AnalysisScreen$lambda$32$lambda$30(tabs, viewModel2, currentTab$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 14380416, 2);
            Modifier modifierM672padding3ABfNKs = PaddingKt.m672padding3ABfNKs(ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m6627constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer2, modifierM672padding3ABfNKs);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i13 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function3 = constructor4;
                $composer2.createNode(function3);
            } else {
                function3 = constructor4;
                $composer2.useNode();
            }
            Composer composerM3656constructorimpl4 = Updater.m3656constructorimpl($composer2);
            Updater.m3663setimpl(composerM3656constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl4.getInserting()) {
                composer = $composer2;
            } else {
                composer = $composer2;
                if (!Intrinsics.areEqual(composerM3656constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i14 = (i13 >> 6) & 14;
                composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                int i15 = ((0 >> 6) & 112) | 6;
                boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1680664568, "C:AnalysisScreen.kt#td928");
                if (AnalysisScreen$lambda$0(analysis$delegate) == null) {
                    composer2.startReplaceGroup(-1680673094);
                    ComposerKt.sourceInformation(composer2, "101@4636L94");
                    ProgressIndicatorKt.m2371CircularProgressIndicatorLxG7B9w(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), TwilightIndigo, 0.0f, 0L, 0, composer2, 48, 28);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1680516575);
                    ComposerKt.sourceInformation(composer2, "");
                    strAnalysisScreen$lambda$1 = AnalysisScreen$lambda$1(currentTab$delegate);
                    switch (strAnalysisScreen$lambda$1.hashCode()) {
                        case -2136794456:
                            if (strAnalysisScreen$lambda$1.equals("Heures")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192728839);
                                ComposerKt.sourceInformation(composer2, "109@5187L29");
                                GlobalAnalysis globalAnalysisAnalysisScreen$lambda$0 = AnalysisScreen$lambda$0(analysis$delegate);
                                Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$0);
                                HourlyList(globalAnalysisAnalysisScreen$lambda$0.getHourly(), composer2, 0);
                                composer2.endReplaceGroup();
                                Unit unit2 = Unit.INSTANCE;
                            }
                            break;
                        case -2108431847:
                            if (strAnalysisScreen$lambda$1.equals("Backtest")) {
                                composer2.startReplaceGroup(1192742560);
                                ComposerKt.sourceInformation(composer2, "115@5615L54");
                                BacktestView(viewModel2, AnalysisScreen$lambda$8(backtestReport$delegate), AnalysisScreen$lambda$9(isBacktesting$delegate), composer2, $dirty2 & 14);
                            } else {
                                composer2.startReplaceGroup(-1685259048);
                            }
                            composer2.endReplaceGroup();
                            Unit unit3 = Unit.INSTANCE;
                            break;
                        case -2054544569:
                            if (strAnalysisScreen$lambda$1.equals("Fréquences")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit4 = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192717231);
                                ComposerKt.sourceInformation(composer2, "104@4824L37");
                                GlobalAnalysis globalAnalysisAnalysisScreen$lambda$1 = AnalysisScreen$lambda$0(analysis$delegate);
                                Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$1);
                                FrequencyList(globalAnalysisAnalysisScreen$lambda$1.getFrequencies(), composer2, 0);
                                composer2.endReplaceGroup();
                                Unit unit5 = Unit.INSTANCE;
                            }
                            break;
                        case -1911812824:
                            if (strAnalysisScreen$lambda$1.equals("Paires")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit6 = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192730820);
                                ComposerKt.sourceInformation(composer2, "110@5249L26");
                                GlobalAnalysis globalAnalysisAnalysisScreen$lambda$2 = AnalysisScreen$lambda$0(analysis$delegate);
                                Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$2);
                                PairList(globalAnalysisAnalysisScreen$lambda$2.getPairs(), composer2, 0);
                                composer2.endReplaceGroup();
                                Unit unit7 = Unit.INSTANCE;
                            }
                            break;
                        case -1532434303:
                            if (strAnalysisScreen$lambda$1.equals("Retards")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit8 = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192719494);
                                ComposerKt.sourceInformation(composer2, "105@4895L28");
                                GlobalAnalysis globalAnalysisAnalysisScreen$lambda$3 = AnalysisScreen$lambda$0(analysis$delegate);
                                Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$3);
                                DelayList(globalAnalysisAnalysisScreen$lambda$3.getDelays(), composer2, 0);
                                composer2.endReplaceGroup();
                                Unit unit9 = Unit.INSTANCE;
                            }
                            break;
                        case -241441378:
                            if (strAnalysisScreen$lambda$1.equals("Transitions")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit10 = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192726576);
                                ComposerKt.sourceInformation(composer2, "108@5116L38");
                                GlobalAnalysis globalAnalysisAnalysisScreen$lambda$4 = AnalysisScreen$lambda$0(analysis$delegate);
                                Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$4);
                                TransitionList(globalAnalysisAnalysisScreen$lambda$4.getTransitions(), composer2, 0);
                                composer2.endReplaceGroup();
                                Unit unit11 = Unit.INSTANCE;
                            }
                            break;
                        case 604987642:
                            if (strAnalysisScreen$lambda$1.equals("Répétitions")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit12 = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192721616);
                                ComposerKt.sourceInformation(composer2, "106@4961L38");
                                GlobalAnalysis globalAnalysisAnalysisScreen$lambda$5 = AnalysisScreen$lambda$0(analysis$delegate);
                                Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$5);
                                RepetitionList(globalAnalysisAnalysisScreen$lambda$5.getRepetitions(), composer2, 0);
                                composer2.endReplaceGroup();
                                Unit unit13 = Unit.INSTANCE;
                            }
                            break;
                        case 1124745466:
                            if (strAnalysisScreen$lambda$1.equals("Générateur")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit14 = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192737807);
                                ComposerKt.sourceInformation(composer2, "113@5467L37");
                                PredictionView(viewModel2, AnalysisScreen$lambda$3(prediction$delegate), composer2, $dirty2 & 14);
                                composer2.endReplaceGroup();
                                Unit unit15 = Unit.INSTANCE;
                            }
                            break;
                        case 1355227543:
                            if (strAnalysisScreen$lambda$1.equals("Profils")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit16 = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192734912);
                                ComposerKt.sourceInformation(composer2, "112@5376L54");
                                Integer numAnalysisScreen$lambda$2 = AnalysisScreen$lambda$2(selectedNumber$delegate);
                                GlobalAnalysis globalAnalysisAnalysisScreen$lambda$6 = AnalysisScreen$lambda$0(analysis$delegate);
                                Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$6);
                                ProfileSelector(viewModel2, numAnalysisScreen$lambda$2, globalAnalysisAnalysisScreen$lambda$6, composer2, $dirty2 & 14);
                                composer2.endReplaceGroup();
                                Unit unit17 = Unit.INSTANCE;
                            }
                            break;
                        case 1516915299:
                            if (strAnalysisScreen$lambda$1.equals("Performances")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit18 = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192740239);
                                ComposerKt.sourceInformation(composer2, "114@5543L37");
                                PerformanceView(AnalysisScreen$lambda$4(predictions$delegate), AnalysisScreen$lambda$5(stateCollectAsState), composer2, 0);
                                composer2.endReplaceGroup();
                                Unit unit19 = Unit.INSTANCE;
                            }
                            break;
                        case 1576198013:
                            if (strAnalysisScreen$lambda$1.equals("Triplets")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit110 = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192732778);
                                ComposerKt.sourceInformation(composer2, "111@5310L32");
                                GlobalAnalysis globalAnalysisAnalysisScreen$lambda$7 = AnalysisScreen$lambda$0(analysis$delegate);
                                Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$7);
                                TripletList(globalAnalysisAnalysisScreen$lambda$7.getTriplets(), composer2, 0);
                                composer2.endReplaceGroup();
                                Unit unit20 = Unit.INSTANCE;
                            }
                            break;
                        case 1746798642:
                            if (strAnalysisScreen$lambda$1.equals("Associations")) {
                                composer2.startReplaceGroup(-1685259048);
                                composer2.endReplaceGroup();
                                Unit unit111 = Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(1192724082);
                                ComposerKt.sourceInformation(composer2, "107@5038L40");
                                GlobalAnalysis globalAnalysisAnalysisScreen$lambda$8 = AnalysisScreen$lambda$0(analysis$delegate);
                                Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$8);
                                AssociationList(globalAnalysisAnalysisScreen$lambda$8.getAssociations(), composer2, 0);
                                composer2.endReplaceGroup();
                                Unit unit21 = Unit.INSTANCE;
                            }
                            break;
                        default:
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit112 = Unit.INSTANCE;
                            break;
                    }
                    composer2.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3656constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM3656constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            Updater.m3663setimpl(composerM3656constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i16 = (i13 >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            int i17 = ((0 >> 6) & 112) | 6;
            boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1680664568, "C:AnalysisScreen.kt#td928");
            if (AnalysisScreen$lambda$0(analysis$delegate) == null) {
                composer2.startReplaceGroup(-1680673094);
                ComposerKt.sourceInformation(composer2, "101@4636L94");
                ProgressIndicatorKt.m2371CircularProgressIndicatorLxG7B9w(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), TwilightIndigo, 0.0f, 0L, 0, composer2, 48, 28);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1680516575);
                ComposerKt.sourceInformation(composer2, "");
                strAnalysisScreen$lambda$1 = AnalysisScreen$lambda$1(currentTab$delegate);
                switch (strAnalysisScreen$lambda$1.hashCode()) {
                    case -2136794456:
                        if (strAnalysisScreen$lambda$1.equals("Heures")) {
                            composer2.startReplaceGroup(1192728839);
                            ComposerKt.sourceInformation(composer2, "109@5187L29");
                            GlobalAnalysis globalAnalysisAnalysisScreen$lambda$9 = AnalysisScreen$lambda$0(analysis$delegate);
                            Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$9);
                            HourlyList(globalAnalysisAnalysisScreen$lambda$9.getHourly(), composer2, 0);
                            composer2.endReplaceGroup();
                            Unit unit22 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit113 = Unit.INSTANCE;
                        }
                        break;
                    case -2108431847:
                        if (strAnalysisScreen$lambda$1.equals("Backtest")) {
                            composer2.startReplaceGroup(-1685259048);
                        } else {
                            composer2.startReplaceGroup(1192742560);
                            ComposerKt.sourceInformation(composer2, "115@5615L54");
                            BacktestView(viewModel2, AnalysisScreen$lambda$8(backtestReport$delegate), AnalysisScreen$lambda$9(isBacktesting$delegate), composer2, $dirty2 & 14);
                        }
                        composer2.endReplaceGroup();
                        Unit unit114 = Unit.INSTANCE;
                        break;
                    case -2054544569:
                        if (strAnalysisScreen$lambda$1.equals("Fréquences")) {
                            composer2.startReplaceGroup(1192717231);
                            ComposerKt.sourceInformation(composer2, "104@4824L37");
                            GlobalAnalysis globalAnalysisAnalysisScreen$lambda$10 = AnalysisScreen$lambda$0(analysis$delegate);
                            Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$10);
                            FrequencyList(globalAnalysisAnalysisScreen$lambda$10.getFrequencies(), composer2, 0);
                            composer2.endReplaceGroup();
                            Unit unit23 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit115 = Unit.INSTANCE;
                        }
                        break;
                    case -1911812824:
                        if (strAnalysisScreen$lambda$1.equals("Paires")) {
                            composer2.startReplaceGroup(1192730820);
                            ComposerKt.sourceInformation(composer2, "110@5249L26");
                            GlobalAnalysis globalAnalysisAnalysisScreen$lambda$11 = AnalysisScreen$lambda$0(analysis$delegate);
                            Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$11);
                            PairList(globalAnalysisAnalysisScreen$lambda$11.getPairs(), composer2, 0);
                            composer2.endReplaceGroup();
                            Unit unit24 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit116 = Unit.INSTANCE;
                        }
                        break;
                    case -1532434303:
                        if (strAnalysisScreen$lambda$1.equals("Retards")) {
                            composer2.startReplaceGroup(1192719494);
                            ComposerKt.sourceInformation(composer2, "105@4895L28");
                            GlobalAnalysis globalAnalysisAnalysisScreen$lambda$12 = AnalysisScreen$lambda$0(analysis$delegate);
                            Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$12);
                            DelayList(globalAnalysisAnalysisScreen$lambda$12.getDelays(), composer2, 0);
                            composer2.endReplaceGroup();
                            Unit unit25 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit117 = Unit.INSTANCE;
                        }
                        break;
                    case -241441378:
                        if (strAnalysisScreen$lambda$1.equals("Transitions")) {
                            composer2.startReplaceGroup(1192726576);
                            ComposerKt.sourceInformation(composer2, "108@5116L38");
                            GlobalAnalysis globalAnalysisAnalysisScreen$lambda$13 = AnalysisScreen$lambda$0(analysis$delegate);
                            Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$13);
                            TransitionList(globalAnalysisAnalysisScreen$lambda$13.getTransitions(), composer2, 0);
                            composer2.endReplaceGroup();
                            Unit unit118 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit119 = Unit.INSTANCE;
                        }
                        break;
                    case 604987642:
                        if (strAnalysisScreen$lambda$1.equals("Répétitions")) {
                            composer2.startReplaceGroup(1192721616);
                            ComposerKt.sourceInformation(composer2, "106@4961L38");
                            GlobalAnalysis globalAnalysisAnalysisScreen$lambda$14 = AnalysisScreen$lambda$0(analysis$delegate);
                            Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$14);
                            RepetitionList(globalAnalysisAnalysisScreen$lambda$14.getRepetitions(), composer2, 0);
                            composer2.endReplaceGroup();
                            Unit unit120 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit1110 = Unit.INSTANCE;
                        }
                        break;
                    case 1124745466:
                        if (strAnalysisScreen$lambda$1.equals("Générateur")) {
                            composer2.startReplaceGroup(1192737807);
                            ComposerKt.sourceInformation(composer2, "113@5467L37");
                            PredictionView(viewModel2, AnalysisScreen$lambda$3(prediction$delegate), composer2, $dirty2 & 14);
                            composer2.endReplaceGroup();
                            Unit unit121 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit1111 = Unit.INSTANCE;
                        }
                        break;
                    case 1355227543:
                        if (strAnalysisScreen$lambda$1.equals("Profils")) {
                            composer2.startReplaceGroup(1192734912);
                            ComposerKt.sourceInformation(composer2, "112@5376L54");
                            Integer numAnalysisScreen$lambda$3 = AnalysisScreen$lambda$2(selectedNumber$delegate);
                            GlobalAnalysis globalAnalysisAnalysisScreen$lambda$15 = AnalysisScreen$lambda$0(analysis$delegate);
                            Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$15);
                            ProfileSelector(viewModel2, numAnalysisScreen$lambda$3, globalAnalysisAnalysisScreen$lambda$15, composer2, $dirty2 & 14);
                            composer2.endReplaceGroup();
                            Unit unit122 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit1112 = Unit.INSTANCE;
                        }
                        break;
                    case 1516915299:
                        if (strAnalysisScreen$lambda$1.equals("Performances")) {
                            composer2.startReplaceGroup(1192740239);
                            ComposerKt.sourceInformation(composer2, "114@5543L37");
                            PerformanceView(AnalysisScreen$lambda$4(predictions$delegate), AnalysisScreen$lambda$5(stateCollectAsState), composer2, 0);
                            composer2.endReplaceGroup();
                            Unit unit123 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit1113 = Unit.INSTANCE;
                        }
                        break;
                    case 1576198013:
                        if (strAnalysisScreen$lambda$1.equals("Triplets")) {
                            composer2.startReplaceGroup(1192732778);
                            ComposerKt.sourceInformation(composer2, "111@5310L32");
                            GlobalAnalysis globalAnalysisAnalysisScreen$lambda$16 = AnalysisScreen$lambda$0(analysis$delegate);
                            Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$16);
                            TripletList(globalAnalysisAnalysisScreen$lambda$16.getTriplets(), composer2, 0);
                            composer2.endReplaceGroup();
                            Unit unit26 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit1114 = Unit.INSTANCE;
                        }
                        break;
                    case 1746798642:
                        if (strAnalysisScreen$lambda$1.equals("Associations")) {
                            composer2.startReplaceGroup(1192724082);
                            ComposerKt.sourceInformation(composer2, "107@5038L40");
                            GlobalAnalysis globalAnalysisAnalysisScreen$lambda$17 = AnalysisScreen$lambda$0(analysis$delegate);
                            Intrinsics.checkNotNull(globalAnalysisAnalysisScreen$lambda$17);
                            AssociationList(globalAnalysisAnalysisScreen$lambda$17.getAssociations(), composer2, 0);
                            composer2.endReplaceGroup();
                            Unit unit27 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1685259048);
                            composer2.endReplaceGroup();
                            Unit unit1115 = Unit.INSTANCE;
                        }
                        break;
                    default:
                        composer2.startReplaceGroup(-1685259048);
                        composer2.endReplaceGroup();
                        Unit unit1116 = Unit.INSTANCE;
                        break;
                }
                composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda67
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.AnalysisScreen$lambda$33(viewModel2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final GlobalAnalysis AnalysisScreen$lambda$0(State<GlobalAnalysis> state) {
        return (GlobalAnalysis) state.getValue();
    }

    private static final String AnalysisScreen$lambda$1(State<String> state) {
        return (String) state.getValue();
    }

    private static final Integer AnalysisScreen$lambda$2(State<Integer> state) {
        return (Integer) state.getValue();
    }

    private static final PredictionResult AnalysisScreen$lambda$3(State<PredictionResult> state) {
        return (PredictionResult) state.getValue();
    }

    private static final List<PredictionEntity> AnalysisScreen$lambda$4(State<? extends List<PredictionEntity>> state) {
        return (List) state.getValue();
    }

    private static final WeightEntity AnalysisScreen$lambda$5(State<WeightEntity> state) {
        return (WeightEntity) state.getValue();
    }

    private static final List<String> AnalysisScreen$lambda$6(State<? extends List<String>> state) {
        return (List) state.getValue();
    }

    private static final String AnalysisScreen$lambda$7(State<String> state) {
        return (String) state.getValue();
    }

    private static final BacktestReport AnalysisScreen$lambda$8(State<BacktestReport> state) {
        return (BacktestReport) state.getValue();
    }

    private static final boolean AnalysisScreen$lambda$9(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean AnalysisScreen$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void AnalysisScreen$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$14$lambda$13(MutableState $periodExpanded$delegate) {
        AnalysisScreen$lambda$12($periodExpanded$delegate, true);
        return Unit.INSTANCE;
    }

    static final Unit AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$15(State $selectedPeriod$delegate, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C65@3060L62,66@3143L62:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1986513996, $changed, -1, "lnb.predict.earn.ui.screens.AnalysisScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:65)");
            }
            TextKt.m2697Text4IGK_g(AnalysisScreen$lambda$7($selectedPeriod$delegate), (Modifier) null, TwilightIndigo, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
            IconKt.m2154Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, TwilightIndigo, $composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$17$lambda$16(MutableState $periodExpanded$delegate) {
        AnalysisScreen$lambda$12($periodExpanded$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$22(State $availablePeriods$delegate, final AnalysisViewModel $viewModel, final MutableState $periodExpanded$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C*71@3463L16,72@3519L147,70@3410L282:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(812200609, $changed, -1, "lnb.predict.earn.ui.screens.AnalysisScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:69)");
            }
            for (final String str : AnalysisScreen$lambda$6($availablePeriods$delegate)) {
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-717227743, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return AnalysisScreenKt.AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$22$lambda$21$lambda$18(str, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1920771740, "CC(remember):AnalysisScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance($viewModel) | composer.changed(str);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function0() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AnalysisScreenKt.AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19($viewModel, str, $periodExpanded$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) obj, null, null, null, false, null, null, null, composer, 6, 508);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$22$lambda$21$lambda$18(String $period, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C71@3465L12:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-717227743, $changed, -1, "lnb.predict.earn.ui.screens.AnalysisScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:71)");
            }
            TextKt.m2697Text4IGK_g($period, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit AnalysisScreen$lambda$32$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19(AnalysisViewModel $viewModel, String $period, MutableState $periodExpanded$delegate) {
        $viewModel.setPeriod($period);
        AnalysisScreen$lambda$12($periodExpanded$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit AnalysisScreen$lambda$32$lambda$25(List $tabs, State $currentTab$delegate, List it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C88@4049L118:AnalysisScreen.kt#td928");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1257578416, $changed, -1, "lnb.predict.earn.ui.screens.AnalysisScreen.<anonymous>.<anonymous> (AnalysisScreen.kt:88)");
        }
        TabRowDefaults.INSTANCE.m2592SecondaryIndicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, (TabPosition) it.get(RangesKt.coerceAtLeast($tabs.indexOf(AnalysisScreen$lambda$1($currentTab$delegate)), 0))), 0.0f, TwilightIndigo, $composer, (TabRowDefaults.$stable << 9) | 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit AnalysisScreen$lambda$32$lambda$30(List $tabs, final AnalysisViewModel $viewModel, final State $currentTab$delegate, Composer $composer, int $changed) {
        Object obj;
        Composer composer = $composer;
        ComposerKt.sourceInformation(composer, "C*93@4317L25,94@4371L108,91@4232L265:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-197513808, $changed, -1, "lnb.predict.earn.ui.screens.AnalysisScreen.<anonymous>.<anonymous> (AnalysisScreen.kt:90)");
            }
            Iterator it = $tabs.iterator();
            while (it.hasNext()) {
                final String str = (String) it.next();
                boolean zAreEqual = Intrinsics.areEqual(AnalysisScreen$lambda$1($currentTab$delegate), str);
                ComposerKt.sourceInformationMarkerStart(composer, -666655431, "CC(remember):AnalysisScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance($viewModel) | composer.changed(str);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function0() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda73
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AnalysisScreenKt.AnalysisScreen$lambda$32$lambda$30$lambda$29$lambda$27$lambda$26($viewModel, str);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TabKt.m2583TabwqdebIU(zAreEqual, (Function0) obj, null, false, ComposableLambdaKt.rememberComposableLambda(232679878, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda74
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return AnalysisScreenKt.AnalysisScreen$lambda$32$lambda$30$lambda$29$lambda$28(str, $currentTab$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), null, 0L, 0L, null, composer, 24576, 492);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit AnalysisScreen$lambda$32$lambda$30$lambda$29$lambda$27$lambda$26(AnalysisViewModel $viewModel, String $tab) {
        $viewModel.setTab($tab);
        return Unit.INSTANCE;
    }

    static final Unit AnalysisScreen$lambda$32$lambda$30$lambda$29$lambda$28(String $tab, State $currentTab$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C94@4373L104:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(232679878, $changed, -1, "lnb.predict.earn.ui.screens.AnalysisScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:94)");
            }
            TextKt.m2697Text4IGK_g($tab, (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, Intrinsics.areEqual(AnalysisScreen$lambda$1($currentTab$delegate), $tab) ? FontWeight.INSTANCE.getBlack() : FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0250  */
    /* JADX WARN: Code duplicated, block: B:59:0x0279  */
    /* JADX WARN: Code duplicated, block: B:60:0x027b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0290  */
    /* JADX WARN: Code duplicated, block: B:69:0x02c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0334  */
    /* JADX WARN: Code duplicated, block: B:75:0x0340  */
    /* JADX WARN: Code duplicated, block: B:76:0x0346  */
    /* JADX WARN: Code duplicated, block: B:86:0x0435  */
    /* JADX WARN: Code duplicated, block: B:90:0x045b  */
    public static final void BacktestView(final AnalysisViewModel viewModel, final BacktestReport report, final boolean isLoading, Composer $composer, final int $changed) {
        Function0<ComposeUiNode> function0;
        Composer $composer2;
        boolean z;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> function1;
        Composer composerM3656constructorimpl;
        boolean z2;
        Object obj;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer3 = $composer.startRestartGroup(1417268345);
        ComposerKt.sourceInformation($composer3, "C(BacktestView)P(2,1)124@5831L2870:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(report) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(isLoading) ? 256 : 128;
        }
        if (($dirty & 147) == 146 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1417268345, $dirty, -1, "lnb.predict.earn.ui.screens.BacktestView (AnalysisScreen.kt:123)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            int $dirty2 = $dirty;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor2;
                $composer3.createNode(function0);
            } else {
                function0 = constructor2;
                $composer3.useNode();
            }
            Composer composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer3);
            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1035597816, "C129@6084L45,126@5913L27,131@6187L354,125@5883L658:AnalysisScreen.kt#td928");
            Modifier modifierM676paddingqDBjuR0$default = PaddingKt.m676paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6627constructorimpl(16), 7, null);
            boolean z3 = !isLoading;
            ButtonColors buttonColorsM1813buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1813buttonColorsro_MJ88(TwilightIndigo, 0L, 0L, 0L, $composer3, (ButtonDefaults.$stable << 12) | 6, 14);
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer3, 2111614538, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(viewModel);
            $composer2 = $composer3;
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChangedInstance) {
                z = z3;
            } else {
                z = z3;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ButtonKt.Button((Function0) objRememberedValue, modifierM676paddingqDBjuR0$default, z, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1813buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-110472993, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return AnalysisScreenKt.BacktestView$lambda$43$lambda$36(isLoading, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer3, 54), $composer3, 805306416, 480);
                if (report != null) {
                    $composer3.startReplaceGroup(1036248040);
                    ComposerKt.sourceInformation($composer3, "142@6647L1685,142@6585L1747");
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(12));
                    ComposerKt.sourceInformationMarkerStart($composer3, 2111639684, "CC(remember):AnalysisScreen.kt#9igjgp");
                    if (($dirty2 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object objRememberedValue2 = $composer3.rememberedValue();
                    if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda50
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AnalysisScreenKt.BacktestView$lambda$43$lambda$41$lambda$40(report, (LazyListScope) obj2);
                            }
                        };
                        $composer3.updateRememberedValue(obj);
                    } else {
                        obj = objRememberedValue2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer3, 24576, 239);
                    $composer3.endReplaceGroup();
                } else {
                    if (isLoading) {
                        $composer3.startReplaceGroup(1029673715);
                    } else {
                        $composer3.startReplaceGroup(1037982056);
                        ComposerKt.sourceInformation($composer3, "171@8378L307");
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default2);
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer3.startReusableNode();
                        if ($composer3.getInserting()) {
                            function1 = constructor;
                            $composer3.createNode(function1);
                        } else {
                            function1 = constructor;
                            $composer3.useNode();
                        }
                        composerM3656constructorimpl = Updater.m3656constructorimpl($composer3);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i5 = (i4 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        int i6 = ((54 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer3, 899681987, "C172@8472L199:AnalysisScreen.kt#td928");
                        long j = TwilightIndigo;
                        TextKt.m2697Text4IGK_g("Aucun backtest enregistré. Cliquez sur le bouton pour simuler les performances passées.", (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6487boximpl(TextAlign.INSTANCE.m6494getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 390, 0, 130554);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        $composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                    }
                    $composer3.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            objRememberedValue = new Function0() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnalysisScreenKt.BacktestView$lambda$43$lambda$35$lambda$34(viewModel);
                }
            };
            $composer3.updateRememberedValue(objRememberedValue);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ButtonKt.Button((Function0) objRememberedValue, modifierM676paddingqDBjuR0$default, z, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1813buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-110472993, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return AnalysisScreenKt.BacktestView$lambda$43$lambda$36(isLoading, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 805306416, 480);
            if (report != null) {
                $composer3.startReplaceGroup(1036248040);
                ComposerKt.sourceInformation($composer3, "142@6647L1685,142@6585L1747");
                Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_5 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer3, 2111639684, "CC(remember):AnalysisScreen.kt#9igjgp");
                if (($dirty2 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objRememberedValue3 = $composer3.rememberedValue();
                if (z2) {
                    obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda50
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AnalysisScreenKt.BacktestView$lambda$43$lambda$41$lambda$40(report, (LazyListScope) obj2);
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                } else {
                    obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda50
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AnalysisScreenKt.BacktestView$lambda$43$lambda$41$lambda$40(report, (LazyListScope) obj2);
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_5, null, null, false, (Function1) obj, $composer3, 24576, 239);
                $composer3.endReplaceGroup();
            } else {
                if (isLoading) {
                    $composer3.startReplaceGroup(1037982056);
                    ComposerKt.sourceInformation($composer3, "171@8378L307");
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default3);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer3.startReusableNode();
                    if ($composer3.getInserting()) {
                        function1 = constructor;
                        $composer3.createNode(function1);
                    } else {
                        function1 = constructor;
                        $composer3.useNode();
                    }
                    composerM3656constructorimpl = Updater.m3656constructorimpl($composer3);
                    Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3656constructorimpl.getInserting()) {
                    }
                    composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                    Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i8 = (i7 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i9 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, 899681987, "C172@8472L199:AnalysisScreen.kt#td928");
                    long j2 = TwilightIndigo;
                    TextKt.m2697Text4IGK_g("Aucun backtest enregistré. Cliquez sur le bouton pour simuler les performances passées.", (Modifier) null, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6487boximpl(TextAlign.INSTANCE.m6494getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 390, 0, 130554);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                } else {
                    $composer3.startReplaceGroup(1029673715);
                }
                $composer3.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda51
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.BacktestView$lambda$44(viewModel, report, isLoading, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit BacktestView$lambda$43$lambda$35$lambda$34(AnalysisViewModel $viewModel) {
        $viewModel.runBacktest();
        return Unit.INSTANCE;
    }

    static final Unit BacktestView$lambda$43$lambda$36(boolean $isLoading, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-110472993, $changed, -1, "lnb.predict.earn.ui.screens.BacktestView.<anonymous>.<anonymous> (AnalysisScreen.kt:132)");
            }
            if ($isLoading) {
                $composer.startReplaceGroup(-1155950137);
                ComposerKt.sourceInformation($composer, "133@6234L99,134@6350L28,135@6395L27");
                ProgressIndicatorKt.m2371CircularProgressIndicatorLxG7B9w(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(24)), Color.INSTANCE.m4200getWhite0d7_KjU(), Dp.m6627constructorimpl(2), 0L, 0, $composer, 438, 24);
                SpacerKt.Spacer(SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(8)), $composer, 6);
                TextKt.m2697Text4IGK_g("ANALYSE EN COURS...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1155730006);
                ComposerKt.sourceInformation($composer, "137@6460L57");
                TextKt.m2697Text4IGK_g("LANCER LE BACKTEST", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BacktestView$lambda$43$lambda$41$lambda$40(final BacktestReport $report, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1504409950, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnalysisScreenKt.BacktestView$lambda$43$lambda$41$lambda$40$lambda$38($report, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AnalysisScreenKt.INSTANCE.m8645getLambda$864459691$app_debug(), 3, null);
        final List<BacktestStep> steps = $report.getSteps();
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$BacktestView$lambda$43$lambda$41$lambda$40$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((BacktestStep) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BacktestStep backtestStep) {
                return null;
            }
        };
        LazyColumn.items(steps.size(), null, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$BacktestView$lambda$43$lambda$41$lambda$40$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(steps.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$BacktestView$lambda$43$lambda$41$lambda$40$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final BacktestStep backtestStep = (BacktestStep) steps.get(it);
                $composer.startReplaceGroup(-430351749);
                ComposerKt.sourceInformation($composer, "C*154@7366L934,154@7353L947:AnalysisScreen.kt#td928");
                AnalysisScreenKt.AnalysisCard(ComposableLambdaKt.rememberComposableLambda(67947932, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$BacktestView$1$3$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code duplicated, block: B:52:0x03db  */
                    /* JADX WARN: Code duplicated, block: B:55:0x03e7  */
                    /* JADX WARN: Code duplicated, block: B:56:0x03ed  */
                    /* JADX WARN: Code duplicated, block: B:59:0x041e  */
                    /* JADX WARN: Code duplicated, block: B:62:0x0431  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0434  */
                    /* JADX WARN: Code duplicated, block: B:67:0x04f4  */
                    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
                    public final void invoke(Composer $composer2, int $changed2) {
                        Function0<ComposeUiNode> function0;
                        Function0<ComposeUiNode> function2;
                        long jM4193getGray0d7_KjU;
                        long j;
                        int currentCompositeKeyHash;
                        Function0<ComposeUiNode> constructor;
                        Function0<ComposeUiNode> function3;
                        Composer composerM3656constructorimpl;
                        Composer composer;
                        ComposerKt.sourceInformation($composer2, "C155@7392L886:AnalysisScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(67947932, $changed2, -1, "lnb.predict.earn.ui.screens.BacktestView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:155)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        BacktestStep backtestStep2 = backtestStep;
                        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function0 = constructor2;
                            $composer2.createNode(function0);
                        } else {
                            function0 = constructor2;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3656constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i3 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i4 = ((384 >> 6) & 112) | 6;
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer2, -820347711, "C156@7474L318,160@7821L431:AnalysisScreen.kt#td928");
                        Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierWeight$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function2 = constructor3;
                            $composer2.createNode(function2);
                        } else {
                            function2 = constructor3;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl3 = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3656constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i6 = (i5 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        int i7 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, 1180197855, "C157@7536L87,158@7656L106:AnalysisScreen.kt#td928");
                        TextKt.m2697Text4IGK_g(backtestStep2.getDate() + " - " + backtestStep2.getDrawName(), (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 199680, 0, 131030);
                        String str = "Résultat: " + CollectionsKt.joinToString$default(backtestStep2.getActual(), ", ", null, null, 0, null, null, 62, null);
                        long sp = TextUnitKt.getSp(11);
                        long j2 = AnalysisScreenKt.InkBlack;
                        TextKt.m2697Text4IGK_g(str, (Modifier) null, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.6f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 3456, 0, 131058);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        Modifier modifierClip = ClipKt.clip(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(36)), RoundedCornerShapeKt.getCircleShape());
                        if (backtestStep2.getHits() < 2) {
                            if (backtestStep2.getHits() == 1) {
                                j = 4294951175L;
                            } else {
                                jM4193getGray0d7_KjU = Color.INSTANCE.m4193getGray0d7_KjU();
                            }
                            Modifier modifierM227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(modifierClip, jM4193getGray0d7_KjU, null, 2, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer2, modifierM227backgroundbw27NRU$default);
                            constructor = ComposeUiNode.INSTANCE.getConstructor();
                            int i8 = ((((48 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer2.startReusableNode();
                            if ($composer2.getInserting()) {
                                function3 = constructor;
                                $composer2.createNode(function3);
                            } else {
                                function3 = constructor;
                                $composer2.useNode();
                            }
                            composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3656constructorimpl.getInserting()) {
                                composer = $composer2;
                                if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                }
                                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                int i9 = (i8 >> 6) & 14;
                                Composer composer2 = composer;
                                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                int i10 = ((48 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer2, -1464361783, "C164@8150L72:AnalysisScreen.kt#td928");
                                TextKt.m2697Text4IGK_g(String.valueOf(backtestStep2.getHits()), (Modifier) null, Color.INSTANCE.m4200getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196992, 0, 131034);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                $composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                            composer = $composer2;
                            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i11 = (i8 >> 6) & 14;
                            Composer composer3 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            int i12 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer3, -1464361783, "C164@8150L72:AnalysisScreen.kt#td928");
                            TextKt.m2697Text4IGK_g(String.valueOf(backtestStep2.getHits()), (Modifier) null, Color.INSTANCE.m4200getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 196992, 0, 131034);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            $composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        j = 4283215696L;
                        jM4193getGray0d7_KjU = ColorKt.Color(j);
                        Modifier modifierM227backgroundbw27NRU$default2 = BackgroundKt.m227backgroundbw27NRU$default(modifierClip, jM4193getGray0d7_KjU, null, 2, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer2, modifierM227backgroundbw27NRU$default2);
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i13 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function3 = constructor;
                            $composer2.createNode(function3);
                        } else {
                            function3 = constructor;
                            $composer2.useNode();
                        }
                        composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl.getInserting()) {
                            composer = $composer2;
                            if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            int i14 = (i13 >> 6) & 14;
                            Composer composer4 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            int i15 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -1464361783, "C164@8150L72:AnalysisScreen.kt#td928");
                            TextKt.m2697Text4IGK_g(String.valueOf(backtestStep2.getHits()), (Modifier) null, Color.INSTANCE.m4200getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 196992, 0, 131034);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            $composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        composer = $composer2;
                        composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        int i16 = (i13 >> 6) & 14;
                        Composer composer5 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        int i17 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer5, -1464361783, "C164@8150L72:AnalysisScreen.kt#td928");
                        TextKt.m2697Text4IGK_g(String.valueOf(backtestStep2.getHits()), (Modifier) null, Color.INSTANCE.m4200getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 196992, 0, 131034);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 6);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit BacktestView$lambda$43$lambda$41$lambda$40$lambda$38(BacktestReport $report, LazyItemScope item, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C144@6692L391:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1504409950, $changed, -1, "lnb.predict.earn.ui.screens.BacktestView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:144)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal horizontalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM552spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i3 = ((54 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1521347065, "C145@6811L68,146@6904L75,147@7004L57:AnalysisScreen.kt#td928");
            StatCard("Simulations", String.valueOf($report.getTotalSteps()), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6, 0);
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf($report.getAverageHits())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            StatCard("Moyenne", str, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6, 0);
            StatCard("Max", String.valueOf($report.getBestHit()), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void FrequencyList(final List<FrequencyStats> list, Composer $composer, final int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "list");
        Composer $composer2 = $composer.startRestartGroup(765350186);
        ComposerKt.sourceInformation($composer2, "C(FrequencyList)180@8830L1229,180@8769L1290:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(765350186, $dirty, -1, "lnb.predict.earn.ui.screens.FrequencyList (AnalysisScreen.kt:179)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer2, 1062126359, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(list);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda54
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalysisScreenKt.FrequencyList$lambda$48$lambda$47(list, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer2, 24576, 239);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.FrequencyList$lambda$49(list, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit FrequencyList$lambda$48$lambda$47(final List $list, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AnalysisScreenKt.INSTANCE.getLambda$400328470$app_debug(), 3, null);
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalysisScreenKt.FrequencyList$lambda$48$lambda$47$lambda$45((FrequencyStats) obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$FrequencyList$lambda$48$lambda$47$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((FrequencyStats) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(FrequencyStats frequencyStats) {
                return null;
            }
        };
        LazyColumn.items($list.size(), new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$FrequencyList$lambda$48$lambda$47$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($list.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$FrequencyList$lambda$48$lambda$47$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function2.invoke($list.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$FrequencyList$lambda$48$lambda$47$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final FrequencyStats frequencyStats = (FrequencyStats) $list.get(it);
                $composer.startReplaceGroup(-541503577);
                ComposerKt.sourceInformation($composer, "C*191@9517L526,191@9504L539:AnalysisScreen.kt#td928");
                AnalysisScreenKt.AnalysisCard(ComposableLambdaKt.rememberComposableLambda(1182329562, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$FrequencyList$1$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer2, int $changed2) {
                        Function0<ComposeUiNode> function0;
                        ComposerKt.sourceInformation($composer2, "C192@9535L494:AnalysisScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1182329562, $changed2, -1, "lnb.predict.earn.ui.screens.FrequencyList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:192)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        FrequencyStats frequencyStats2 = frequencyStats;
                        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function0 = constructor;
                            $composer2.createNode(function0);
                        } else {
                            function0 = constructor;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i3 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i4 = ((384 >> 6) & 112) | 6;
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer2, 1625015283, "C193@9609L23,194@9653L29,195@9703L83,196@9807L54,197@9882L54,198@9957L54:AnalysisScreen.kt#td928");
                        AnalysisScreenKt.NumberBall(frequencyStats2.getNumber(), 0, $composer2, 0, 2);
                        SpacerKt.Spacer(SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), $composer2, 6);
                        TextKt.m2697Text4IGK_g(String.valueOf(frequencyStats2.getTotal()), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131036);
                        TextKt.m2697Text4IGK_g(String.valueOf(frequencyStats2.getLast30()), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        TextKt.m2697Text4IGK_g(String.valueOf(frequencyStats2.getLast90()), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        TextKt.m2697Text4IGK_g(String.valueOf(frequencyStats2.getYearly()), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 6);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object FrequencyList$lambda$48$lambda$47$lambda$45(FrequencyStats it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getNumber());
    }

    public static final void DelayList(final List<DelayStats> list, Composer $composer, final int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "list");
        Composer $composer2 = $composer.startRestartGroup(994745443);
        ComposerKt.sourceInformation($composer2, "C(DelayList)207@10180L1088,207@10119L1149:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(994745443, $dirty, -1, "lnb.predict.earn.ui.screens.DelayList (AnalysisScreen.kt:206)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer2, -1827331453, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(list);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalysisScreenKt.DelayList$lambda$53$lambda$52(list, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer2, 24576, 239);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.DelayList$lambda$54(list, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit DelayList$lambda$53$lambda$52(final List $list, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AnalysisScreenKt.INSTANCE.getLambda$1284024399$app_debug(), 3, null);
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalysisScreenKt.DelayList$lambda$53$lambda$52$lambda$50((DelayStats) obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$DelayList$lambda$53$lambda$52$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((DelayStats) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(DelayStats delayStats) {
                return null;
            }
        };
        LazyColumn.items($list.size(), new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$DelayList$lambda$53$lambda$52$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($list.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$DelayList$lambda$53$lambda$52$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function2.invoke($list.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$DelayList$lambda$53$lambda$52$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final DelayStats delayStats = (DelayStats) $list.get(it);
                $composer.startReplaceGroup(1633674668);
                ComposerKt.sourceInformation($composer, "C*217@10731L521,217@10718L534:AnalysisScreen.kt#td928");
                AnalysisScreenKt.AnalysisCard(ComposableLambdaKt.rememberComposableLambda(1423212858, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$DelayList$1$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer2, int $changed2) {
                        Function0<ComposeUiNode> function0;
                        ComposerKt.sourceInformation($composer2, "C218@10749L489:AnalysisScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1423212858, $changed2, -1, "lnb.predict.earn.ui.screens.DelayList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:218)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        DelayStats delayStats2 = delayStats;
                        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function0 = constructor;
                            $composer2.createNode(function0);
                        } else {
                            function0 = constructor;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i3 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i4 = ((384 >> 6) & 112) | 6;
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer2, -287642376, "C219@10823L23,220@10867L29,221@10917L148,222@11086L62,223@11169L51:AnalysisScreen.kt#td928");
                        AnalysisScreenKt.NumberBall(delayStats2.getNumber(), 0, $composer2, 0, 2);
                        SpacerKt.Spacer(SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), $composer2, 6);
                        TextKt.m2697Text4IGK_g(String.valueOf(delayStats2.getCurrent()), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), ((double) delayStats2.getCurrent()) > delayStats2.getMean() ? Color.INSTANCE.m4197getRed0d7_KjU() : AnalysisScreenKt.InkBlack, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131032);
                        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(delayStats2.getMean())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        TextKt.m2697Text4IGK_g(str, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        TextKt.m2697Text4IGK_g(String.valueOf(delayStats2.getMax()), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 6);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object DelayList$lambda$53$lambda$52$lambda$50(DelayStats it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getNumber());
    }

    public static final void RepetitionList(final List<RepetitionStats> list, Composer $composer, final int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "list");
        Composer $composer2 = $composer.startRestartGroup(-434716519);
        ComposerKt.sourceInformation($composer2, "C(RepetitionList)232@11399L630,232@11338L691:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434716519, $dirty, -1, "lnb.predict.earn.ui.screens.RepetitionList (AnalysisScreen.kt:231)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer2, -1150742353, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(list);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda75
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalysisScreenKt.RepetitionList$lambda$58$lambda$57(list, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer2, 24576, 239);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda76
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.RepetitionList$lambda$59(list, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit RepetitionList$lambda$58$lambda$57(final List $list, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AnalysisScreenKt.INSTANCE.getLambda$1134512173$app_debug(), 3, null);
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalysisScreenKt.RepetitionList$lambda$58$lambda$57$lambda$55((RepetitionStats) obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$RepetitionList$lambda$58$lambda$57$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((RepetitionStats) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(RepetitionStats repetitionStats) {
                return null;
            }
        };
        LazyColumn.items($list.size(), new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$RepetitionList$lambda$58$lambda$57$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($list.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$RepetitionList$lambda$58$lambda$57$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function2.invoke($list.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$RepetitionList$lambda$58$lambda$57$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final RepetitionStats repetitionStats = (RepetitionStats) $list.get(it);
                $composer.startReplaceGroup(-951937494);
                ComposerKt.sourceInformation($composer, "C*235@11638L375,235@11625L388:AnalysisScreen.kt#td928");
                AnalysisScreenKt.AnalysisCard(ComposableLambdaKt.rememberComposableLambda(-864050354, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$RepetitionList$1$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer2, int $changed2) {
                        Function0<ComposeUiNode> function0;
                        ComposerKt.sourceInformation($composer2, "C236@11656L343:AnalysisScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-864050354, $changed2, -1, "lnb.predict.earn.ui.screens.RepetitionList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:236)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        RepetitionStats repetitionStats2 = repetitionStats;
                        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function0 = constructor;
                            $composer2.createNode(function0);
                        } else {
                            function0 = constructor;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i3 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i4 = ((384 >> 6) & 112) | 6;
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer2, -1982374474, "C237@11730L23,238@11774L55,239@11850L55,240@11926L55:AnalysisScreen.kt#td928");
                        AnalysisScreenKt.NumberBall(repetitionStats2.getNumber(), 0, $composer2, 0, 2);
                        String str = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(repetitionStats2.getTPlus1())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        TextKt.m2697Text4IGK_g(str, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        String str2 = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(repetitionStats2.getTPlus2())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        TextKt.m2697Text4IGK_g(str2, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        String str3 = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(repetitionStats2.getTPlus3())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                        TextKt.m2697Text4IGK_g(str3, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 6);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object RepetitionList$lambda$58$lambda$57$lambda$55(RepetitionStats it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getNumber());
    }

    public static final void AssociationList(final Map<Integer, AssociationStats> map, Composer $composer, final int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(map, "map");
        Composer $composer2 = $composer.startRestartGroup(1447675477);
        ComposerKt.sourceInformation($composer2, "C(AssociationList)249@12165L891,249@12104L952:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(map) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1447675477, $dirty, -1, "lnb.predict.earn.ui.screens.AssociationList (AnalysisScreen.kt:248)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer2, -353265392, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(map);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalysisScreenKt.AssociationList$lambda$63$lambda$62(map, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer2, 24576, 239);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.AssociationList$lambda$64(map, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit AssociationList$lambda$63$lambda$62(Map $map, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List list = CollectionsKt.toList($map.values());
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalysisScreenKt.AssociationList$lambda$63$lambda$62$lambda$60((AssociationStats) obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$AssociationList$lambda$63$lambda$62$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((AssociationStats) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AssociationStats associationStats) {
                return null;
            }
        };
        LazyColumn.items(list.size(), new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$AssociationList$lambda$63$lambda$62$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(list.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$AssociationList$lambda$63$lambda$62$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function2.invoke(list.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$AssociationList$lambda$63$lambda$62$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final AssociationStats associationStats = (AssociationStats) list.get(it);
                $composer.startReplaceGroup(1285526607);
                ComposerKt.sourceInformation($composer, "C*251@12258L782,251@12245L795:AnalysisScreen.kt#td928");
                AnalysisScreenKt.AnalysisCard(ComposableLambdaKt.rememberComposableLambda(1242113120, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$AssociationList$1$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code duplicated, block: B:28:0x01b6  */
                    /* JADX WARN: Code duplicated, block: B:31:0x01c2  */
                    /* JADX WARN: Code duplicated, block: B:32:0x01c8  */
                    /* JADX WARN: Code duplicated, block: B:43:0x033f  */
                    /* JADX WARN: Code duplicated, block: B:46:0x034b  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0351  */
                    /* JADX WARN: Code duplicated, block: B:59:0x040a  */
                    /* JADX WARN: Code duplicated, block: B:61:0x048e  */
                    /* JADX WARN: Code duplicated, block: B:64:0x049a  */
                    /* JADX WARN: Code duplicated, block: B:65:0x04a0  */
                    /* JADX WARN: Code duplicated, block: B:77:0x05e7  */
                    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
                    public final void invoke(Composer $composer2, int $changed2) {
                        Function0<ComposeUiNode> function0;
                        int i2;
                        Composer composer;
                        Composer composer2;
                        String str;
                        int currentCompositeKeyHash;
                        Function0<ComposeUiNode> constructor;
                        Function0<ComposeUiNode> function3;
                        Composer composerM3656constructorimpl;
                        int currentCompositeKeyHash2;
                        Modifier modifierMaterializeModifier;
                        Function0<ComposeUiNode> constructor2;
                        Function0<ComposeUiNode> function4;
                        Composer composerM3656constructorimpl2;
                        Composer composer3;
                        int i3;
                        Iterable<Companion> iterableTake;
                        int i4;
                        Composer composer4;
                        int currentCompositeKeyHash3;
                        Function0<ComposeUiNode> constructor3;
                        Function0<ComposeUiNode> function5;
                        Composer composerM3656constructorimpl3;
                        ComposerKt.sourceInformation($composer2, "C252@12276L750:AnalysisScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1242113120, $changed2, -1, "lnb.predict.earn.ui.screens.AssociationList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:252)");
                        }
                        AssociationStats associationStats2 = associationStats;
                        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        String str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        String str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function0 = constructor4;
                            $composer2.createNode(function0);
                        } else {
                            function0 = constructor4;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl4 = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl4, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl4, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl4.getInserting()) {
                            i2 = 0;
                            composer = $composer2;
                            if (!Intrinsics.areEqual(composerM3656constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            }
                            Updater.m3663setimpl(composerM3656constructorimpl4, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i6 = (i5 >> 6) & 14;
                            composer2 = composer;
                            str = "C88@4444L9:Column.kt#2w3rfo";
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i7 = ((i2 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, 740728826, "C253@12305L200,257@12526L29,258@12576L432:AnalysisScreen.kt#td928");
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Modifier modifier2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier2);
                            constructor = ComposeUiNode.INSTANCE.getConstructor();
                            int i8 = ((((384 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                function3 = constructor;
                                composer2.createNode(function3);
                            } else {
                                function3 = constructor;
                                composer2.useNode();
                            }
                            composerM3656constructorimpl = Updater.m3656constructorimpl(composer2);
                            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                            }
                            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i9 = (i8 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            int i10 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, -1292285991, "C254@12383L23,255@12431L52:AnalysisScreen.kt#td928");
                            AnalysisScreenKt.NumberBall(associationStats2.getNumber(), 0, composer2, 0, 2);
                            TextKt.m2697Text4IGK_g(" Compagnons : ", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196614, 0, 131038);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(8)), composer2, 6);
                            Arrangement.Horizontal horizontalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(4));
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Modifier modifier3 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM552spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier3);
                            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            int i11 = ((((48 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                function4 = constructor2;
                                composer2.createNode(function4);
                            } else {
                                function4 = constructor2;
                                composer2.useNode();
                            }
                            composerM3656constructorimpl2 = Updater.m3656constructorimpl(composer2);
                            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3656constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3);
                            }
                            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            int i12 = (i11 >> 6) & 14;
                            composer3 = composer2;
                            i3 = 0;
                            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            int i13 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer3, 453552364, "C:AnalysisScreen.kt#td928");
                            composer3.startReplaceGroup(1815746876);
                            ComposerKt.sourceInformation(composer3, "*260@12731L229");
                            iterableTake = CollectionsKt.take(associationStats2.getTopCompanions(), 5);
                            i4 = 0;
                            for (Companion companion : iterableTake) {
                                Iterable iterable = iterableTake;
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                composer4 = composer3;
                                int i14 = i4;
                                Composer composer5 = composer3;
                                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                Modifier modifier4 = Modifier.INSTANCE;
                                Modifier modifier5 = modifierMaterializeModifier;
                                int i15 = i3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str2);
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                String str4 = str2;
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifier4);
                                constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                int i16 = ((((384 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str3);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    function5 = constructor3;
                                    composer4.createNode(function5);
                                } else {
                                    function5 = constructor3;
                                    composer4.useNode();
                                }
                                String str5 = str3;
                                composerM3656constructorimpl3 = Updater.m3656constructorimpl(composer4);
                                Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!composerM3656constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash4);
                                }
                                Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                int i17 = (i16 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart(composer4, -384784025, str);
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                int i18 = ((384 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer4, 254295797, "C261@12824L34,262@12891L39:AnalysisScreen.kt#td928");
                                AnalysisScreenKt.NumberBall(companion.getNumber(), 24, composer4, 48, 0);
                                TextKt.m2697Text4IGK_g(String.valueOf(companion.getCount()), (Modifier) null, 0L, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131062);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer3 = composer5;
                                iterableTake = iterable;
                                i4 = i14;
                                modifierMaterializeModifier = modifier5;
                                i3 = i15;
                                str2 = str4;
                                str3 = str5;
                                str = str;
                            }
                            Composer composer6 = composer3;
                            composer6.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        i2 = 0;
                        composer = $composer2;
                        composerM3656constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3656constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash);
                        Updater.m3663setimpl(composerM3656constructorimpl4, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i19 = (i5 >> 6) & 14;
                        composer2 = composer;
                        str = "C88@4444L9:Column.kt#2w3rfo";
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        int i20 = ((i2 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, 740728826, "C253@12305L200,257@12526L29,258@12576L432:AnalysisScreen.kt#td928");
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier6 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifier6);
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i21 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            function3 = constructor;
                            composer2.createNode(function3);
                        } else {
                            function3 = constructor;
                            composer2.useNode();
                        }
                        composerM3656constructorimpl = Updater.m3656constructorimpl(composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl.getInserting()) {
                        }
                        composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        int i22 = (i21 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        int i110 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1292285991, "C254@12383L23,255@12431L52:AnalysisScreen.kt#td928");
                        AnalysisScreenKt.NumberBall(associationStats2.getNumber(), 0, composer2, 0, 2);
                        TextKt.m2697Text4IGK_g(" Compagnons : ", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196614, 0, 131038);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(8)), composer2, 6);
                        Arrangement.Horizontal horizontalM552spacedBy0680j_5 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(4));
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier7 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontalM552spacedBy0680j_5, Alignment.INSTANCE.getTop(), composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier7);
                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        int i111 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            function4 = constructor2;
                            composer2.createNode(function4);
                        } else {
                            function4 = constructor2;
                            composer2.useNode();
                        }
                        composerM3656constructorimpl2 = Updater.m3656constructorimpl(composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl2.getInserting()) {
                        }
                        composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash6);
                        Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i112 = (i111 >> 6) & 14;
                        composer3 = composer2;
                        i3 = 0;
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                        int i113 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer3, 453552364, "C:AnalysisScreen.kt#td928");
                        composer3.startReplaceGroup(1815746876);
                        ComposerKt.sourceInformation(composer3, "*260@12731L229");
                        iterableTake = CollectionsKt.take(associationStats2.getTopCompanions(), 5);
                        i4 = 0;
                        while (r25.hasNext()) {
                            Iterable iterable2 = iterableTake;
                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                            composer4 = composer3;
                            int i114 = i4;
                            Composer composer7 = composer3;
                            ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier modifier8 = Modifier.INSTANCE;
                            Modifier modifier9 = modifierMaterializeModifier;
                            int i115 = i3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer4, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str2);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap7 = composer4.getCurrentCompositionLocalMap();
                            String str6 = str2;
                            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer4, modifier8);
                            constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            int i116 = ((((384 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str3);
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                function5 = constructor3;
                                composer4.createNode(function5);
                            } else {
                                function5 = constructor3;
                                composer4.useNode();
                            }
                            String str7 = str3;
                            composerM3656constructorimpl3 = Updater.m3656constructorimpl(composer4);
                            Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3656constructorimpl3.getInserting()) {
                            }
                            composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash7);
                            Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                            int i117 = (i116 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer4, -384784025, str);
                            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                            int i118 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, 254295797, "C261@12824L34,262@12891L39:AnalysisScreen.kt#td928");
                            AnalysisScreenKt.NumberBall(companion.getNumber(), 24, composer4, 48, 0);
                            TextKt.m2697Text4IGK_g(String.valueOf(companion.getCount()), (Modifier) null, 0L, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131062);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer3 = composer7;
                            iterableTake = iterable2;
                            i4 = i114;
                            modifierMaterializeModifier = modifier9;
                            i3 = i115;
                            str2 = str6;
                            str3 = str7;
                            str = str;
                        }
                        Composer composer8 = composer3;
                        composer8.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 6);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object AssociationList$lambda$63$lambda$62$lambda$60(AssociationStats it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getNumber());
    }

    public static final void TransitionList(final Map<Integer, TransitionStats> map, Composer $composer, final int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(map, "map");
        Composer $composer2 = $composer.startRestartGroup(-1585364027);
        ComposerKt.sourceInformation($composer2, "C(TransitionList)274@13190L674,274@13129L735:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(map) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1585364027, $dirty, -1, "lnb.predict.earn.ui.screens.TransitionList (AnalysisScreen.kt:273)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer2, 1178564967, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(map);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalysisScreenKt.TransitionList$lambda$68$lambda$67(map, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer2, 24576, 239);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.TransitionList$lambda$69(map, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit TransitionList$lambda$68$lambda$67(Map $map, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List list = CollectionsKt.toList($map.values());
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda72
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalysisScreenKt.TransitionList$lambda$68$lambda$67$lambda$65((TransitionStats) obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$TransitionList$lambda$68$lambda$67$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((TransitionStats) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(TransitionStats transitionStats) {
                return null;
            }
        };
        LazyColumn.items(list.size(), new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$TransitionList$lambda$68$lambda$67$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(list.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$TransitionList$lambda$68$lambda$67$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function2.invoke(list.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$TransitionList$lambda$68$lambda$67$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final TransitionStats transitionStats = (TransitionStats) list.get(it);
                $composer.startReplaceGroup(-1637252012);
                ComposerKt.sourceInformation($composer, "C*276@13283L565,276@13270L578:AnalysisScreen.kt#td928");
                AnalysisScreenKt.AnalysisCard(ComposableLambdaKt.rememberComposableLambda(156820308, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$TransitionList$1$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code duplicated, block: B:28:0x01b4  */
                    /* JADX WARN: Code duplicated, block: B:31:0x01c0  */
                    /* JADX WARN: Code duplicated, block: B:32:0x01c6  */
                    /* JADX WARN: Code duplicated, block: B:43:0x0328  */
                    /* JADX WARN: Code duplicated, block: B:46:0x0334  */
                    /* JADX WARN: Code duplicated, block: B:47:0x033a  */
                    /* JADX WARN: Code duplicated, block: B:50:0x036b  */
                    /* JADX WARN: Code duplicated, block: B:53:0x037e  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0381  */
                    /* JADX WARN: Code duplicated, block: B:59:0x03f1 A[LOOP:0: B:57:0x03eb->B:59:0x03f1, LOOP_END] */
                    /* JADX WARN: Code duplicated, block: B:62:0x04a7  */
                    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
                    public final void invoke(Composer $composer2, int $changed2) {
                        Function0<ComposeUiNode> function0;
                        TransitionStats transitionStats2;
                        int currentCompositeKeyHash;
                        Function0<ComposeUiNode> constructor;
                        Function0<ComposeUiNode> function3;
                        Composer composerM3656constructorimpl;
                        int currentCompositeKeyHash2;
                        Function0<ComposeUiNode> constructor2;
                        Function0<ComposeUiNode> function4;
                        Composer composerM3656constructorimpl2;
                        Composer composer;
                        Composer composer2;
                        Iterable<Transition> iterableTake;
                        int i2;
                        ComposerKt.sourceInformation($composer2, "C277@13301L533:AnalysisScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(156820308, $changed2, -1, "lnb.predict.earn.ui.screens.TransitionList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:277)");
                        }
                        TransitionStats transitionStats3 = transitionStats;
                        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int i3 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function0 = constructor3;
                            $composer2.createNode(function0);
                        } else {
                            function0 = constructor3;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl3 = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl3.getInserting()) {
                            transitionStats2 = transitionStats3;
                            if (!Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            }
                            Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            int i4 = (i3 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i5 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer2, -149555265, "C278@13330L200,282@13551L265:AnalysisScreen.kt#td928");
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Modifier modifier2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifier2);
                            constructor = ComposeUiNode.INSTANCE.getConstructor();
                            int i6 = ((((384 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer2.startReusableNode();
                            if ($composer2.getInserting()) {
                                function3 = constructor;
                                $composer2.createNode(function3);
                            } else {
                                function3 = constructor;
                                $composer2.useNode();
                            }
                            composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                            }
                            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i7 = (i6 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            int i8 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer2, -147209499, "C279@13408L23,280@13456L52:AnalysisScreen.kt#td928");
                            AnalysisScreenKt.NumberBall(transitionStats2.getNumber(), 0, $composer2, 0, 2);
                            TextKt.m2697Text4IGK_g(" → Suivants : ", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 196614, 0, 131038);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            $composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            Arrangement.Horizontal horizontalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
                            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Modifier modifier3 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM552spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer2, modifier3);
                            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            int i9 = ((((48 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer2.startReusableNode();
                            if ($composer2.getInserting()) {
                                function4 = constructor2;
                                $composer2.createNode(function4);
                            } else {
                                function4 = constructor2;
                                $composer2.useNode();
                            }
                            composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer2);
                            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3656constructorimpl2.getInserting()) {
                                composer = $composer2;
                                if (!Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                }
                                Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                int i10 = (i9 >> 6) & 14;
                                Composer composer3 = composer;
                                ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                int i11 = ((48 >> 6) & 112) | 6;
                                composer2 = composer3;
                                ComposerKt.sourceInformationMarkerStart(composer2, 779747711, "C:AnalysisScreen.kt#td928");
                                composer2.startReplaceGroup(163701104);
                                ComposerKt.sourceInformation(composer2, "*284@13696L72");
                                iterableTake = CollectionsKt.take(transitionStats2.getTPlus1(), 5);
                                i2 = 0;
                                for (Transition transition : iterableTake) {
                                    Iterable iterable = iterableTake;
                                    Composer composer4 = composer2;
                                    String str = String.format(transition.getTargetNumber() + "(%.0f%%)", Arrays.copyOf(new Object[]{Double.valueOf(transition.getPercentage())}, 1));
                                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                    TextKt.m2697Text4IGK_g(str, (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131062);
                                    composer2 = composer4;
                                    iterableTake = iterable;
                                    i2 = i2;
                                }
                                Composer composer5 = composer2;
                                composer5.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                $composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                            composer = $composer2;
                            composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3);
                            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i12 = (i9 >> 6) & 14;
                            Composer composer6 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer6, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                            int i13 = ((48 >> 6) & 112) | 6;
                            composer2 = composer6;
                            ComposerKt.sourceInformationMarkerStart(composer2, 779747711, "C:AnalysisScreen.kt#td928");
                            composer2.startReplaceGroup(163701104);
                            ComposerKt.sourceInformation(composer2, "*284@13696L72");
                            iterableTake = CollectionsKt.take(transitionStats2.getTPlus1(), 5);
                            i2 = 0;
                            while (r29.hasNext()) {
                                Iterable iterable2 = iterableTake;
                                Composer composer7 = composer2;
                                String str2 = String.format(transition.getTargetNumber() + "(%.0f%%)", Arrays.copyOf(new Object[]{Double.valueOf(transition.getPercentage())}, 1));
                                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                                TextKt.m2697Text4IGK_g(str2, (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer7, 3072, 0, 131062);
                                composer2 = composer7;
                                iterableTake = iterable2;
                                i2 = i2;
                            }
                            Composer composer8 = composer2;
                            composer8.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer8);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            $composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        transitionStats2 = transitionStats3;
                        composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash);
                        Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i14 = (i3 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        int i15 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -149555265, "C278@13330L200,282@13551L265:AnalysisScreen.kt#td928");
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier4 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer2, modifier4);
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i16 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function3 = constructor;
                            $composer2.createNode(function3);
                        } else {
                            function3 = constructor;
                            $composer2.useNode();
                        }
                        composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl.getInserting()) {
                        }
                        composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        int i17 = (i16 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                        int i18 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -147209499, "C279@13408L23,280@13456L52:AnalysisScreen.kt#td928");
                        AnalysisScreenKt.NumberBall(transitionStats2.getNumber(), 0, $composer2, 0, 2);
                        TextKt.m2697Text4IGK_g(" → Suivants : ", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 196614, 0, 131038);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        Arrangement.Horizontal horizontalM552spacedBy0680j_5 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier5 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontalM552spacedBy0680j_5, Alignment.INSTANCE.getTop(), $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer2, modifier5);
                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        int i19 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function4 = constructor2;
                            $composer2.createNode(function4);
                        } else {
                            function4 = constructor2;
                            $composer2.useNode();
                        }
                        composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl2.getInserting()) {
                            composer = $composer2;
                            if (!Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            }
                            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            int i110 = (i19 >> 6) & 14;
                            Composer composer9 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer9, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                            int i111 = ((48 >> 6) & 112) | 6;
                            composer2 = composer9;
                            ComposerKt.sourceInformationMarkerStart(composer2, 779747711, "C:AnalysisScreen.kt#td928");
                            composer2.startReplaceGroup(163701104);
                            ComposerKt.sourceInformation(composer2, "*284@13696L72");
                            iterableTake = CollectionsKt.take(transitionStats2.getTPlus1(), 5);
                            i2 = 0;
                            while (r29.hasNext()) {
                                Iterable iterable3 = iterableTake;
                                Composer composer10 = composer2;
                                String str3 = String.format(transition.getTargetNumber() + "(%.0f%%)", Arrays.copyOf(new Object[]{Double.valueOf(transition.getPercentage())}, 1));
                                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                                TextKt.m2697Text4IGK_g(str3, (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer10, 3072, 0, 131062);
                                composer2 = composer10;
                                iterableTake = iterable3;
                                i2 = i2;
                            }
                            Composer composer11 = composer2;
                            composer11.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer11);
                            ComposerKt.sourceInformationMarkerEnd(composer9);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            $composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        composer = $composer2;
                        composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash5);
                        Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        int i112 = (i19 >> 6) & 14;
                        Composer composer12 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer12, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                        int i113 = ((48 >> 6) & 112) | 6;
                        composer2 = composer12;
                        ComposerKt.sourceInformationMarkerStart(composer2, 779747711, "C:AnalysisScreen.kt#td928");
                        composer2.startReplaceGroup(163701104);
                        ComposerKt.sourceInformation(composer2, "*284@13696L72");
                        iterableTake = CollectionsKt.take(transitionStats2.getTPlus1(), 5);
                        i2 = 0;
                        while (r29.hasNext()) {
                            Iterable iterable4 = iterableTake;
                            Composer composer13 = composer2;
                            String str4 = String.format(transition.getTargetNumber() + "(%.0f%%)", Arrays.copyOf(new Object[]{Double.valueOf(transition.getPercentage())}, 1));
                            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                            TextKt.m2697Text4IGK_g(str4, (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer13, 3072, 0, 131062);
                            composer2 = composer13;
                            iterableTake = iterable4;
                            i2 = i2;
                        }
                        Composer composer14 = composer2;
                        composer14.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer14);
                        ComposerKt.sourceInformationMarkerEnd(composer12);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 6);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object TransitionList$lambda$68$lambda$67$lambda$65(TransitionStats it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getNumber());
    }

    public static final void HourlyList(final List<HourlyStats> list, Composer $composer, final int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "list");
        Composer $composer2 = $composer.startRestartGroup(-455586919);
        ComposerKt.sourceInformation($composer2, "C(HourlyList)295@13987L648,295@13926L709:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-455586919, $dirty, -1, "lnb.predict.earn.ui.screens.HourlyList (AnalysisScreen.kt:294)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer2, 267639489, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(list);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalysisScreenKt.HourlyList$lambda$73$lambda$72(list, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer2, 24576, 239);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.HourlyList$lambda$74(list, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit HourlyList$lambda$73$lambda$72(final List $list, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AnalysisScreenKt.INSTANCE.m8644getLambda$77873875$app_debug(), 3, null);
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalysisScreenKt.HourlyList$lambda$73$lambda$72$lambda$70((HourlyStats) obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$HourlyList$lambda$73$lambda$72$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((HourlyStats) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(HourlyStats hourlyStats) {
                return null;
            }
        };
        LazyColumn.items($list.size(), new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$HourlyList$lambda$73$lambda$72$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($list.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$HourlyList$lambda$73$lambda$72$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function2.invoke($list.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$HourlyList$lambda$73$lambda$72$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final HourlyStats hourlyStats = (HourlyStats) $list.get(it);
                $composer.startReplaceGroup(16411294);
                ComposerKt.sourceInformation($composer, "C*298@14232L387,298@14219L400:AnalysisScreen.kt#td928");
                AnalysisScreenKt.AnalysisCard(ComposableLambdaKt.rememberComposableLambda(-284944050, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$HourlyList$1$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer2, int $changed2) {
                        Function0<ComposeUiNode> function0;
                        ComposerKt.sourceInformation($composer2, "C299@14250L355:AnalysisScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-284944050, $changed2, -1, "lnb.predict.earn.ui.screens.HourlyList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:299)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        HourlyStats hourlyStats2 = hourlyStats;
                        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function0 = constructor;
                            $composer2.createNode(function0);
                        } else {
                            function0 = constructor;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i3 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i4 = ((384 >> 6) & 112) | 6;
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer2, 470746410, "C300@14324L23,301@14368L59,302@14448L59,303@14528L59:AnalysisScreen.kt#td928");
                        AnalysisScreenKt.NumberBall(hourlyStats2.getNumber(), 0, $composer2, 0, 2);
                        String str = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(hourlyStats2.getFrom11To14())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        TextKt.m2697Text4IGK_g(str, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        String str2 = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(hourlyStats2.getFrom14To18())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        TextKt.m2697Text4IGK_g(str2, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        String str3 = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(hourlyStats2.getFrom18To21())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                        TextKt.m2697Text4IGK_g(str3, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131068);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 6);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object HourlyList$lambda$73$lambda$72$lambda$70(HourlyStats it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getNumber());
    }

    public static final void PairList(final List<PairStats> list, Composer $composer, final int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "list");
        Composer $composer2 = $composer.startRestartGroup(1684709712);
        ComposerKt.sourceInformation($composer2, "C(PairList)312@14754L443,312@14693L504:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1684709712, $dirty, -1, "lnb.predict.earn.ui.screens.PairList (AnalysisScreen.kt:311)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer2, -196633237, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(list);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalysisScreenKt.PairList$lambda$77$lambda$76(list, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer2, 24576, 239);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.PairList$lambda$78(list, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit PairList$lambda$77$lambda$76(final List $list, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$PairList$lambda$77$lambda$76$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((PairStats) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(PairStats pairStats) {
                return null;
            }
        };
        LazyColumn.items($list.size(), null, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$PairList$lambda$77$lambda$76$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($list.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$PairList$lambda$77$lambda$76$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final PairStats pairStats = (PairStats) $list.get(it);
                $composer.startReplaceGroup(1691401505);
                ComposerKt.sourceInformation($composer, "C*314@14811L370,314@14798L383:AnalysisScreen.kt#td928");
                AnalysisScreenKt.AnalysisCard(ComposableLambdaKt.rememberComposableLambda(-864193924, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$PairList$1$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer2, int $changed2) {
                        Function0<ComposeUiNode> function0;
                        ComposerKt.sourceInformation($composer2, "C315@14829L338:AnalysisScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-864193924, $changed2, -1, "lnb.predict.earn.ui.screens.PairList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:315)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        PairStats pairStats2 = pairStats;
                        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function0 = constructor;
                            $composer2.createNode(function0);
                        } else {
                            function0 = constructor;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i3 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i4 = ((384 >> 6) & 112) | 6;
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer2, -1595514579, "C316@14903L19,317@14943L41,318@15005L19,319@15045L27,320@15093L56:AnalysisScreen.kt#td928");
                        AnalysisScreenKt.NumberBall(pairStats2.getP1(), 0, $composer2, 0, 2);
                        TextKt.m2697Text4IGK_g(" + ", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 196614, 0, 131038);
                        AnalysisScreenKt.NumberBall(pairStats2.getP2(), 0, $composer2, 0, 2);
                        SpacerKt.Spacer(RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer2, 0);
                        TextKt.m2697Text4IGK_g(pairStats2.getCount() + " fois", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 6);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void TripletList(final List<TripletStats> list, Composer $composer, final int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "list");
        Composer $composer2 = $composer.startRestartGroup(-2052696464);
        ComposerKt.sourceInformation($composer2, "C(TripletList)329@15322L593,329@15261L654:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2052696464, $dirty, -1, "lnb.predict.earn.ui.screens.TripletList (AnalysisScreen.kt:328)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer2, -1251308575, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(list);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda68
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalysisScreenKt.TripletList$lambda$81$lambda$80(list, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer2, 24576, 239);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda69
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.TripletList$lambda$82(list, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit TripletList$lambda$81$lambda$80(final List $list, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$TripletList$lambda$81$lambda$80$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((TripletStats) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(TripletStats tripletStats) {
                return null;
            }
        };
        LazyColumn.items($list.size(), null, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$TripletList$lambda$81$lambda$80$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($list.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$TripletList$lambda$81$lambda$80$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final TripletStats tripletStats = (TripletStats) $list.get(it);
                $composer.startReplaceGroup(-543880400);
                ComposerKt.sourceInformation($composer, "C*331@15382L517,331@15369L530:AnalysisScreen.kt#td928");
                AnalysisScreenKt.AnalysisCard(ComposableLambdaKt.rememberComposableLambda(-696742310, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$TripletList$1$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer2, int $changed2) {
                        Function0<ComposeUiNode> function0;
                        ComposerKt.sourceInformation($composer2, "C332@15400L485:AnalysisScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-696742310, $changed2, -1, "lnb.predict.earn.ui.screens.TripletList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:332)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        TripletStats tripletStats2 = tripletStats;
                        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function0 = constructor;
                            $composer2.createNode(function0);
                        } else {
                            function0 = constructor;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i3 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i4 = ((384 >> 6) & 112) | 6;
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer2, -2010423972, "C333@15474L33,334@15528L41,335@15590L33,336@15644L41,337@15706L33,338@15760L27,339@15808L59:AnalysisScreen.kt#td928");
                        AnalysisScreenKt.NumberBall(tripletStats2.getT1(), 28, $composer2, 48, 0);
                        TextKt.m2697Text4IGK_g(" + ", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 196614, 0, 131038);
                        AnalysisScreenKt.NumberBall(tripletStats2.getT2(), 28, $composer2, 48, 0);
                        TextKt.m2697Text4IGK_g(" + ", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 196614, 0, 131038);
                        AnalysisScreenKt.NumberBall(tripletStats2.getT3(), 28, $composer2, 48, 0);
                        SpacerKt.Spacer(RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer2, 0);
                        TextKt.m2697Text4IGK_g(tripletStats2.getCount() + " fois", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 6);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0369  */
    /* JADX WARN: Code duplicated, block: B:104:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:106:0x0422  */
    /* JADX WARN: Code duplicated, block: B:109:0x042e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0434  */
    /* JADX WARN: Code duplicated, block: B:113:0x0465  */
    /* JADX WARN: Code duplicated, block: B:116:0x0478  */
    /* JADX WARN: Code duplicated, block: B:117:0x047b  */
    /* JADX WARN: Code duplicated, block: B:120:0x051f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0545  */
    /* JADX WARN: Code duplicated, block: B:129:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0216  */
    /* JADX WARN: Code duplicated, block: B:62:0x022c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0250  */
    /* JADX WARN: Code duplicated, block: B:67:0x0260  */
    /* JADX WARN: Code duplicated, block: B:68:0x0262  */
    /* JADX WARN: Code duplicated, block: B:74:0x026c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0282  */
    /* JADX WARN: Code duplicated, block: B:79:0x0297  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:96:0x0353  */
    /* JADX WARN: Code duplicated, block: B:99:0x035e  */
    public static final void ProfileSelector(final AnalysisViewModel viewModel, final Integer selected, final GlobalAnalysis analysis, Composer $composer, final int $changed) {
        Function0<ComposeUiNode> function0;
        Composer $composer2;
        int iIntValue;
        Iterator<T> it;
        Object next;
        FrequencyStats frequencyStats;
        int i;
        FrequencyStats frequencyStats2;
        Iterator<T> it2;
        Object next2;
        DelayStats delayStats;
        DelayStats delayStats2;
        final int i2;
        RepetitionStats repetitionStats;
        RepetitionStats repetitionStats2;
        RepetitionStats repetitionStats3;
        boolean zChanged;
        Object objRememberedValue;
        final RepetitionStats repetitionStats4;
        Object obj;
        Unit unit;
        boolean z;
        boolean z2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> function1;
        Composer composerM3656constructorimpl;
        int i3;
        Composer composer;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(analysis, "analysis");
        Composer $composer3 = $composer.startRestartGroup(876861086);
        ComposerKt.sourceInformation($composer3, "C(ProfileSelector)P(2,1)348@16029L4765:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(selected) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(analysis) ? 256 : 128;
        }
        if (($dirty & 147) == 146 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(876861086, $dirty, -1, "lnb.predict.earn.ui.screens.ProfileSelector (AnalysisScreen.kt:347)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            int $dirty2 = $dirty;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifier);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor2;
                $composer3.createNode(function0);
            } else {
                function0 = constructor2;
                $composer3.useNode();
            }
            Composer composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer3);
            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -2095925099, "C349@16154L643,349@16046L751:AnalysisScreen.kt#td928");
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(4));
            PaddingValues paddingValuesM669PaddingValuesa9UjIt4$default = PaddingKt.m669PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6627constructorimpl(16), 7, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM552spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer3, 1179314859, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = (($dirty2 & 112) == 32) | $composer3.changedInstance(viewModel);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChangedInstance) {
                $composer2 = $composer3;
            } else {
                $composer2 = $composer3;
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                LazyDslKt.LazyRow(null, null, paddingValuesM669PaddingValuesa9UjIt4$default, false, horizontalOrVertical, null, null, false, (Function1) objRememberedValue2, $composer3, 24960, 235);
                if (selected == null) {
                    $composer3.startReplaceGroup(-2095182930);
                    $composer3.endReplaceGroup();
                    unit = null;
                } else {
                    $composer3.startReplaceGroup(-2095182929);
                    ComposerKt.sourceInformation($composer3, "*371@17314L3256,371@17217L3353");
                    iIntValue = selected.intValue();
                    it = analysis.getFrequencies().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((FrequencyStats) next).getNumber() == iIntValue) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } while (!z2);
                    frequencyStats = (FrequencyStats) next;
                    if (frequencyStats == null) {
                        i = iIntValue;
                        frequencyStats2 = new FrequencyStats(iIntValue, 0, 0, 0, 0, 0);
                    } else {
                        i = iIntValue;
                        frequencyStats2 = frequencyStats;
                    }
                    final FrequencyStats frequencyStats3 = frequencyStats2;
                    it2 = analysis.getDelays().iterator();
                    do {
                        if (it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (((DelayStats) next2).getNumber() == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } while (!z);
                    delayStats = (DelayStats) next2;
                    if (delayStats == null) {
                        delayStats2 = new DelayStats(i, 0, 0.0d, 0);
                    } else {
                        delayStats2 = delayStats;
                    }
                    final DelayStats delayStats3 = delayStats2;
                    i2 = i;
                    repetitionStats = (RepetitionStats) CollectionsKt.getOrNull(analysis.getRepetitions(), i2 - 1);
                    if (repetitionStats == null) {
                        repetitionStats2 = new RepetitionStats(i2, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
                    } else {
                        repetitionStats2 = repetitionStats;
                    }
                    repetitionStats3 = repetitionStats2;
                    final AssociationStats associationStats = analysis.getAssociations().get(Integer.valueOf(i2));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_5 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(12));
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVertical2 = horizontalOrVerticalM552spacedBy0680j_5;
                    ComposerKt.sourceInformationMarkerStart($composer3, 1729191359, "CC(remember):AnalysisScreen.kt#9igjgp");
                    zChanged = $composer3.changed(i2) | $composer3.changed(frequencyStats3) | $composer3.changed(delayStats3) | $composer3.changed(repetitionStats3) | $composer3.changed(associationStats);
                    objRememberedValue = $composer3.rememberedValue();
                    if (zChanged) {
                        repetitionStats4 = repetitionStats3;
                    } else {
                        repetitionStats4 = repetitionStats3;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            obj = objRememberedValue;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, horizontalOrVertical2, null, null, false, (Function1) obj, $composer3, 24582, 238);
                        Unit unit2 = Unit.INSTANCE;
                        $composer3.endReplaceGroup();
                        unit = Unit.INSTANCE;
                    }
                    obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107(associationStats, i2, frequencyStats3, delayStats3, repetitionStats4, (LazyListScope) obj2);
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, horizontalOrVertical2, null, null, false, (Function1) obj, $composer3, 24582, 238);
                    Unit unit3 = Unit.INSTANCE;
                    $composer3.endReplaceGroup();
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    $composer3.startReplaceGroup(1179456180);
                    ComposerKt.sourceInformation($composer3, "427@20584L204");
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default2);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer3.startReusableNode();
                    if ($composer3.getInserting()) {
                        function1 = constructor;
                        $composer3.createNode(function1);
                    } else {
                        function1 = constructor;
                        $composer3.useNode();
                    }
                    composerM3656constructorimpl = Updater.m3656constructorimpl($composer3);
                    Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3656constructorimpl.getInserting()) {
                        i3 = 54;
                        composer = $composer3;
                    } else {
                        i3 = 54;
                        composer = $composer3;
                        if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i8 = (i7 >> 6) & 14;
                        Composer composer2 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        int i9 = ((i3 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, 225233521, "C428@20674L104:AnalysisScreen.kt#td928");
                        long j = TwilightIndigo;
                        TextKt.m2697Text4IGK_g("Sélectionnez un numéro pour voir son profil détaillé.", (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 390, 0, 131066);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        $composer3.endReplaceGroup();
                    }
                    composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i10 = (i7 >> 6) & 14;
                    Composer composer3 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i11 = ((i3 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, 225233521, "C428@20674L104:AnalysisScreen.kt#td928");
                    long j2 = TwilightIndigo;
                    TextKt.m2697Text4IGK_g("Sélectionnez un numéro pour voir son profil détaillé.", (Modifier) null, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 390, 0, 131066);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer3.endReplaceGroup();
                } else {
                    $composer3.startReplaceGroup(1179339341);
                    $composer3.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            objRememberedValue2 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$87$lambda$86(selected, viewModel, (LazyListScope) obj2);
                }
            };
            $composer3.updateRememberedValue(objRememberedValue2);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            LazyDslKt.LazyRow(null, null, paddingValuesM669PaddingValuesa9UjIt4$default, false, horizontalOrVertical, null, null, false, (Function1) objRememberedValue2, $composer3, 24960, 235);
            if (selected == null) {
                $composer3.startReplaceGroup(-2095182930);
                $composer3.endReplaceGroup();
                unit = null;
            } else {
                $composer3.startReplaceGroup(-2095182929);
                ComposerKt.sourceInformation($composer3, "*371@17314L3256,371@17217L3353");
                iIntValue = selected.intValue();
                it = analysis.getFrequencies().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((FrequencyStats) next).getNumber() == iIntValue) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } while (!z2);
                frequencyStats = (FrequencyStats) next;
                if (frequencyStats == null) {
                    i = iIntValue;
                    frequencyStats2 = new FrequencyStats(iIntValue, 0, 0, 0, 0, 0);
                } else {
                    i = iIntValue;
                    frequencyStats2 = frequencyStats;
                }
                final FrequencyStats frequencyStats4 = frequencyStats2;
                it2 = analysis.getDelays().iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((DelayStats) next2).getNumber() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                } while (!z);
                delayStats = (DelayStats) next2;
                if (delayStats == null) {
                    delayStats2 = new DelayStats(i, 0, 0.0d, 0);
                } else {
                    delayStats2 = delayStats;
                }
                final DelayStats delayStats4 = delayStats2;
                i2 = i;
                repetitionStats = (RepetitionStats) CollectionsKt.getOrNull(analysis.getRepetitions(), i2 - 1);
                if (repetitionStats == null) {
                    repetitionStats2 = new RepetitionStats(i2, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
                } else {
                    repetitionStats2 = repetitionStats;
                }
                repetitionStats3 = repetitionStats2;
                final AssociationStats associationStats2 = analysis.getAssociations().get(Integer.valueOf(i2));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_6 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(12));
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVertical3 = horizontalOrVerticalM552spacedBy0680j_6;
                ComposerKt.sourceInformationMarkerStart($composer3, 1729191359, "CC(remember):AnalysisScreen.kt#9igjgp");
                zChanged = $composer3.changed(i2) | $composer3.changed(frequencyStats4) | $composer3.changed(delayStats4) | $composer3.changed(repetitionStats3) | $composer3.changed(associationStats2);
                objRememberedValue = $composer3.rememberedValue();
                if (zChanged) {
                    repetitionStats4 = repetitionStats3;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        obj = objRememberedValue;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    LazyDslKt.LazyColumn(modifierFillMaxSize$default3, null, null, false, horizontalOrVertical3, null, null, false, (Function1) obj, $composer3, 24582, 238);
                    Unit unit4 = Unit.INSTANCE;
                    $composer3.endReplaceGroup();
                    unit = Unit.INSTANCE;
                } else {
                    repetitionStats4 = repetitionStats3;
                }
                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107(associationStats2, i2, frequencyStats4, delayStats4, repetitionStats4, (LazyListScope) obj2);
                    }
                };
                $composer3.updateRememberedValue(obj);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default3, null, null, false, horizontalOrVertical3, null, null, false, (Function1) obj, $composer3, 24582, 238);
                Unit unit5 = Unit.INSTANCE;
                $composer3.endReplaceGroup();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                $composer3.startReplaceGroup(1179456180);
                ComposerKt.sourceInformation($composer3, "427@20584L204");
                Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default4);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i12 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function1 = constructor;
                    $composer3.createNode(function1);
                } else {
                    function1 = constructor;
                    $composer3.useNode();
                }
                composerM3656constructorimpl = Updater.m3656constructorimpl($composer3);
                Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3656constructorimpl.getInserting()) {
                    i3 = 54;
                    composer = $composer3;
                    if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i13 = (i12 >> 6) & 14;
                    Composer composer4 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    int i14 = ((i3 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer4, 225233521, "C428@20674L104:AnalysisScreen.kt#td928");
                    long j3 = TwilightIndigo;
                    TextKt.m2697Text4IGK_g("Sélectionnez un numéro pour voir son profil détaillé.", (Modifier) null, Color.m4161copywmQWz5c(j3, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j3) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j3) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j3) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j3) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 390, 0, 131066);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer3.endReplaceGroup();
                } else {
                    i3 = 54;
                    composer = $composer3;
                }
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i15 = (i12 >> 6) & 14;
                Composer composer5 = composer;
                ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                int i16 = ((i3 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer5, 225233521, "C428@20674L104:AnalysisScreen.kt#td928");
                long j4 = TwilightIndigo;
                TextKt.m2697Text4IGK_g("Sélectionnez un numéro pour voir son profil détaillé.", (Modifier) null, Color.m4161copywmQWz5c(j4, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j4) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j4) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j4) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j4) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 390, 0, 131066);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(1179339341);
                $composer3.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.ProfileSelector$lambda$112(viewModel, selected, analysis, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit ProfileSelector$lambda$111$lambda$87$lambda$86(final Integer $selected, final AnalysisViewModel $viewModel, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final List list = CollectionsKt.toList(new IntRange(1, 90));
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$ProfileSelector$lambda$111$lambda$87$lambda$86$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Integer) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Integer num) {
                return null;
            }
        };
        LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$ProfileSelector$lambda$111$lambda$87$lambda$86$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(list.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$ProfileSelector$lambda$111$lambda$87$lambda$86$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code duplicated, block: B:51:0x017f  */
            /* JADX WARN: Code duplicated, block: B:54:0x018b  */
            /* JADX WARN: Code duplicated, block: B:55:0x0191  */
            /* JADX WARN: Code duplicated, block: B:70:0x023c  */
            /* JADX WARN: Code duplicated, block: B:73:0x0291  */
            /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                int i;
                Object obj;
                int currentCompositeKeyHash;
                Function0<ComposeUiNode> constructor;
                Function0<ComposeUiNode> function0;
                Composer composerM3656constructorimpl;
                Integer num;
                long jM4200getWhite0d7_KjU;
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i2 = $dirty & 14;
                final int iIntValue = ((Number) list.get(it)).intValue();
                $composer.startReplaceGroup(-2139143036);
                ComposerKt.sourceInformation($composer, "C*356@16467L31,351@16217L556:AnalysisScreen.kt#td928");
                Modifier modifierClip = ClipKt.clip(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(36)), RoundedCornerShapeKt.getCircleShape());
                Integer num2 = $selected;
                Modifier modifierM227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(modifierClip, (num2 != null && num2.intValue() == iIntValue) ? AnalysisScreenKt.TwilightIndigo : Color.INSTANCE.m4200getWhite0d7_KjU(), null, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer, 1177928850, "CC(remember):AnalysisScreen.kt#9igjgp");
                boolean zChangedInstance = ((((i2 & 112) ^ 48) > 32 && $composer.changed(iIntValue)) || (i2 & 48) == 32) | $composer.changedInstance($viewModel);
                Object objRememberedValue = $composer.rememberedValue();
                if (!zChangedInstance) {
                    i = 48;
                    if (objRememberedValue != Composer.INSTANCE.getEmpty()) {
                        obj = objRememberedValue;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Modifier modifierM238borderxT4_qwU = BorderKt.m238borderxT4_qwU(ClickableKt.m260clickableXHw0xAI$default(modifierM227backgroundbw27NRU$default, false, null, null, (Function0) obj, 7, null), Dp.m6627constructorimpl(1), AnalysisScreenKt.TwilightIndigo, RoundedCornerShapeKt.getCircleShape());
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM238borderxT4_qwU);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    int i3 = ((((i << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                        function0 = constructor;
                        $composer.createNode(function0);
                    } else {
                        function0 = constructor;
                        $composer.useNode();
                    }
                    composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
                    Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i4 = (i3 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i5 = ((i >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -1660963730, "C360@16663L92:AnalysisScreen.kt#td928");
                    String strValueOf = String.valueOf(iIntValue);
                    num = $selected;
                    if (num == null && num.intValue() == iIntValue) {
                        jM4200getWhite0d7_KjU = Color.INSTANCE.m4200getWhite0d7_KjU();
                    } else {
                        jM4200getWhite0d7_KjU = AnalysisScreenKt.TwilightIndigo;
                    }
                    TextKt.m2697Text4IGK_g(strValueOf, (Modifier) null, jM4200getWhite0d7_KjU, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                i = 48;
                final AnalysisViewModel analysisViewModel = $viewModel;
                obj = (Function0) new Function0<Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$ProfileSelector$1$1$1$1$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        analysisViewModel.selectNumber(Integer.valueOf(iIntValue));
                    }
                };
                $composer.updateRememberedValue(obj);
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier modifierM238borderxT4_qwU2 = BorderKt.m238borderxT4_qwU(ClickableKt.m260clickableXHw0xAI$default(modifierM227backgroundbw27NRU$default, false, null, null, (Function0) obj, 7, null), Dp.m6627constructorimpl(1), AnalysisScreenKt.TwilightIndigo, RoundedCornerShapeKt.getCircleShape());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM238borderxT4_qwU2);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i6 = ((((i << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function0 = constructor;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor;
                    $composer.useNode();
                }
                composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
                Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3656constructorimpl.getInserting()) {
                }
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i7 = (i6 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i8 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1660963730, "C360@16663L92:AnalysisScreen.kt#td928");
                String strValueOf2 = String.valueOf(iIntValue);
                num = $selected;
                if (num == null) {
                    jM4200getWhite0d7_KjU = AnalysisScreenKt.TwilightIndigo;
                } else {
                    jM4200getWhite0d7_KjU = Color.INSTANCE.m4200getWhite0d7_KjU();
                }
                TextKt.m2697Text4IGK_g(strValueOf2, (Modifier) null, jM4200getWhite0d7_KjU, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107(final AssociationStats $assoc, final int $num, final FrequencyStats $freq, final DelayStats $delay, final RepetitionStats $rep, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2022127803, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$90($num, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1381682958, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$93($freq, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1197685747, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$96($delay, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-517912844, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$99($rep, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if ($assoc != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(119322088, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$106$lambda$105($assoc, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$90(int $num, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C373@17359L102:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2022127803, $changed, -1, "lnb.predict.earn.ui.screens.ProfileSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:373)");
            }
            TextKt.m2697Text4IGK_g("PROFIL COMPLET N°" + $num, (Modifier) null, TwilightIndigo, TextUnitKt.getSp(22), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$93(final FrequencyStats $freq, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C376@17536L566,376@17523L579:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1381682958, $changed, -1, "lnb.predict.earn.ui.screens.ProfileSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:376)");
            }
            AnalysisCard(ComposableLambdaKt.rememberComposableLambda(1278335179, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$93$lambda$92($freq, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0209  */
    static final Unit ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$93$lambda$92(FrequencyStats $freq, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Composer composer;
        ComposerKt.sourceInformation($composer, "C377@17562L518:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1278335179, $changed, -1, "lnb.predict.earn.ui.screens.ProfileSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:377)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                Composer composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i3 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, 1296125691, "C378@17599L95,379@17723L95,380@17847L36,381@17912L49,382@17990L64:AnalysisScreen.kt#td928");
                TextKt.m2697Text4IGK_g("FRÉQUENCES", (Modifier) null, TwilightIndigo, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200070, 0, 131026);
                Modifier modifierM674paddingVpY3zN4$default = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(4), 1, null);
                long j = TwilightIndigo;
                DividerKt.m2076HorizontalDivider9IZ8Weo(modifierM674paddingVpY3zN4$default, 0.0f, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), composer2, 390, 2);
                ProfileRow("Total", String.valueOf($freq.getTotal()), composer2, 6);
                ProfileRow("Derniers 30 jours", String.valueOf($freq.getLast30()), composer2, 6);
                ProfileRow("Annuel (" + LocalDate.now().getYear() + ")", String.valueOf($freq.getYearly()), composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = (i >> 6) & 14;
            Composer composer3 = composer;
            ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i5 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, 1296125691, "C378@17599L95,379@17723L95,380@17847L36,381@17912L49,382@17990L64:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g("FRÉQUENCES", (Modifier) null, TwilightIndigo, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200070, 0, 131026);
            Modifier modifierM674paddingVpY3zN4$default2 = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(4), 1, null);
            long j2 = TwilightIndigo;
            DividerKt.m2076HorizontalDivider9IZ8Weo(modifierM674paddingVpY3zN4$default2, 0.0f, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), composer3, 390, 2);
            ProfileRow("Total", String.valueOf($freq.getTotal()), composer3, 6);
            ProfileRow("Derniers 30 jours", String.valueOf($freq.getLast30()), composer3, 6);
            ProfileRow("Annuel (" + LocalDate.now().getYear() + ")", String.valueOf($freq.getYearly()), composer3, 0);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$96(final DelayStats $delay, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C387@18177L559,387@18164L572:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1197685747, $changed, -1, "lnb.predict.earn.ui.screens.ProfileSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:387)");
            }
            AnalysisCard(ComposableLambdaKt.rememberComposableLambda(-437263412, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$96$lambda$95($delay, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01fa  */
    static final Unit ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$96$lambda$95(DelayStats $delay, Composer $composer, int $changed) {
        int i;
        ComposerKt.sourceInformation($composer, "C388@18203L511:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-437263412, $changed, -1, "lnb.predict.earn.ui.screens.ProfileSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:388)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting()) {
                i = currentCompositeKeyHash;
            } else {
                i = currentCompositeKeyHash;
                if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i4 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 2009323393, "C389@18240L92,390@18361L95,391@18485L40,392@18554L57,393@18640L48:AnalysisScreen.kt#td928");
                TextKt.m2697Text4IGK_g("RETARDS", (Modifier) null, TwilightIndigo, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                Modifier modifierM674paddingVpY3zN4$default = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(4), 1, null);
                long j = TwilightIndigo;
                DividerKt.m2076HorizontalDivider9IZ8Weo(modifierM674paddingVpY3zN4$default, 0.0f, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), $composer, 390, 2);
                ProfileRow("Actuel", String.valueOf($delay.getCurrent()), $composer, 6);
                String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf($delay.getMean())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                ProfileRow("Moyen historique", str, $composer, 6);
                ProfileRow("Maximum historique", String.valueOf($delay.getMax()), $composer, 6);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(i));
            composerM3656constructorimpl.apply(Integer.valueOf(i), setCompositeKeyHash);
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2009323393, "C389@18240L92,390@18361L95,391@18485L40,392@18554L57,393@18640L48:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g("RETARDS", (Modifier) null, TwilightIndigo, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
            Modifier modifierM674paddingVpY3zN4$default2 = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(4), 1, null);
            long j2 = TwilightIndigo;
            DividerKt.m2076HorizontalDivider9IZ8Weo(modifierM674paddingVpY3zN4$default2, 0.0f, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), $composer, 390, 2);
            ProfileRow("Actuel", String.valueOf($delay.getCurrent()), $composer, 6);
            String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf($delay.getMean())}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            ProfileRow("Moyen historique", str2, $composer, 6);
            ProfileRow("Maximum historique", String.valueOf($delay.getMax()), $composer, 6);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$99(final RepetitionStats $rep, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C398@18811L616,398@18798L629:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-517912844, $changed, -1, "lnb.predict.earn.ui.screens.ProfileSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:398)");
            }
            AnalysisCard(ComposableLambdaKt.rememberComposableLambda(2142105293, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$99$lambda$98($rep, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x021c  */
    static final Unit ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$99$lambda$98(RepetitionStats $rep, Composer $composer, int $changed) {
        int i;
        ComposerKt.sourceInformation($composer, "C399@18837L568:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2142105293, $changed, -1, "lnb.predict.earn.ui.screens.ProfileSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:399)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting()) {
                i = currentCompositeKeyHash;
            } else {
                i = currentCompositeKeyHash;
                if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i4 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1572444217, "C400@18874L111,401@19014L95,402@19138L73,403@19240L55,404@19324L55:AnalysisScreen.kt#td928");
                TextKt.m2697Text4IGK_g("PROBABILITÉS DE RÉPÉTITION", (Modifier) null, TwilightIndigo, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                Modifier modifierM674paddingVpY3zN4$default = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(4), 1, null);
                long j = TwilightIndigo;
                DividerKt.m2076HorizontalDivider9IZ8Weo(modifierM674paddingVpY3zN4$default, 0.0f, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), $composer, 390, 2);
                String str = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf($rep.getTPlus1())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                ProfileRow("Retour au tirage suivant (T+1)", str, $composer, 6);
                String str2 = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf($rep.getTPlus2())}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                ProfileRow("Retour à T+2", str2, $composer, 6);
                String str3 = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf($rep.getTPlus3())}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                ProfileRow("Retour à T+3", str3, $composer, 6);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(i));
            composerM3656constructorimpl.apply(Integer.valueOf(i), setCompositeKeyHash);
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1572444217, "C400@18874L111,401@19014L95,402@19138L73,403@19240L55,404@19324L55:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g("PROBABILITÉS DE RÉPÉTITION", (Modifier) null, TwilightIndigo, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
            Modifier modifierM674paddingVpY3zN4$default2 = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(4), 1, null);
            long j2 = TwilightIndigo;
            DividerKt.m2076HorizontalDivider9IZ8Weo(modifierM674paddingVpY3zN4$default2, 0.0f, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), $composer, 390, 2);
            String str4 = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf($rep.getTPlus1())}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            ProfileRow("Retour au tirage suivant (T+1)", str4, $composer, 6);
            String str5 = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf($rep.getTPlus2())}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            ProfileRow("Retour à T+2", str5, $composer, 6);
            String str6 = String.format("%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf($rep.getTPlus3())}, 1));
            Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
            ProfileRow("Retour à T+3", str6, $composer, 6);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$106$lambda$105(final AssociationStats $it, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C410@19539L977,410@19526L990:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(119322088, $changed, -1, "lnb.predict.earn.ui.screens.ProfileSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:410)");
            }
            AnalysisCard(ComposableLambdaKt.rememberComposableLambda(-1748104017, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$106$lambda$105$lambda$104($it, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0238  */
    /* JADX WARN: Code duplicated, block: B:31:0x0244  */
    /* JADX WARN: Code duplicated, block: B:32:0x024a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0305  */
    /* JADX WARN: Code duplicated, block: B:46:0x0388  */
    /* JADX WARN: Code duplicated, block: B:49:0x0394  */
    /* JADX WARN: Code duplicated, block: B:50:0x039a  */
    /* JADX WARN: Code duplicated, block: B:62:0x04f2  */
    static final Unit ProfileSelector$lambda$111$lambda$109$lambda$108$lambda$107$lambda$106$lambda$105$lambda$104(AssociationStats $it, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        int i;
        String str;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> function1;
        Composer composerM3656constructorimpl;
        Composer composer;
        int i2;
        int i3;
        Iterable<Companion> iterableTake;
        int i4;
        Composer composer2;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Function0<ComposeUiNode> function2;
        Composer composerM3656constructorimpl2;
        ComposerKt.sourceInformation($composer, "C411@19569L921:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1748104017, $changed, -1, "lnb.predict.earn.ui.screens.ProfileSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:411)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
            String str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor3;
                $composer.createNode(function0);
            } else {
                function0 = constructor3;
                $composer.useNode();
            }
            Composer composerM3656constructorimpl3 = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl3.getInserting()) {
                i = 0;
            } else {
                i = 0;
                if (!Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i6 = (i5 >> 6) & 14;
                str = "C88@4444L9:Column.kt#2w3rfo";
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i7 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -913671272, "C412@19610L105,413@19748L95,414@19876L584:AnalysisScreen.kt#td928");
                TextKt.m2697Text4IGK_g("MEILLEURS COMPAGNONS", (Modifier) null, TwilightIndigo, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                Modifier modifierM674paddingVpY3zN4$default = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(4), 1, null);
                long j = TwilightIndigo;
                DividerKt.m2076HorizontalDivider9IZ8Weo(modifierM674paddingVpY3zN4$default, 0.0f, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), $composer, 390, 2);
                Modifier modifierM676paddingqDBjuR0$default = PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(8), 0.0f, 0.0f, 13, null);
                Arrangement.Horizontal horizontalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM552spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM676paddingqDBjuR0$default);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i8 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function1 = constructor;
                    $composer.createNode(function1);
                } else {
                    function1 = constructor;
                    $composer.useNode();
                }
                composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
                Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                }
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = (i8 >> 6) & 14;
                composer = $composer;
                i2 = 0;
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                i3 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer, -1664076880, "C:AnalysisScreen.kt#td928");
                composer.startReplaceGroup(-1716247110);
                ComposerKt.sourceInformation(composer, "*416@20092L296");
                iterableTake = CollectionsKt.take($it.getTopCompanions(), 5);
                i4 = 0;
                for (Companion companion : iterableTake) {
                    Iterable iterable = iterableTake;
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    composer2 = composer;
                    int i10 = i4;
                    Composer composer3 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier2 = Modifier.INSTANCE;
                    int i11 = i2;
                    int i12 = i3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier2);
                    constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i13 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        function2 = constructor2;
                        composer2.createNode(function2);
                    } else {
                        function2 = constructor2;
                        composer2.useNode();
                    }
                    String str3 = str2;
                    composerM3656constructorimpl2 = Updater.m3656constructorimpl(composer2);
                    Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3656constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3);
                    }
                    Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i14 = (i13 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, str);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i15 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -854663100, "C417@20197L24,418@20266L80:AnalysisScreen.kt#td928");
                    NumberBall(companion.getNumber(), 28, composer2, 48, 0);
                    TextKt.m2697Text4IGK_g(((int) companion.getPercentage()) + "%", (Modifier) null, 0L, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer = composer3;
                    iterableTake = iterable;
                    i4 = i10;
                    i2 = i11;
                    i3 = i12;
                    str2 = str3;
                    str = str;
                }
                Composer composer4 = composer;
                composer4.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash);
            Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i16 = (i5 >> 6) & 14;
            str = "C88@4444L9:Column.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int i17 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -913671272, "C412@19610L105,413@19748L95,414@19876L584:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g("MEILLEURS COMPAGNONS", (Modifier) null, TwilightIndigo, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
            Modifier modifierM674paddingVpY3zN4$default2 = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(4), 1, null);
            long j2 = TwilightIndigo;
            DividerKt.m2076HorizontalDivider9IZ8Weo(modifierM674paddingVpY3zN4$default2, 0.0f, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), $composer, 390, 2);
            Modifier modifierM676paddingqDBjuR0$default2 = PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(8), 0.0f, 0.0f, 13, null);
            Arrangement.Horizontal horizontalM552spacedBy0680j_5 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM552spacedBy0680j_5, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifierM676paddingqDBjuR0$default2);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i18 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function1 = constructor;
                $composer.createNode(function1);
            } else {
                function1 = constructor;
                $composer.useNode();
            }
            composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3656constructorimpl.getInserting()) {
            }
            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i19 = (i18 >> 6) & 14;
            composer = $composer;
            i2 = 0;
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer, -1664076880, "C:AnalysisScreen.kt#td928");
            composer.startReplaceGroup(-1716247110);
            ComposerKt.sourceInformation(composer, "*416@20092L296");
            iterableTake = CollectionsKt.take($it.getTopCompanions(), 5);
            i4 = 0;
            while (r42.hasNext()) {
                Iterable iterable2 = iterableTake;
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                composer2 = composer;
                int i110 = i4;
                Composer composer5 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier3 = Modifier.INSTANCE;
                int i111 = i2;
                int i112 = i3;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifier3);
                constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i113 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    function2 = constructor2;
                    composer2.createNode(function2);
                } else {
                    function2 = constructor2;
                    composer2.useNode();
                }
                String str4 = str2;
                composerM3656constructorimpl2 = Updater.m3656constructorimpl(composer2);
                Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3656constructorimpl2.getInserting()) {
                }
                composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash5);
                Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                int i114 = (i113 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, str);
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                int i115 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -854663100, "C417@20197L24,418@20266L80:AnalysisScreen.kt#td928");
                NumberBall(companion.getNumber(), 28, composer2, 48, 0);
                TextKt.m2697Text4IGK_g(((int) companion.getPercentage()) + "%", (Modifier) null, 0L, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer = composer5;
                iterableTake = iterable2;
                i4 = i110;
                i2 = i111;
                i3 = i112;
                str2 = str4;
                str = str;
            }
            Composer composer6 = composer;
            composer6.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void ProfileRow(final String label, String value, Composer $composer, final int $changed) {
        Composer $composer2;
        final String str;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer $composer3 = $composer.startRestartGroup(1626111667);
        ComposerKt.sourceInformation($composer3, "C(ProfileRow)435@20861L284:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(label) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(value) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            str = value;
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1626111667, $dirty, -1, "lnb.predict.earn.ui.screens.ProfileRow (AnalysisScreen.kt:434)");
            }
            Modifier modifierM674paddingVpY3zN4$default = PaddingKt.m674paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6627constructorimpl(2), 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM674paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer3);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 841341211, "C436@20986L66,437@21061L78:AnalysisScreen.kt#td928");
            int $dirty2 = $dirty;
            long sp = TextUnitKt.getSp(13);
            long j = InkBlack;
            $composer2 = $composer3;
            TextKt.m2697Text4IGK_g(label, (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.7f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, ($dirty2 & 14) | 3456, 0, 131058);
            str = value;
            TextKt.m2697Text4IGK_g(str, (Modifier) null, InkBlack, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, (($dirty2 >> 3) & 14) | 200064, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.ProfileRow$lambda$114(label, str, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PredictionView(final AnalysisViewModel viewModel, final PredictionResult prediction, Composer $composer, final int $changed) {
        Object objMutableStateOf$default;
        int i;
        Object objMutableStateOf$default2;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function1;
        Function0<ComposeUiNode> function2;
        Object obj;
        Object obj2;
        Object obj3;
        Unit unit;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer2 = $composer.startRestartGroup(275709638);
        ComposerKt.sourceInformation($composer2, "C(PredictionView)P(1)443@21267L42,444@21330L34,447@21472L2362:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(prediction) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(275709638, $dirty, -1, "lnb.predict.earn.ui.screens.PredictionView (AnalysisScreen.kt:442)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1331006416, "CC(remember):AnalysisScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Fortune 11H", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue;
            }
            final MutableState selectedDraw$delegate = (MutableState) objMutableStateOf$default;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1331004408, "CC(remember):AnalysisScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                i = 0;
                objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
            } else {
                i = 0;
                objMutableStateOf$default2 = objRememberedValue2;
            }
            final MutableState expanded$delegate = (MutableState) objMutableStateOf$default2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            String[] strArr = new String[5];
            strArr[i] = "Digital 00H";
            strArr[1] = "Fortune 11H";
            strArr[2] = "Fortune 14H";
            strArr[3] = "Fortune 18H";
            strArr[4] = "Digital 21H";
            final List drawNames = CollectionsKt.listOf((Object[]) strArr);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, i);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int i4 = ((6 >> 6) & 112) | 6;
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 249675271, "C448@21524L1429:AnalysisScreen.kt#td928");
            Modifier modifierM676paddingqDBjuR0$default = PaddingKt.m676paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6627constructorimpl(12), 7, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierM676paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function1 = constructor2;
                $composer2.createNode(function1);
            } else {
                function1 = constructor2;
                $composer2.useNode();
            }
            Composer composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer2);
            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i6 = (i5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i7 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -829811146, "C449@21650L867,466@22530L28,469@22700L45,468@22605L53,467@22571L372:AnalysisScreen.kt#td928");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer2, modifierWeight$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i8 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function2 = constructor3;
                $composer2.createNode(function2);
            } else {
                function2 = constructor3;
                $composer2.useNode();
            }
            Composer composerM3656constructorimpl3 = Updater.m3656constructorimpl($composer2);
            Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = (i8 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i10 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 1107319454, "C451@21748L19,454@21896L309,450@21704L501,460@22275L20,460@22297L206,460@22222L281:AnalysisScreen.kt#td928");
            ComposerKt.sourceInformationMarkerStart($composer2, -1349752711, "CC(remember):AnalysisScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnalysisScreenKt.PredictionView$lambda$142$lambda$135$lambda$132$lambda$122$lambda$121(expanded$delegate);
                    }
                };
                $composer2.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            CardKt.OutlinedCard((Function0) objRememberedValue3, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(8)), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1348123107, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return AnalysisScreenKt.PredictionView$lambda$142$lambda$135$lambda$132$lambda$124(selectedDraw$delegate, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 100663350, 244);
            boolean zPredictionView$lambda$119 = PredictionView$lambda$119(expanded$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -1349735846, "CC(remember):AnalysisScreen.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnalysisScreenKt.PredictionView$lambda$142$lambda$135$lambda$132$lambda$126$lambda$125(expanded$delegate);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AndroidMenu_androidKt.m1769DropdownMenuIlH_yew(zPredictionView$lambda$119, (Function0) obj, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1451231307, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return AnalysisScreenKt.PredictionView$lambda$142$lambda$135$lambda$132$lambda$131(drawNames, selectedDraw$delegate, expanded$delegate, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 48, 48, 2044);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SpacerKt.Spacer(SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(8)), $composer2, 6);
            ButtonColors buttonColorsM1813buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1813buttonColorsro_MJ88(TwilightIndigo, 0L, 0L, 0L, $composer2, (ButtonDefaults.$stable << 12) | 6, 14);
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(8));
            Modifier modifierM703height3ABfNKs = SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(48));
            ComposerKt.sourceInformationMarkerStart($composer2, -1550759435, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(viewModel);
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnalysisScreenKt.PredictionView$lambda$142$lambda$135$lambda$134$lambda$133(viewModel, selectedDraw$delegate);
                    }
                };
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = objRememberedValue5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ButtonKt.Button((Function0) obj2, modifierM703height3ABfNKs, false, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1813buttonColorsro_MJ88, null, null, null, null, ComposableSingletons$AnalysisScreenKt.INSTANCE.getLambda$1621800080$app_debug(), $composer2, 805306416, 484);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (prediction == null) {
                $composer2.startReplaceGroup(251066270);
                $composer2.endReplaceGroup();
                unit = null;
            } else {
                $composer2.startReplaceGroup(251066271);
                ComposerKt.sourceInformation($composer2, "*478@23095L613,478@23001L707");
                Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(16));
                Modifier modifierWeight$default2 = ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM552spacedBy0680j_4;
                ComposerKt.sourceInformationMarkerStart($composer2, -2017723795, "CC(remember):AnalysisScreen.kt#9igjgp");
                boolean zChanged = $composer2.changed(prediction);
                Object objRememberedValue6 = $composer2.rememberedValue();
                if (zChanged || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    obj3 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda43
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return AnalysisScreenKt.PredictionView$lambda$142$lambda$141$lambda$140$lambda$139(prediction, (LazyListScope) obj4);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                } else {
                    obj3 = objRememberedValue6;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                LazyDslKt.LazyColumn(modifierWeight$default2, null, null, false, horizontalOrVertical, null, null, false, (Function1) obj3, $composer2, 24576, 238);
                Unit unit2 = Unit.INSTANCE;
                $composer2.endReplaceGroup();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                $composer2.startReplaceGroup(-961709146);
                ComposerKt.sourceInformation($composer2, "488@23722L106");
                ProgressIndicatorKt.m2371CircularProgressIndicatorLxG7B9w(columnScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), TwilightIndigo, 0.0f, 0L, 0, $composer2, 48, 28);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-961732675);
                $composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return AnalysisScreenKt.PredictionView$lambda$143(viewModel, prediction, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final String PredictionView$lambda$116(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean PredictionView$lambda$119(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PredictionView$lambda$120(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit PredictionView$lambda$142$lambda$135$lambda$132$lambda$122$lambda$121(MutableState $expanded$delegate) {
        PredictionView$lambda$120($expanded$delegate, true);
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$142$lambda$135$lambda$132$lambda$124(MutableState $selectedDraw$delegate, ColumnScope OutlinedCard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedCard, "$this$OutlinedCard");
        ComposerKt.sourceInformation($composer, "C455@21918L269:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1348123107, $changed, -1, "lnb.predict.earn.ui.screens.PredictionView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:455)");
            }
            Modifier modifierM672padding3ABfNKs = PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM672padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i3 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 393094418, "C456@22021L80,457@22126L39:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g(PredictionView$lambda$116($selectedDraw$delegate), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131036);
            IconKt.m2154Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$142$lambda$135$lambda$132$lambda$126$lambda$125(MutableState $expanded$delegate) {
        PredictionView$lambda$120($expanded$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$142$lambda$135$lambda$132$lambda$131(List $drawNames, final MutableState $selectedDraw$delegate, final MutableState $expanded$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C*462@22395L14,462@22421L41,462@22371L92:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1451231307, $changed, -1, "lnb.predict.earn.ui.screens.PredictionView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:461)");
            }
            Iterator it = $drawNames.iterator();
            while (it.hasNext()) {
                final String str = (String) it.next();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1446973899, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return AnalysisScreenKt.PredictionView$lambda$142$lambda$135$lambda$132$lambda$131$lambda$130$lambda$127(str, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, 1183882724, "CC(remember):AnalysisScreen.kt#9igjgp");
                boolean zChanged = composer.changed(str);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function0() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AnalysisScreenKt.PredictionView$lambda$142$lambda$135$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128(str, $selectedDraw$delegate, $expanded$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) obj, null, null, null, false, null, null, null, composer, 6, 508);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$142$lambda$135$lambda$132$lambda$131$lambda$130$lambda$127(String $name, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C462@22397L10:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1446973899, $changed, -1, "lnb.predict.earn.ui.screens.PredictionView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:462)");
            }
            TextKt.m2697Text4IGK_g($name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$142$lambda$135$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128(String $name, MutableState $selectedDraw$delegate, MutableState $expanded$delegate) {
        $selectedDraw$delegate.setValue($name);
        PredictionView$lambda$120($expanded$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$142$lambda$135$lambda$134$lambda$133(AnalysisViewModel $viewModel, MutableState $selectedDraw$delegate) {
        $viewModel.generateAndSavePrediction(PredictionView$lambda$116($selectedDraw$delegate));
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$142$lambda$141$lambda$140$lambda$139(final PredictionResult $pred, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AnalysisScreenKt.INSTANCE.getLambda$853719324$app_debug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-234022765, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnalysisScreenKt.PredictionView$lambda$142$lambda$141$lambda$140$lambda$139$lambda$136($pred, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1591613012, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnalysisScreenKt.PredictionView$lambda$142$lambda$141$lambda$140$lambda$139$lambda$137($pred, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-877718507, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnalysisScreenKt.PredictionView$lambda$142$lambda$141$lambda$140$lambda$139$lambda$138($pred, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$142$lambda$141$lambda$140$lambda$139$lambda$136(PredictionResult $pred, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C484@23470L58:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-234022765, $changed, -1, "lnb.predict.earn.ui.screens.PredictionView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:484)");
            }
            PredictionGroup("TOP 5 (Probabilité maximale)", $pred.getTop5(), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$142$lambda$141$lambda$140$lambda$139$lambda$137(PredictionResult $pred, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C485@23554L56:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1591613012, $changed, -1, "lnb.predict.earn.ui.screens.PredictionView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:485)");
            }
            PredictionGroup("TOP 10 (Sécurité moyenne)", $pred.getTop10(), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit PredictionView$lambda$142$lambda$141$lambda$140$lambda$139$lambda$138(PredictionResult $pred, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C486@23636L56:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-877718507, $changed, -1, "lnb.predict.earn.ui.screens.PredictionView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:486)");
            }
            PredictionGroup("TOP 20 (Couverture large)", $pred.getTop20(), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void PerformanceView(final List<PredictionEntity> predictions, final WeightEntity weights, Composer $composer, final int $changed) {
        Integer num;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(predictions, "predictions");
        Composer $composer3 = $composer.startRestartGroup(-1887529384);
        ComposerKt.sourceInformation($composer3, "C(PerformanceView)500@24286L2184,500@24224L2246:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(predictions) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(weights) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1887529384, $dirty2, -1, "lnb.predict.earn.ui.screens.PerformanceView (AnalysisScreen.kt:493)");
            }
            Collection arrayList = new ArrayList();
            for (Object obj : predictions) {
                if (((PredictionEntity) obj).getEvaluated()) {
                    arrayList.add(obj);
                }
            }
            final List evaluated = (List) arrayList;
            final int total = evaluated.size();
            Iterator it = evaluated.iterator();
            int matchCount = 0;
            while (it.hasNext()) {
                matchCount += ((PredictionEntity) it.next()).getMatchCount();
            }
            int totalMatches = matchCount;
            double avgMatches = total > 0 ? ((double) totalMatches) / ((double) total) : 0.0d;
            Iterator it2 = evaluated.iterator();
            if (it2.hasNext()) {
                Integer numValueOf = Integer.valueOf(((PredictionEntity) it2.next()).getMatchCount());
                while (it2.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((PredictionEntity) it2.next()).getMatchCount());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            Integer num2 = num;
            final int bestMatch = num2 != null ? num2.intValue() : 0;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer3, -1439522592, "CC(remember):AnalysisScreen.kt#9igjgp");
            boolean zChanged = $composer3.changed(total) | $composer3.changed(avgMatches) | $composer3.changed(bestMatch) | (($dirty2 & 112) == 32) | $composer3.changedInstance(evaluated);
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final double avgMatches2 = avgMatches;
                objRememberedValue = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalysisScreenKt.PerformanceView$lambda$155$lambda$154(weights, evaluated, total, avgMatches2, bestMatch, (LazyListScope) obj2);
                    }
                };
                $composer3.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) objRememberedValue, $composer2, 24576, 239);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AnalysisScreenKt.PerformanceView$lambda$156(predictions, weights, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit PerformanceView$lambda$155$lambda$154(final WeightEntity $weights, List $evaluated, final int $total, final double $avgMatches, final int $bestMatch, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AnalysisScreenKt.INSTANCE.getLambda$1189628652$app_debug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1802112419, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnalysisScreenKt.PerformanceView$lambda$155$lambda$154$lambda$148($total, $avgMatches, $bestMatch, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if ($weights != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2142893514, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda71
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AnalysisScreenKt.PerformanceView$lambda$155$lambda$154$lambda$152$lambda$151($weights, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AnalysisScreenKt.INSTANCE.getLambda$1974526500$app_debug(), 3, null);
        final List listTake = CollectionsKt.take($evaluated, 10);
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$PerformanceView$lambda$155$lambda$154$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((PredictionEntity) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(PredictionEntity predictionEntity) {
                return null;
            }
        };
        LazyColumn.items(listTake.size(), null, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$PerformanceView$lambda$155$lambda$154$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(listTake.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$PerformanceView$lambda$155$lambda$154$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final PredictionEntity predictionEntity = (PredictionEntity) listTake.get(it);
                $composer.startReplaceGroup(978993487);
                ComposerKt.sourceInformation($composer, "C*534@25663L791,534@25650L804:AnalysisScreen.kt#td928");
                AnalysisScreenKt.AnalysisCard(ComposableLambdaKt.rememberComposableLambda(-1425932073, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$PerformanceView$1$1$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code duplicated, block: B:28:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:31:0x01c9  */
                    /* JADX WARN: Code duplicated, block: B:32:0x01cf  */
                    /* JADX WARN: Code duplicated, block: B:43:0x035b  */
                    /* JADX WARN: Code duplicated, block: B:44:0x0365  */
                    /* JADX WARN: Code duplicated, block: B:47:0x03d3  */
                    /* JADX WARN: Code duplicated, block: B:50:0x03df  */
                    /* JADX WARN: Code duplicated, block: B:51:0x03e5  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0416  */
                    /* JADX WARN: Code duplicated, block: B:57:0x0429  */
                    /* JADX WARN: Code duplicated, block: B:58:0x042c  */
                    /* JADX WARN: Code duplicated, block: B:62:0x04ec  */
                    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
                    public final void invoke(Composer $composer2, int $changed2) {
                        Function0<ComposeUiNode> function0;
                        PredictionEntity predictionEntity2;
                        int currentCompositeKeyHash;
                        Function0<ComposeUiNode> constructor;
                        Function0<ComposeUiNode> function2;
                        Composer composerM3656constructorimpl;
                        long jM4193getGray0d7_KjU;
                        int currentCompositeKeyHash2;
                        Function0<ComposeUiNode> constructor2;
                        Function0<ComposeUiNode> function3;
                        Composer composerM3656constructorimpl2;
                        Composer composer;
                        ComposerKt.sourceInformation($composer2, "C535@25681L759:AnalysisScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1425932073, $changed2, -1, "lnb.predict.earn.ui.screens.PerformanceView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:535)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        PredictionEntity predictionEntity3 = predictionEntity;
                        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function0 = constructor3;
                            $composer2.createNode(function0);
                        } else {
                            function0 = constructor3;
                            $composer2.useNode();
                        }
                        Composer composerM3656constructorimpl3 = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl3.getInserting()) {
                            predictionEntity2 = predictionEntity3;
                            if (!Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            }
                            Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            int i3 = (i2 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            int i4 = ((384 >> 6) & 112) | 6;
                            RowScope rowScope = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart($composer2, 1735110197, "C536@25755L287,540@26063L359:AnalysisScreen.kt#td928");
                            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierWeight$default);
                            constructor = ComposeUiNode.INSTANCE.getConstructor();
                            int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer2.startReusableNode();
                            if ($composer2.getInserting()) {
                                function2 = constructor;
                                $composer2.createNode(function2);
                            } else {
                                function2 = constructor;
                                $composer2.useNode();
                            }
                            composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                            }
                            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i6 = (i5 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i7 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer2, -137087117, "C537@25809L87,538@25921L99:AnalysisScreen.kt#td928");
                            TextKt.m2697Text4IGK_g(predictionEntity2.getDate() + " - " + predictionEntity2.getDrawName(), (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 199680, 0, 131030);
                            TextKt.m2697Text4IGK_g("Prédit: " + CollectionsKt.joinToString$default(CollectionsKt.take(StringsKt.split$default((CharSequence) predictionEntity2.getPredictedNumbers(), new String[]{","}, false, 0, 6, (Object) null), 5), ", ", null, null, 0, null, null, 62, null) + "...", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 3072, 0, 131062);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            $composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            Modifier modifierClip = ClipKt.clip(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(36)), RoundedCornerShapeKt.getCircleShape());
                            if (predictionEntity2.getMatchCount() > 0) {
                                jM4193getGray0d7_KjU = ColorKt.Color(4283215696L);
                            } else {
                                jM4193getGray0d7_KjU = Color.INSTANCE.m4193getGray0d7_KjU();
                            }
                            Modifier modifierM227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(modifierClip, jM4193getGray0d7_KjU, null, 2, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer2, modifierM227backgroundbw27NRU$default);
                            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            int i8 = ((((48 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer2.startReusableNode();
                            if ($composer2.getInserting()) {
                                function3 = constructor2;
                                $composer2.createNode(function3);
                            } else {
                                function3 = constructor2;
                                $composer2.useNode();
                            }
                            composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer2);
                            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3656constructorimpl2.getInserting()) {
                                composer = $composer2;
                                if (!Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                }
                                Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                int i9 = (i8 >> 6) & 14;
                                Composer composer2 = composer;
                                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                int i10 = ((48 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer2, -1804308760, "C544@26322L78:AnalysisScreen.kt#td928");
                                TextKt.m2697Text4IGK_g(String.valueOf(predictionEntity2.getMatchCount()), (Modifier) null, Color.INSTANCE.m4200getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196992, 0, 131034);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                $composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                            composer = $composer2;
                            composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3);
                            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i11 = (i8 >> 6) & 14;
                            Composer composer3 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            int i12 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer3, -1804308760, "C544@26322L78:AnalysisScreen.kt#td928");
                            TextKt.m2697Text4IGK_g(String.valueOf(predictionEntity2.getMatchCount()), (Modifier) null, Color.INSTANCE.m4200getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 196992, 0, 131034);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            $composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        predictionEntity2 = predictionEntity3;
                        composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash);
                        Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i13 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i14 = ((384 >> 6) & 112) | 6;
                        RowScope rowScope2 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer2, 1735110197, "C536@25755L287,540@26063L359:AnalysisScreen.kt#td928");
                        Modifier modifierWeight$default2 = RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer2, modifierWeight$default2);
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i15 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function2 = constructor;
                            $composer2.createNode(function2);
                        } else {
                            function2 = constructor;
                            $composer2.useNode();
                        }
                        composerM3656constructorimpl = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl.getInserting()) {
                        }
                        composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                        Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        int i16 = (i15 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        int i17 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -137087117, "C537@25809L87,538@25921L99:AnalysisScreen.kt#td928");
                        TextKt.m2697Text4IGK_g(predictionEntity2.getDate() + " - " + predictionEntity2.getDrawName(), (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 199680, 0, 131030);
                        TextKt.m2697Text4IGK_g("Prédit: " + CollectionsKt.joinToString$default(CollectionsKt.take(StringsKt.split$default((CharSequence) predictionEntity2.getPredictedNumbers(), new String[]{","}, false, 0, 6, (Object) null), 5), ", ", null, null, 0, null, null, 62, null) + "...", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 3072, 0, 131062);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        Modifier modifierClip2 = ClipKt.clip(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(36)), RoundedCornerShapeKt.getCircleShape());
                        if (predictionEntity2.getMatchCount() > 0) {
                            jM4193getGray0d7_KjU = ColorKt.Color(4283215696L);
                        } else {
                            jM4193getGray0d7_KjU = Color.INSTANCE.m4193getGray0d7_KjU();
                        }
                        Modifier modifierM227backgroundbw27NRU$default2 = BackgroundKt.m227backgroundbw27NRU$default(modifierClip2, jM4193getGray0d7_KjU, null, 2, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer2, modifierM227backgroundbw27NRU$default2);
                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        int i18 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer2.startReusableNode();
                        if ($composer2.getInserting()) {
                            function3 = constructor2;
                            $composer2.createNode(function3);
                        } else {
                            function3 = constructor2;
                            $composer2.useNode();
                        }
                        composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer2);
                        Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl2.getInserting()) {
                            composer = $composer2;
                            if (!Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            }
                            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            int i19 = (i18 >> 6) & 14;
                            Composer composer4 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            int i110 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -1804308760, "C544@26322L78:AnalysisScreen.kt#td928");
                            TextKt.m2697Text4IGK_g(String.valueOf(predictionEntity2.getMatchCount()), (Modifier) null, Color.INSTANCE.m4200getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 196992, 0, 131034);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            $composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        composer = $composer2;
                        composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash5);
                        Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        int i111 = (i18 >> 6) & 14;
                        Composer composer5 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        int i112 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer5, -1804308760, "C544@26322L78:AnalysisScreen.kt#td928");
                        TextKt.m2697Text4IGK_g(String.valueOf(predictionEntity2.getMatchCount()), (Modifier) null, Color.INSTANCE.m4200getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 196992, 0, 131034);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 6);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit PerformanceView$lambda$155$lambda$154$lambda$148(int $total, double $avgMatches, int $bestMatch, LazyItemScope item, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C506@24464L327:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1802112419, $changed, -1, "lnb.predict.earn.ui.screens.PerformanceView.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:506)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal horizontalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM552spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i3 = ((54 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 737071826, "C507@24575L48,508@24640L67,509@24724L53:AnalysisScreen.kt#td928");
            StatCard("Total", String.valueOf($total), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6, 0);
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf($avgMatches)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            StatCard("Moyenne", str, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6, 0);
            StatCard("Record", String.valueOf($bestMatch), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit PerformanceView$lambda$155$lambda$154$lambda$152$lambda$151(final WeightEntity $w, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C515@24879L567,515@24866L580:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2142893514, $changed, -1, "lnb.predict.earn.ui.screens.PerformanceView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:515)");
            }
            AnalysisCard(ComposableLambdaKt.rememberComposableLambda(-2033762563, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.PerformanceView$lambda$155$lambda$154$lambda$152$lambda$151$lambda$150($w, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01c6  */
    static final Unit PerformanceView$lambda$155$lambda$154$lambda$152$lambda$151$lambda$150(WeightEntity $w, Composer $composer, int $changed) {
        int i;
        ComposerKt.sourceInformation($composer, "C516@24901L527:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2033762563, $changed, -1, "lnb.predict.earn.ui.screens.PerformanceView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:516)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting()) {
                i = currentCompositeKeyHash;
            } else {
                i = currentCompositeKeyHash;
                if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i4 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 278871492, "C517@24934L101,518@25060L29,519@25114L36,520@25175L34,521@25234L43,522@25302L36,523@25363L43:AnalysisScreen.kt#td928");
                TextKt.m2697Text4IGK_g("PONDÉRATION ACTUELLE (APPRENTISSAGE IA)", (Modifier) null, TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196998, 0, 131034);
                SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(8)), $composer, 6);
                WeightBar("Fréquence", $w.getFreqWeight(), $composer, 6);
                WeightBar("Retard", $w.getDelayWeight(), $composer, 6);
                WeightBar("Transition", $w.getTransitionWeight(), $composer, 6);
                WeightBar("Horaire", $w.getHourlyWeight(), $composer, 6);
                WeightBar("Répétition", $w.getRepetitionWeight(), $composer, 6);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(i));
            composerM3656constructorimpl.apply(Integer.valueOf(i), setCompositeKeyHash);
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 278871492, "C517@24934L101,518@25060L29,519@25114L36,520@25175L34,521@25234L43,522@25302L36,523@25363L43:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g("PONDÉRATION ACTUELLE (APPRENTISSAGE IA)", (Modifier) null, TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196998, 0, 131034);
            SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(8)), $composer, 6);
            WeightBar("Fréquence", $w.getFreqWeight(), $composer, 6);
            WeightBar("Retard", $w.getDelayWeight(), $composer, 6);
            WeightBar("Transition", $w.getTransitionWeight(), $composer, 6);
            WeightBar("Horaire", $w.getHourlyWeight(), $composer, 6);
            WeightBar("Répétition", $w.getRepetitionWeight(), $composer, 6);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void StatCard(final String label, final String value, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Modifier.Companion modifier3;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer $composer2 = $composer.startRestartGroup(2031339197);
        ComposerKt.sourceInformation($composer2, "C(StatCard)P(!1,2)554@26693L304,554@26566L431:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(label) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(value) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (($dirty & 147) == 146 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031339197, $dirty, -1, "lnb.predict.earn.ui.screens.StatCard (AnalysisScreen.kt:553)");
            }
            SurfaceKt.m2547SurfaceT9BRK9s(modifier3, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(12)), Color.INSTANCE.m4200getWhite0d7_KjU(), 0L, 0.0f, 0.0f, BorderStrokeKt.m254BorderStrokecXLIe8U(Dp.m6627constructorimpl(1), GlassBorder), ComposableLambdaKt.rememberComposableLambda(-1615261800, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda59
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.StatCard$lambda$158(label, value, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 6) & 14) | 14156160, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.StatCard$lambda$159(label, value, modifier4, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit StatCard$lambda$158(String $label, String $value, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C555@26703L288:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1615261800, $changed, -1, "lnb.predict.earn.ui.screens.StatCard.<anonymous> (AnalysisScreen.kt:555)");
            }
            Modifier modifierM672padding3ABfNKs = PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(12));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM672padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 125236248, "C556@26812L72,557@26897L84:AnalysisScreen.kt#td928");
            long sp = TextUnitKt.getSp(11);
            long j = TwilightIndigo;
            TextKt.m2697Text4IGK_g($label, (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.6f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
            TextKt.m2697Text4IGK_g($value, (Modifier) null, TwilightIndigo, TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x03ce  */
    public static final void WeightBar(String label, float weight, Composer $composer, final int $changed) {
        Function0<ComposeUiNode> function0;
        CompositionLocalMap compositionLocalMap;
        Composer composer;
        Composer $composer2;
        final float f;
        final String label2 = label;
        Intrinsics.checkNotNullParameter(label2, "label");
        Composer $composer3 = $composer.startRestartGroup(1760001196);
        ComposerKt.sourceInformation($composer3, "C(WeightBar)564@27063L573:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(label2) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(weight) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            f = weight;
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1760001196, $dirty, -1, "lnb.predict.earn.ui.screens.WeightBar (AnalysisScreen.kt:563)");
            }
            Modifier modifierM674paddingVpY3zN4$default = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(4), 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM674paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
                $composer3.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer3);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 424878357, "C565@27126L239,569@27374L256:AnalysisScreen.kt#td928");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor2);
            } else {
                $composer3.useNode();
            }
            Composer composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer3);
            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl2.getInserting()) {
                compositionLocalMap = currentCompositionLocalMap2;
                composer = $composer3;
            } else {
                compositionLocalMap = currentCompositionLocalMap2;
                composer = $composer3;
                if (!Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                Composer composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -2144968428, "C566@27230L29,567@27272L83:AnalysisScreen.kt#td928");
                Composer composer3 = composer;
                $composer2 = $composer3;
                label2 = label;
                TextKt.m2697Text4IGK_g(label2, (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ($dirty & 14) | 3072, 0, 131062);
                f = weight;
                String str = String.format("%.1f%%", Arrays.copyOf(new Object[]{Float.valueOf(100.0f * f)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                TextKt.m2697Text4IGK_g(str, (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
                Modifier modifierClip = ClipKt.clip(SizeKt.m703height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6627constructorimpl(6)), RoundedCornerShapeKt.getCircleShape());
                long j = TwilightIndigo;
                long j2 = TwilightIndigo;
                ProgressIndicatorKt.m2377LinearProgressIndicator_5eSRE(fCoerceIn, modifierClip, j, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), 0, $composer3, 3456, 16);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i4 >> 6) & 14;
            Composer composer4 = composer;
            ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i8 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer4, -2144968428, "C566@27230L29,567@27272L83:AnalysisScreen.kt#td928");
            Composer composer5 = composer;
            $composer2 = $composer3;
            label2 = label;
            TextKt.m2697Text4IGK_g(label2, (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, ($dirty & 14) | 3072, 0, 131062);
            f = weight;
            String str2 = String.format("%.1f%%", Arrays.copyOf(new Object[]{Float.valueOf(100.0f * f)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            TextKt.m2697Text4IGK_g(str2, (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 199680, 0, 131030);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer5.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            float fCoerceIn2 = RangesKt.coerceIn(f, 0.0f, 1.0f);
            Modifier modifierClip2 = ClipKt.clip(SizeKt.m703height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6627constructorimpl(6)), RoundedCornerShapeKt.getCircleShape());
            long j3 = TwilightIndigo;
            long j4 = TwilightIndigo;
            ProgressIndicatorKt.m2377LinearProgressIndicator_5eSRE(fCoerceIn2, modifierClip2, j3, Color.m4161copywmQWz5c(j4, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j4) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j4) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j4) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j4) : 0.0f), 0, $composer3, 3456, 16);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.WeightBar$lambda$162(label2, f, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PredictionGroup(String title, List<NumberProfile> list, Composer $composer, final int $changed) {
        Composer $composer2;
        final List<NumberProfile> list2;
        final String title2 = title;
        Intrinsics.checkNotNullParameter(title2, "title");
        Intrinsics.checkNotNullParameter(list, "list");
        Composer $composer3 = $composer.startRestartGroup(-733313693);
        ComposerKt.sourceInformation($composer3, "C(PredictionGroup)P(1)581@27757L910:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title2) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(list) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
            list2 = list;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-733313693, $dirty, -1, "lnb.predict.earn.ui.screens.PredictionGroup (AnalysisScreen.kt:580)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer3);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 580181555, "C582@27774L109,586@28036L625,583@27892L769:AnalysisScreen.kt#td928");
            $composer2 = $composer3;
            title2 = title;
            TextKt.m2697Text4IGK_g(title2, PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6627constructorimpl(8), 7, null), TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, ($dirty & 14) | 197040, 0, 131032);
            list2 = list;
            FlowLayoutKt.FlowRow(null, Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8)), Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8)), 0, 0, null, ComposableLambdaKt.rememberComposableLambda(-1507308162, true, new Function3() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda56
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AnalysisScreenKt.PredictionGroup$lambda$167$lambda$166(list2, (FlowRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 1573296, 57);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.PredictionGroup$lambda$168(title2, list2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit PredictionGroup$lambda$167$lambda$166(List $list, FlowRowScope FlowRow, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        ComposerKt.sourceInformation(composer, "C*592@28271L366,588@28092L545:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1507308162, $changed, -1, "lnb.predict.earn.ui.screens.PredictionGroup.<anonymous>.<anonymous> (AnalysisScreen.kt:587)");
            }
            Iterator it = $list.iterator();
            while (it.hasNext()) {
                final NumberProfile numberProfile = (NumberProfile) it.next();
                SurfaceKt.m2547SurfaceT9BRK9s(null, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(8)), Color.INSTANCE.m4200getWhite0d7_KjU(), 0L, 0.0f, 0.0f, BorderStrokeKt.m254BorderStrokecXLIe8U(Dp.m6627constructorimpl(1), IcyBlue), ComposableLambdaKt.rememberComposableLambda(-873976030, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AnalysisScreenKt.PredictionGroup$lambda$167$lambda$166$lambda$165$lambda$164(numberProfile, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 14156160, 57);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit PredictionGroup$lambda$167$lambda$166$lambda$165$lambda$164(NumberProfile $profile, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C593@28293L326:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-873976030, $changed, -1, "lnb.predict.earn.ui.screens.PredictionGroup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnalysisScreen.kt:593)");
            }
            Modifier modifierM672padding3ABfNKs = PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(8));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM672padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -999322906, "C594@28406L30,595@28461L28,596@28514L83:AnalysisScreen.kt#td928");
            NumberBall($profile.getNumber(), 28, $composer, 48, 0);
            SpacerKt.Spacer(SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(8)), $composer, 6);
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf($profile.getScore())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            TextKt.m2697Text4IGK_g(str, (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AnalysisCard(final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(-2112258387);
        ComposerKt.sourceInformation($composer2, "C(AnalysisCard)611@28918L89,606@28739L268:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(content) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112258387, $dirty, -1, "lnb.predict.earn.ui.screens.AnalysisCard (AnalysisScreen.kt:605)");
            }
            SurfaceKt.m2547SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(12)), GlassWhite, 0L, 0.0f, 0.0f, BorderStrokeKt.m254BorderStrokecXLIe8U(Dp.m6627constructorimpl(1), GlassBorder), ComposableLambdaKt.rememberComposableLambda(807227698, true, new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.AnalysisCard$lambda$170(content, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 14156166, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.AnalysisCard$lambda$171(content, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0156  */
    static final Unit AnalysisCard$lambda$170(Function2 $content, Composer $composer, int $changed) {
        int i;
        ComposerKt.sourceInformation($composer, "C612@28928L73:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(807227698, $changed, -1, "lnb.predict.earn.ui.screens.AnalysisCard.<anonymous> (AnalysisScreen.kt:612)");
            }
            Modifier modifierM672padding3ABfNKs = PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM672padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting()) {
                i = 6;
            } else {
                i = 6;
                if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i4 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1761476062, "C613@28982L9:AnalysisScreen.kt#td928");
                $content.invoke($composer, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i6 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1761476062, "C613@28982L9:AnalysisScreen.kt#td928");
            $content.invoke($composer, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01ea  */
    public static final void NumberBall(final int num, int size, Composer $composer, final int $changed, final int i) {
        int i2;
        final int size2;
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        Composer composer;
        Composer $composer3 = $composer.startRestartGroup(1082708816);
        ComposerKt.sourceInformation($composer3, "C(NumberBall)620@29070L245:AnalysisScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(num) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
            i2 = size;
        } else if (($changed & 48) == 0) {
            i2 = size;
            $dirty |= $composer3.changed(i2) ? 32 : 16;
        } else {
            i2 = size;
        }
        if (($dirty & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
            size2 = i2;
        } else {
            size2 = i3 != 0 ? 32 : i2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1082708816, $dirty, -1, "lnb.predict.earn.ui.screens.NumberBall (AnalysisScreen.kt:619)");
            }
            Modifier modifierM227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(ClipKt.clip(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(size2)), RoundedCornerShapeKt.getCircleShape()), IcyBlue, null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            $composer2 = $composer3;
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM227backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
                $composer3.useNode();
            }
            Composer composerM3656constructorimpl = Updater.m3656constructorimpl($composer3);
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting()) {
                composer = $composer3;
            } else {
                composer = $composer3;
                if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                Composer composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i6 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -1224160068, "C624@29216L93:AnalysisScreen.kt#td928");
                TextKt.m2697Text4IGK_g(String.valueOf(num), (Modifier) null, TwilightIndigo, TextUnitKt.getSp(((double) size2) / 2.5d), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196992, 0, 131026);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i4 >> 6) & 14;
            Composer composer3 = composer;
            ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i8 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -1224160068, "C624@29216L93:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g(String.valueOf(num), (Modifier) null, TwilightIndigo, TextUnitKt.getSp(((double) size2) / 2.5d), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 196992, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.AnalysisScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalysisScreenKt.NumberBall$lambda$173(num, size2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
