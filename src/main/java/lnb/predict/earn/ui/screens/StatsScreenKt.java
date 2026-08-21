package lnb.predict.earn.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lnb.predict.earn.domain.model.GlobalStatistics;
import lnb.predict.earn.domain.model.NumberStats;
import lnb.predict.earn.ui.viewmodel.LotoViewModel;

/* JADX INFO: compiled from: StatsScreen.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u001d²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\u0018\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"X\u008a\u0084\u0002"}, d2 = {"DATE_FORMATTER", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "IcyBlue", "Landroidx/compose/ui/graphics/Color;", "J", "AzureMist", "TwilightIndigo", "InkBlack", "GlassWhite", "GlassBorder", "StatsScreen", "", "viewModel", "Llnb/predict/earn/ui/viewmodel/LotoViewModel;", "(Llnb/predict/earn/ui/viewmodel/LotoViewModel;Landroidx/compose/runtime/Composer;I)V", "FrequentNumberRowIcy", "stat", "Llnb/predict/earn/domain/model/NumberStats;", "(Llnb/predict/earn/domain/model/NumberStats;Landroidx/compose/runtime/Composer;I)V", "SearchedNumberDetailsIcy", "rank", "", "(Llnb/predict/earn/domain/model/NumberStats;ILandroidx/compose/runtime/Composer;I)V", "DetailRowIcy", "label", "", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_debug", "stats", "Llnb/predict/earn/domain/model/GlobalStatistics;", "searchQuery", "searchedResult", "Lkotlin/Pair;"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class StatsScreenKt {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.FRENCH);
    private static final long IcyBlue = ColorKt.Color(4289317856L);
    private static final long AzureMist = ColorKt.Color(4293064179L);
    private static final long TwilightIndigo = ColorKt.Color(4281547895L);
    private static final long InkBlack = ColorKt.Color(4278197033L);
    private static final long GlassWhite = ColorKt.Color(4294967295L);
    private static final long GlassBorder = ColorKt.Color(4291945704L);

    static final Unit DetailRowIcy$lambda$29(String str, String str2, int i, Composer composer, int i2) {
        DetailRowIcy(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit FrequentNumberRowIcy$lambda$19(NumberStats numberStats, int i, Composer composer, int i2) {
        FrequentNumberRowIcy(numberStats, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit SearchedNumberDetailsIcy$lambda$27(NumberStats numberStats, int i, int i2, Composer composer, int i3) {
        SearchedNumberDetailsIcy(numberStats, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    static final Unit StatsScreen$lambda$14(LotoViewModel lotoViewModel, int i, Composer composer, int i2) {
        StatsScreen(lotoViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x078f  */
    /* JADX WARN: Code duplicated, block: B:107:0x079a  */
    /* JADX WARN: Code duplicated, block: B:111:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x0241  */
    /* JADX WARN: Code duplicated, block: B:38:0x024d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0253  */
    /* JADX WARN: Code duplicated, block: B:50:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x0465  */
    /* JADX WARN: Code duplicated, block: B:60:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0518  */
    /* JADX WARN: Code duplicated, block: B:71:0x052e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0603  */
    /* JADX WARN: Code duplicated, block: B:82:0x060e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0638  */
    /* JADX WARN: Code duplicated, block: B:85:0x0683  */
    /* JADX WARN: Code duplicated, block: B:87:0x0691  */
    /* JADX WARN: Code duplicated, block: B:89:0x0714  */
    /* JADX WARN: Code duplicated, block: B:93:0x071f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0726  */
    /* JADX WARN: Code duplicated, block: B:99:0x0736  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void StatsScreen(final LotoViewModel viewModel, Composer $composer, final int $changed) {
        Function0<ComposeUiNode> function0;
        State searchedResult$delegate;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> function1;
        Composer composerM3656constructorimpl;
        Modifier modifierM226backgroundbw27NRU;
        boolean zChangedInstance;
        Composer $composer2;
        Object objRememberedValue;
        Modifier modifier;
        boolean z;
        boolean zChanged;
        GlobalStatistics globalStatisticsStatsScreen$lambda$0;
        Object objEmptyList;
        List<NumberStats> byFrequency;
        final List list;
        boolean zChangedInstance2;
        Object obj;
        Pair<NumberStats, Integer> pairStatsScreen$lambda$2;
        Unit unit;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Function0<ComposeUiNode> function2;
        Composer composerM3656constructorimpl2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer3 = $composer.startRestartGroup(943376560);
        ComposerKt.sourceInformation($composer3, "C(StatsScreen)39@1532L16,40@1598L16,41@1671L16,43@1693L2996:StatsScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(943376560, $dirty, -1, "lnb.predict.earn.ui.screens.StatsScreen (StatsScreen.kt:38)");
            }
            State stats$delegate = SnapshotStateKt.collectAsState(viewModel.getGlobalStats(), null, $composer3, 0, 1);
            State searchQuery$delegate = SnapshotStateKt.collectAsState(viewModel.getStatSearchQuery(), null, $composer3, 0, 1);
            State searchedResult$delegate2 = SnapshotStateKt.collectAsState(viewModel.getSearchedNumberStats(), null, $composer3, 0, 1);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor3;
                $composer3.createNode(function0);
            } else {
                function0 = constructor3;
                $composer3.useNode();
            }
            Composer composerM3656constructorimpl3 = Updater.m3656constructorimpl($composer3);
            Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl3.getInserting()) {
                searchedResult$delegate = searchedResult$delegate2;
            } else {
                searchedResult$delegate = searchedResult$delegate2;
                if (!Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i3 = ((6 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 1394652571, "C45@1773L123,49@1906L2777:StatsScreen.kt#td928");
                BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m4120verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4153boximpl(AzureMist), Color.m4153boximpl(IcyBlue)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), $composer3, 6);
                Modifier modifierM674paddingVpY3zN4$default = PaddingKt.m674paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6627constructorimpl(16), 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((6 >> 3) & 14) | ((6 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierM674paddingVpY3zN4$default);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((6 << 3) & 112) << 6) & 896) | 6;
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
                Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                }
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i6 = ((6 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 135502964, "C50@1990L41,63@2738L280,55@2177L39,53@2089L943,72@3046L41:StatsScreen.kt#td928");
                SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), $composer3, 6);
                String strStatsScreen$lambda$1 = StatsScreen$lambda$1(searchQuery$delegate);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                long jM4200getWhite0d7_KjU = Color.INSTANCE.m4200getWhite0d7_KjU();
                modifierM226backgroundbw27NRU = BackgroundKt.m226backgroundbw27NRU(modifierFillMaxWidth$default, Color.m4161copywmQWz5c(jM4200getWhite0d7_KjU, (14 & 1) != 0 ? Color.m4165getAlphaimpl(jM4200getWhite0d7_KjU) : 0.4f, (14 & 2) != 0 ? Color.m4169getRedimpl(jM4200getWhite0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(jM4200getWhite0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(jM4200getWhite0d7_KjU) : 0.0f), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(12)));
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(12));
                TextFieldColors textFieldColorsM2347colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2347colors0hiis_0(InkBlack, InkBlack, 0L, 0L, 0L, 0L, 0L, 0L, TwilightIndigo, 0L, null, IcyBlue, GlassBorder, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer3, 100663350, 432, 0, 0, 3072, 2147477244, 4095);
                ComposerKt.sourceInformationMarkerStart($composer3, -272720261, "CC(remember):StatsScreen.kt#9igjgp");
                zChangedInstance = $composer3.changedInstance(viewModel);
                $composer2 = $composer3;
                objRememberedValue = $composer3.rememberedValue();
                if (zChangedInstance) {
                    modifier = modifierM226backgroundbw27NRU;
                } else {
                    modifier = modifierM226backgroundbw27NRU;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    OutlinedTextFieldKt.OutlinedTextField(strStatsScreen$lambda$1, (Function1<? super String, Unit>) objRememberedValue, modifier, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$StatsScreenKt.INSTANCE.getLambda$982080219$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$StatsScreenKt.INSTANCE.m8651getLambda$1822318372$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_4, textFieldColorsM2347colors0hiis_0, $composer3, 113246208, 12582912, 0, 1965688);
                    SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(20)), $composer3, 6);
                    if (StatsScreen$lambda$0(stats$delegate) == null) {
                        $composer3.startReplaceGroup(136552623);
                        ComposerKt.sourceInformation($composer3, "75@3138L351");
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default2);
                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer3.startReusableNode();
                        if ($composer3.getInserting()) {
                            function2 = constructor2;
                            $composer3.createNode(function2);
                        } else {
                            function2 = constructor2;
                            $composer3.useNode();
                        }
                        composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer3);
                        Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3656constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3);
                        }
                        Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        int i8 = (i7 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        int i9 = ((54 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer3, 853034789, "C78@3361L10,76@3236L235:StatsScreen.kt#td928");
                        TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium();
                        long j = TwilightIndigo;
                        TextKt.m2697Text4IGK_g("Aucune statistique pour cette période.", (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium, $composer3, 390, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        $composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        $composer3.endReplaceGroup();
                    } else {
                        if (StatsScreen$lambda$1(searchQuery$delegate).length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            $composer3.startReplaceGroup(136963807);
                            ComposerKt.sourceInformation($composer3, "");
                            pairStatsScreen$lambda$2 = StatsScreen$lambda$2(searchedResult$delegate);
                            if (pairStatsScreen$lambda$2 == null) {
                                $composer3.startReplaceGroup(136993473);
                                $composer3.endReplaceGroup();
                                unit = null;
                            } else {
                                $composer3.startReplaceGroup(136993474);
                                ComposerKt.sourceInformation($composer3, "*84@3621L42");
                                SearchedNumberDetailsIcy(pairStatsScreen$lambda$2.component1(), pairStatsScreen$lambda$2.component2().intValue(), $composer3, 0);
                                Unit unit2 = Unit.INSTANCE;
                                $composer3.endReplaceGroup();
                                unit = Unit.INSTANCE;
                            }
                            if (unit == null) {
                                $composer3.startReplaceGroup(137103679);
                                ComposerKt.sourceInformation($composer3, "85@3685L79");
                                TextKt.m2697Text4IGK_g("Non trouvé.", PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), TwilightIndigo, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 438, 0, 131064);
                                $composer3.endReplaceGroup();
                            } else {
                                $composer3.startReplaceGroup(-272675933);
                                $composer3.endReplaceGroup();
                            }
                            $composer3.endReplaceGroup();
                        } else {
                            $composer3.startReplaceGroup(137226997);
                            ComposerKt.sourceInformation($composer3, "89@3904L10,87@3802L315,95@4163L99,103@4503L156,99@4280L379");
                            TextKt.m2697Text4IGK_g("NUMÉROS CHAUDS (TOP 20)", PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6627constructorimpl(4), 0.0f, 0.0f, Dp.m6627constructorimpl(12), 6, null), TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelLarge(), $composer3, 196998, 0, 65496);
                            GlobalStatistics globalStatisticsStatsScreen$lambda$1 = StatsScreen$lambda$0(stats$delegate);
                            ComposerKt.sourceInformationMarkerStart($composer3, -272656649, "CC(remember):StatsScreen.kt#9igjgp");
                            zChanged = $composer3.changed(globalStatisticsStatsScreen$lambda$1);
                            Object objRememberedValue2 = $composer3.rememberedValue();
                            if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                globalStatisticsStatsScreen$lambda$0 = StatsScreen$lambda$0(stats$delegate);
                                if (globalStatisticsStatsScreen$lambda$0 != null || (byFrequency = globalStatisticsStatsScreen$lambda$0.getByFrequency()) == null || (objEmptyList = CollectionsKt.take(byFrequency, 20)) == null) {
                                    objEmptyList = CollectionsKt.emptyList();
                                }
                                $composer3.updateRememberedValue(objEmptyList);
                            } else {
                                objEmptyList = objRememberedValue2;
                            }
                            list = (List) objEmptyList;
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(10));
                            PaddingValues paddingValuesM669PaddingValuesa9UjIt4$default = PaddingKt.m669PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6627constructorimpl(16), 7, null);
                            Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM552spacedBy0680j_4;
                            ComposerKt.sourceInformationMarkerStart($composer3, -272645712, "CC(remember):StatsScreen.kt#9igjgp");
                            zChangedInstance2 = $composer3.changedInstance(list);
                            Object objRememberedValue3 = $composer3.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return StatsScreenKt.StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10(list, (LazyListScope) obj2);
                                    }
                                };
                                $composer3.updateRememberedValue(obj);
                            } else {
                                obj = objRememberedValue3;
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            LazyDslKt.LazyColumn(modifierFillMaxSize$default3, null, paddingValuesM669PaddingValuesa9UjIt4$default, false, horizontalOrVertical, null, null, false, (Function1) obj, $composer3, 24966, 234);
                            $composer3.endReplaceGroup();
                        }
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
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
                objRememberedValue = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return StatsScreenKt.StatsScreen$lambda$13$lambda$12$lambda$4$lambda$3(viewModel, (String) obj2);
                    }
                };
                $composer3.updateRememberedValue(objRememberedValue);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                OutlinedTextFieldKt.OutlinedTextField(strStatsScreen$lambda$1, (Function1<? super String, Unit>) objRememberedValue, modifier, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$StatsScreenKt.INSTANCE.getLambda$982080219$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$StatsScreenKt.INSTANCE.m8651getLambda$1822318372$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_4, textFieldColorsM2347colors0hiis_0, $composer3, 113246208, 12582912, 0, 1965688);
                SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(20)), $composer3, 6);
                if (StatsScreen$lambda$0(stats$delegate) == null) {
                    $composer3.startReplaceGroup(136552623);
                    ComposerKt.sourceInformation($composer3, "75@3138L351");
                    Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = $composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default4);
                    constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i10 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer3.startReusableNode();
                    if ($composer3.getInserting()) {
                        function2 = constructor2;
                        $composer3.createNode(function2);
                    } else {
                        function2 = constructor2;
                        $composer3.useNode();
                    }
                    composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer3);
                    Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3656constructorimpl2.getInserting()) {
                    }
                    composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash4);
                    Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i11 = (i10 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    int i12 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, 853034789, "C78@3361L10,76@3236L235:StatsScreen.kt#td928");
                    TextStyle bodyMedium2 = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium();
                    long j2 = TwilightIndigo;
                    TextKt.m2697Text4IGK_g("Aucune statistique pour cette période.", (Modifier) null, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium2, $composer3, 390, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endReplaceGroup();
                } else {
                    if (StatsScreen$lambda$1(searchQuery$delegate).length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        $composer3.startReplaceGroup(136963807);
                        ComposerKt.sourceInformation($composer3, "");
                        pairStatsScreen$lambda$2 = StatsScreen$lambda$2(searchedResult$delegate);
                        if (pairStatsScreen$lambda$2 == null) {
                            $composer3.startReplaceGroup(136993473);
                            $composer3.endReplaceGroup();
                            unit = null;
                        } else {
                            $composer3.startReplaceGroup(136993474);
                            ComposerKt.sourceInformation($composer3, "*84@3621L42");
                            SearchedNumberDetailsIcy(pairStatsScreen$lambda$2.component1(), pairStatsScreen$lambda$2.component2().intValue(), $composer3, 0);
                            Unit unit3 = Unit.INSTANCE;
                            $composer3.endReplaceGroup();
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            $composer3.startReplaceGroup(137103679);
                            ComposerKt.sourceInformation($composer3, "85@3685L79");
                            TextKt.m2697Text4IGK_g("Non trouvé.", PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), TwilightIndigo, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 438, 0, 131064);
                            $composer3.endReplaceGroup();
                        } else {
                            $composer3.startReplaceGroup(-272675933);
                            $composer3.endReplaceGroup();
                        }
                        $composer3.endReplaceGroup();
                    } else {
                        $composer3.startReplaceGroup(137226997);
                        ComposerKt.sourceInformation($composer3, "89@3904L10,87@3802L315,95@4163L99,103@4503L156,99@4280L379");
                        TextKt.m2697Text4IGK_g("NUMÉROS CHAUDS (TOP 20)", PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6627constructorimpl(4), 0.0f, 0.0f, Dp.m6627constructorimpl(12), 6, null), TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelLarge(), $composer3, 196998, 0, 65496);
                        GlobalStatistics globalStatisticsStatsScreen$lambda$2 = StatsScreen$lambda$0(stats$delegate);
                        ComposerKt.sourceInformationMarkerStart($composer3, -272656649, "CC(remember):StatsScreen.kt#9igjgp");
                        zChanged = $composer3.changed(globalStatisticsStatsScreen$lambda$2);
                        Object objRememberedValue4 = $composer3.rememberedValue();
                        if (zChanged) {
                            globalStatisticsStatsScreen$lambda$0 = StatsScreen$lambda$0(stats$delegate);
                            if (globalStatisticsStatsScreen$lambda$0 != null) {
                                objEmptyList = CollectionsKt.emptyList();
                            } else {
                                objEmptyList = CollectionsKt.emptyList();
                            }
                            $composer3.updateRememberedValue(objEmptyList);
                        } else {
                            globalStatisticsStatsScreen$lambda$0 = StatsScreen$lambda$0(stats$delegate);
                            if (globalStatisticsStatsScreen$lambda$0 != null) {
                                objEmptyList = CollectionsKt.emptyList();
                            } else {
                                objEmptyList = CollectionsKt.emptyList();
                            }
                            $composer3.updateRememberedValue(objEmptyList);
                        }
                        list = (List) objEmptyList;
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_5 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(10));
                        PaddingValues paddingValuesM669PaddingValuesa9UjIt4$default2 = PaddingKt.m669PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6627constructorimpl(16), 7, null);
                        Arrangement.HorizontalOrVertical horizontalOrVertical2 = horizontalOrVerticalM552spacedBy0680j_5;
                        ComposerKt.sourceInformationMarkerStart($composer3, -272645712, "CC(remember):StatsScreen.kt#9igjgp");
                        zChangedInstance2 = $composer3.changedInstance(list);
                        Object objRememberedValue5 = $composer3.rememberedValue();
                        if (zChangedInstance2) {
                            obj = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return StatsScreenKt.StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10(list, (LazyListScope) obj2);
                                }
                            };
                            $composer3.updateRememberedValue(obj);
                        } else {
                            obj = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return StatsScreenKt.StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10(list, (LazyListScope) obj2);
                                }
                            };
                            $composer3.updateRememberedValue(obj);
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        LazyDslKt.LazyColumn(modifierFillMaxSize$default5, null, paddingValuesM669PaddingValuesa9UjIt4$default2, false, horizontalOrVertical2, null, null, false, (Function1) obj, $composer3, 24966, 234);
                        $composer3.endReplaceGroup();
                    }
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
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
            composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash);
            Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i13 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            int i14 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1394652571, "C45@1773L123,49@1906L2777:StatsScreen.kt#td928");
            BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m4120verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4153boximpl(AzureMist), Color.m4153boximpl(IcyBlue)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), $composer3, 6);
            Modifier modifierM674paddingVpY3zN4$default2 = PaddingKt.m674paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6627constructorimpl(16), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap5 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer3, modifierM674paddingVpY3zN4$default2);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i15 = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3656constructorimpl.getInserting()) {
            }
            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            int i16 = (i15 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i17 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 135502964, "C50@1990L41,63@2738L280,55@2177L39,53@2089L943,72@3046L41:StatsScreen.kt#td928");
            SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), $composer3, 6);
            String strStatsScreen$lambda$2 = StatsScreen$lambda$1(searchQuery$delegate);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            long jM4200getWhite0d7_KjU2 = Color.INSTANCE.m4200getWhite0d7_KjU();
            modifierM226backgroundbw27NRU = BackgroundKt.m226backgroundbw27NRU(modifierFillMaxWidth$default2, Color.m4161copywmQWz5c(jM4200getWhite0d7_KjU2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(jM4200getWhite0d7_KjU2) : 0.4f, (14 & 2) != 0 ? Color.m4169getRedimpl(jM4200getWhite0d7_KjU2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(jM4200getWhite0d7_KjU2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(jM4200getWhite0d7_KjU2) : 0.0f), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(12)));
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(12));
            TextFieldColors textFieldColorsM2347colors0hiis_1 = OutlinedTextFieldDefaults.INSTANCE.m2347colors0hiis_0(InkBlack, InkBlack, 0L, 0L, 0L, 0L, 0L, 0L, TwilightIndigo, 0L, null, IcyBlue, GlassBorder, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer3, 100663350, 432, 0, 0, 3072, 2147477244, 4095);
            ComposerKt.sourceInformationMarkerStart($composer3, -272720261, "CC(remember):StatsScreen.kt#9igjgp");
            zChangedInstance = $composer3.changedInstance(viewModel);
            $composer2 = $composer3;
            objRememberedValue = $composer3.rememberedValue();
            if (zChangedInstance) {
                modifier = modifierM226backgroundbw27NRU;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                OutlinedTextFieldKt.OutlinedTextField(strStatsScreen$lambda$2, (Function1<? super String, Unit>) objRememberedValue, modifier, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$StatsScreenKt.INSTANCE.getLambda$982080219$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$StatsScreenKt.INSTANCE.m8651getLambda$1822318372$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_5, textFieldColorsM2347colors0hiis_1, $composer3, 113246208, 12582912, 0, 1965688);
                SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(20)), $composer3, 6);
                if (StatsScreen$lambda$0(stats$delegate) == null) {
                    $composer3.startReplaceGroup(136552623);
                    ComposerKt.sourceInformation($composer3, "75@3138L351");
                    Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center3 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = $composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default6);
                    constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i18 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer3.startReusableNode();
                    if ($composer3.getInserting()) {
                        function2 = constructor2;
                        $composer3.createNode(function2);
                    } else {
                        function2 = constructor2;
                        $composer3.useNode();
                    }
                    composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer3);
                    Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3656constructorimpl2.getInserting()) {
                    }
                    composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash6);
                    Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                    int i19 = (i18 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    int i110 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, 853034789, "C78@3361L10,76@3236L235:StatsScreen.kt#td928");
                    TextStyle bodyMedium3 = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium();
                    long j3 = TwilightIndigo;
                    TextKt.m2697Text4IGK_g("Aucune statistique pour cette période.", (Modifier) null, Color.m4161copywmQWz5c(j3, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j3) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j3) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j3) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j3) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium3, $composer3, 390, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endReplaceGroup();
                } else {
                    if (StatsScreen$lambda$1(searchQuery$delegate).length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        $composer3.startReplaceGroup(136963807);
                        ComposerKt.sourceInformation($composer3, "");
                        pairStatsScreen$lambda$2 = StatsScreen$lambda$2(searchedResult$delegate);
                        if (pairStatsScreen$lambda$2 == null) {
                            $composer3.startReplaceGroup(136993473);
                            $composer3.endReplaceGroup();
                            unit = null;
                        } else {
                            $composer3.startReplaceGroup(136993474);
                            ComposerKt.sourceInformation($composer3, "*84@3621L42");
                            SearchedNumberDetailsIcy(pairStatsScreen$lambda$2.component1(), pairStatsScreen$lambda$2.component2().intValue(), $composer3, 0);
                            Unit unit4 = Unit.INSTANCE;
                            $composer3.endReplaceGroup();
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            $composer3.startReplaceGroup(137103679);
                            ComposerKt.sourceInformation($composer3, "85@3685L79");
                            TextKt.m2697Text4IGK_g("Non trouvé.", PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), TwilightIndigo, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 438, 0, 131064);
                            $composer3.endReplaceGroup();
                        } else {
                            $composer3.startReplaceGroup(-272675933);
                            $composer3.endReplaceGroup();
                        }
                        $composer3.endReplaceGroup();
                    } else {
                        $composer3.startReplaceGroup(137226997);
                        ComposerKt.sourceInformation($composer3, "89@3904L10,87@3802L315,95@4163L99,103@4503L156,99@4280L379");
                        TextKt.m2697Text4IGK_g("NUMÉROS CHAUDS (TOP 20)", PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6627constructorimpl(4), 0.0f, 0.0f, Dp.m6627constructorimpl(12), 6, null), TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelLarge(), $composer3, 196998, 0, 65496);
                        GlobalStatistics globalStatisticsStatsScreen$lambda$3 = StatsScreen$lambda$0(stats$delegate);
                        ComposerKt.sourceInformationMarkerStart($composer3, -272656649, "CC(remember):StatsScreen.kt#9igjgp");
                        zChanged = $composer3.changed(globalStatisticsStatsScreen$lambda$3);
                        Object objRememberedValue6 = $composer3.rememberedValue();
                        if (zChanged) {
                            globalStatisticsStatsScreen$lambda$0 = StatsScreen$lambda$0(stats$delegate);
                            if (globalStatisticsStatsScreen$lambda$0 != null) {
                                objEmptyList = CollectionsKt.emptyList();
                            } else {
                                objEmptyList = CollectionsKt.emptyList();
                            }
                            $composer3.updateRememberedValue(objEmptyList);
                        } else {
                            globalStatisticsStatsScreen$lambda$0 = StatsScreen$lambda$0(stats$delegate);
                            if (globalStatisticsStatsScreen$lambda$0 != null) {
                                objEmptyList = CollectionsKt.emptyList();
                            } else {
                                objEmptyList = CollectionsKt.emptyList();
                            }
                            $composer3.updateRememberedValue(objEmptyList);
                        }
                        list = (List) objEmptyList;
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        Modifier modifierFillMaxSize$default7 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_6 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(10));
                        PaddingValues paddingValuesM669PaddingValuesa9UjIt4$default3 = PaddingKt.m669PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6627constructorimpl(16), 7, null);
                        Arrangement.HorizontalOrVertical horizontalOrVertical3 = horizontalOrVerticalM552spacedBy0680j_6;
                        ComposerKt.sourceInformationMarkerStart($composer3, -272645712, "CC(remember):StatsScreen.kt#9igjgp");
                        zChangedInstance2 = $composer3.changedInstance(list);
                        Object objRememberedValue7 = $composer3.rememberedValue();
                        if (zChangedInstance2) {
                            obj = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return StatsScreenKt.StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10(list, (LazyListScope) obj2);
                                }
                            };
                            $composer3.updateRememberedValue(obj);
                        } else {
                            obj = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return StatsScreenKt.StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10(list, (LazyListScope) obj2);
                                }
                            };
                            $composer3.updateRememberedValue(obj);
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        LazyDslKt.LazyColumn(modifierFillMaxSize$default7, null, paddingValuesM669PaddingValuesa9UjIt4$default3, false, horizontalOrVertical3, null, null, false, (Function1) obj, $composer3, 24966, 234);
                        $composer3.endReplaceGroup();
                    }
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                modifier = modifierM226backgroundbw27NRU;
            }
            objRememberedValue = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return StatsScreenKt.StatsScreen$lambda$13$lambda$12$lambda$4$lambda$3(viewModel, (String) obj2);
                }
            };
            $composer3.updateRememberedValue(objRememberedValue);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            OutlinedTextFieldKt.OutlinedTextField(strStatsScreen$lambda$2, (Function1<? super String, Unit>) objRememberedValue, modifier, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$StatsScreenKt.INSTANCE.getLambda$982080219$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$StatsScreenKt.INSTANCE.m8651getLambda$1822318372$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_5, textFieldColorsM2347colors0hiis_1, $composer3, 113246208, 12582912, 0, 1965688);
            SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(20)), $composer3, 6);
            if (StatsScreen$lambda$0(stats$delegate) == null) {
                $composer3.startReplaceGroup(136552623);
                ComposerKt.sourceInformation($composer3, "75@3138L351");
                Modifier modifierFillMaxSize$default8 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center4 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                CompositionLocalMap currentCompositionLocalMap7 = $composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default8);
                constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i111 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function2 = constructor2;
                    $composer3.createNode(function2);
                } else {
                    function2 = constructor2;
                    $composer3.useNode();
                }
                composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer3);
                Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3656constructorimpl2.getInserting()) {
                }
                composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash7);
                Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                int i112 = (i111 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                int i113 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 853034789, "C78@3361L10,76@3236L235:StatsScreen.kt#td928");
                TextStyle bodyMedium4 = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium();
                long j4 = TwilightIndigo;
                TextKt.m2697Text4IGK_g("Aucune statistique pour cette période.", (Modifier) null, Color.m4161copywmQWz5c(j4, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j4) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j4) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j4) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j4) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium4, $composer3, 390, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            } else {
                if (StatsScreen$lambda$1(searchQuery$delegate).length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    $composer3.startReplaceGroup(136963807);
                    ComposerKt.sourceInformation($composer3, "");
                    pairStatsScreen$lambda$2 = StatsScreen$lambda$2(searchedResult$delegate);
                    if (pairStatsScreen$lambda$2 == null) {
                        $composer3.startReplaceGroup(136993473);
                        $composer3.endReplaceGroup();
                        unit = null;
                    } else {
                        $composer3.startReplaceGroup(136993474);
                        ComposerKt.sourceInformation($composer3, "*84@3621L42");
                        SearchedNumberDetailsIcy(pairStatsScreen$lambda$2.component1(), pairStatsScreen$lambda$2.component2().intValue(), $composer3, 0);
                        Unit unit5 = Unit.INSTANCE;
                        $composer3.endReplaceGroup();
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        $composer3.startReplaceGroup(137103679);
                        ComposerKt.sourceInformation($composer3, "85@3685L79");
                        TextKt.m2697Text4IGK_g("Non trouvé.", PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), TwilightIndigo, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 438, 0, 131064);
                        $composer3.endReplaceGroup();
                    } else {
                        $composer3.startReplaceGroup(-272675933);
                        $composer3.endReplaceGroup();
                    }
                    $composer3.endReplaceGroup();
                } else {
                    $composer3.startReplaceGroup(137226997);
                    ComposerKt.sourceInformation($composer3, "89@3904L10,87@3802L315,95@4163L99,103@4503L156,99@4280L379");
                    TextKt.m2697Text4IGK_g("NUMÉROS CHAUDS (TOP 20)", PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6627constructorimpl(4), 0.0f, 0.0f, Dp.m6627constructorimpl(12), 6, null), TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelLarge(), $composer3, 196998, 0, 65496);
                    GlobalStatistics globalStatisticsStatsScreen$lambda$4 = StatsScreen$lambda$0(stats$delegate);
                    ComposerKt.sourceInformationMarkerStart($composer3, -272656649, "CC(remember):StatsScreen.kt#9igjgp");
                    zChanged = $composer3.changed(globalStatisticsStatsScreen$lambda$4);
                    Object objRememberedValue8 = $composer3.rememberedValue();
                    if (zChanged) {
                        globalStatisticsStatsScreen$lambda$0 = StatsScreen$lambda$0(stats$delegate);
                        if (globalStatisticsStatsScreen$lambda$0 != null) {
                            objEmptyList = CollectionsKt.emptyList();
                        } else {
                            objEmptyList = CollectionsKt.emptyList();
                        }
                        $composer3.updateRememberedValue(objEmptyList);
                    } else {
                        globalStatisticsStatsScreen$lambda$0 = StatsScreen$lambda$0(stats$delegate);
                        if (globalStatisticsStatsScreen$lambda$0 != null) {
                            objEmptyList = CollectionsKt.emptyList();
                        } else {
                            objEmptyList = CollectionsKt.emptyList();
                        }
                        $composer3.updateRememberedValue(objEmptyList);
                    }
                    list = (List) objEmptyList;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    Modifier modifierFillMaxSize$default9 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_7 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(10));
                    PaddingValues paddingValuesM669PaddingValuesa9UjIt4$default4 = PaddingKt.m669PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6627constructorimpl(16), 7, null);
                    Arrangement.HorizontalOrVertical horizontalOrVertical4 = horizontalOrVerticalM552spacedBy0680j_7;
                    ComposerKt.sourceInformationMarkerStart($composer3, -272645712, "CC(remember):StatsScreen.kt#9igjgp");
                    zChangedInstance2 = $composer3.changedInstance(list);
                    Object objRememberedValue9 = $composer3.rememberedValue();
                    if (zChangedInstance2) {
                        obj = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return StatsScreenKt.StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10(list, (LazyListScope) obj2);
                            }
                        };
                        $composer3.updateRememberedValue(obj);
                    } else {
                        obj = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return StatsScreenKt.StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10(list, (LazyListScope) obj2);
                            }
                        };
                        $composer3.updateRememberedValue(obj);
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    LazyDslKt.LazyColumn(modifierFillMaxSize$default9, null, paddingValuesM669PaddingValuesa9UjIt4$default4, false, horizontalOrVertical4, null, null, false, (Function1) obj, $composer3, 24966, 234);
                    $composer3.endReplaceGroup();
                }
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return StatsScreenKt.StatsScreen$lambda$14(viewModel, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final GlobalStatistics StatsScreen$lambda$0(State<GlobalStatistics> state) {
        return (GlobalStatistics) state.getValue();
    }

    private static final String StatsScreen$lambda$1(State<String> state) {
        return (String) state.getValue();
    }

    private static final Pair<NumberStats, Integer> StatsScreen$lambda$2(State<Pair<NumberStats, Integer>> state) {
        return (Pair) state.getValue();
    }

    static final Unit StatsScreen$lambda$13$lambda$12$lambda$4$lambda$3(LotoViewModel $viewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.updateStatSearchQuery(it);
        return Unit.INSTANCE;
    }

    static final Unit StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10(final List $top20, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StatsScreenKt.StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10$lambda$8((NumberStats) obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((NumberStats) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(NumberStats numberStats) {
                return null;
            }
        };
        LazyColumn.items($top20.size(), new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($top20.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function2.invoke($top20.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10$$inlined$items$default$4
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
                NumberStats numberStats = (NumberStats) $top20.get(it);
                $composer.startReplaceGroup(-777376419);
                ComposerKt.sourceInformation($composer, "C*105@4593L26:StatsScreen.kt#td928");
                StatsScreenKt.FrequentNumberRowIcy(numberStats, $composer, (($dirty & 14) >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object StatsScreen$lambda$13$lambda$12$lambda$11$lambda$10$lambda$8(NumberStats it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getNumber());
    }

    public static final void FrequentNumberRowIcy(final NumberStats stat, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(stat, "stat");
        Composer $composer2 = $composer.startRestartGroup(747093619);
        ComposerKt.sourceInformation($composer2, "C(FrequentNumberRowIcy)121@4967L1272,115@4755L1484:StatsScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(stat) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(747093619, $dirty, -1, "lnb.predict.earn.ui.screens.FrequentNumberRowIcy (StatsScreen.kt:114)");
            }
            SurfaceKt.m2547SurfaceT9BRK9s(BorderKt.m238borderxT4_qwU(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(16))), Dp.m6627constructorimpl((float) 0.5d), GlassBorder, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(16))), null, GlassWhite, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1777368562, true, new Function2() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatsScreenKt.FrequentNumberRowIcy$lambda$18(stat, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 12583296, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatsScreenKt.FrequentNumberRowIcy$lambda$19(stat, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x04d2  */
    static final Unit FrequentNumberRowIcy$lambda$18(NumberStats $stat, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function1;
        Function0<ComposeUiNode> function2;
        Composer composer;
        ComposerKt.sourceInformation($composer, "C122@4977L1256:StatsScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1777368562, $changed, -1, "lnb.predict.earn.ui.screens.FrequentNumberRowIcy.<anonymous> (StatsScreen.kt:122)");
            }
            Modifier modifierM672padding3ABfNKs = PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(12));
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM672padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2023391425, "C127@5175L555,143@5756L467:StatsScreen.kt#td928");
            Modifier modifierM227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(ClipKt.clip(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), IcyBlue, null, 2, null);
            float fM6627constructorimpl = Dp.m6627constructorimpl(1);
            long jM4200getWhite0d7_KjU = Color.INSTANCE.m4200getWhite0d7_KjU();
            Modifier modifierM238borderxT4_qwU = BorderKt.m238borderxT4_qwU(modifierM227backgroundbw27NRU$default, fM6627constructorimpl, Color.m4161copywmQWz5c(jM4200getWhite0d7_KjU, (14 & 1) != 0 ? Color.m4165getAlphaimpl(jM4200getWhite0d7_KjU) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(jM4200getWhite0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(jM4200getWhite0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(jM4200getWhite0d7_KjU) : 0.0f), RoundedCornerShapeKt.getCircleShape());
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM238borderxT4_qwU);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function1 = constructor2;
                $composer.createNode(function1);
            } else {
                function1 = constructor2;
                $composer.useNode();
            }
            Composer composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1585616160, "C135@5493L223:StatsScreen.kt#td928");
            TextKt.m2697Text4IGK_g(StringsKt.padStart(String.valueOf($stat.getNumber()), 2, '0'), (Modifier) null, TwilightIndigo, TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function2 = constructor3;
                $composer.createNode(function2);
            } else {
                function2 = constructor3;
                $composer.useNode();
            }
            Composer composerM3656constructorimpl3 = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl3.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (!Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i8 = (i7 >> 6) & 14;
                Composer composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i9 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -477386840, "C144@5818L204,150@6039L170:StatsScreen.kt#td928");
                TextKt.m2697Text4IGK_g($stat.getFrequency() + " sorties", (Modifier) null, InkBlack, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 0, 131026);
                long sp = TextUnitKt.getSp(11);
                long j = TwilightIndigo;
                TextKt.m2697Text4IGK_g("Tendance filtrée", (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3462, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
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
            composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i10 = (i7 >> 6) & 14;
            Composer composer3 = composer;
            ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i11 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -477386840, "C144@5818L204,150@6039L170:StatsScreen.kt#td928");
            TextKt.m2697Text4IGK_g($stat.getFrequency() + " sorties", (Modifier) null, InkBlack, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 0, 131026);
            long sp2 = TextUnitKt.getSp(11);
            long j2 = TwilightIndigo;
            TextKt.m2697Text4IGK_g("Tendance filtrée", (Modifier) null, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3462, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
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

    public static final void SearchedNumberDetailsIcy(final NumberStats stat, final int rank, Composer $composer, final int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(stat, "stat");
        Composer $composer2 = $composer.startRestartGroup(-704415937);
        ComposerKt.sourceInformation($composer2, "C(SearchedNumberDetailsIcy)P(1)162@6366L2051,162@6320L2097:StatsScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(stat) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(rank) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-704415937, $dirty, -1, "lnb.predict.earn.ui.screens.SearchedNumberDetailsIcy (StatsScreen.kt:161)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 1661123298, "CC(remember):StatsScreen.kt#9igjgp");
            boolean z = (($dirty & 14) == 4) | (($dirty & 112) == 32);
            Object objRememberedValue = $composer2.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return StatsScreenKt.SearchedNumberDetailsIcy$lambda$26$lambda$25(stat, rank, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, null, null, null, false, (Function1) obj, $composer2, 6, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return StatsScreenKt.SearchedNumberDetailsIcy$lambda$27(stat, rank, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit SearchedNumberDetailsIcy$lambda$26$lambda$25(final NumberStats $stat, final int $rank, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1583824429, true, new Function3() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return StatsScreenKt.SearchedNumberDetailsIcy$lambda$26$lambda$25$lambda$22($stat, $rank, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        final List<LocalDate> lastAppearances = $stat.getLastAppearances();
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StatsScreenKt.SearchedNumberDetailsIcy$lambda$26$lambda$25$lambda$23((LocalDate) obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$SearchedNumberDetailsIcy$lambda$26$lambda$25$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((LocalDate) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(LocalDate localDate) {
                return null;
            }
        };
        LazyColumn.items(lastAppearances.size(), new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$SearchedNumberDetailsIcy$lambda$26$lambda$25$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(lastAppearances.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$SearchedNumberDetailsIcy$lambda$26$lambda$25$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function2.invoke(lastAppearances.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$SearchedNumberDetailsIcy$lambda$26$lambda$25$$inlined$items$default$4
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
                final LocalDate localDate = (LocalDate) lastAppearances.get(it);
                $composer.startReplaceGroup(188449324);
                ComposerKt.sourceInformation($composer, "C*202@8077L324,198@7872L529:StatsScreen.kt#td928");
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(4), 1, null), 0.0f, 1, null);
                long jM4200getWhite0d7_KjU = Color.INSTANCE.m4200getWhite0d7_KjU();
                SurfaceKt.m2547SurfaceT9BRK9s(modifierFillMaxWidth$default, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(8)), Color.m4161copywmQWz5c(jM4200getWhite0d7_KjU, (14 & 1) != 0 ? Color.m4165getAlphaimpl(jM4200getWhite0d7_KjU) : 0.3f, (14 & 2) != 0 ? Color.m4169getRedimpl(jM4200getWhite0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(jM4200getWhite0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(jM4200getWhite0d7_KjU) : 0.0f), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(382264577, true, new Function2<Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$SearchedNumberDetailsIcy$1$1$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer2, int $changed2) {
                        ComposerKt.sourceInformation($composer2, "C203@8095L292:StatsScreen.kt#td928");
                        if (($changed2 & 3) == 2 && $composer2.getSkipping()) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(382264577, $changed2, -1, "lnb.predict.earn.ui.screens.SearchedNumberDetailsIcy.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatsScreen.kt:203)");
                        }
                        String str = localDate.format(StatsScreenKt.DATE_FORMATTER);
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        TextKt.m2697Text4IGK_g(str, PaddingKt.m673paddingVpY3zN4(Modifier.INSTANCE, Dp.m6627constructorimpl(16), Dp.m6627constructorimpl(8)), StatsScreenKt.InkBlack, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 200112, 0, 131024);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), $composer, 12583302, 120);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit SearchedNumberDetailsIcy$lambda$26$lambda$25$lambda$22(final NumberStats $stat, final int $rank, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C170@6655L733,164@6395L993,186@7414L41,190@7580L10,188@7481L296:StatsScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1583824429, $changed, -1, "lnb.predict.earn.ui.screens.SearchedNumberDetailsIcy.<anonymous>.<anonymous>.<anonymous> (StatsScreen.kt:164)");
            }
            SurfaceKt.m2547SurfaceT9BRK9s(BorderKt.m238borderxT4_qwU(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(20))), Dp.m6627constructorimpl((float) 0.5d), GlassBorder, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(20))), null, GlassWhite, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(476547886, true, new Function2() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatsScreenKt.SearchedNumberDetailsIcy$lambda$26$lambda$25$lambda$22$lambda$21($stat, $rank, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12583296, 122);
            SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(24)), $composer, 6);
            TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge();
            FontWeight black = FontWeight.INSTANCE.getBlack();
            TextKt.m2697Text4IGK_g("DERNIÈRES SORTIES (FILTRÉES)", PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6627constructorimpl(4), 0.0f, 0.0f, Dp.m6627constructorimpl(12), 6, null), TwilightIndigo, 0L, (FontStyle) null, black, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelLarge, $composer, 196998, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x022b  */
    static final Unit SearchedNumberDetailsIcy$lambda$26$lambda$25$lambda$22$lambda$21(NumberStats $stat, int $rank, Composer $composer, int $changed) {
        int i;
        ComposerKt.sourceInformation($composer, "C171@6673L701:StatsScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476547886, $changed, -1, "lnb.predict.earn.ui.screens.SearchedNumberDetailsIcy.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatsScreen.kt:171)");
            }
            Modifier modifierM672padding3ABfNKs = PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(20));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
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
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i4 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1525251873, "C174@6854L10,172@6738L257,178@7016L107,180@7165L56,181@7242L36,182@7299L57:StatsScreen.kt#td928");
                TextKt.m2697Text4IGK_g("Statistiques n°" + $stat.getNumber(), (Modifier) null, InkBlack, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196992, 0, 65498);
                Modifier modifierM674paddingVpY3zN4$default = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(12), 1, null);
                long j = TwilightIndigo;
                DividerKt.m2076HorizontalDivider9IZ8Weo(modifierM674paddingVpY3zN4$default, 0.0f, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), $composer, 390, 2);
                DetailRowIcy("Total sorties", String.valueOf($stat.getFrequency()), $composer, 6);
                DetailRowIcy("Classement", "#" + $rank, $composer, 6);
                DetailRowIcy("Retard (période)", $stat.getDelay() + " tirages", $composer, 6);
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
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i6 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1525251873, "C174@6854L10,172@6738L257,178@7016L107,180@7165L56,181@7242L36,182@7299L57:StatsScreen.kt#td928");
            TextKt.m2697Text4IGK_g("Statistiques n°" + $stat.getNumber(), (Modifier) null, InkBlack, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196992, 0, 65498);
            Modifier modifierM674paddingVpY3zN4$default2 = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(12), 1, null);
            long j2 = TwilightIndigo;
            DividerKt.m2076HorizontalDivider9IZ8Weo(modifierM674paddingVpY3zN4$default2, 0.0f, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), $composer, 390, 2);
            DetailRowIcy("Total sorties", String.valueOf($stat.getFrequency()), $composer, 6);
            DetailRowIcy("Classement", "#" + $rank, $composer, 6);
            DetailRowIcy("Retard (période)", $stat.getDelay() + " tirages", $composer, 6);
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

    static final Object SearchedNumberDetailsIcy$lambda$26$lambda$25$lambda$23(LocalDate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = it.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final void DetailRowIcy(final String label, String value, Composer $composer, final int $changed) {
        Composer $composer2;
        final String str;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer $composer3 = $composer.startRestartGroup(850225155);
        ComposerKt.sourceInformation($composer3, "C(DetailRowIcy)217@8486L380:StatsScreen.kt#td928");
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
                ComposerKt.traceEventStart(850225155, $dirty, -1, "lnb.predict.earn.ui.screens.DetailRowIcy (StatsScreen.kt:216)");
            }
            Modifier modifierM674paddingVpY3zN4$default = PaddingKt.m674paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6627constructorimpl(4), 1, null);
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
            ComposerKt.sourceInformationMarkerStart($composer3, -849200263, "C221@8674L10,221@8633L106,222@8789L10,222@8748L112:StatsScreen.kt#td928");
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium();
            long j = TwilightIndigo;
            $composer2 = $composer3;
            TextKt.m2697Text4IGK_g(label, (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.6f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium, $composer3, ($dirty & 14) | 384, 0, 65530);
            str = value;
            TextKt.m2697Text4IGK_g(str, (Modifier) null, InkBlack, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), $composer3, (($dirty >> 3) & 14) | 196992, 0, 65498);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.StatsScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatsScreenKt.DetailRowIcy$lambda$29(label, str, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
