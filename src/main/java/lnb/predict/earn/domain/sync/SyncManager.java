package lnb.predict.earn.domain.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import lnb.predict.earn.data.local.StatisticsDao;
import lnb.predict.earn.data.local.StatisticsEntity;
import lnb.predict.earn.data.repository.LotoRepository;
import lnb.predict.earn.domain.model.Draw;
import lnb.predict.earn.domain.model.GlobalStatistics;
import lnb.predict.earn.domain.service.StatisticsService;

/* JADX INFO: compiled from: SyncManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Singleton
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Llnb/predict/earn/domain/sync/SyncManager;", "", "repository", "Llnb/predict/earn/data/repository/LotoRepository;", "analyticsSyncManager", "Llnb/predict/earn/domain/sync/AnalyticsSyncManager;", "statisticsService", "Llnb/predict/earn/domain/service/StatisticsService;", "statisticsDao", "Llnb/predict/earn/data/local/StatisticsDao;", "gson", "Lcom/google/gson/Gson;", "<init>", "(Llnb/predict/earn/data/repository/LotoRepository;Llnb/predict/earn/domain/sync/AnalyticsSyncManager;Llnb/predict/earn/domain/service/StatisticsService;Llnb/predict/earn/data/local/StatisticsDao;Lcom/google/gson/Gson;)V", "performSync", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SyncManager {
    public static final int $stable = 8;
    private final AnalyticsSyncManager analyticsSyncManager;
    private final Gson gson;
    private final LotoRepository repository;
    private final StatisticsDao statisticsDao;
    private final StatisticsService statisticsService;

    /* JADX INFO: renamed from: lnb.predict.earn.domain.sync.SyncManager$performSync$1, reason: invalid class name */
    /* JADX INFO: compiled from: SyncManager.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.domain.sync.SyncManager", f = "SyncManager.kt", i = {3, 3, 3}, l = {28, 31, 34, 38}, m = "performSync", n = {"allDraws", "stats", "json"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.performSync(this);
        }
    }

    @Inject
    public SyncManager(LotoRepository repository, AnalyticsSyncManager analyticsSyncManager, StatisticsService statisticsService, StatisticsDao statisticsDao, Gson gson) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analyticsSyncManager, "analyticsSyncManager");
        Intrinsics.checkNotNullParameter(statisticsService, "statisticsService");
        Intrinsics.checkNotNullParameter(statisticsDao, "statisticsDao");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.repository = repository;
        this.analyticsSyncManager = analyticsSyncManager;
        this.statisticsService = statisticsService;
        this.statisticsDao = statisticsDao;
        this.gson = gson;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object performSync(Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        AnalyticsSyncManager analyticsSyncManager;
        Object objFirst;
        List<Draw> list;
        StatisticsDao statisticsDao;
        StatisticsEntity statisticsEntity;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object $result = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                LotoRepository lotoRepository = this.repository;
                anonymousClass1.label = 1;
                if (lotoRepository.refreshResults(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                analyticsSyncManager = this.analyticsSyncManager;
                anonymousClass1.label = 2;
                if (analyticsSyncManager.sync(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Flow<List<Draw>> allDraws = this.repository.getAllDraws();
                anonymousClass1.label = 3;
                objFirst = FlowKt.first(allDraws, anonymousClass1);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) objFirst;
                if (!list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                GlobalStatistics stats = this.statisticsService.calculate(list);
                String json = this.gson.toJson(stats);
                statisticsDao = this.statisticsDao;
                Intrinsics.checkNotNull(json);
                statisticsEntity = new StatisticsEntity(null, json, 0L, 5, null);
                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(stats);
                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(json);
                anonymousClass1.label = 4;
                if (statisticsDao.insertStats(statisticsEntity, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure($result);
                analyticsSyncManager = this.analyticsSyncManager;
                anonymousClass1.label = 2;
                if (analyticsSyncManager.sync(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Flow<List<Draw>> allDraws2 = this.repository.getAllDraws();
                anonymousClass1.label = 3;
                objFirst = FlowKt.first(allDraws2, anonymousClass1);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) objFirst;
                if (!list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                GlobalStatistics stats2 = this.statisticsService.calculate(list);
                String json2 = this.gson.toJson(stats2);
                statisticsDao = this.statisticsDao;
                Intrinsics.checkNotNull(json2);
                statisticsEntity = new StatisticsEntity(null, json2, 0L, 5, null);
                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(stats2);
                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(json2);
                anonymousClass1.label = 4;
                if (statisticsDao.insertStats(statisticsEntity, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure($result);
                Flow<List<Draw>> allDraws3 = this.repository.getAllDraws();
                anonymousClass1.label = 3;
                objFirst = FlowKt.first(allDraws3, anonymousClass1);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) objFirst;
                if (!list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                GlobalStatistics stats3 = this.statisticsService.calculate(list);
                String json3 = this.gson.toJson(stats3);
                statisticsDao = this.statisticsDao;
                Intrinsics.checkNotNull(json3);
                statisticsEntity = new StatisticsEntity(null, json3, 0L, 5, null);
                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(stats3);
                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(json3);
                anonymousClass1.label = 4;
                if (statisticsDao.insertStats(statisticsEntity, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure($result);
                objFirst = $result;
                list = (List) objFirst;
                if (!list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                GlobalStatistics stats4 = this.statisticsService.calculate(list);
                String json4 = this.gson.toJson(stats4);
                statisticsDao = this.statisticsDao;
                Intrinsics.checkNotNull(json4);
                statisticsEntity = new StatisticsEntity(null, json4, 0L, 5, null);
                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(stats4);
                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(json4);
                anonymousClass1.label = 4;
                if (statisticsDao.insertStats(statisticsEntity, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
