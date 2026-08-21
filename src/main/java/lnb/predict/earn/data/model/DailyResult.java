package lnb.predict.earn.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Llnb/predict/earn/data/model/DailyResult;", "", "date", "", "drawResults", "Llnb/predict/earn/data/model/DrawResultsContainer;", "<init>", "(Ljava/lang/String;Llnb/predict/earn/data/model/DrawResultsContainer;)V", "getDate", "()Ljava/lang/String;", "getDrawResults", "()Llnb/predict/earn/data/model/DrawResultsContainer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DailyResult {
    public static final int $stable = 8;

    @SerializedName("date")
    private final String date;

    @SerializedName("drawResults")
    private final DrawResultsContainer drawResults;

    public static /* synthetic */ DailyResult copy$default(DailyResult dailyResult, String str, DrawResultsContainer drawResultsContainer, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyResult.date;
        }
        if ((i & 2) != 0) {
            drawResultsContainer = dailyResult.drawResults;
        }
        return dailyResult.copy(str, drawResultsContainer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DrawResultsContainer getDrawResults() {
        return this.drawResults;
    }

    public final DailyResult copy(String date, DrawResultsContainer drawResults) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawResults, "drawResults");
        return new DailyResult(date, drawResults);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyResult)) {
            return false;
        }
        DailyResult dailyResult = (DailyResult) other;
        return Intrinsics.areEqual(this.date, dailyResult.date) && Intrinsics.areEqual(this.drawResults, dailyResult.drawResults);
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.drawResults.hashCode();
    }

    public String toString() {
        return "DailyResult(date=" + this.date + ", drawResults=" + this.drawResults + ")";
    }

    public DailyResult(String date, DrawResultsContainer drawResults) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawResults, "drawResults");
        this.date = date;
        this.drawResults = drawResults;
    }

    public final String getDate() {
        return this.date;
    }

    public final DrawResultsContainer getDrawResults() {
        return this.drawResults;
    }
}
