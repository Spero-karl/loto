package lnb.predict.earn.data.remote;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoDto.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Llnb/predict/earn/data/remote/WeeklyResultDto;", "", "startDate", "", "endDate", "drawResultsDaily", "", "Llnb/predict/earn/data/remote/DailyResultDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getStartDate", "()Ljava/lang/String;", "getEndDate", "getDrawResultsDaily", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class WeeklyResultDto {
    public static final int $stable = 8;
    private final List<DailyResultDto> drawResultsDaily;
    private final String endDate;
    private final String startDate;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeeklyResultDto copy$default(WeeklyResultDto weeklyResultDto, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weeklyResultDto.startDate;
        }
        if ((i & 2) != 0) {
            str2 = weeklyResultDto.endDate;
        }
        if ((i & 4) != 0) {
            list = weeklyResultDto.drawResultsDaily;
        }
        return weeklyResultDto.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final List<DailyResultDto> component3() {
        return this.drawResultsDaily;
    }

    public final WeeklyResultDto copy(String startDate, String endDate, List<DailyResultDto> drawResultsDaily) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(drawResultsDaily, "drawResultsDaily");
        return new WeeklyResultDto(startDate, endDate, drawResultsDaily);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyResultDto)) {
            return false;
        }
        WeeklyResultDto weeklyResultDto = (WeeklyResultDto) other;
        return Intrinsics.areEqual(this.startDate, weeklyResultDto.startDate) && Intrinsics.areEqual(this.endDate, weeklyResultDto.endDate) && Intrinsics.areEqual(this.drawResultsDaily, weeklyResultDto.drawResultsDaily);
    }

    public int hashCode() {
        return (((this.startDate.hashCode() * 31) + this.endDate.hashCode()) * 31) + this.drawResultsDaily.hashCode();
    }

    public String toString() {
        return "WeeklyResultDto(startDate=" + this.startDate + ", endDate=" + this.endDate + ", drawResultsDaily=" + this.drawResultsDaily + ")";
    }

    public WeeklyResultDto(String startDate, String endDate, List<DailyResultDto> drawResultsDaily) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(drawResultsDaily, "drawResultsDaily");
        this.startDate = startDate;
        this.endDate = endDate;
        this.drawResultsDaily = drawResultsDaily;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final List<DailyResultDto> getDrawResultsDaily() {
        return this.drawResultsDaily;
    }
}
