package lnb.predict.earn.data.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lnb.predict.earn.data.local.AnalysisDao;
import lnb.predict.earn.data.local.BacktestResultEntity;
import lnb.predict.earn.data.local.PredictionEntity;
import lnb.predict.earn.data.local.WeightEntity;

/* JADX INFO: compiled from: AnalysisRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Singleton
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Llnb/predict/earn/data/repository/AnalysisRepository;", "", "analysisDao", "Llnb/predict/earn/data/local/AnalysisDao;", "<init>", "(Llnb/predict/earn/data/local/AnalysisDao;)V", "allPredictions", "Lkotlinx/coroutines/flow/Flow;", "", "Llnb/predict/earn/data/local/PredictionEntity;", "getAllPredictions", "()Lkotlinx/coroutines/flow/Flow;", "savePrediction", "", "prediction", "(Llnb/predict/earn/data/local/PredictionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePrediction", "getUnevaluated", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeights", "Llnb/predict/earn/data/local/WeightEntity;", "saveWeights", "weights", "(Llnb/predict/earn/data/local/WeightEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestBacktest", "Llnb/predict/earn/data/local/BacktestResultEntity;", "saveBacktest", "result", "(Llnb/predict/earn/data/local/BacktestResultEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AnalysisRepository {
    public static final int $stable = 8;
    private final Flow<List<PredictionEntity>> allPredictions;
    private final AnalysisDao analysisDao;

    /* JADX INFO: renamed from: lnb.predict.earn.data.repository.AnalysisRepository$getWeights$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnalysisRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "lnb.predict.earn.data.repository.AnalysisRepository", f = "AnalysisRepository.kt", i = {}, l = {28}, m = "getWeights", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalysisRepository.this.getWeights(this);
        }
    }

    @Inject
    public AnalysisRepository(AnalysisDao analysisDao) {
        Intrinsics.checkNotNullParameter(analysisDao, "analysisDao");
        this.analysisDao = analysisDao;
        this.allPredictions = this.analysisDao.getAllPredictions();
    }

    public final Flow<List<PredictionEntity>> getAllPredictions() {
        return this.allPredictions;
    }

    public final Object savePrediction(PredictionEntity prediction, Continuation<? super Unit> continuation) {
        Object objInsertPrediction = this.analysisDao.insertPrediction(prediction, continuation);
        return objInsertPrediction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertPrediction : Unit.INSTANCE;
    }

    public final Object updatePrediction(PredictionEntity prediction, Continuation<? super Unit> continuation) {
        Object objUpdatePrediction = this.analysisDao.updatePrediction(prediction, continuation);
        return objUpdatePrediction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdatePrediction : Unit.INSTANCE;
    }

    public final Object getUnevaluated(Continuation<? super List<PredictionEntity>> continuation) {
        return this.analysisDao.getUnevaluatedPredictions(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object getWeights(Continuation<? super WeightEntity> continuation) {
        AnonymousClass1 anonymousClass1;
        Object weights;
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
                AnalysisDao analysisDao = this.analysisDao;
                anonymousClass1.label = 1;
                weights = analysisDao.getWeights(anonymousClass1);
                if (weights == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                weights = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        WeightEntity weightEntity = (WeightEntity) weights;
        return weightEntity == null ? new WeightEntity(null, 0.4f, 0.3f, 0.2f, 0.05f, 0.05f, System.currentTimeMillis(), 1, null) : weightEntity;
    }

    public final Object saveWeights(WeightEntity weights, Continuation<? super Unit> continuation) {
        Object objSaveWeights = this.analysisDao.saveWeights(weights, continuation);
        return objSaveWeights == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveWeights : Unit.INSTANCE;
    }

    public final Object getLatestBacktest(Continuation<? super BacktestResultEntity> continuation) {
        return this.analysisDao.getLatestBacktest(continuation);
    }

    public final Object saveBacktest(BacktestResultEntity result, Continuation<? super Unit> continuation) {
        Object objSaveBacktest = this.analysisDao.saveBacktest(result, continuation);
        return objSaveBacktest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveBacktest : Unit.INSTANCE;
    }
}
