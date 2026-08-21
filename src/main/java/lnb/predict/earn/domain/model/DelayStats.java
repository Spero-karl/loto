package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Llnb/predict/earn/domain/model/DelayStats;", "", "number", "", "current", "mean", "", "max", "<init>", "(IIDI)V", "getNumber", "()I", "getCurrent", "getMean", "()D", "getMax", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DelayStats {
    public static final int $stable = 0;
    private final int current;
    private final int max;
    private final double mean;
    private final int number;

    public static /* synthetic */ DelayStats copy$default(DelayStats delayStats, int i, int i2, double d, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = delayStats.number;
        }
        if ((i4 & 2) != 0) {
            i2 = delayStats.current;
        }
        if ((i4 & 4) != 0) {
            d = delayStats.mean;
        }
        if ((i4 & 8) != 0) {
            i3 = delayStats.max;
        }
        int i5 = i3;
        return delayStats.copy(i, i2, d, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMean() {
        return this.mean;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    public final DelayStats copy(int number, int current, double mean, int max) {
        return new DelayStats(number, current, mean, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelayStats)) {
            return false;
        }
        DelayStats delayStats = (DelayStats) other;
        return this.number == delayStats.number && this.current == delayStats.current && Double.compare(this.mean, delayStats.mean) == 0 && this.max == delayStats.max;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.number) * 31) + Integer.hashCode(this.current)) * 31) + Double.hashCode(this.mean)) * 31) + Integer.hashCode(this.max);
    }

    public String toString() {
        return "DelayStats(number=" + this.number + ", current=" + this.current + ", mean=" + this.mean + ", max=" + this.max + ")";
    }

    public DelayStats(int number, int current, double mean, int max) {
        this.number = number;
        this.current = current;
        this.mean = mean;
        this.max = max;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final double getMean() {
        return this.mean;
    }

    public final int getMax() {
        return this.max;
    }
}
