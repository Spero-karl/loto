package lnb.predict.earn.data.remote;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoDto.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Llnb/predict/earn/data/remote/DailyResultDto;", "", "date", "", "drawResults", "Llnb/predict/earn/data/remote/DrawCategoriesDto;", "<init>", "(Ljava/lang/String;Llnb/predict/earn/data/remote/DrawCategoriesDto;)V", "getDate", "()Ljava/lang/String;", "getDrawResults", "()Llnb/predict/earn/data/remote/DrawCategoriesDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DailyResultDto {
    public static final int $stable = 8;
    private final String date;
    private final DrawCategoriesDto drawResults;

    public static /* synthetic */ DailyResultDto copy$default(DailyResultDto dailyResultDto, String str, DrawCategoriesDto drawCategoriesDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyResultDto.date;
        }
        if ((i & 2) != 0) {
            drawCategoriesDto = dailyResultDto.drawResults;
        }
        return dailyResultDto.copy(str, drawCategoriesDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DrawCategoriesDto getDrawResults() {
        return this.drawResults;
    }

    public final DailyResultDto copy(String date, DrawCategoriesDto drawResults) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawResults, "drawResults");
        return new DailyResultDto(date, drawResults);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyResultDto)) {
            return false;
        }
        DailyResultDto dailyResultDto = (DailyResultDto) other;
        return Intrinsics.areEqual(this.date, dailyResultDto.date) && Intrinsics.areEqual(this.drawResults, dailyResultDto.drawResults);
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.drawResults.hashCode();
    }

    public String toString() {
        return "DailyResultDto(date=" + this.date + ", drawResults=" + this.drawResults + ")";
    }

    public DailyResultDto(String date, DrawCategoriesDto drawResults) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawResults, "drawResults");
        this.date = date;
        this.drawResults = drawResults;
    }

    public final String getDate() {
        return this.date;
    }

    public final DrawCategoriesDto getDrawResults() {
        return this.drawResults;
    }
}
