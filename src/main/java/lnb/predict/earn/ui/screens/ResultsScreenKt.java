package lnb.predict.earn.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
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
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lnb.predict.earn.domain.model.Draw;
import lnb.predict.earn.ui.viewmodel.DrawListItem;
import lnb.predict.earn.ui.viewmodel.LotoViewModel;
import lnb.predict.earn.ui.viewmodel.MonthGroup;
import lnb.predict.earn.ui.viewmodel.YearGroup;

/* JADX INFO: compiled from: ResultsScreen.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\u001a\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0015²\u0006\u0010\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u008a\u0084\u0002"}, d2 = {"IcyBlue", "Landroidx/compose/ui/graphics/Color;", "J", "AzureMist", "TwilightIndigo", "InkBlack", "GlassWhite", "GlassBorder", "ResultsScreen", "", "viewModel", "Llnb/predict/earn/ui/viewmodel/LotoViewModel;", "(Llnb/predict/earn/ui/viewmodel/LotoViewModel;Landroidx/compose/runtime/Composer;I)V", "DrawCardCompact", "draw", "Llnb/predict/earn/domain/model/Draw;", "(Llnb/predict/earn/domain/model/Draw;Landroidx/compose/runtime/Composer;I)V", "IcyNumberBall", "number", "", "(ILandroidx/compose/runtime/Composer;I)V", "app_debug", "hierarchicalData", "", "Llnb/predict/earn/ui/viewmodel/YearGroup;"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ResultsScreenKt {
    private static final long IcyBlue = ColorKt.Color(4289317856L);
    private static final long AzureMist = ColorKt.Color(4293064179L);
    private static final long TwilightIndigo = ColorKt.Color(4281547895L);
    private static final long InkBlack = ColorKt.Color(4278197033L);
    private static final long GlassWhite = ColorKt.Color(4294967295L);
    private static final long GlassBorder = ColorKt.Color(4291945704L);

    static final Unit DrawCardCompact$lambda$16(Draw draw, int i, Composer composer, int i2) {
        DrawCardCompact(draw, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit IcyNumberBall$lambda$18(int i, int i2, Composer composer, int i3) {
        IcyNumberBall(i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    static final Unit ResultsScreen$lambda$11(LotoViewModel lotoViewModel, int i, Composer composer, int i2) {
        ResultsScreen(lotoViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ResultsScreen(final LotoViewModel viewModel, Composer $composer, final int $changed) {
        Object obj;
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        int i;
        Composer composer;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer3 = $composer.startRestartGroup(-312660350);
        ComposerKt.sourceInformation($composer3, "C(ResultsScreen)34@1360L16:ResultsScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 3) == 2 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-312660350, $dirty2, -1, "lnb.predict.earn.ui.screens.ResultsScreen (ResultsScreen.kt:33)");
            }
            final State hierarchicalData$delegate = SnapshotStateKt.collectAsState(viewModel.getHierarchicalDraws(), null, $composer3, 0, 1);
            if (ResultsScreen$lambda$0(hierarchicalData$delegate).isEmpty()) {
                $composer3.startReplaceGroup(1319795269);
                ComposerKt.sourceInformation($composer3, "37@1424L299");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i2 = ((((54 << 3) & 112) << 6) & 896) | 6;
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
                    i = 54;
                    composer = $composer3;
                } else {
                    i = 54;
                    composer = $composer3;
                    if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i4 = ((i >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -925895557, "C40@1619L10,38@1514L199:ResultsScreen.kt#td928");
                    TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
                    long j = TwilightIndigo;
                    TextKt.m2697Text4IGK_g("Aucun résultat pour cette période.", (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium, composer2, 390, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer3.endReplaceGroup();
                    $composer2 = $composer3;
                }
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i2 >> 6) & 14;
                Composer composer3 = composer;
                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i6 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer3, -925895557, "C40@1619L10,38@1514L199:ResultsScreen.kt#td928");
                TextStyle bodyMedium2 = MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium();
                long j2 = TwilightIndigo;
                TextKt.m2697Text4IGK_g("Aucun résultat pour cette période.", (Modifier) null, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium2, composer3, 390, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer3.endReplaceGroup();
                $composer2 = $composer3;
            } else {
                $composer3.startReplaceGroup(1320194735);
                ComposerKt.sourceInformation($composer3, "49@1956L2702,45@1745L2913");
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues paddingValuesM666PaddingValuesYgX7TsA = PaddingKt.m666PaddingValuesYgX7TsA(Dp.m6627constructorimpl(12), Dp.m6627constructorimpl(8));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(4));
                ComposerKt.sourceInformationMarkerStart($composer3, 181141104, "CC(remember):ResultsScreen.kt#9igjgp");
                boolean zChanged = $composer3.changed(hierarchicalData$delegate);
                Object objRememberedValue = $composer3.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function1() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ResultsScreenKt.ResultsScreen$lambda$10$lambda$9(hierarchicalData$delegate, (LazyListScope) obj2);
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, paddingValuesM666PaddingValuesYgX7TsA, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer3, 24966, 234);
                $composer2 = $composer3;
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ResultsScreenKt.ResultsScreen$lambda$11(viewModel, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<YearGroup> ResultsScreen$lambda$0(State<? extends List<YearGroup>> state) {
        return (List) state.getValue();
    }

    static final Unit ResultsScreen$lambda$10$lambda$9(State $hierarchicalData$delegate, LazyListScope $this$LazyColumn) {
        LazyListScope LazyColumn = $this$LazyColumn;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        Iterable<YearGroup> iterableResultsScreen$lambda$0 = ResultsScreen$lambda$0($hierarchicalData$delegate);
        for (final YearGroup yearGroup : iterableResultsScreen$lambda$0) {
            boolean z = true;
            LazyListScope.item$default(LazyColumn, "year_" + yearGroup.getYear(), null, ComposableLambdaKt.composableLambdaInstance(-1010060353, true, new Function3() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ResultsScreenKt.ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$2(yearGroup, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
            for (final MonthGroup monthGroup : yearGroup.getMonths()) {
                LazyListScope.stickyHeader$default($this$LazyColumn, monthGroup.getKey(), null, ComposableLambdaKt.composableLambdaInstance(198919046, z, new Function3() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ResultsScreenKt.ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$7$lambda$3(monthGroup, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 2, null);
                final List<DrawListItem> items = monthGroup.getItems();
                final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ResultsScreenKt.ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$7$lambda$4(monthGroup, (DrawListItem) obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ResultsScreenKt.ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$7$lambda$5((DrawListItem) obj);
                    }
                };
                $this$LazyColumn.items(items.size(), new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$7$$inlined$items$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int index) {
                        return function1.invoke(items.get(index));
                    }
                }, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$7$$inlined$items$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int index) {
                        return function2.invoke(items.get(index));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$7$$inlined$items$3
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
                        DrawListItem drawListItem = (DrawListItem) items.get(it);
                        Composer composer = $composer;
                        composer.startReplaceGroup(-674378085);
                        ComposerKt.sourceInformation(composer, "C:ResultsScreen.kt#td928");
                        if (drawListItem instanceof DrawListItem.DayHeader) {
                            composer.startReplaceGroup(-674315218);
                            ComposerKt.sourceInformation(composer, "94@4083L10,92@3965L426");
                            String date = ((DrawListItem.DayHeader) drawListItem).getDate();
                            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium();
                            FontWeight bold = FontWeight.INSTANCE.getBold();
                            long j = ResultsScreenKt.TwilightIndigo;
                            TextKt.m2697Text4IGK_g(date, PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6627constructorimpl(12), Dp.m6627constructorimpl(8), 0.0f, Dp.m6627constructorimpl(4), 4, null), Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelMedium, composer, 197040, 0, 65496);
                            composer = composer;
                            composer.endReplaceGroup();
                        } else {
                            if (!(drawListItem instanceof DrawListItem.DrawItem)) {
                                composer.startReplaceGroup(-160301464);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-673784994);
                            ComposerKt.sourceInformation(composer, "101@4512L26");
                            ResultsScreenKt.DrawCardCompact(((DrawListItem.DrawItem) drawListItem).getDraw(), composer, 0);
                            composer.endReplaceGroup();
                        }
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                z = true;
                iterableResultsScreen$lambda$0 = iterableResultsScreen$lambda$0;
            }
            LazyColumn = $this$LazyColumn;
        }
        return Unit.INSTANCE;
    }

    static final Unit ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$2(YearGroup $yearGroup, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C54@2184L10,52@2085L343:ResultsScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1010060353, $changed, -1, "lnb.predict.earn.ui.screens.ResultsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ResultsScreen.kt:52)");
            }
            String year = $yearGroup.getYear();
            TextStyle headlineSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall();
            FontWeight black = FontWeight.INSTANCE.getBlack();
            TextKt.m2697Text4IGK_g(year, PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6627constructorimpl(4), Dp.m6627constructorimpl(16), 0.0f, Dp.m6627constructorimpl(8), 4, null), TwilightIndigo, 0L, (FontStyle) null, black, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, headlineSmall, $composer, 196992, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$7$lambda$3(MonthGroup $monthGroup, LazyItemScope stickyHeader, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
        ComposerKt.sourceInformation($composer, "C65@2694L10,63@2586L514:ResultsScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(198919046, $changed, -1, "lnb.predict.earn.ui.screens.ResultsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ResultsScreen.kt:63)");
            }
            String name = $monthGroup.getName();
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium();
            FontWeight bold = FontWeight.INSTANCE.getBold();
            long j = TwilightIndigo;
            TextKt.m2697Text4IGK_g(name, PaddingKt.m673paddingVpY3zN4(BackgroundKt.m227backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), AzureMist, null, 2, null), Dp.m6627constructorimpl(8), Dp.m6627constructorimpl(8)), Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.7f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, titleMedium, $composer, 196992, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Object ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$7$lambda$4(MonthGroup $monthGroup, DrawListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof DrawListItem.DayHeader) {
            return "day_" + $monthGroup.getKey() + "_" + ((DrawListItem.DayHeader) item).getDate();
        }
        if (!(item instanceof DrawListItem.DrawItem)) {
            throw new NoWhenBranchMatchedException();
        }
        return "draw_" + ((DrawListItem.DrawItem) item).getDraw().getId();
    }

    static final Object ResultsScreen$lambda$10$lambda$9$lambda$8$lambda$7$lambda$5(DrawListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof DrawListItem.DayHeader) {
            return "header";
        }
        if (item instanceof DrawListItem.DrawItem) {
            return "draw";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void DrawCardCompact(final Draw draw, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(draw, "draw");
        Composer $composer2 = $composer.startRestartGroup(-810949111);
        ComposerKt.sourceInformation($composer2, "C(DrawCardCompact)120@4969L957,113@4718L1208:ResultsScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(draw) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-810949111, $dirty, -1, "lnb.predict.earn.ui.screens.DrawCardCompact (ResultsScreen.kt:112)");
            }
            SurfaceKt.m2547SurfaceT9BRK9s(BorderKt.m238borderxT4_qwU(ClipKt.clip(PaddingKt.m674paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6627constructorimpl(2), 1, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(12))), Dp.m6627constructorimpl((float) 0.5d), GlassBorder, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(12))), null, GlassWhite, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(103374692, true, new Function2() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResultsScreenKt.DrawCardCompact$lambda$15(draw, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 12583296, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResultsScreenKt.DrawCardCompact$lambda$16(draw, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit DrawCardCompact$lambda$15(Draw $draw, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function1;
        Function0<ComposeUiNode> function2;
        ComposerKt.sourceInformation($composer, "C121@4979L941:ResultsScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(103374692, $changed, -1, "lnb.predict.earn.ui.screens.DrawCardCompact.<anonymous> (ResultsScreen.kt:121)");
            }
            Modifier modifierM673paddingVpY3zN4 = PaddingKt.m673paddingVpY3zN4(Modifier.INSTANCE, Dp.m6627constructorimpl(12), Dp.m6627constructorimpl(10));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM673paddingVpY3zN4);
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
            int i3 = ((438 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1064771899, "C126@5208L498,140@5732L178:ResultsScreen.kt#td928");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1266004114, "C129@5355L10,127@5265L218,135@5590L10,133@5500L192:ResultsScreen.kt#td928");
            TextKt.m2697Text4IGK_g($draw.getDrawName(), (Modifier) null, InkBlack, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 196992, 0, 65498);
            String drawType = $draw.getDrawType();
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            long j = TwilightIndigo;
            TextKt.m2697Text4IGK_g(drawType, (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelSmall, $composer, 384, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Arrangement.Horizontal horizontalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM552spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i9 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2057925261, "C:ResultsScreen.kt#td928");
            $composer.startReplaceGroup(343479350);
            ComposerKt.sourceInformation($composer, "*142@5857L21");
            for (Iterator<Integer> it = $draw.getNumbers().iterator(); it.hasNext(); it = it) {
                IcyNumberBall(it.next().intValue(), $composer, 0);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
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

    public static final void IcyNumberBall(final int number, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        Composer $composer3 = $composer.startRestartGroup(99641940);
        ComposerKt.sourceInformation($composer3, "C(IcyNumberBall)151@5979L442:ResultsScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(number) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(99641940, $dirty, -1, "lnb.predict.earn.ui.screens.IcyNumberBall (ResultsScreen.kt:150)");
            }
            Modifier modifierM227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(ClipKt.clip(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(30)), RoundedCornerShapeKt.getCircleShape()), IcyBlue, null, 2, null);
            float fM6627constructorimpl = Dp.m6627constructorimpl(1);
            long jM4200getWhite0d7_KjU = Color.INSTANCE.m4200getWhite0d7_KjU();
            Modifier modifierM238borderxT4_qwU = BorderKt.m238borderxT4_qwU(modifierM227backgroundbw27NRU$default, fM6627constructorimpl, Color.m4161copywmQWz5c(jM4200getWhite0d7_KjU, (14 & 1) != 0 ? Color.m4165getAlphaimpl(jM4200getWhite0d7_KjU) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(jM4200getWhite0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(jM4200getWhite0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(jM4200getWhite0d7_KjU) : 0.0f), RoundedCornerShapeKt.getCircleShape());
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM238borderxT4_qwU);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((48 << 3) & 112) << 6) & 896) | 6;
            $composer2 = $composer3;
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
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -896533633, "C159@6233L182:ResultsScreen.kt#td928");
            TextKt.m2697Text4IGK_g(StringsKt.padStart(String.valueOf(number), 2, '0'), (Modifier) null, TwilightIndigo, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200064, 0, 131026);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.ResultsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResultsScreenKt.IcyNumberBall$lambda$18(number, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
