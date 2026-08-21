package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Llnb/predict/earn/domain/model/FrequencyStats;", "", "number", "", "total", "last30", "last90", "last180", "yearly", "<init>", "(IIIIII)V", "getNumber", "()I", "getTotal", "getLast30", "getLast90", "getLast180", "getYearly", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class FrequencyStats {
    public static final int $stable = 0;
    private final int last180;
    private final int last30;
    private final int last90;
    private final int number;
    private final int total;
    private final int yearly;

    public static /* synthetic */ FrequencyStats copy$default(FrequencyStats frequencyStats, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = frequencyStats.number;
        }
        if ((i7 & 2) != 0) {
            i2 = frequencyStats.total;
        }
        if ((i7 & 4) != 0) {
            i3 = frequencyStats.last30;
        }
        if ((i7 & 8) != 0) {
            i4 = frequencyStats.last90;
        }
        if ((i7 & 16) != 0) {
            i5 = frequencyStats.last180;
        }
        if ((i7 & 32) != 0) {
            i6 = frequencyStats.yearly;
        }
        int i8 = i5;
        int i9 = i6;
        return frequencyStats.copy(i, i2, i3, i4, i8, i9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLast30() {
        return this.last30;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLast90() {
        return this.last90;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLast180() {
        return this.last180;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getYearly() {
        return this.yearly;
    }

    public final FrequencyStats copy(int number, int total, int last30, int last90, int last180, int yearly) {
        return new FrequencyStats(number, total, last30, last90, last180, yearly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequencyStats)) {
            return false;
        }
        FrequencyStats frequencyStats = (FrequencyStats) other;
        return this.number == frequencyStats.number && this.total == frequencyStats.total && this.last30 == frequencyStats.last30 && this.last90 == frequencyStats.last90 && this.last180 == frequencyStats.last180 && this.yearly == frequencyStats.yearly;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.number) * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.last30)) * 31) + Integer.hashCode(this.last90)) * 31) + Integer.hashCode(this.last180)) * 31) + Integer.hashCode(this.yearly);
    }

    public String toString() {
        return "FrequencyStats(number=" + this.number + ", total=" + this.total + ", last30=" + this.last30 + ", last90=" + this.last90 + ", last180=" + this.last180 + ", yearly=" + this.yearly + ")";
    }

    public FrequencyStats(int number, int total, int last30, int last90, int last180, int yearly) {
        this.number = number;
        this.total = total;
        this.last30 = last30;
        this.last90 = last90;
        this.last180 = last180;
        this.yearly = yearly;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getLast30() {
        return this.last30;
    }

    public final int getLast90() {
        return this.last90;
    }

    public final int getLast180() {
        return this.last180;
    }

    public final int getYearly() {
        return this.yearly;
    }
}
