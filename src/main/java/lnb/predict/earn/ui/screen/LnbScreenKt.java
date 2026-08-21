package lnb.predict.earn.ui.screen;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
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
import androidx.profileinstaller.ProfileVerifier;
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
import lnb.predict.earn.data.model.FlatDraw;
import lnb.predict.earn.ui.viewmodel.LnbUiState;
import lnb.predict.earn.ui.viewmodel.LnbViewModel;

/* JADX INFO: compiled from: LnbScreen.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t\u001a\u0015\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"LnbScreen", "", "viewModel", "Llnb/predict/earn/ui/viewmodel/LnbViewModel;", "(Llnb/predict/earn/ui/viewmodel/LnbViewModel;Landroidx/compose/runtime/Composer;I)V", "LotoList", "draws", "", "Llnb/predict/earn/data/model/FlatDraw;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "LotoCard", "draw", "(Llnb/predict/earn/data/model/FlatDraw;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Llnb/predict/earn/ui/viewmodel/LnbUiState;"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LnbScreenKt {
    static final Unit LnbScreen$lambda$3(LnbViewModel lnbViewModel, int i, Composer composer, int i2) {
        LnbScreen(lnbViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit LotoCard$lambda$10(FlatDraw flatDraw, int i, Composer composer, int i2) {
        LotoCard(flatDraw, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit LotoList$lambda$7(List list, int i, Composer composer, int i2) {
        LotoList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LnbScreen(final LnbViewModel viewModel, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer2 = $composer.startRestartGroup(1745793105);
        ComposerKt.sourceInformation($composer2, "C(LnbScreen)22@850L16,34@1248L823,24@872L1199:LnbScreen.kt#drvelv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1745793105, $dirty, -1, "lnb.predict.earn.ui.screen.LnbScreen (LnbScreen.kt:21)");
            }
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer2, 0, 1);
            ScaffoldKt.m2412ScaffoldTvnljyQ(null, ComposableSingletons$LnbScreenKt.INSTANCE.m8643getLambda$2083284211$app_debug(), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1326781666, true, new Function3() { // from class: lnb.predict.earn.ui.screen.LnbScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LnbScreenKt.LnbScreen$lambda$2(uiState$delegate, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screen.LnbScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LnbScreenKt.LnbScreen$lambda$3(viewModel, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final LnbUiState LnbScreen$lambda$0(State<? extends LnbUiState> state) {
        return (LnbUiState) state.getValue();
    }

    static final Unit LnbScreen$lambda$2(State $uiState$delegate, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "C35@1275L790:LnbScreen.kt#drvelv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if (($dirty & 19) == 18 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1326781666, $dirty, -1, "lnb.predict.earn.ui.screen.LnbScreen.<anonymous> (LnbScreen.kt:35)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
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
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            int i3 = ((0 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            Composer composer = $composer;
            ComposerKt.sourceInformationMarkerStart(composer, -742212837, "C:LnbScreen.kt#drvelv");
            LnbUiState lnbUiStateLnbScreen$lambda$0 = LnbScreen$lambda$0($uiState$delegate);
            if (lnbUiStateLnbScreen$lambda$0 instanceof LnbUiState.Loading) {
                composer.startReplaceGroup(-742173716);
                ComposerKt.sourceInformation(composer, "38@1431L70");
                ProgressIndicatorKt.m2371CircularProgressIndicatorLxG7B9w(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0L, 0.0f, 0L, 0, composer, 0, 30);
                composer.endReplaceGroup();
            } else if (lnbUiStateLnbScreen$lambda$0 instanceof LnbUiState.Success) {
                composer.startReplaceGroup(-742022467);
                ComposerKt.sourceInformation(composer, "42@1653L15");
                LnbUiState lnbUiStateLnbScreen$lambda$1 = LnbScreen$lambda$0($uiState$delegate);
                Intrinsics.checkNotNull(lnbUiStateLnbScreen$lambda$1, "null cannot be cast to non-null type lnb.predict.earn.ui.viewmodel.LnbUiState.Success");
                LotoList(((LnbUiState.Success) lnbUiStateLnbScreen$lambda$1).getDraws(), composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(lnbUiStateLnbScreen$lambda$0 instanceof LnbUiState.Error)) {
                    composer.startReplaceGroup(1777172968);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-741852897);
                ComposerKt.sourceInformation(composer, "46@1820L203");
                LnbUiState lnbUiStateLnbScreen$lambda$2 = LnbScreen$lambda$0($uiState$delegate);
                Intrinsics.checkNotNull(lnbUiStateLnbScreen$lambda$2, "null cannot be cast to non-null type lnb.predict.earn.ui.viewmodel.LnbUiState.Error");
                composer = composer;
                TextKt.m2697Text4IGK_g("Error: " + ((LnbUiState.Error) lnbUiStateLnbScreen$lambda$2).getMessage(), PaddingKt.m672padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m6627constructorimpl(16)), Color.INSTANCE.m4197getRed0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 384, 0, 131064);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
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

    public static final void LotoList(final List<FlatDraw> draws, Composer $composer, final int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(draws, "draws");
        Composer $composer2 = $composer.startRestartGroup(1282461375);
        ComposerKt.sourceInformation($composer2, "C(LotoList)63@2295L75,59@2129L241:LnbScreen.kt#drvelv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(draws) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1282461375, $dirty, -1, "lnb.predict.earn.ui.screen.LotoList (LnbScreen.kt:58)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesM665PaddingValues0680j_4 = PaddingKt.m665PaddingValues0680j_4(Dp.m6627constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer2, -210225462, "CC(remember):LnbScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(draws);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: lnb.predict.earn.ui.screen.LnbScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LnbScreenKt.LotoList$lambda$6$lambda$5(draws, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM665PaddingValues0680j_4, false, horizontalOrVerticalM552spacedBy0680j_4, null, null, false, (Function1) obj, $composer2, 24966, 234);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screen.LnbScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LnbScreenKt.LotoList$lambda$7(draws, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit LotoList$lambda$6$lambda$5(final List $draws, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: lnb.predict.earn.ui.screen.LnbScreenKt$LotoList$lambda$6$lambda$5$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((FlatDraw) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(FlatDraw flatDraw) {
                return null;
            }
        };
        LazyColumn.items($draws.size(), null, new Function1<Integer, Object>() { // from class: lnb.predict.earn.ui.screen.LnbScreenKt$LotoList$lambda$6$lambda$5$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($draws.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: lnb.predict.earn.ui.screen.LnbScreenKt$LotoList$lambda$6$lambda$5$$inlined$items$default$4
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
                FlatDraw flatDraw = (FlatDraw) $draws.get(it);
                $composer.startReplaceGroup(-814985229);
                ComposerKt.sourceInformation($composer, "C*65@2340L14:LnbScreen.kt#drvelv");
                LnbScreenKt.LotoCard(flatDraw, $composer, (($dirty & 14) >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void LotoCard(final FlatDraw draw, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(draw, "draw");
        Composer $composer3 = $composer.startRestartGroup(-1594882676);
        ComposerKt.sourceInformation($composer3, "C(LotoCard)74@2504L38,75@2549L815,72@2421L943:LnbScreen.kt#drvelv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(draw) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594882676, $dirty, -1, "lnb.predict.earn.ui.screen.LotoCard (LnbScreen.kt:71)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m1834cardElevationaqJV_2Y(Dp.m6627constructorimpl(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(881682558, true, new Function3() { // from class: lnb.predict.earn.ui.screen.LnbScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LnbScreenKt.LotoCard$lambda$9(draw, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 196614, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screen.LnbScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LnbScreenKt.LotoCard$lambda$10(draw, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit LotoCard$lambda$9(FlatDraw $draw, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C76@2559L799:LnbScreen.kt#drvelv");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(881682558, $changed, -1, "lnb.predict.earn.ui.screen.LotoCard.<anonymous> (LnbScreen.kt:76)");
            }
            Modifier modifierM672padding3ABfNKs = PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM672padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1174746253, "C79@2694L10,80@2756L11,77@2616L175,82@2804L40,85@2939L10,83@2857L163,88@3033L40,91@3189L10,89@3086L262:LnbScreen.kt#drvelv");
            TextKt.m2697Text4IGK_g($draw.getDate(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSecondary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(4)), $composer, 6);
            TextKt.m2697Text4IGK_g($draw.getDrawName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(8)), $composer, 6);
            TextKt.m2697Text4IGK_g("Gagnants: " + $draw.getWinningNumbers(), (Modifier) null, ColorKt.Color(4281236786L), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 200064, 0, 65490);
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
}
