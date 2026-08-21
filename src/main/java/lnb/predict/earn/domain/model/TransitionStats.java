package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Llnb/predict/earn/domain/model/TransitionStats;", "", "number", "", "tPlus1", "", "Llnb/predict/earn/domain/model/Transition;", "tPlus2", "tPlus3", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getNumber", "()I", "getTPlus1", "()Ljava/util/List;", "getTPlus2", "getTPlus3", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class TransitionStats {
    public static final int $stable = 0;
    private final int number;
    private final List<Transition> tPlus1;
    private final List<Transition> tPlus2;
    private final List<Transition> tPlus3;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransitionStats copy$default(TransitionStats transitionStats, int i, List list, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transitionStats.number;
        }
        if ((i2 & 2) != 0) {
            list = transitionStats.tPlus1;
        }
        if ((i2 & 4) != 0) {
            list2 = transitionStats.tPlus2;
        }
        if ((i2 & 8) != 0) {
            list3 = transitionStats.tPlus3;
        }
        return transitionStats.copy(i, list, list2, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    public final List<Transition> component2() {
        return this.tPlus1;
    }

    public final List<Transition> component3() {
        return this.tPlus2;
    }

    public final List<Transition> component4() {
        return this.tPlus3;
    }

    public final TransitionStats copy(int number, List<Transition> tPlus1, List<Transition> tPlus2, List<Transition> tPlus3) {
        Intrinsics.checkNotNullParameter(tPlus1, "tPlus1");
        Intrinsics.checkNotNullParameter(tPlus2, "tPlus2");
        Intrinsics.checkNotNullParameter(tPlus3, "tPlus3");
        return new TransitionStats(number, tPlus1, tPlus2, tPlus3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionStats)) {
            return false;
        }
        TransitionStats transitionStats = (TransitionStats) other;
        return this.number == transitionStats.number && Intrinsics.areEqual(this.tPlus1, transitionStats.tPlus1) && Intrinsics.areEqual(this.tPlus2, transitionStats.tPlus2) && Intrinsics.areEqual(this.tPlus3, transitionStats.tPlus3);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.number) * 31) + this.tPlus1.hashCode()) * 31) + this.tPlus2.hashCode()) * 31) + this.tPlus3.hashCode();
    }

    public String toString() {
        return "TransitionStats(number=" + this.number + ", tPlus1=" + this.tPlus1 + ", tPlus2=" + this.tPlus2 + ", tPlus3=" + this.tPlus3 + ")";
    }

    public TransitionStats(int number, List<Transition> tPlus1, List<Transition> tPlus2, List<Transition> tPlus3) {
        Intrinsics.checkNotNullParameter(tPlus1, "tPlus1");
        Intrinsics.checkNotNullParameter(tPlus2, "tPlus2");
        Intrinsics.checkNotNullParameter(tPlus3, "tPlus3");
        this.number = number;
        this.tPlus1 = tPlus1;
        this.tPlus2 = tPlus2;
        this.tPlus3 = tPlus3;
    }

    public final int getNumber() {
        return this.number;
    }

    public final List<Transition> getTPlus1() {
        return this.tPlus1;
    }

    public final List<Transition> getTPlus2() {
        return this.tPlus2;
    }

    public final List<Transition> getTPlus3() {
        return this.tPlus3;
    }
}
