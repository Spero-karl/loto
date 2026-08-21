package lnb.predict.earn.ui.screen;

import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: LnbScreen.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ComposableSingletons$LnbScreenKt {
    public static final ComposableSingletons$LnbScreenKt INSTANCE = new ComposableSingletons$LnbScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1772969425 = ComposableLambdaKt.composableLambdaInstance(1772969425, false, new Function2() { // from class: lnb.predict.earn.ui.screen.ComposableSingletons$LnbScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$LnbScreenKt.lambda_1772969425$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2083284211, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f98lambda$2083284211 = ComposableLambdaKt.composableLambdaInstance(-2083284211, false, new Function2() { // from class: lnb.predict.earn.ui.screen.ComposableSingletons$LnbScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$LnbScreenKt.lambda__2083284211$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-2083284211$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8643getLambda$2083284211$app_debug() {
        return f98lambda$2083284211;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1772969425$app_debug() {
        return lambda$1772969425;
    }

    static final Unit lambda__2083284211$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C29@1095L11,30@1179L11,28@1027L190,26@913L318:LnbScreen.kt#drvelv");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2083284211, $changed, -1, "lnb.predict.earn.ui.screen.ComposableSingletons$LnbScreenKt.lambda$-2083284211.<anonymous> (LnbScreen.kt:26)");
            }
            AppBarKt.m1778TopAppBarGHTll3U(lambda$1772969425, null, null, null, 0.0f, null, TopAppBarDefaults.INSTANCE.m2868topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, $composer, TopAppBarDefaults.$stable << 15, 22), null, $composer, 6, 190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1772969425$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C27@950L30:LnbScreen.kt#drvelv");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772969425, $changed, -1, "lnb.predict.earn.ui.screen.ComposableSingletons$LnbScreenKt.lambda$1772969425.<anonymous> (LnbScreen.kt:27)");
            }
            TextKt.m2697Text4IGK_g("LNB Loto Bénin Results", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
