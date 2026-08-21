package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Llnb/predict/earn/domain/model/LearningHistory;", "", "date", "Ljava/time/LocalDate;", "predicted", "", "", "actual", "hits", "precision", "", "<init>", "(Ljava/time/LocalDate;Ljava/util/List;Ljava/util/List;ID)V", "getDate", "()Ljava/time/LocalDate;", "getPredicted", "()Ljava/util/List;", "getActual", "getHits", "()I", "getPrecision", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class LearningHistory {
    public static final int $stable = 0;
    private final List<Integer> actual;
    private final LocalDate date;
    private final int hits;
    private final double precision;
    private final List<Integer> predicted;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LearningHistory copy$default(LearningHistory learningHistory, LocalDate localDate, List list, List list2, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localDate = learningHistory.date;
        }
        if ((i2 & 2) != 0) {
            list = learningHistory.predicted;
        }
        if ((i2 & 4) != 0) {
            list2 = learningHistory.actual;
        }
        if ((i2 & 8) != 0) {
            i = learningHistory.hits;
        }
        if ((i2 & 16) != 0) {
            d = learningHistory.precision;
        }
        double d2 = d;
        return learningHistory.copy(localDate, list, list2, i, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    public final List<Integer> component2() {
        return this.predicted;
    }

    public final List<Integer> component3() {
        return this.actual;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHits() {
        return this.hits;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getPrecision() {
        return this.precision;
    }

    public final LearningHistory copy(LocalDate date, List<Integer> predicted, List<Integer> actual, int hits, double precision) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(predicted, "predicted");
        Intrinsics.checkNotNullParameter(actual, "actual");
        return new LearningHistory(date, predicted, actual, hits, precision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LearningHistory)) {
            return false;
        }
        LearningHistory learningHistory = (LearningHistory) other;
        return Intrinsics.areEqual(this.date, learningHistory.date) && Intrinsics.areEqual(this.predicted, learningHistory.predicted) && Intrinsics.areEqual(this.actual, learningHistory.actual) && this.hits == learningHistory.hits && Double.compare(this.precision, learningHistory.precision) == 0;
    }

    public int hashCode() {
        return (((((((this.date.hashCode() * 31) + this.predicted.hashCode()) * 31) + this.actual.hashCode()) * 31) + Integer.hashCode(this.hits)) * 31) + Double.hashCode(this.precision);
    }

    public String toString() {
        return "LearningHistory(date=" + this.date + ", predicted=" + this.predicted + ", actual=" + this.actual + ", hits=" + this.hits + ", precision=" + this.precision + ")";
    }

    public LearningHistory(LocalDate date, List<Integer> predicted, List<Integer> actual, int hits, double precision) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(predicted, "predicted");
        Intrinsics.checkNotNullParameter(actual, "actual");
        this.date = date;
        this.predicted = predicted;
        this.actual = actual;
        this.hits = hits;
        this.precision = precision;
    }

    public final LocalDate getDate() {
        return this.date;
    }

    public final List<Integer> getPredicted() {
        return this.predicted;
    }

    public final List<Integer> getActual() {
        return this.actual;
    }

    public final int getHits() {
        return this.hits;
    }

    public final double getPrecision() {
        return this.precision;
    }
}
