package lnb.predict.earn.ui.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisScreen.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ComposableSingletons$AnalysisScreenKt {
    public static final ComposableSingletons$AnalysisScreenKt INSTANCE = new ComposableSingletons$AnalysisScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$486716497 = ComposableLambdaKt.composableLambdaInstance(486716497, false, new Function2() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AnalysisScreenKt.lambda_486716497$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-864459691, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f100lambda$864459691 = ComposableLambdaKt.composableLambdaInstance(-864459691, false, new Function3() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AnalysisScreenKt.lambda__864459691$lambda$1((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$400328470 = ComposableLambdaKt.composableLambdaInstance(400328470, false, new Function3() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AnalysisScreenKt.lambda_400328470$lambda$3((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1284024399 = ComposableLambdaKt.composableLambdaInstance(1284024399, false, new Function3() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AnalysisScreenKt.lambda_1284024399$lambda$5((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1134512173 = ComposableLambdaKt.composableLambdaInstance(1134512173, false, new Function3() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AnalysisScreenKt.lambda_1134512173$lambda$7((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-77873875, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f99lambda$77873875 = ComposableLambdaKt.composableLambdaInstance(-77873875, false, new Function3() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AnalysisScreenKt.lambda__77873875$lambda$9((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1621800080 = ComposableLambdaKt.composableLambdaInstance(1621800080, false, new Function3() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AnalysisScreenKt.lambda_1621800080$lambda$10((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$853719324 = ComposableLambdaKt.composableLambdaInstance(853719324, false, new Function3() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AnalysisScreenKt.lambda_853719324$lambda$11((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1189628652 = ComposableLambdaKt.composableLambdaInstance(1189628652, false, new Function3() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AnalysisScreenKt.lambda_1189628652$lambda$12((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1974526500 = ComposableLambdaKt.composableLambdaInstance(1974526500, false, new Function3() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AnalysisScreenKt.lambda_1974526500$lambda$13((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-77873875$app_debug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m8644getLambda$77873875$app_debug() {
        return f99lambda$77873875;
    }

    /* JADX INFO: renamed from: getLambda$-864459691$app_debug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m8645getLambda$864459691$app_debug() {
        return f100lambda$864459691;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1134512173$app_debug() {
        return lambda$1134512173;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1189628652$app_debug() {
        return lambda$1189628652;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1284024399$app_debug() {
        return lambda$1284024399;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1621800080$app_debug() {
        return lambda$1621800080;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1974526500$app_debug() {
        return lambda$1974526500;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$400328470$app_debug() {
        return lambda$400328470;
    }

    public final Function2<Composer, Integer, Unit> getLambda$486716497$app_debug() {
        return lambda$486716497;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$853719324$app_debug() {
        return lambda$853719324;
    }

    static final Unit lambda_486716497$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:AnalysisScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(486716497, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt.lambda$486716497.<anonymous> (AnalysisScreen.kt:87)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__864459691$lambda$1(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C151@7145L123:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-864459691, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt.lambda$-864459691.<anonymous> (AnalysisScreen.kt:151)");
            }
            TextKt.m2697Text4IGK_g("HISTORIQUE DES TESTS", PaddingKt.m676paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6627constructorimpl(8), 0.0f, 0.0f, 13, null), AnalysisScreenKt.TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 197046, 0, 131032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_400328470$lambda$3(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C182@8859L571:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(400328470, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt.lambda$400328470.<anonymous> (AnalysisScreen.kt:182)");
            }
            Modifier modifierM672padding3ABfNKs = PaddingKt.m672padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6627constructorimpl(8));
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM672padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((54 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 249478910, "C183@8981L74,184@9072L75,185@9164L73,186@9254L73,187@9344L72:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g("N°", SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(30)), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196662, 0, 131036);
            TextKt.m2697Text4IGK_g("Total", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131036);
            TextKt.m2697Text4IGK_g("30j", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131036);
            TextKt.m2697Text4IGK_g("90j", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131036);
            TextKt.m2697Text4IGK_g("An", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131036);
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

    static final Unit lambda_1284024399$lambda$5(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C209@10209L435:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1284024399, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt.lambda$1284024399.<anonymous> (AnalysisScreen.kt:209)");
            }
            Modifier modifierM672padding3ABfNKs = PaddingKt.m672padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6627constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
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
            int i3 = ((6 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 911355579, "C210@10281L74,211@10372L76,212@10465L75,213@10557L73:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g("N°", SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(50)), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196662, 0, 131036);
            TextKt.m2697Text4IGK_g("Actuel", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131036);
            TextKt.m2697Text4IGK_g("Moyen", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131036);
            TextKt.m2697Text4IGK_g("Max", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131036);
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

    static final Unit lambda_1134512173$lambda$7(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C233@11416L143:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1134512173, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt.lambda$1134512173.<anonymous> (AnalysisScreen.kt:233)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
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
            int i3 = ((0 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -666663445, "C233@11422L33,233@11457L32,233@11491L32,233@11525L32:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g("N°", SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(50)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 54, 0, 131068);
            TextKt.m2697Text4IGK_g("T+1", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131068);
            TextKt.m2697Text4IGK_g("T+2", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131068);
            TextKt.m2697Text4IGK_g("T+3", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131068);
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

    static final Unit lambda__77873875$lambda$9(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C296@14004L149:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-77873875, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt.lambda$-77873875.<anonymous> (AnalysisScreen.kt:296)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
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
            int i3 = ((0 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1616633765, "C296@14010L33,296@14045L34,296@14081L34,296@14117L34:AnalysisScreen.kt#td928");
            TextKt.m2697Text4IGK_g("N°", SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(50)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 54, 0, 131068);
            TextKt.m2697Text4IGK_g("11→14", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131068);
            TextKt.m2697Text4IGK_g("14→18", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131068);
            TextKt.m2697Text4IGK_g("18→21", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131068);
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

    static final Unit lambda_1621800080$lambda$10(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C473@22879L50:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1621800080, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt.lambda$1621800080.<anonymous> (AnalysisScreen.kt:473)");
            }
            TextKt.m2697Text4IGK_g("ENREGISTRER", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_853719324$lambda$11(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C480@23140L108,481@23269L142:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(853719324, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt.lambda$853719324.<anonymous> (AnalysisScreen.kt:480)");
            }
            TextKt.m2697Text4IGK_g("PRÉDICTIONS BASÉES SUR L'IA", (Modifier) null, AnalysisScreenKt.TwilightIndigo, TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
            long sp = TextUnitKt.getSp(11);
            long j = AnalysisScreenKt.TwilightIndigo;
            TextKt.m2697Text4IGK_g("Algorithme auto-adaptatif : les poids évoluent selon les résultats réels.", (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.6f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1189628652$lambda$12(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C502@24315L102:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1189628652, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt.lambda$1189628652.<anonymous> (AnalysisScreen.kt:502)");
            }
            TextKt.m2697Text4IGK_g("PERFORMANCE DU MOTEUR", (Modifier) null, AnalysisScreenKt.TwilightIndigo, TextUnitKt.getSp(22), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1974526500$lambda$13(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C530@25499L83:AnalysisScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1974526500, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$AnalysisScreenKt.lambda$1974526500.<anonymous> (AnalysisScreen.kt:530)");
            }
            TextKt.m2697Text4IGK_g("DERNIÈRES ÉVALUATIONS", (Modifier) null, AnalysisScreenKt.TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196998, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
