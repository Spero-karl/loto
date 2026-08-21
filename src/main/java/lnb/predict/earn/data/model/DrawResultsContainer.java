package lnb.predict.earn.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Llnb/predict/earn/data/model/DrawResultsContainer;", "", "nightDraws", "", "Llnb/predict/earn/data/model/DrawDetail;", "standardDraws", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getNightDraws", "()Ljava/util/List;", "getStandardDraws", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DrawResultsContainer {
    public static final int $stable = 8;

    @SerializedName("nightDraws")
    private final List<DrawDetail> nightDraws;

    @SerializedName("standardDraws")
    private final List<DrawDetail> standardDraws;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawResultsContainer copy$default(DrawResultsContainer drawResultsContainer, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = drawResultsContainer.nightDraws;
        }
        if ((i & 2) != 0) {
            list2 = drawResultsContainer.standardDraws;
        }
        return drawResultsContainer.copy(list, list2);
    }

    public final List<DrawDetail> component1() {
        return this.nightDraws;
    }

    public final List<DrawDetail> component2() {
        return this.standardDraws;
    }

    public final DrawResultsContainer copy(List<DrawDetail> nightDraws, List<DrawDetail> standardDraws) {
        Intrinsics.checkNotNullParameter(nightDraws, "nightDraws");
        Intrinsics.checkNotNullParameter(standardDraws, "standardDraws");
        return new DrawResultsContainer(nightDraws, standardDraws);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawResultsContainer)) {
            return false;
        }
        DrawResultsContainer drawResultsContainer = (DrawResultsContainer) other;
        return Intrinsics.areEqual(this.nightDraws, drawResultsContainer.nightDraws) && Intrinsics.areEqual(this.standardDraws, drawResultsContainer.standardDraws);
    }

    public int hashCode() {
        return (this.nightDraws.hashCode() * 31) + this.standardDraws.hashCode();
    }

    public String toString() {
        return "DrawResultsContainer(nightDraws=" + this.nightDraws + ", standardDraws=" + this.standardDraws + ")";
    }

    public DrawResultsContainer(List<DrawDetail> nightDraws, List<DrawDetail> standardDraws) {
        Intrinsics.checkNotNullParameter(nightDraws, "nightDraws");
        Intrinsics.checkNotNullParameter(standardDraws, "standardDraws");
        this.nightDraws = nightDraws;
        this.standardDraws = standardDraws;
    }

    public final List<DrawDetail> getNightDraws() {
        return this.nightDraws;
    }

    public final List<DrawDetail> getStandardDraws() {
        return this.standardDraws;
    }
}
