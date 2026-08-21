package lnb.predict.earn;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lnb.predict.earn.ui.screens.MainScreenKt;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ComposableSingletons$MainActivityKt {
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();
    private static Function2<Composer, Integer, Unit> lambda$189715264 = ComposableLambdaKt.composableLambdaInstance(189715264, false, new Function2() { // from class: lnb.predict.earn.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda_189715264$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$867521211 = ComposableLambdaKt.composableLambdaInstance(867521211, false, new Function2() { // from class: lnb.predict.earn.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda_867521211$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-200125977, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f97lambda$200125977 = ComposableLambdaKt.composableLambdaInstance(-200125977, false, new Function2() { // from class: lnb.predict.earn.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda__200125977$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-200125977$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8640getLambda$200125977$app_debug() {
        return f97lambda$200125977;
    }

    public final Function2<Composer, Integer, Unit> getLambda$189715264$app_debug() {
        return lambda$189715264;
    }

    public final Function2<Composer, Integer, Unit> getLambda$867521211$app_debug() {
        return lambda$867521211;
    }

    static final Unit lambda__200125977$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C23@753L245:MainActivity.kt#6hunmt");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-200125977, $changed, -1, "lnb.predict.earn.ComposableSingletons$MainActivityKt.lambda$-200125977.<anonymous> (MainActivity.kt:23)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, lambda$867521211, $composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_867521211$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C26@891L11,24@785L199:MainActivity.kt#6hunmt");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(867521211, $changed, -1, "lnb.predict.earn.ComposableSingletons$MainActivityKt.lambda$867521211.<anonymous> (MainActivity.kt:24)");
            }
            SurfaceKt.m2547SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, lambda$189715264, $composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_189715264$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C28@954L12:MainActivity.kt#6hunmt");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(189715264, $changed, -1, "lnb.predict.earn.ComposableSingletons$MainActivityKt.lambda$189715264.<anonymous> (MainActivity.kt:28)");
            }
            MainScreenKt.MainScreen(null, $composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
