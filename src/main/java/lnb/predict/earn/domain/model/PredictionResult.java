package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Llnb/predict/earn/domain/model/PredictionResult;", "", "top5", "", "Llnb/predict/earn/domain/model/NumberProfile;", "top10", "top20", "timestamp", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;J)V", "getTop5", "()Ljava/util/List;", "getTop10", "getTop20", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PredictionResult {
    public static final int $stable = 0;
    private final long timestamp;
    private final List<NumberProfile> top10;
    private final List<NumberProfile> top20;
    private final List<NumberProfile> top5;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PredictionResult copy$default(PredictionResult predictionResult, List list, List list2, List list3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = predictionResult.top5;
        }
        if ((i & 2) != 0) {
            list2 = predictionResult.top10;
        }
        if ((i & 4) != 0) {
            list3 = predictionResult.top20;
        }
        if ((i & 8) != 0) {
            j = predictionResult.timestamp;
        }
        List list4 = list3;
        return predictionResult.copy(list, list2, list4, j);
    }

    public final List<NumberProfile> component1() {
        return this.top5;
    }

    public final List<NumberProfile> component2() {
        return this.top10;
    }

    public final List<NumberProfile> component3() {
        return this.top20;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final PredictionResult copy(List<NumberProfile> top5, List<NumberProfile> top10, List<NumberProfile> top20, long timestamp) {
        Intrinsics.checkNotNullParameter(top5, "top5");
        Intrinsics.checkNotNullParameter(top10, "top10");
        Intrinsics.checkNotNullParameter(top20, "top20");
        return new PredictionResult(top5, top10, top20, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredictionResult)) {
            return false;
        }
        PredictionResult predictionResult = (PredictionResult) other;
        return Intrinsics.areEqual(this.top5, predictionResult.top5) && Intrinsics.areEqual(this.top10, predictionResult.top10) && Intrinsics.areEqual(this.top20, predictionResult.top20) && this.timestamp == predictionResult.timestamp;
    }

    public int hashCode() {
        return (((((this.top5.hashCode() * 31) + this.top10.hashCode()) * 31) + this.top20.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "PredictionResult(top5=" + this.top5 + ", top10=" + this.top10 + ", top20=" + this.top20 + ", timestamp=" + this.timestamp + ")";
    }

    public PredictionResult(List<NumberProfile> top5, List<NumberProfile> top10, List<NumberProfile> top20, long timestamp) {
        Intrinsics.checkNotNullParameter(top5, "top5");
        Intrinsics.checkNotNullParameter(top10, "top10");
        Intrinsics.checkNotNullParameter(top20, "top20");
        this.top5 = top5;
        this.top10 = top10;
        this.top20 = top20;
        this.timestamp = timestamp;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PredictionResult(List list, List list2, List list3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jCurrentTimeMillis;
        if ((i & 8) == 0) {
            jCurrentTimeMillis = j;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this(list, list2, list3, jCurrentTimeMillis);
    }

    public final List<NumberProfile> getTop5() {
        return this.top5;
    }

    public final List<NumberProfile> getTop10() {
        return this.top10;
    }

    public final List<NumberProfile> getTop20() {
        return this.top20;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
