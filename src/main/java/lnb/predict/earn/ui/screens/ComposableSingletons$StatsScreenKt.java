package lnb.predict.earn.ui.screens;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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

/* JADX INFO: compiled from: StatsScreen.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ComposableSingletons$StatsScreenKt {
    public static final ComposableSingletons$StatsScreenKt INSTANCE = new ComposableSingletons$StatsScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$982080219 = ComposableLambdaKt.composableLambdaInstance(982080219, false, new Function2() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$StatsScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$StatsScreenKt.lambda_982080219$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1822318372, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f106lambda$1822318372 = ComposableLambdaKt.composableLambdaInstance(-1822318372, false, new Function2() { // from class: lnb.predict.earn.ui.screens.ComposableSingletons$StatsScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$StatsScreenKt.lambda__1822318372$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1822318372$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8651getLambda$1822318372$app_debug() {
        return f106lambda$1822318372;
    }

    public final Function2<Composer, Integer, Unit> getLambda$982080219$app_debug() {
        return lambda$982080219;
    }

    static final Unit lambda_982080219$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C59@2414L71:StatsScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(982080219, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$StatsScreenKt.lambda$982080219.<anonymous> (StatsScreen.kt:59)");
            }
            long j = StatsScreenKt.TwilightIndigo;
            TextKt.m2697Text4IGK_g("Numéro à analyser...", (Modifier) null, Color.m4161copywmQWz5c(j, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j) : 0.5f, (14 & 2) != 0 ? Color.m4169getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1822318372$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C60@2521L76:StatsScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1822318372, $changed, -1, "lnb.predict.earn.ui.screens.ComposableSingletons$StatsScreenKt.lambda$-1822318372.<anonymous> (StatsScreen.kt:60)");
            }
            IconKt.m2154Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, StatsScreenKt.TwilightIndigo, $composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
