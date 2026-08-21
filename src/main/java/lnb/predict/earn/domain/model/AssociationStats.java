package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Llnb/predict/earn/domain/model/AssociationStats;", "", "number", "", "topCompanions", "", "Llnb/predict/earn/domain/model/Companion;", "<init>", "(ILjava/util/List;)V", "getNumber", "()I", "getTopCompanions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AssociationStats {
    public static final int $stable = 0;
    private final int number;
    private final List<Companion> topCompanions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssociationStats copy$default(AssociationStats associationStats, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = associationStats.number;
        }
        if ((i2 & 2) != 0) {
            list = associationStats.topCompanions;
        }
        return associationStats.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    public final List<Companion> component2() {
        return this.topCompanions;
    }

    public final AssociationStats copy(int number, List<Companion> topCompanions) {
        Intrinsics.checkNotNullParameter(topCompanions, "topCompanions");
        return new AssociationStats(number, topCompanions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssociationStats)) {
            return false;
        }
        AssociationStats associationStats = (AssociationStats) other;
        return this.number == associationStats.number && Intrinsics.areEqual(this.topCompanions, associationStats.topCompanions);
    }

    public int hashCode() {
        return (Integer.hashCode(this.number) * 31) + this.topCompanions.hashCode();
    }

    public String toString() {
        return "AssociationStats(number=" + this.number + ", topCompanions=" + this.topCompanions + ")";
    }

    public AssociationStats(int number, List<Companion> topCompanions) {
        Intrinsics.checkNotNullParameter(topCompanions, "topCompanions");
        this.number = number;
        this.topCompanions = topCompanions;
    }

    public final int getNumber() {
        return this.number;
    }

    public final List<Companion> getTopCompanions() {
        return this.topCompanions;
    }
}
