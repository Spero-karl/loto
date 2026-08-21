package lnb.predict.earn.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.MenuKt;
import androidx.compose.material.icons.filled.RefreshKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.NavigationDrawerItemDefaults;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import lnb.predict.earn.ui.viewmodel.LotoViewModel;

/* JADX INFO: compiled from: MainScreen.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a5\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\fX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002²\u0006\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018X\u008a\u0084\u0002²\u0006\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018X\u008a\u0084\u0002²\u0006\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"MainScreen", "", "viewModel", "Llnb/predict/earn/ui/viewmodel/LotoViewModel;", "(Llnb/predict/earn/ui/viewmodel/LotoViewModel;Landroidx/compose/runtime/Composer;II)V", "ResultsFilterBar", "(Llnb/predict/earn/ui/viewmodel/LotoViewModel;Landroidx/compose/runtime/Composer;I)V", "FilterChipCompact", "label", "", "value", "enabled", "", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_debug", "currentScreen", "isSyncing", "selectedYear", "", "selectedMonth", "selectedType", "years", "", "months", "drawTypes", "showYearMenu", "showMonthMenu", "showTypeMenu"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MainScreenKt {
    static final Unit FilterChipCompact$lambda$82(String str, String str2, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        FilterChipCompact(str, str2, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$23(LotoViewModel lotoViewModel, int i, int i2, Composer composer, int i3) {
        MainScreen(lotoViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$77(LotoViewModel lotoViewModel, int i, Composer composer, int i2) {
        ResultsFilterBar(lotoViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:45:0x012b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0154  */
    /* JADX WARN: Code duplicated, block: B:49:0x0163  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d4  */
    public static final void MainScreen(LotoViewModel viewModel, Composer $composer, final int $changed, final int i) {
        final LotoViewModel viewModel2;
        CreationExtras defaultViewModelCreationExtras;
        int $dirty;
        final LotoViewModel viewModel3;
        Object objRememberedValue;
        Object compositionScopedCoroutineScopeCanceller;
        Object objRememberedValue2;
        Object objMutableStateOf$default;
        int i2;
        Composer $composer2 = $composer.startRestartGroup(-393883324);
        ComposerKt.sourceInformation($composer2, "C(MainScreen)28@1184L54,29@1255L24,30@1305L40,39@1578L2103,84@3688L2770,37@1496L4962:MainScreen.kt#td928");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            if ((i & 1) == 0) {
                viewModel2 = viewModel;
                if ($composer2.changedInstance(viewModel2)) {
                    i2 = 4;
                }
                $dirty2 |= i2;
            } else {
                viewModel2 = viewModel;
            }
            i2 = 2;
            $dirty2 |= i2;
        } else {
            viewModel2 = viewModel;
        }
        if (($dirty2 & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "27@1143L15");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 1) != 0) {
                    $dirty2 &= -15;
                }
            } else {
                if ((i & 1) != 0) {
                    $composer2.startReplaceableGroup(1890788296);
                    ComposerKt.sourceInformation($composer2, "CC(hiltViewModel)P(1)*45@1969L7,50@2112L47,51@2171L54:HiltViewModel.kt#9mcars");
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer2, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, $composer2, 0 & 14);
                    int i3 = (0 & 14) | (0 & 112);
                    $composer2.startReplaceableGroup(1729797275);
                    ComposerKt.sourceInformation($composer2, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel4 = ViewModelKt.viewModel((Class<ViewModel>) LotoViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, $composer2, ((i3 << 3) & 896) | 36936, 0);
                    $composer2.endReplaceableGroup();
                    $composer2.endReplaceableGroup();
                    $dirty = $dirty2 & (-15);
                    viewModel3 = (LotoViewModel) viewModel4;
                }
                $composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-393883324, $dirty, -1, "lnb.predict.earn.ui.screens.MainScreen (MainScreen.kt:27)");
                }
                final DrawerState drawerState = NavigationDrawerKt.rememberDrawerState(DrawerValue.Closed, null, $composer2, 6, 2);
                ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart($composer2, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = $composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
                    $composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                } else {
                    compositionScopedCoroutineScopeCanceller = objRememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                final CoroutineScope scope = ((CompositionScopedCoroutineScopeCanceller) compositionScopedCoroutineScopeCanceller).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -564744084, "CC(remember):MainScreen.kt#9igjgp");
                objRememberedValue2 = $composer2.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Résultats", null, 2, null);
                    $composer2.updateRememberedValue(objMutableStateOf$default);
                } else {
                    objMutableStateOf$default = objRememberedValue2;
                }
                final MutableState currentScreen$delegate = (MutableState) objMutableStateOf$default;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                final long AzureMist = ColorKt.Color(4293064179L);
                final long IcyBlue = ColorKt.Color(4289317856L);
                final long TwilightIndigo = ColorKt.Color(4281547895L);
                NavigationDrawerKt.m2289ModalNavigationDrawerFHprtrg(ComposableLambdaKt.rememberComposableLambda(-1981282083, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MainScreenKt.MainScreen$lambda$10(AzureMist, TwilightIndigo, scope, drawerState, currentScreen$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, drawerState, false, 0L, ComposableLambdaKt.rememberComposableLambda(189096674, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MainScreenKt.MainScreen$lambda$22(AzureMist, IcyBlue, TwilightIndigo, scope, drawerState, viewModel3, currentScreen$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), $composer2, 196614, 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                viewModel2 = viewModel3;
            }
            $dirty = $dirty2;
            viewModel3 = viewModel2;
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-393883324, $dirty, -1, "lnb.predict.earn.ui.screens.MainScreen (MainScreen.kt:27)");
            }
            final DrawerState drawerState2 = NavigationDrawerKt.rememberDrawerState(DrawerValue.Closed, null, $composer2, 6, 2);
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, -954367824, "CC(remember):Effects.kt#9igjgp");
            objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
                $composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            } else {
                compositionScopedCoroutineScopeCanceller = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final CoroutineScope scope2 = ((CompositionScopedCoroutineScopeCanceller) compositionScopedCoroutineScopeCanceller).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -564744084, "CC(remember):MainScreen.kt#9igjgp");
            objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Résultats", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue2;
            }
            final MutableState currentScreen$delegate2 = (MutableState) objMutableStateOf$default;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final long AzureMist2 = ColorKt.Color(4293064179L);
            final long IcyBlue2 = ColorKt.Color(4289317856L);
            final long TwilightIndigo2 = ColorKt.Color(4281547895L);
            NavigationDrawerKt.m2289ModalNavigationDrawerFHprtrg(ComposableLambdaKt.rememberComposableLambda(-1981282083, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainScreenKt.MainScreen$lambda$10(AzureMist2, TwilightIndigo2, scope2, drawerState2, currentScreen$delegate2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), null, drawerState2, false, 0L, ComposableLambdaKt.rememberComposableLambda(189096674, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainScreenKt.MainScreen$lambda$22(AzureMist2, IcyBlue2, TwilightIndigo2, scope2, drawerState2, viewModel3, currentScreen$delegate2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 196614, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            viewModel2 = viewModel3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainScreenKt.MainScreen$lambda$23(viewModel2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String MainScreen$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    static final Unit MainScreen$lambda$10(long $AzureMist, final long $TwilightIndigo, final CoroutineScope $scope, final DrawerState $drawerState, final MutableState $currentScreen$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C43@1758L1913,40@1592L2079:MainScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1981282083, $changed, -1, "lnb.predict.earn.ui.screens.MainScreen.<anonymous> (MainScreen.kt:40)");
            }
            NavigationDrawerKt.m2288ModalDrawerSheetafqeVBk(null, RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(0.0f, Dp.m6627constructorimpl(16), Dp.m6627constructorimpl(16), 0.0f, 9, null), $AzureMist, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(107089793, true, new Function3() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainScreenKt.MainScreen$lambda$10$lambda$9($TwilightIndigo, $scope, $drawerState, $currentScreen$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 1573248, 57);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$10$lambda$9(long $TwilightIndigo, final CoroutineScope $scope, final DrawerState $drawerState, final MutableState $currentScreen$delegate, ColumnScope ModalDrawerSheet, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(ModalDrawerSheet, "$this$ModalDrawerSheet");
        ComposerKt.sourceInformation($composer, "C44@1776L30,48@1961L10,45@1823L275,55@2279L136,52@2115L505,65@2807L139,62@2637L502,75@3330L134,72@3156L501:MainScreen.kt#td928");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(107089793, $changed, -1, "lnb.predict.earn.ui.screens.MainScreen.<anonymous>.<anonymous> (MainScreen.kt:44)");
            }
            SpacerKt.Spacer(SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(12)), $composer, 6);
            TextKt.m2697Text4IGK_g("Loto Bénin", PaddingKt.m672padding3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), $TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, 197046, 0, 65496);
            boolean zAreEqual = Intrinsics.areEqual(MainScreen$lambda$1($currentScreen$delegate), "Résultats");
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, NavigationDrawerItemDefaults.INSTANCE.getItemPadding());
            Function2<Composer, Integer, Unit> lambda$394916774$app_debug = ComposableSingletons$MainScreenKt.INSTANCE.getLambda$394916774$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, -165907223, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changed($drawerState);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.MainScreen$lambda$10$lambda$9$lambda$4$lambda$3($scope, $currentScreen$delegate, $drawerState);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            NavigationDrawerKt.NavigationDrawerItem(lambda$394916774$app_debug, zAreEqual, (Function0) obj, modifierPadding, ComposableSingletons$MainScreenKt.INSTANCE.m8649getLambda$1982668374$app_debug(), null, null, null, null, $composer, 24582, 480);
            boolean zAreEqual2 = Intrinsics.areEqual(MainScreen$lambda$1($currentScreen$delegate), "Statistiques");
            Modifier modifierPadding2 = PaddingKt.padding(Modifier.INSTANCE, NavigationDrawerItemDefaults.INSTANCE.getItemPadding());
            Function2<Composer, Integer, Unit> lambda$1154608413$app_debug = ComposableSingletons$MainScreenKt.INSTANCE.getLambda$1154608413$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, -165890324, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($scope) | $composer.changed($drawerState);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.MainScreen$lambda$10$lambda$9$lambda$6$lambda$5($scope, $currentScreen$delegate, $drawerState);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = objRememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            NavigationDrawerKt.NavigationDrawerItem(lambda$1154608413$app_debug, zAreEqual2, (Function0) obj2, modifierPadding2, ComposableSingletons$MainScreenKt.INSTANCE.getLambda$1217882657$app_debug(), null, null, null, null, $composer, 24582, 480);
            boolean zAreEqual3 = Intrinsics.areEqual(MainScreen$lambda$1($currentScreen$delegate), "Analyse");
            Modifier modifierPadding3 = PaddingKt.padding(Modifier.INSTANCE, NavigationDrawerItemDefaults.INSTANCE.getItemPadding());
            Function2<Composer, Integer, Unit> function2M8647getLambda$1630337058$app_debug = ComposableSingletons$MainScreenKt.INSTANCE.m8647getLambda$1630337058$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, -165873593, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance($scope) | $composer.changed($drawerState);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.MainScreen$lambda$10$lambda$9$lambda$8$lambda$7($scope, $currentScreen$delegate, $drawerState);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                obj3 = objRememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            NavigationDrawerKt.NavigationDrawerItem(function2M8647getLambda$1630337058$app_debug, zAreEqual3, (Function0) obj3, modifierPadding3, ComposableSingletons$MainScreenKt.INSTANCE.m8646getLambda$1567062814$app_debug(), null, null, null, null, $composer, 24582, 480);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$10$lambda$9$lambda$4$lambda$3(CoroutineScope $scope, MutableState $currentScreen$delegate, DrawerState $drawerState) {
        $currentScreen$delegate.setValue("Résultats");
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new MainScreenKt$MainScreen$1$1$1$1$1($drawerState, null), 3, null);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$10$lambda$9$lambda$6$lambda$5(CoroutineScope $scope, MutableState $currentScreen$delegate, DrawerState $drawerState) {
        $currentScreen$delegate.setValue("Statistiques");
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new MainScreenKt$MainScreen$1$1$2$1$1($drawerState, null), 3, null);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$10$lambda$9$lambda$8$lambda$7(CoroutineScope $scope, MutableState $currentScreen$delegate, DrawerState $drawerState) {
        $currentScreen$delegate.setValue("Analyse");
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new MainScreenKt$MainScreen$1$1$3$1$1($drawerState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x02df  */
    /* JADX WARN: Code duplicated, block: B:47:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0301  */
    /* JADX WARN: Code duplicated, block: B:52:0x0314  */
    /* JADX WARN: Code duplicated, block: B:54:0x031e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0331  */
    /* JADX WARN: Code duplicated, block: B:59:0x036e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static final Unit MainScreen$lambda$22(long $AzureMist, long $IcyBlue, final long $TwilightIndigo, final CoroutineScope $scope, final DrawerState $drawerState, final LotoViewModel $viewModel, final MutableState $currentScreen$delegate, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Composer composer;
        Composer composer2;
        String strMainScreen$lambda$1;
        ComposerKt.sourceInformation($composer, "C85@3698L2754:MainScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(189096674, $changed, -1, "lnb.predict.earn.ui.screens.MainScreen.<anonymous> (MainScreen.kt:85)");
            }
            Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m4120verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4153boximpl($AzureMist), Color.m4153boximpl($IcyBlue)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierBackground$default);
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
            int i3 = ((6 >> 6) & 112) | 6;
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 305323291, "C92@4015L2134,89@3898L2251,138@6163L279:MainScreen.kt#td928");
            SurfaceKt.m2547SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, Color.INSTANCE.m4198getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-184735821, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19($TwilightIndigo, $scope, $drawerState, $viewModel, $currentScreen$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12583302, 122);
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                function0 = constructor2;
                $composer.createNode(function0);
            } else {
                function0 = constructor2;
                $composer.useNode();
            }
            Composer composerM3656constructorimpl2 = Updater.m3656constructorimpl($composer);
            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl2.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (!Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i6 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -1703444686, "C:MainScreen.kt#td928");
                strMainScreen$lambda$1 = MainScreen$lambda$1($currentScreen$delegate);
                switch (strMainScreen$lambda$1.hashCode()) {
                    case -1692851137:
                        if (strMainScreen$lambda$1.equals("Résultats")) {
                            composer2.startReplaceGroup(-1709619484);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1746167158);
                            ComposerKt.sourceInformation(composer2, "140@6275L24");
                            ResultsScreenKt.ResultsScreen($viewModel, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        break;
                    case -540624411:
                        if (strMainScreen$lambda$1.equals("Statistiques")) {
                            composer2.startReplaceGroup(-1709619484);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1746169172);
                            ComposerKt.sourceInformation(composer2, "141@6338L22");
                            StatsScreenKt.StatsScreen($viewModel, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        break;
                    case 800322643:
                        if (strMainScreen$lambda$1.equals("Analyse")) {
                            composer2.startReplaceGroup(1746170958);
                            ComposerKt.sourceInformation(composer2, "142@6394L16");
                            AnalysisScreenKt.AnalysisScreen(null, composer2, 0, 1);
                        } else {
                            composer2.startReplaceGroup(-1709619484);
                        }
                        composer2.endReplaceGroup();
                        break;
                    default:
                        composer2.startReplaceGroup(-1709619484);
                        composer2.endReplaceGroup();
                        break;
                }
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
            composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i4 >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i8 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -1703444686, "C:MainScreen.kt#td928");
            strMainScreen$lambda$1 = MainScreen$lambda$1($currentScreen$delegate);
            switch (strMainScreen$lambda$1.hashCode()) {
                case -1692851137:
                    if (strMainScreen$lambda$1.equals("Résultats")) {
                        composer2.startReplaceGroup(-1709619484);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1746167158);
                        ComposerKt.sourceInformation(composer2, "140@6275L24");
                        ResultsScreenKt.ResultsScreen($viewModel, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    break;
                case -540624411:
                    if (strMainScreen$lambda$1.equals("Statistiques")) {
                        composer2.startReplaceGroup(1746169172);
                        ComposerKt.sourceInformation(composer2, "141@6338L22");
                        StatsScreenKt.StatsScreen($viewModel, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1709619484);
                        composer2.endReplaceGroup();
                    }
                    break;
                case 800322643:
                    if (strMainScreen$lambda$1.equals("Analyse")) {
                        composer2.startReplaceGroup(-1709619484);
                    } else {
                        composer2.startReplaceGroup(1746170958);
                        ComposerKt.sourceInformation(composer2, "142@6394L16");
                        AnalysisScreenKt.AnalysisScreen(null, composer2, 0, 1);
                    }
                    composer2.endReplaceGroup();
                    break;
                default:
                    composer2.startReplaceGroup(-1709619484);
                    composer2.endReplaceGroup();
                    break;
            }
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
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x0328  */
    /* JADX WARN: Code duplicated, block: B:55:0x0385  */
    /* JADX WARN: Code duplicated, block: B:58:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:59:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0417  */
    /* JADX WARN: Code duplicated, block: B:65:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x04b7  */
    static final Unit MainScreen$lambda$22$lambda$21$lambda$19(long $TwilightIndigo, final CoroutineScope $scope, final DrawerState $drawerState, final LotoViewModel $viewModel, MutableState $currentScreen$delegate, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function1;
        Composer composer;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer3;
        Composer composer4;
        boolean zChangedInstance2;
        Object obj;
        final long j;
        ComposerKt.sourceInformation($composer, "C93@4033L2102:MainScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-184735821, $changed, -1, "lnb.predict.earn.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:93)");
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
            if (composerM3656constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1031871871, "C94@4062L1974,134@6057L60:MainScreen.kt#td928");
            Modifier modifierM673paddingVpY3zN4 = PaddingKt.m673paddingVpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), Dp.m6627constructorimpl(16), Dp.m6627constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM673paddingVpY3zN4);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3663setimpl(composerM3656constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl2.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (!Intrinsics.areEqual(composerM3656constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i6 = ((384 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -456342245, "C105@4645L99,101@4399L371,110@4820L40,123@5445L38,125@5546L16:MainScreen.kt#td928");
                ImageVector menu = MenuKt.getMenu(Icons.INSTANCE.getDefault());
                Modifier modifierM717size3ABfNKs = SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(28));
                ComposerKt.sourceInformationMarkerStart(composer2, 1786400956, "CC(remember):MainScreen.kt#9igjgp");
                zChangedInstance = composer2.changedInstance($scope) | composer2.changed($drawerState);
                objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance) {
                    composer3 = composer2;
                } else {
                    composer3 = composer2;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer4 = composer3;
                    IconKt.m2154Iconww6aTOc(menu, "Menu", ClickableKt.m260clickableXHw0xAI$default(modifierM717size3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), $TwilightIndigo, composer4, 3120, 0);
                    SpacerKt.Spacer(SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), composer4, 6);
                    if (!Intrinsics.areEqual(MainScreen$lambda$1($currentScreen$delegate), "Résultats") || Intrinsics.areEqual(MainScreen$lambda$1($currentScreen$delegate), "Statistiques")) {
                        composer4.startReplaceGroup(-455814378);
                        ComposerKt.sourceInformation(composer4, "113@5009L27");
                        ResultsFilterBar($viewModel, composer4, 0);
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(-455717782);
                        ComposerKt.sourceInformation(composer4, "117@5222L10,115@5098L295");
                        TextKt.m2697Text4IGK_g("Analyse Personnalisée", (Modifier) null, $TwilightIndigo, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getTitleMedium(), composer4, 196998, 0, 65498);
                        composer4.endReplaceGroup();
                    }
                    SpacerKt.Spacer(RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0);
                    if (MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$13(SnapshotStateKt.collectAsState($viewModel.isSyncing(), null, composer4, 0, 1))) {
                        composer4.startReplaceGroup(-455194037);
                        ComposerKt.sourceInformation(composer4, "127@5632L102");
                        ProgressIndicatorKt.m2371CircularProgressIndicatorLxG7B9w(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(24)), $TwilightIndigo, Dp.m6627constructorimpl(2), 0L, 0, composer4, 438, 24);
                        composer4.endReplaceGroup();
                        j = $TwilightIndigo;
                    } else {
                        composer4.startReplaceGroup(-455028559);
                        ComposerKt.sourceInformation(composer4, "129@5817L23,129@5842L146,129@5796L192");
                        ComposerKt.sourceInformationMarkerStart(composer4, 1786438384, "CC(remember):MainScreen.kt#9igjgp");
                        zChangedInstance2 = composer4.changedInstance($viewModel);
                        Object objRememberedValue2 = composer4.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            obj = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$15$lambda$14($viewModel);
                                }
                            };
                            composer4.updateRememberedValue(obj);
                        } else {
                            obj = objRememberedValue2;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        j = $TwilightIndigo;
                        IconButtonKt.IconButton((Function0) obj, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(860941345, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$16(j, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        }, composer4, 54), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                        composer4.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    long j2 = j;
                    DividerKt.m2076HorizontalDivider9IZ8Weo(null, 0.0f, Color.m4161copywmQWz5c(j2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j2) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j2) : 0.0f), $composer, 384, 3);
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
                objRememberedValue = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$12$lambda$11($scope, $drawerState);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer4 = composer3;
                IconKt.m2154Iconww6aTOc(menu, "Menu", ClickableKt.m260clickableXHw0xAI$default(modifierM717size3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), $TwilightIndigo, composer4, 3120, 0);
                SpacerKt.Spacer(SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), composer4, 6);
                if (Intrinsics.areEqual(MainScreen$lambda$1($currentScreen$delegate), "Résultats")) {
                    composer4.startReplaceGroup(-455814378);
                    ComposerKt.sourceInformation(composer4, "113@5009L27");
                    ResultsFilterBar($viewModel, composer4, 0);
                    composer4.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(-455814378);
                    ComposerKt.sourceInformation(composer4, "113@5009L27");
                    ResultsFilterBar($viewModel, composer4, 0);
                    composer4.endReplaceGroup();
                }
                SpacerKt.Spacer(RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0);
                if (MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$13(SnapshotStateKt.collectAsState($viewModel.isSyncing(), null, composer4, 0, 1))) {
                    composer4.startReplaceGroup(-455194037);
                    ComposerKt.sourceInformation(composer4, "127@5632L102");
                    ProgressIndicatorKt.m2371CircularProgressIndicatorLxG7B9w(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(24)), $TwilightIndigo, Dp.m6627constructorimpl(2), 0L, 0, composer4, 438, 24);
                    composer4.endReplaceGroup();
                    j = $TwilightIndigo;
                } else {
                    composer4.startReplaceGroup(-455028559);
                    ComposerKt.sourceInformation(composer4, "129@5817L23,129@5842L146,129@5796L192");
                    ComposerKt.sourceInformationMarkerStart(composer4, 1786438384, "CC(remember):MainScreen.kt#9igjgp");
                    zChangedInstance2 = composer4.changedInstance($viewModel);
                    Object objRememberedValue3 = composer4.rememberedValue();
                    if (zChangedInstance2) {
                    }
                    obj = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$15$lambda$14($viewModel);
                        }
                    };
                    composer4.updateRememberedValue(obj);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    j = $TwilightIndigo;
                    IconButtonKt.IconButton((Function0) obj, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(860941345, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$16(j, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer4, 54), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                    composer4.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                long j3 = j;
                DividerKt.m2076HorizontalDivider9IZ8Weo(null, 0.0f, Color.m4161copywmQWz5c(j3, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j3) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j3) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j3) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j3) : 0.0f), $composer, 384, 3);
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
            composerM3656constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3656constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            Updater.m3663setimpl(composerM3656constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i4 >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i8 = ((384 >> 6) & 112) | 6;
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -456342245, "C105@4645L99,101@4399L371,110@4820L40,123@5445L38,125@5546L16:MainScreen.kt#td928");
            ImageVector menu2 = MenuKt.getMenu(Icons.INSTANCE.getDefault());
            Modifier modifierM717size3ABfNKs2 = SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(28));
            ComposerKt.sourceInformationMarkerStart(composer2, 1786400956, "CC(remember):MainScreen.kt#9igjgp");
            zChangedInstance = composer2.changedInstance($scope) | composer2.changed($drawerState);
            objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance) {
                composer3 = composer2;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer4 = composer3;
                IconKt.m2154Iconww6aTOc(menu2, "Menu", ClickableKt.m260clickableXHw0xAI$default(modifierM717size3ABfNKs2, false, null, null, (Function0) objRememberedValue, 7, null), $TwilightIndigo, composer4, 3120, 0);
                SpacerKt.Spacer(SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), composer4, 6);
                if (Intrinsics.areEqual(MainScreen$lambda$1($currentScreen$delegate), "Résultats")) {
                    composer4.startReplaceGroup(-455814378);
                    ComposerKt.sourceInformation(composer4, "113@5009L27");
                    ResultsFilterBar($viewModel, composer4, 0);
                    composer4.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(-455814378);
                    ComposerKt.sourceInformation(composer4, "113@5009L27");
                    ResultsFilterBar($viewModel, composer4, 0);
                    composer4.endReplaceGroup();
                }
                SpacerKt.Spacer(RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0);
                if (MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$13(SnapshotStateKt.collectAsState($viewModel.isSyncing(), null, composer4, 0, 1))) {
                    composer4.startReplaceGroup(-455194037);
                    ComposerKt.sourceInformation(composer4, "127@5632L102");
                    ProgressIndicatorKt.m2371CircularProgressIndicatorLxG7B9w(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(24)), $TwilightIndigo, Dp.m6627constructorimpl(2), 0L, 0, composer4, 438, 24);
                    composer4.endReplaceGroup();
                    j = $TwilightIndigo;
                } else {
                    composer4.startReplaceGroup(-455028559);
                    ComposerKt.sourceInformation(composer4, "129@5817L23,129@5842L146,129@5796L192");
                    ComposerKt.sourceInformationMarkerStart(composer4, 1786438384, "CC(remember):MainScreen.kt#9igjgp");
                    zChangedInstance2 = composer4.changedInstance($viewModel);
                    Object objRememberedValue4 = composer4.rememberedValue();
                    if (zChangedInstance2) {
                    }
                    obj = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$15$lambda$14($viewModel);
                        }
                    };
                    composer4.updateRememberedValue(obj);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    j = $TwilightIndigo;
                    IconButtonKt.IconButton((Function0) obj, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(860941345, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$16(j, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer4, 54), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                    composer4.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                long j4 = j;
                DividerKt.m2076HorizontalDivider9IZ8Weo(null, 0.0f, Color.m4161copywmQWz5c(j4, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j4) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j4) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j4) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j4) : 0.0f), $composer, 384, 3);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer3 = composer2;
            }
            objRememberedValue = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$12$lambda$11($scope, $drawerState);
                }
            };
            composer2.updateRememberedValue(objRememberedValue);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer4 = composer3;
            IconKt.m2154Iconww6aTOc(menu2, "Menu", ClickableKt.m260clickableXHw0xAI$default(modifierM717size3ABfNKs2, false, null, null, (Function0) objRememberedValue, 7, null), $TwilightIndigo, composer4, 3120, 0);
            SpacerKt.Spacer(SizeKt.m722width3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(16)), composer4, 6);
            if (Intrinsics.areEqual(MainScreen$lambda$1($currentScreen$delegate), "Résultats")) {
                composer4.startReplaceGroup(-455814378);
                ComposerKt.sourceInformation(composer4, "113@5009L27");
                ResultsFilterBar($viewModel, composer4, 0);
                composer4.endReplaceGroup();
            } else {
                composer4.startReplaceGroup(-455814378);
                ComposerKt.sourceInformation(composer4, "113@5009L27");
                ResultsFilterBar($viewModel, composer4, 0);
                composer4.endReplaceGroup();
            }
            SpacerKt.Spacer(RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0);
            if (MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$13(SnapshotStateKt.collectAsState($viewModel.isSyncing(), null, composer4, 0, 1))) {
                composer4.startReplaceGroup(-455194037);
                ComposerKt.sourceInformation(composer4, "127@5632L102");
                ProgressIndicatorKt.m2371CircularProgressIndicatorLxG7B9w(SizeKt.m717size3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(24)), $TwilightIndigo, Dp.m6627constructorimpl(2), 0L, 0, composer4, 438, 24);
                composer4.endReplaceGroup();
                j = $TwilightIndigo;
            } else {
                composer4.startReplaceGroup(-455028559);
                ComposerKt.sourceInformation(composer4, "129@5817L23,129@5842L146,129@5796L192");
                ComposerKt.sourceInformationMarkerStart(composer4, 1786438384, "CC(remember):MainScreen.kt#9igjgp");
                zChangedInstance2 = composer4.changedInstance($viewModel);
                Object objRememberedValue5 = composer4.rememberedValue();
                if (zChangedInstance2) {
                }
                obj = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$15$lambda$14($viewModel);
                    }
                };
                composer4.updateRememberedValue(obj);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                j = $TwilightIndigo;
                IconButtonKt.IconButton((Function0) obj, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(860941345, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return MainScreenKt.MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$16(j, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer4, 54), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                composer4.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long j5 = j;
            DividerKt.m2076HorizontalDivider9IZ8Weo(null, 0.0f, Color.m4161copywmQWz5c(j5, (14 & 1) != 0 ? Color.m4165getAlphaimpl(j5) : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(j5) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(j5) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(j5) : 0.0f), $composer, 384, 3);
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

    static final Unit MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$12$lambda$11(CoroutineScope $scope, DrawerState $drawerState) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new MainScreenKt$MainScreen$2$1$1$1$1$1$1$1($drawerState, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final boolean MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$13(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    static final Unit MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$15$lambda$14(LotoViewModel $viewModel) {
        $viewModel.refresh();
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$22$lambda$21$lambda$19$lambda$18$lambda$17$lambda$16(long $TwilightIndigo, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C130@5876L82:MainScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(860941345, $changed, -1, "lnb.predict.earn.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:130)");
            }
            IconKt.m2154Iconww6aTOc(RefreshKt.getRefresh(Icons.INSTANCE.getDefault()), "Refresh", (Modifier) null, $TwilightIndigo, $composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:112:0x0602  */
    /* JADX WARN: Code duplicated, block: B:115:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:118:0x06be  */
    /* JADX WARN: Code duplicated, block: B:119:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:122:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:125:0x0708  */
    /* JADX WARN: Code duplicated, block: B:126:0x070b  */
    /* JADX WARN: Code duplicated, block: B:130:0x075e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0761  */
    /* JADX WARN: Code duplicated, block: B:134:0x077f  */
    /* JADX WARN: Code duplicated, block: B:135:0x078d  */
    /* JADX WARN: Code duplicated, block: B:138:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:139:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:142:0x0845  */
    public static final void ResultsFilterBar(final LotoViewModel viewModel, Composer $composer, final int $changed) {
        Object objMutableStateOf$default;
        Composer $composer2;
        Object objMutableStateOf$default2;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function1;
        Function0<ComposeUiNode> function2;
        Composer composer;
        Composer composer2;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> function3;
        Composer composerM3656constructorimpl;
        Composer composer3;
        Composer composer4;
        String strResultsFilterBar$lambda$26;
        String str;
        Object objRememberedValue2;
        Object objRememberedValue3;
        String strTake;
        String string;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer3 = $composer.startRestartGroup(914831716);
        ComposerKt.sourceInformation($composer3, "C(ResultsFilterBar)151@6570L16,152@6636L16,153@6704L16,155@6768L16,156@6836L16,157@6903L16,159@6945L34,160@7005L34,161@7064L34,163@7104L2041:MainScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(914831716, $dirty, -1, "lnb.predict.earn.ui.screens.ResultsFilterBar (MainScreen.kt:150)");
            }
            final State selectedYear$delegate = SnapshotStateKt.collectAsState(viewModel.getSelectedYear(), null, $composer3, 0, 1);
            State selectedMonth$delegate = SnapshotStateKt.collectAsState(viewModel.getSelectedMonth(), null, $composer3, 0, 1);
            State selectedType$delegate = SnapshotStateKt.collectAsState(viewModel.getSelectedDrawType(), null, $composer3, 0, 1);
            final State years$delegate = SnapshotStateKt.collectAsState(viewModel.getAvailableYears(), null, $composer3, 0, 1);
            final State months$delegate = SnapshotStateKt.collectAsState(viewModel.getAvailableMonthsForYear(), null, $composer3, 0, 1);
            final State drawTypes$delegate = SnapshotStateKt.collectAsState(viewModel.getAvailableDrawTypes(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, -1315001114, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue4;
            }
            final MutableState showYearMenu$delegate = (MutableState) objMutableStateOf$default;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1314999194, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objRememberedValue5);
            }
            final MutableState showMonthMenu$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1314997306, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            $composer2 = $composer3;
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
            } else {
                objMutableStateOf$default2 = objRememberedValue6;
            }
            final MutableState showTypeMenu$delegate = (MutableState) objMutableStateOf$default2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifier = Modifier.INSTANCE;
            Arrangement.Horizontal horizontalM552spacedBy0680j_4 = Arrangement.INSTANCE.m552spacedBy0680j_4(Dp.m6627constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM552spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer2, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 986198354, "C168@7234L531,179@7833L751,196@8617L522:MainScreen.kt#td928");
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier modifier2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifier2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function1 = constructor3;
                $composer2.createNode(function1);
            } else {
                function1 = constructor3;
                $composer2.useNode();
            }
            Composer composerM3656constructorimpl3 = Updater.m3656constructorimpl($composer2);
            Updater.m3663setimpl(composerM3656constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3656constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3656constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
            }
            Updater.m3663setimpl(composerM3656constructorimpl3, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -59820750, "C169@7312L23,169@7252L83,170@7405L24,170@7431L324,170@7348L407:MainScreen.kt#td928");
            Integer numResultsFilterBar$lambda$24 = ResultsFilterBar$lambda$24(selectedYear$delegate);
            String str2 = (numResultsFilterBar$lambda$24 == null || (string = numResultsFilterBar$lambda$24.toString()) == null) ? "Tout" : string;
            ComposerKt.sourceInformationMarkerStart($composer2, -1387401583, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue7 = $composer2.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$50$lambda$40$lambda$39(showYearMenu$delegate);
                    }
                };
                $composer2.updateRememberedValue(objRememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            FilterChipCompact("An", str2, false, (Function0) objRememberedValue7, $composer2, 3078, 4);
            boolean zResultsFilterBar$lambda$31 = ResultsFilterBar$lambda$31(showYearMenu$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -1387398606, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue8 = $composer2.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$50$lambda$42$lambda$41(showYearMenu$delegate);
                    }
                };
                $composer2.updateRememberedValue(objRememberedValue8);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AndroidMenu_androidKt.m1769DropdownMenuIlH_yew(zResultsFilterBar$lambda$31, (Function0) objRememberedValue8, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1870925131, true, new Function3() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainScreenKt.ResultsFilterBar$lambda$76$lambda$50$lambda$49(viewModel, showYearMenu$delegate, years$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 48, 48, 2044);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier modifier3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer2, modifier3);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function2 = constructor4;
                $composer2.createNode(function2);
            } else {
                function2 = constructor4;
                $composer2.useNode();
            }
            Composer composerM3656constructorimpl4 = Updater.m3656constructorimpl($composer2);
            Updater.m3663setimpl(composerM3656constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl4, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3656constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM3656constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM3656constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash3);
            }
            Updater.m3663setimpl(composerM3656constructorimpl4, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i9 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -597402803, "C184@8054L80,180@7851L283,187@8205L25,187@8232L342,187@8147L427:MainScreen.kt#td928");
            Integer numResultsFilterBar$lambda$25 = ResultsFilterBar$lambda$25(selectedMonth$delegate);
            String str3 = (numResultsFilterBar$lambda$25 == null || (strTake = StringsKt.take(viewModel.monthName(numResultsFilterBar$lambda$25.intValue()), 4)) == null) ? "Tout" : strTake;
            boolean z = ResultsFilterBar$lambda$24(selectedYear$delegate) != null;
            ComposerKt.sourceInformationMarkerStart($composer2, 257829459, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChanged = $composer2.changed(selectedYear$delegate);
            Object objRememberedValue9 = $composer2.rememberedValue();
            if (zChanged) {
                composer = $composer2;
            } else {
                composer = $composer2;
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer2 = composer;
                FilterChipCompact("Mois", str3, z, (Function0) objRememberedValue9, composer2, 6, 0);
                boolean zResultsFilterBar$lambda$34 = ResultsFilterBar$lambda$34(showMonthMenu$delegate);
                ComposerKt.sourceInformationMarkerStart(composer2, 257834236, "CC(remember):MainScreen.kt#9igjgp");
                objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.ResultsFilterBar$lambda$76$lambda$63$lambda$55$lambda$54(showMonthMenu$delegate);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                AndroidMenu_androidKt.m1769DropdownMenuIlH_yew(zResultsFilterBar$lambda$34, (Function0) objRememberedValue, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1404657698, true, new Function3() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$63$lambda$62(viewModel, showMonthMenu$delegate, months$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, 54), composer2, 48, 48, 2044);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                Modifier modifier4 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = $composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer2, modifier4);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i10 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3656constructorimpl.getInserting()) {
                    composer3 = $composer2;
                } else {
                    composer3 = $composer2;
                    if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i11 = (i10 >> 6) & 14;
                    composer4 = composer3;
                    ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    int i12 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer4, -675400173, "C197@8685L23,197@8635L73,198@8778L24,198@8804L325,198@8721L408:MainScreen.kt#td928");
                    strResultsFilterBar$lambda$26 = ResultsFilterBar$lambda$26(selectedType$delegate);
                    if (strResultsFilterBar$lambda$26 == null) {
                        str = "Tout";
                    } else {
                        str = strResultsFilterBar$lambda$26;
                    }
                    ComposerKt.sourceInformationMarkerStart(composer4, -1684353959, "CC(remember):MainScreen.kt#9igjgp");
                    objRememberedValue2 = composer4.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$65$lambda$64(showTypeMenu$delegate);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    FilterChipCompact("Type", str, false, (Function0) objRememberedValue2, composer4, 3078, 4);
                    boolean zResultsFilterBar$lambda$37 = ResultsFilterBar$lambda$37(showTypeMenu$delegate);
                    ComposerKt.sourceInformationMarkerStart(composer4, -1684350982, "CC(remember):MainScreen.kt#9igjgp");
                    objRememberedValue3 = composer4.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$67$lambda$66(showTypeMenu$delegate);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    AndroidMenu_androidKt.m1769DropdownMenuIlH_yew(zResultsFilterBar$lambda$37, (Function0) objRememberedValue3, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-325115651, true, new Function3() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$74(viewModel, showTypeMenu$delegate, drawTypes$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer4, 54), composer4, 48, 48, 2044);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
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
                composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i13 = (i10 >> 6) & 14;
                composer4 = composer3;
                ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                int i14 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer4, -675400173, "C197@8685L23,197@8635L73,198@8778L24,198@8804L325,198@8721L408:MainScreen.kt#td928");
                strResultsFilterBar$lambda$26 = ResultsFilterBar$lambda$26(selectedType$delegate);
                if (strResultsFilterBar$lambda$26 == null) {
                    str = "Tout";
                } else {
                    str = strResultsFilterBar$lambda$26;
                }
                ComposerKt.sourceInformationMarkerStart(composer4, -1684353959, "CC(remember):MainScreen.kt#9igjgp");
                objRememberedValue2 = composer4.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$65$lambda$64(showTypeMenu$delegate);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                FilterChipCompact("Type", str, false, (Function0) objRememberedValue2, composer4, 3078, 4);
                boolean zResultsFilterBar$lambda$38 = ResultsFilterBar$lambda$37(showTypeMenu$delegate);
                ComposerKt.sourceInformationMarkerStart(composer4, -1684350982, "CC(remember):MainScreen.kt#9igjgp");
                objRememberedValue3 = composer4.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$67$lambda$66(showTypeMenu$delegate);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                AndroidMenu_androidKt.m1769DropdownMenuIlH_yew(zResultsFilterBar$lambda$38, (Function0) objRememberedValue3, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-325115651, true, new Function3() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$74(viewModel, showTypeMenu$delegate, drawTypes$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer4, 54), composer4, 48, 48, 2044);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
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
            objRememberedValue9 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.ResultsFilterBar$lambda$76$lambda$63$lambda$53$lambda$52(selectedYear$delegate, showMonthMenu$delegate);
                }
            };
            $composer2.updateRememberedValue(objRememberedValue9);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer2 = composer;
            FilterChipCompact("Mois", str3, z, (Function0) objRememberedValue9, composer2, 6, 0);
            boolean zResultsFilterBar$lambda$35 = ResultsFilterBar$lambda$34(showMonthMenu$delegate);
            ComposerKt.sourceInformationMarkerStart(composer2, 257834236, "CC(remember):MainScreen.kt#9igjgp");
            objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$63$lambda$55$lambda$54(showMonthMenu$delegate);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            AndroidMenu_androidKt.m1769DropdownMenuIlH_yew(zResultsFilterBar$lambda$35, (Function0) objRememberedValue, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1404657698, true, new Function3() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainScreenKt.ResultsFilterBar$lambda$76$lambda$63$lambda$62(viewModel, showMonthMenu$delegate, months$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer2, 54), composer2, 48, 48, 2044);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier modifier5 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer2, modifier5);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i15 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3663setimpl(composerM3656constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3663setimpl(composerM3656constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3656constructorimpl.getInserting()) {
                composer3 = $composer2;
                if (!Intrinsics.areEqual(composerM3656constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                int i16 = (i15 >> 6) & 14;
                composer4 = composer3;
                ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                int i17 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer4, -675400173, "C197@8685L23,197@8635L73,198@8778L24,198@8804L325,198@8721L408:MainScreen.kt#td928");
                strResultsFilterBar$lambda$26 = ResultsFilterBar$lambda$26(selectedType$delegate);
                if (strResultsFilterBar$lambda$26 == null) {
                    str = "Tout";
                } else {
                    str = strResultsFilterBar$lambda$26;
                }
                ComposerKt.sourceInformationMarkerStart(composer4, -1684353959, "CC(remember):MainScreen.kt#9igjgp");
                objRememberedValue2 = composer4.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$65$lambda$64(showTypeMenu$delegate);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                FilterChipCompact("Type", str, false, (Function0) objRememberedValue2, composer4, 3078, 4);
                boolean zResultsFilterBar$lambda$39 = ResultsFilterBar$lambda$37(showTypeMenu$delegate);
                ComposerKt.sourceInformationMarkerStart(composer4, -1684350982, "CC(remember):MainScreen.kt#9igjgp");
                objRememberedValue3 = composer4.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$67$lambda$66(showTypeMenu$delegate);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                AndroidMenu_androidKt.m1769DropdownMenuIlH_yew(zResultsFilterBar$lambda$39, (Function0) objRememberedValue3, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-325115651, true, new Function3() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$74(viewModel, showTypeMenu$delegate, drawTypes$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer4, 54), composer4, 48, 48, 2044);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer3 = $composer2;
            }
            composerM3656constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3656constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
            Updater.m3663setimpl(composerM3656constructorimpl, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            int i18 = (i15 >> 6) & 14;
            composer4 = composer3;
            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            int i19 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer4, -675400173, "C197@8685L23,197@8635L73,198@8778L24,198@8804L325,198@8721L408:MainScreen.kt#td928");
            strResultsFilterBar$lambda$26 = ResultsFilterBar$lambda$26(selectedType$delegate);
            if (strResultsFilterBar$lambda$26 == null) {
                str = "Tout";
            } else {
                str = strResultsFilterBar$lambda$26;
            }
            ComposerKt.sourceInformationMarkerStart(composer4, -1684353959, "CC(remember):MainScreen.kt#9igjgp");
            objRememberedValue2 = composer4.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$65$lambda$64(showTypeMenu$delegate);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer4);
            FilterChipCompact("Type", str, false, (Function0) objRememberedValue2, composer4, 3078, 4);
            boolean zResultsFilterBar$lambda$310 = ResultsFilterBar$lambda$37(showTypeMenu$delegate);
            ComposerKt.sourceInformationMarkerStart(composer4, -1684350982, "CC(remember):MainScreen.kt#9igjgp");
            objRememberedValue3 = composer4.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$67$lambda$66(showTypeMenu$delegate);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer4);
            AndroidMenu_androidKt.m1769DropdownMenuIlH_yew(zResultsFilterBar$lambda$310, (Function0) objRememberedValue3, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-325115651, true, new Function3() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$74(viewModel, showTypeMenu$delegate, drawTypes$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer4, 54), composer4, 48, 48, 2044);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainScreenKt.ResultsFilterBar$lambda$77(viewModel, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Integer ResultsFilterBar$lambda$24(State<Integer> state) {
        return (Integer) state.getValue();
    }

    private static final Integer ResultsFilterBar$lambda$25(State<Integer> state) {
        return (Integer) state.getValue();
    }

    private static final String ResultsFilterBar$lambda$26(State<String> state) {
        return (String) state.getValue();
    }

    private static final List<Integer> ResultsFilterBar$lambda$27(State<? extends List<Integer>> state) {
        return (List) state.getValue();
    }

    private static final List<Integer> ResultsFilterBar$lambda$28(State<? extends List<Integer>> state) {
        return (List) state.getValue();
    }

    private static final List<String> ResultsFilterBar$lambda$29(State<? extends List<String>> state) {
        return (List) state.getValue();
    }

    private static final boolean ResultsFilterBar$lambda$31(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ResultsFilterBar$lambda$32(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ResultsFilterBar$lambda$34(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ResultsFilterBar$lambda$35(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ResultsFilterBar$lambda$37(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ResultsFilterBar$lambda$38(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$50$lambda$40$lambda$39(MutableState $showYearMenu$delegate) {
        ResultsFilterBar$lambda$32($showYearMenu$delegate, true);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$50$lambda$42$lambda$41(MutableState $showYearMenu$delegate) {
        ResultsFilterBar$lambda$32($showYearMenu$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$50$lambda$49(final LotoViewModel $viewModel, final MutableState $showYearMenu$delegate, State $years$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C171@7501L49,171@7449L102,*173@7636L25,173@7673L49,173@7612L111:MainScreen.kt#td928");
        if (($changed & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1870925131, $changed, -1, "lnb.predict.earn.ui.screens.ResultsFilterBar.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:171)");
            }
            Function2<Composer, Integer, Unit> function2M8650getLambda$8797563$app_debug = ComposableSingletons$MainScreenKt.INSTANCE.m8650getLambda$8797563$app_debug();
            ComposerKt.sourceInformationMarkerStart(composer, 1632248422, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$50$lambda$49$lambda$44$lambda$43($viewModel, $showYearMenu$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            AndroidMenu_androidKt.DropdownMenuItem(function2M8650getLambda$8797563$app_debug, (Function0) obj, null, null, null, false, null, null, null, composer, 6, 508);
            Iterator it = ResultsFilterBar$lambda$27($years$delegate).iterator();
            while (it.hasNext()) {
                final int iIntValue = ((Number) it.next()).intValue();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-929871459, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$50$lambda$49$lambda$48$lambda$45(iIntValue, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -58933730, "CC(remember):MainScreen.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance($viewModel) | composer.changed(iIntValue);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    obj2 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.ResultsFilterBar$lambda$76$lambda$50$lambda$49$lambda$48$lambda$47$lambda$46($viewModel, iIntValue, $showYearMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                } else {
                    obj2 = objRememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) obj2, null, null, null, false, null, null, null, composer, 6, 508);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$50$lambda$49$lambda$44$lambda$43(LotoViewModel $viewModel, MutableState $showYearMenu$delegate) {
        $viewModel.setYear(null);
        ResultsFilterBar$lambda$32($showYearMenu$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$50$lambda$49$lambda$48$lambda$45(int $year, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C173@7638L21:MainScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-929871459, $changed, -1, "lnb.predict.earn.ui.screens.ResultsFilterBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:173)");
            }
            TextKt.m2697Text4IGK_g(String.valueOf($year), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$50$lambda$49$lambda$48$lambda$47$lambda$46(LotoViewModel $viewModel, int $year, MutableState $showYearMenu$delegate) {
        $viewModel.setYear(Integer.valueOf($year));
        ResultsFilterBar$lambda$32($showYearMenu$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$63$lambda$53$lambda$52(State $selectedYear$delegate, MutableState $showMonthMenu$delegate) {
        if (ResultsFilterBar$lambda$24($selectedYear$delegate) != null) {
            ResultsFilterBar$lambda$35($showMonthMenu$delegate, true);
        }
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$63$lambda$55$lambda$54(MutableState $showMonthMenu$delegate) {
        ResultsFilterBar$lambda$35($showMonthMenu$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$63$lambda$62(final LotoViewModel $viewModel, final MutableState $showMonthMenu$delegate, State $months$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C188@8302L51,188@8250L104,*190@8441L36,190@8489L52,190@8417L125:MainScreen.kt#td928");
        if (($changed & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1404657698, $changed, -1, "lnb.predict.earn.ui.screens.ResultsFilterBar.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:188)");
            }
            Function2<Composer, Integer, Unit> lambda$1393540014$app_debug = ComposableSingletons$MainScreenKt.INSTANCE.getLambda$1393540014$app_debug();
            ComposerKt.sourceInformationMarkerStart(composer, -1256314543, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$63$lambda$62$lambda$57$lambda$56($viewModel, $showMonthMenu$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            AndroidMenu_androidKt.DropdownMenuItem(lambda$1393540014$app_debug, (Function0) obj, null, null, null, false, null, null, null, composer, 6, 508);
            Iterator it = ResultsFilterBar$lambda$28($months$delegate).iterator();
            while (it.hasNext()) {
                final int iIntValue = ((Number) it.next()).intValue();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1004788934, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$63$lambda$62$lambda$61$lambda$58($viewModel, iIntValue, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, 1309597834, "CC(remember):MainScreen.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance($viewModel) | composer.changed(iIntValue);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    obj2 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.ResultsFilterBar$lambda$76$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59($viewModel, iIntValue, $showMonthMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                } else {
                    obj2 = objRememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) obj2, null, null, null, false, null, null, null, composer, 6, 508);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$63$lambda$62$lambda$57$lambda$56(LotoViewModel $viewModel, MutableState $showMonthMenu$delegate) {
        $viewModel.setMonth(null);
        ResultsFilterBar$lambda$35($showMonthMenu$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$63$lambda$62$lambda$61$lambda$58(LotoViewModel $viewModel, int $month, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C190@8443L32:MainScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1004788934, $changed, -1, "lnb.predict.earn.ui.screens.ResultsFilterBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:190)");
            }
            TextKt.m2697Text4IGK_g($viewModel.monthName($month), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59(LotoViewModel $viewModel, int $month, MutableState $showMonthMenu$delegate) {
        $viewModel.setMonth(Integer.valueOf($month));
        ResultsFilterBar$lambda$35($showMonthMenu$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$75$lambda$65$lambda$64(MutableState $showTypeMenu$delegate) {
        ResultsFilterBar$lambda$38($showTypeMenu$delegate, true);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$75$lambda$67$lambda$66(MutableState $showTypeMenu$delegate) {
        ResultsFilterBar$lambda$38($showTypeMenu$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$75$lambda$74(final LotoViewModel $viewModel, final MutableState $showTypeMenu$delegate, State $drawTypes$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C199@8874L53,199@8822L106,*201@9017L14,201@9043L53,201@8993L104:MainScreen.kt#td928");
        if (($changed & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-325115651, $changed, -1, "lnb.predict.earn.ui.screens.ResultsFilterBar.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:199)");
            }
            Function2<Composer, Integer, Unit> function2M8648getLambda$1821885235$app_debug = ComposableSingletons$MainScreenKt.INSTANCE.m8648getLambda$1821885235$app_debug();
            ComposerKt.sourceInformationMarkerStart(composer, 1096474290, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$74$lambda$69$lambda$68($viewModel, $showTypeMenu$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            AndroidMenu_androidKt.DropdownMenuItem(function2M8648getLambda$1821885235$app_debug, (Function0) obj, null, null, null, false, null, null, null, composer, 6, 508);
            for (final String str : ResultsFilterBar$lambda$29($drawTypes$delegate)) {
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(284911485, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$74$lambda$73$lambda$70(str, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -116635582, "CC(remember):MainScreen.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance($viewModel) | composer.changed(str);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    obj2 = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.ResultsFilterBar$lambda$76$lambda$75$lambda$74$lambda$73$lambda$72$lambda$71($viewModel, str, $showTypeMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                } else {
                    obj2 = objRememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) obj2, null, null, null, false, null, null, null, composer, 6, 508);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$75$lambda$74$lambda$69$lambda$68(LotoViewModel $viewModel, MutableState $showTypeMenu$delegate) {
        $viewModel.setDrawType(null);
        ResultsFilterBar$lambda$38($showTypeMenu$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$75$lambda$74$lambda$73$lambda$70(String $type, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C201@9019L10:MainScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(284911485, $changed, -1, "lnb.predict.earn.ui.screens.ResultsFilterBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:201)");
            }
            TextKt.m2697Text4IGK_g($type, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ResultsFilterBar$lambda$76$lambda$75$lambda$74$lambda$73$lambda$72$lambda$71(LotoViewModel $viewModel, String $type, MutableState $showTypeMenu$delegate) {
        $viewModel.setDrawType($type);
        ResultsFilterBar$lambda$38($showTypeMenu$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void FilterChipCompact(final String label, final String value, boolean enabled, final Function0<Unit> onClick, Composer $composer, final int $changed, final int i) {
        boolean z;
        Object obj;
        long jM4161copywmQWz5c;
        Composer $composer2;
        final boolean enabled2;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(541371056);
        ComposerKt.sourceInformation($composer3, "C(FilterChipCompact)P(1,3)213@9371L13,217@9659L431,210@9265L825:MainScreen.kt#td928");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(label) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(value) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            z = enabled;
        } else if (($changed & 384) == 0) {
            z = enabled;
            $dirty |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = enabled;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 2048 : 1024;
        }
        if (($dirty & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
            enabled2 = z;
        } else {
            boolean enabled3 = i2 != 0 ? true : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(541371056, $dirty, -1, "lnb.predict.earn.ui.screens.FilterChipCompact (MainScreen.kt:209)");
            }
            Modifier modifierM703height3ABfNKs = SizeKt.m703height3ABfNKs(Modifier.INSTANCE, Dp.m6627constructorimpl(32));
            ComposerKt.sourceInformationMarkerStart($composer3, 566549117, "CC(remember):MainScreen.kt#9igjgp");
            boolean z2 = ($dirty & 7168) == 2048;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainScreenKt.FilterChipCompact$lambda$79$lambda$78(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierM260clickableXHw0xAI$default = ClickableKt.m260clickableXHw0xAI$default(modifierM703height3ABfNKs, enabled3, null, null, (Function0) obj, 6, null);
            final boolean enabled4 = enabled3;
            long jM4200getWhite0d7_KjU = Color.INSTANCE.m4200getWhite0d7_KjU();
            long jM4161copywmQWz5c2 = Color.m4161copywmQWz5c(jM4200getWhite0d7_KjU, (14 & 1) != 0 ? Color.m4165getAlphaimpl(jM4200getWhite0d7_KjU) : enabled4 ? 0.5f : 0.1f, (14 & 2) != 0 ? Color.m4169getRedimpl(jM4200getWhite0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(jM4200getWhite0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(jM4200getWhite0d7_KjU) : 0.0f);
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6627constructorimpl(8));
            float fM6627constructorimpl = Dp.m6627constructorimpl((float) 0.5d);
            Color.Companion companion = Color.INSTANCE;
            if (enabled4) {
                jM4161copywmQWz5c = companion.m4200getWhite0d7_KjU();
            } else {
                long jM4200getWhite0d7_KjU2 = companion.m4200getWhite0d7_KjU();
                jM4161copywmQWz5c = Color.m4161copywmQWz5c(jM4200getWhite0d7_KjU2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(jM4200getWhite0d7_KjU2) : 0.2f, (14 & 2) != 0 ? Color.m4169getRedimpl(jM4200getWhite0d7_KjU2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(jM4200getWhite0d7_KjU2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(jM4200getWhite0d7_KjU2) : 0.0f);
            }
            $composer2 = $composer3;
            SurfaceKt.m2547SurfaceT9BRK9s(modifierM260clickableXHw0xAI$default, roundedCornerShapeM955RoundedCornerShape0680j_4, jM4161copywmQWz5c2, 0L, 0.0f, 0.0f, BorderStrokeKt.m254BorderStrokecXLIe8U(fM6627constructorimpl, jM4161copywmQWz5c), ComposableLambdaKt.rememberComposableLambda(-692070325, true, new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MainScreenKt.FilterChipCompact$lambda$81(label, enabled4, value, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, 12582912, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            enabled2 = enabled4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lnb.predict.earn.ui.screens.MainScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MainScreenKt.FilterChipCompact$lambda$82(label, value, enabled2, onClick, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit FilterChipCompact$lambda$79$lambda$78(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    static final Unit FilterChipCompact$lambda$81(String $label, boolean $enabled, String $value, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C218@9669L415:MainScreen.kt#td928");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-692070325, $changed, -1, "lnb.predict.earn.ui.screens.FilterChipCompact.<anonymous> (MainScreen.kt:218)");
            }
            Modifier modifierM674paddingVpY3zN4$default = PaddingKt.m674paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6627constructorimpl(10), 0.0f, 2, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM674paddingVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart($composer, -1458012804, "C222@9818L110,223@9941L133:MainScreen.kt#td928");
            String str = $label + ": ";
            long sp = TextUnitKt.getSp(11);
            long jColor = ColorKt.Color(4281547895L);
            TextKt.m2697Text4IGK_g(str, (Modifier) null, Color.m4161copywmQWz5c(jColor, (14 & 1) != 0 ? Color.m4165getAlphaimpl(jColor) : $enabled ? 0.6f : 0.2f, (14 & 2) != 0 ? Color.m4169getRedimpl(jColor) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(jColor) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(jColor) : 0.0f), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
            long sp2 = TextUnitKt.getSp(11);
            FontWeight bold = FontWeight.INSTANCE.getBold();
            long jColor2 = ColorKt.Color(4281547895L);
            TextKt.m2697Text4IGK_g($value, (Modifier) null, Color.m4161copywmQWz5c(jColor2, (14 & 1) != 0 ? Color.m4165getAlphaimpl(jColor2) : $enabled ? 1.0f : 0.3f, (14 & 2) != 0 ? Color.m4169getRedimpl(jColor2) : 0.0f, (14 & 4) != 0 ? Color.m4168getGreenimpl(jColor2) : 0.0f, (14 & 8) != 0 ? Color.m4166getBlueimpl(jColor2) : 0.0f), sp2, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131026);
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
