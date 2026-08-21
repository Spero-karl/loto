package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: IndexedAnalyticsDao.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH§@¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH§@¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fH§@¢\u0006\u0002\u0010\u000eJ\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\fH§@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0018\u001a\u00020\u0019H§@¢\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\fH§@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eH§@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001eH§@¢\u0006\u0002\u0010!J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\fH§@¢\u0006\u0002\u0010\u0011J\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\fH§@¢\u0006\u0002\u0010\u0011J*\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0018\u001a\u00020\u0019H§@¢\u0006\u0002\u0010&¨\u0006'À\u0006\u0003"}, d2 = {"Llnb/predict/earn/data/local/IndexedAnalyticsDao;", "", "getMonthlyAnalytics", "Llnb/predict/earn/data/local/MonthlyAnalyticsEntity;", "periodKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMonthlyAnalytics", "", "analytics", "(Llnb/predict/earn/data/local/MonthlyAnalyticsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopPairs", "", "Llnb/predict/earn/data/local/PairIndexEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePairs", "pairs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopTriplets", "Llnb/predict/earn/data/local/TripletIndexEntity;", "saveTriplets", "triplets", "getTransitions", "Llnb/predict/earn/data/local/TransitionIndexEntity;", "type", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveTransitions", "transitions", "getMetadata", "Llnb/predict/earn/data/local/AnalyticsMetadataEntity;", "saveMetadata", "metadata", "(Llnb/predict/earn/data/local/AnalyticsMetadataEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPairs", "keys", "getTriplets", "getTransitionsByKeys", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface IndexedAnalyticsDao {
    Object getMetadata(Continuation<? super AnalyticsMetadataEntity> continuation);

    Object getMonthlyAnalytics(String str, Continuation<? super MonthlyAnalyticsEntity> continuation);

    Object getPairs(List<String> list, Continuation<? super List<PairIndexEntity>> continuation);

    Object getTopPairs(Continuation<? super List<PairIndexEntity>> continuation);

    Object getTopTriplets(Continuation<? super List<TripletIndexEntity>> continuation);

    Object getTransitions(int i, Continuation<? super List<TransitionIndexEntity>> continuation);

    Object getTransitionsByKeys(List<String> list, int i, Continuation<? super List<TransitionIndexEntity>> continuation);

    Object getTriplets(List<String> list, Continuation<? super List<TripletIndexEntity>> continuation);

    Object saveMetadata(AnalyticsMetadataEntity analyticsMetadataEntity, Continuation<? super Long> continuation);

    Object saveMonthlyAnalytics(MonthlyAnalyticsEntity monthlyAnalyticsEntity, Continuation<? super Long> continuation);

    Object savePairs(List<PairIndexEntity> list, Continuation<? super List<Long>> continuation);

    Object saveTransitions(List<TransitionIndexEntity> list, Continuation<? super List<Long>> continuation);

    Object saveTriplets(List<TripletIndexEntity> list, Continuation<? super List<Long>> continuation);
}
