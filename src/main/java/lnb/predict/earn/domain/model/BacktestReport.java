package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Llnb/predict/earn/domain/model/BacktestReport;", "", "totalSteps", "", "averageHits", "", "bestHit", "steps", "", "Llnb/predict/earn/domain/model/BacktestStep;", "<init>", "(IDILjava/util/List;)V", "getTotalSteps", "()I", "getAverageHits", "()D", "getBestHit", "getSteps", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BacktestReport {
    public static final int $stable = 0;
    private final double averageHits;
    private final int bestHit;
    private final List<BacktestStep> steps;
    private final int totalSteps;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BacktestReport copy$default(BacktestReport backtestReport, int i, double d, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = backtestReport.totalSteps;
        }
        if ((i3 & 2) != 0) {
            d = backtestReport.averageHits;
        }
        if ((i3 & 4) != 0) {
            i2 = backtestReport.bestHit;
        }
        if ((i3 & 8) != 0) {
            list = backtestReport.steps;
        }
        return backtestReport.copy(i, d, i2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAverageHits() {
        return this.averageHits;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBestHit() {
        return this.bestHit;
    }

    public final List<BacktestStep> component4() {
        return this.steps;
    }

    public final BacktestReport copy(int totalSteps, double averageHits, int bestHit, List<BacktestStep> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new BacktestReport(totalSteps, averageHits, bestHit, steps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacktestReport)) {
            return false;
        }
        BacktestReport backtestReport = (BacktestReport) other;
        return this.totalSteps == backtestReport.totalSteps && Double.compare(this.averageHits, backtestReport.averageHits) == 0 && this.bestHit == backtestReport.bestHit && Intrinsics.areEqual(this.steps, backtestReport.steps);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.totalSteps) * 31) + Double.hashCode(this.averageHits)) * 31) + Integer.hashCode(this.bestHit)) * 31) + this.steps.hashCode();
    }

    public String toString() {
        return "BacktestReport(totalSteps=" + this.totalSteps + ", averageHits=" + this.averageHits + ", bestHit=" + this.bestHit + ", steps=" + this.steps + ")";
    }

    public BacktestReport(int totalSteps, double averageHits, int bestHit, List<BacktestStep> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.totalSteps = totalSteps;
        this.averageHits = averageHits;
        this.bestHit = bestHit;
        this.steps = steps;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final double getAverageHits() {
        return this.averageHits;
    }

    public final int getBestHit() {
        return this.bestHit;
    }

    public final List<BacktestStep> getSteps() {
        return this.steps;
    }
}
