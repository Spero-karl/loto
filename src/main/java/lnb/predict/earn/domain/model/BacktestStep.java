package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Llnb/predict/earn/domain/model/BacktestStep;", "", "date", "", "drawName", "predicted", "", "", "actual", "hits", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V", "getDate", "()Ljava/lang/String;", "getDrawName", "getPredicted", "()Ljava/util/List;", "getActual", "getHits", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BacktestStep {
    public static final int $stable = 0;
    private final List<Integer> actual;
    private final String date;
    private final String drawName;
    private final int hits;
    private final List<Integer> predicted;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BacktestStep copy$default(BacktestStep backtestStep, String str, String str2, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = backtestStep.date;
        }
        if ((i2 & 2) != 0) {
            str2 = backtestStep.drawName;
        }
        if ((i2 & 4) != 0) {
            list = backtestStep.predicted;
        }
        if ((i2 & 8) != 0) {
            list2 = backtestStep.actual;
        }
        if ((i2 & 16) != 0) {
            i = backtestStep.hits;
        }
        int i3 = i;
        List list3 = list;
        return backtestStep.copy(str, str2, list3, list2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDrawName() {
        return this.drawName;
    }

    public final List<Integer> component3() {
        return this.predicted;
    }

    public final List<Integer> component4() {
        return this.actual;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHits() {
        return this.hits;
    }

    public final BacktestStep copy(String date, String drawName, List<Integer> predicted, List<Integer> actual, int hits) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(predicted, "predicted");
        Intrinsics.checkNotNullParameter(actual, "actual");
        return new BacktestStep(date, drawName, predicted, actual, hits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacktestStep)) {
            return false;
        }
        BacktestStep backtestStep = (BacktestStep) other;
        return Intrinsics.areEqual(this.date, backtestStep.date) && Intrinsics.areEqual(this.drawName, backtestStep.drawName) && Intrinsics.areEqual(this.predicted, backtestStep.predicted) && Intrinsics.areEqual(this.actual, backtestStep.actual) && this.hits == backtestStep.hits;
    }

    public int hashCode() {
        return (((((((this.date.hashCode() * 31) + this.drawName.hashCode()) * 31) + this.predicted.hashCode()) * 31) + this.actual.hashCode()) * 31) + Integer.hashCode(this.hits);
    }

    public String toString() {
        return "BacktestStep(date=" + this.date + ", drawName=" + this.drawName + ", predicted=" + this.predicted + ", actual=" + this.actual + ", hits=" + this.hits + ")";
    }

    public BacktestStep(String date, String drawName, List<Integer> predicted, List<Integer> actual, int hits) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(predicted, "predicted");
        Intrinsics.checkNotNullParameter(actual, "actual");
        this.date = date;
        this.drawName = drawName;
        this.predicted = predicted;
        this.actual = actual;
        this.hits = hits;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDrawName() {
        return this.drawName;
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
}
