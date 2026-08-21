package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Llnb/predict/earn/domain/model/RepetitionStats;", "", "number", "", "tPlus1", "", "tPlus2", "tPlus3", "tPlus4", "tPlus5", "<init>", "(IDDDDD)V", "getNumber", "()I", "getTPlus1", "()D", "getTPlus2", "getTPlus3", "getTPlus4", "getTPlus5", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class RepetitionStats {
    public static final int $stable = 0;
    private final int number;
    private final double tPlus1;
    private final double tPlus2;
    private final double tPlus3;
    private final double tPlus4;
    private final double tPlus5;

    public static /* synthetic */ RepetitionStats copy$default(RepetitionStats repetitionStats, int i, double d, double d2, double d3, double d4, double d5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = repetitionStats.number;
        }
        if ((i2 & 2) != 0) {
            d = repetitionStats.tPlus1;
        }
        if ((i2 & 4) != 0) {
            d2 = repetitionStats.tPlus2;
        }
        if ((i2 & 8) != 0) {
            d3 = repetitionStats.tPlus3;
        }
        if ((i2 & 16) != 0) {
            d4 = repetitionStats.tPlus4;
        }
        if ((i2 & 32) != 0) {
            d5 = repetitionStats.tPlus5;
        }
        double d6 = d5;
        double d7 = d4;
        double d8 = d3;
        return repetitionStats.copy(i, d, d2, d8, d7, d6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getTPlus1() {
        return this.tPlus1;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getTPlus2() {
        return this.tPlus2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getTPlus3() {
        return this.tPlus3;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getTPlus4() {
        return this.tPlus4;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getTPlus5() {
        return this.tPlus5;
    }

    public final RepetitionStats copy(int number, double tPlus1, double tPlus2, double tPlus3, double tPlus4, double tPlus5) {
        return new RepetitionStats(number, tPlus1, tPlus2, tPlus3, tPlus4, tPlus5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepetitionStats)) {
            return false;
        }
        RepetitionStats repetitionStats = (RepetitionStats) other;
        return this.number == repetitionStats.number && Double.compare(this.tPlus1, repetitionStats.tPlus1) == 0 && Double.compare(this.tPlus2, repetitionStats.tPlus2) == 0 && Double.compare(this.tPlus3, repetitionStats.tPlus3) == 0 && Double.compare(this.tPlus4, repetitionStats.tPlus4) == 0 && Double.compare(this.tPlus5, repetitionStats.tPlus5) == 0;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.number) * 31) + Double.hashCode(this.tPlus1)) * 31) + Double.hashCode(this.tPlus2)) * 31) + Double.hashCode(this.tPlus3)) * 31) + Double.hashCode(this.tPlus4)) * 31) + Double.hashCode(this.tPlus5);
    }

    public String toString() {
        return "RepetitionStats(number=" + this.number + ", tPlus1=" + this.tPlus1 + ", tPlus2=" + this.tPlus2 + ", tPlus3=" + this.tPlus3 + ", tPlus4=" + this.tPlus4 + ", tPlus5=" + this.tPlus5 + ")";
    }

    public RepetitionStats(int number, double tPlus1, double tPlus2, double tPlus3, double tPlus4, double tPlus5) {
        this.number = number;
        this.tPlus1 = tPlus1;
        this.tPlus2 = tPlus2;
        this.tPlus3 = tPlus3;
        this.tPlus4 = tPlus4;
        this.tPlus5 = tPlus5;
    }

    public final int getNumber() {
        return this.number;
    }

    public final double getTPlus1() {
        return this.tPlus1;
    }

    public final double getTPlus2() {
        return this.tPlus2;
    }

    public final double getTPlus3() {
        return this.tPlus3;
    }

    public final double getTPlus4() {
        return this.tPlus4;
    }

    public final double getTPlus5() {
        return this.tPlus5;
    }
}
