package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Llnb/predict/earn/domain/model/HourlyStats;", "", "number", "", "from11To14", "", "from11To18", "from14To18", "from18To21", "<init>", "(IDDDD)V", "getNumber", "()I", "getFrom11To14", "()D", "getFrom11To18", "getFrom14To18", "getFrom18To21", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class HourlyStats {
    public static final int $stable = 0;
    private final double from11To14;
    private final double from11To18;
    private final double from14To18;
    private final double from18To21;
    private final int number;

    public static /* synthetic */ HourlyStats copy$default(HourlyStats hourlyStats, int i, double d, double d2, double d3, double d4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hourlyStats.number;
        }
        if ((i2 & 2) != 0) {
            d = hourlyStats.from11To14;
        }
        if ((i2 & 4) != 0) {
            d2 = hourlyStats.from11To18;
        }
        if ((i2 & 8) != 0) {
            d3 = hourlyStats.from14To18;
        }
        if ((i2 & 16) != 0) {
            d4 = hourlyStats.from18To21;
        }
        double d5 = d4;
        double d6 = d3;
        return hourlyStats.copy(i, d, d2, d6, d5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getFrom11To14() {
        return this.from11To14;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getFrom11To18() {
        return this.from11To18;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getFrom14To18() {
        return this.from14To18;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getFrom18To21() {
        return this.from18To21;
    }

    public final HourlyStats copy(int number, double from11To14, double from11To18, double from14To18, double from18To21) {
        return new HourlyStats(number, from11To14, from11To18, from14To18, from18To21);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HourlyStats)) {
            return false;
        }
        HourlyStats hourlyStats = (HourlyStats) other;
        return this.number == hourlyStats.number && Double.compare(this.from11To14, hourlyStats.from11To14) == 0 && Double.compare(this.from11To18, hourlyStats.from11To18) == 0 && Double.compare(this.from14To18, hourlyStats.from14To18) == 0 && Double.compare(this.from18To21, hourlyStats.from18To21) == 0;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.number) * 31) + Double.hashCode(this.from11To14)) * 31) + Double.hashCode(this.from11To18)) * 31) + Double.hashCode(this.from14To18)) * 31) + Double.hashCode(this.from18To21);
    }

    public String toString() {
        return "HourlyStats(number=" + this.number + ", from11To14=" + this.from11To14 + ", from11To18=" + this.from11To18 + ", from14To18=" + this.from14To18 + ", from18To21=" + this.from18To21 + ")";
    }

    public HourlyStats(int number, double from11To14, double from11To18, double from14To18, double from18To21) {
        this.number = number;
        this.from11To14 = from11To14;
        this.from11To18 = from11To18;
        this.from14To18 = from14To18;
        this.from18To21 = from18To21;
    }

    public final int getNumber() {
        return this.number;
    }

    public final double getFrom11To14() {
        return this.from11To14;
    }

    public final double getFrom11To18() {
        return this.from11To18;
    }

    public final double getFrom14To18() {
        return this.from14To18;
    }

    public final double getFrom18To21() {
        return this.from18To21;
    }
}
