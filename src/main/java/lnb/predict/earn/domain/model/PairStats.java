package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Llnb/predict/earn/domain/model/PairStats;", "", "p1", "", "p2", "count", "returnRate", "", "<init>", "(IIID)V", "getP1", "()I", "getP2", "getCount", "getReturnRate", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PairStats {
    public static final int $stable = 0;
    private final int count;
    private final int p1;
    private final int p2;
    private final double returnRate;

    public static /* synthetic */ PairStats copy$default(PairStats pairStats, int i, int i2, int i3, double d, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = pairStats.p1;
        }
        if ((i4 & 2) != 0) {
            i2 = pairStats.p2;
        }
        if ((i4 & 4) != 0) {
            i3 = pairStats.count;
        }
        if ((i4 & 8) != 0) {
            d = pairStats.returnRate;
        }
        int i5 = i3;
        return pairStats.copy(i, i2, i5, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getP1() {
        return this.p1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getP2() {
        return this.p2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getReturnRate() {
        return this.returnRate;
    }

    public final PairStats copy(int p1, int p2, int count, double returnRate) {
        return new PairStats(p1, p2, count, returnRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PairStats)) {
            return false;
        }
        PairStats pairStats = (PairStats) other;
        return this.p1 == pairStats.p1 && this.p2 == pairStats.p2 && this.count == pairStats.count && Double.compare(this.returnRate, pairStats.returnRate) == 0;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.p1) * 31) + Integer.hashCode(this.p2)) * 31) + Integer.hashCode(this.count)) * 31) + Double.hashCode(this.returnRate);
    }

    public String toString() {
        return "PairStats(p1=" + this.p1 + ", p2=" + this.p2 + ", count=" + this.count + ", returnRate=" + this.returnRate + ")";
    }

    public PairStats(int p1, int p2, int count, double returnRate) {
        this.p1 = p1;
        this.p2 = p2;
        this.count = count;
        this.returnRate = returnRate;
    }

    public final int getP1() {
        return this.p1;
    }

    public final int getP2() {
        return this.p2;
    }

    public final int getCount() {
        return this.count;
    }

    public final double getReturnRate() {
        return this.returnRate;
    }
}
