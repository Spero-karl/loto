package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: AnalysisDao.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH'J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH§@¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Llnb/predict/earn/data/local/AnalysisDao;", "", "insertPrediction", "", "prediction", "Llnb/predict/earn/data/local/PredictionEntity;", "(Llnb/predict/earn/data/local/PredictionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePrediction", "", "getAllPredictions", "Lkotlinx/coroutines/flow/Flow;", "", "getUnevaluatedPredictions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeights", "Llnb/predict/earn/data/local/WeightEntity;", "saveWeights", "weights", "(Llnb/predict/earn/data/local/WeightEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestBacktest", "Llnb/predict/earn/data/local/BacktestResultEntity;", "saveBacktest", "result", "(Llnb/predict/earn/data/local/BacktestResultEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface AnalysisDao {
    Flow<List<PredictionEntity>> getAllPredictions();

    Object getLatestBacktest(Continuation<? super BacktestResultEntity> continuation);

    Object getUnevaluatedPredictions(Continuation<? super List<PredictionEntity>> continuation);

    Object getWeights(Continuation<? super WeightEntity> continuation);

    Object insertPrediction(PredictionEntity predictionEntity, Continuation<? super Long> continuation);

    Object saveBacktest(BacktestResultEntity backtestResultEntity, Continuation<? super Long> continuation);

    Object saveWeights(WeightEntity weightEntity, Continuation<? super Long> continuation);

    Object updatePrediction(PredictionEntity predictionEntity, Continuation<? super Integer> continuation);
}
