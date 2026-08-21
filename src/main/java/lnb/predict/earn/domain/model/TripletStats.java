package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Llnb/predict/earn/domain/model/TripletStats;", "", "t1", "", "t2", "t3", "count", "<init>", "(IIII)V", "getT1", "()I", "getT2", "getT3", "getCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class TripletStats {
    public static final int $stable = 0;
    private final int count;
    private final int t1;
    private final int t2;
    private final int t3;

    public static /* synthetic */ TripletStats copy$default(TripletStats tripletStats, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = tripletStats.t1;
        }
        if ((i5 & 2) != 0) {
            i2 = tripletStats.t2;
        }
        if ((i5 & 4) != 0) {
            i3 = tripletStats.t3;
        }
        if ((i5 & 8) != 0) {
            i4 = tripletStats.count;
        }
        return tripletStats.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getT1() {
        return this.t1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getT2() {
        return this.t2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getT3() {
        return this.t3;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final TripletStats copy(int t1, int t2, int t3, int count) {
        return new TripletStats(t1, t2, t3, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripletStats)) {
            return false;
        }
        TripletStats tripletStats = (TripletStats) other;
        return this.t1 == tripletStats.t1 && this.t2 == tripletStats.t2 && this.t3 == tripletStats.t3 && this.count == tripletStats.count;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.t1) * 31) + Integer.hashCode(this.t2)) * 31) + Integer.hashCode(this.t3)) * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        return "TripletStats(t1=" + this.t1 + ", t2=" + this.t2 + ", t3=" + this.t3 + ", count=" + this.count + ")";
    }

    public TripletStats(int t1, int t2, int t3, int count) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.count = count;
    }

    public final int getT1() {
        return this.t1;
    }

    public final int getT2() {
        return this.t2;
    }

    public final int getT3() {
        return this.t3;
    }

    public final int getCount() {
        return this.count;
    }
}
