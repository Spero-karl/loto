package lnb.predict.earn.data.remote;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoDto.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, d2 = {"Llnb/predict/earn/data/remote/LotoResponse;", "", "drawsResultsWeekly", "", "Llnb/predict/earn/data/remote/WeeklyResultDto;", "success", "", "monthYears", "", "<init>", "(Ljava/util/List;ZLjava/util/List;)V", "getDrawsResultsWeekly", "()Ljava/util/List;", "getSuccess", "()Z", "getMonthYears", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class LotoResponse {
    public static final int $stable = 8;
    private final List<WeeklyResultDto> drawsResultsWeekly;
    private final List<String> monthYears;
    private final boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LotoResponse copy$default(LotoResponse lotoResponse, List list, boolean z, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lotoResponse.drawsResultsWeekly;
        }
        if ((i & 2) != 0) {
            z = lotoResponse.success;
        }
        if ((i & 4) != 0) {
            list2 = lotoResponse.monthYears;
        }
        return lotoResponse.copy(list, z, list2);
    }

    public final List<WeeklyResultDto> component1() {
        return this.drawsResultsWeekly;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final List<String> component3() {
        return this.monthYears;
    }

    public final LotoResponse copy(List<WeeklyResultDto> drawsResultsWeekly, boolean success, List<String> monthYears) {
        Intrinsics.checkNotNullParameter(drawsResultsWeekly, "drawsResultsWeekly");
        return new LotoResponse(drawsResultsWeekly, success, monthYears);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotoResponse)) {
            return false;
        }
        LotoResponse lotoResponse = (LotoResponse) other;
        return Intrinsics.areEqual(this.drawsResultsWeekly, lotoResponse.drawsResultsWeekly) && this.success == lotoResponse.success && Intrinsics.areEqual(this.monthYears, lotoResponse.monthYears);
    }

    public int hashCode() {
        return (((this.drawsResultsWeekly.hashCode() * 31) + Boolean.hashCode(this.success)) * 31) + (this.monthYears == null ? 0 : this.monthYears.hashCode());
    }

    public String toString() {
        return "LotoResponse(drawsResultsWeekly=" + this.drawsResultsWeekly + ", success=" + this.success + ", monthYears=" + this.monthYears + ")";
    }

    public LotoResponse(List<WeeklyResultDto> drawsResultsWeekly, boolean success, List<String> list) {
        Intrinsics.checkNotNullParameter(drawsResultsWeekly, "drawsResultsWeekly");
        this.drawsResultsWeekly = drawsResultsWeekly;
        this.success = success;
        this.monthYears = list;
    }

    public /* synthetic */ LotoResponse(List list, boolean z, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z, (i & 4) != 0 ? null : list2);
    }

    public final List<WeeklyResultDto> getDrawsResultsWeekly() {
        return this.drawsResultsWeekly;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final List<String> getMonthYears() {
        return this.monthYears;
    }
}
