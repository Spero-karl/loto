package lnb.predict.earn.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Llnb/predict/earn/data/model/LotoResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "success", "", "drawsResultsWeekly", "", "Llnb/predict/earn/data/model/WeeklyResult;", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "getStatus", "()Ljava/lang/String;", "getSuccess", "()Z", "getDrawsResultsWeekly", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class LotoResponse {
    public static final int $stable = 8;

    @SerializedName("drawsResultsWeekly")
    private final List<WeeklyResult> drawsResultsWeekly;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("success")
    private final boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LotoResponse copy$default(LotoResponse lotoResponse, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lotoResponse.status;
        }
        if ((i & 2) != 0) {
            z = lotoResponse.success;
        }
        if ((i & 4) != 0) {
            list = lotoResponse.drawsResultsWeekly;
        }
        return lotoResponse.copy(str, z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final List<WeeklyResult> component3() {
        return this.drawsResultsWeekly;
    }

    public final LotoResponse copy(String status, boolean success, List<WeeklyResult> drawsResultsWeekly) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(drawsResultsWeekly, "drawsResultsWeekly");
        return new LotoResponse(status, success, drawsResultsWeekly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotoResponse)) {
            return false;
        }
        LotoResponse lotoResponse = (LotoResponse) other;
        return Intrinsics.areEqual(this.status, lotoResponse.status) && this.success == lotoResponse.success && Intrinsics.areEqual(this.drawsResultsWeekly, lotoResponse.drawsResultsWeekly);
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + Boolean.hashCode(this.success)) * 31) + this.drawsResultsWeekly.hashCode();
    }

    public String toString() {
        return "LotoResponse(status=" + this.status + ", success=" + this.success + ", drawsResultsWeekly=" + this.drawsResultsWeekly + ")";
    }

    public LotoResponse(String status, boolean success, List<WeeklyResult> drawsResultsWeekly) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(drawsResultsWeekly, "drawsResultsWeekly");
        this.status = status;
        this.success = success;
        this.drawsResultsWeekly = drawsResultsWeekly;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final List<WeeklyResult> getDrawsResultsWeekly() {
        return this.drawsResultsWeekly;
    }
}
