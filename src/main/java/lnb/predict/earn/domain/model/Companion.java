package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Llnb/predict/earn/domain/model/Companion;", "", "number", "", "count", "percentage", "", "<init>", "(IID)V", "getNumber", "()I", "getCount", "getPercentage", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class Companion {
    public static final int $stable = 0;
    private final int count;
    private final int number;
    private final double percentage;

    public static /* synthetic */ Companion copy$default(Companion companion, int i, int i2, double d, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = companion.number;
        }
        if ((i3 & 2) != 0) {
            i2 = companion.count;
        }
        if ((i3 & 4) != 0) {
            d = companion.percentage;
        }
        return companion.copy(i, i2, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    public final Companion copy(int number, int count, double percentage) {
        return new Companion(number, count, percentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Companion)) {
            return false;
        }
        Companion companion = (Companion) other;
        return this.number == companion.number && this.count == companion.count && Double.compare(this.percentage, companion.percentage) == 0;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.number) * 31) + Integer.hashCode(this.count)) * 31) + Double.hashCode(this.percentage);
    }

    public String toString() {
        return "Companion(number=" + this.number + ", count=" + this.count + ", percentage=" + this.percentage + ")";
    }

    public Companion(int number, int count, double percentage) {
        this.number = number;
        this.count = count;
        this.percentage = percentage;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getCount() {
        return this.count;
    }

    public final double getPercentage() {
        return this.percentage;
    }
}
