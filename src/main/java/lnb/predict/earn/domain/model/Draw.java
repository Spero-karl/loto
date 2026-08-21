package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Draw.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\rHÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Llnb/predict/earn/domain/model/Draw;", "", "id", "", "date", "Ljava/time/LocalDate;", "year", "", "month", "day", "drawName", "drawType", "numbers", "", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;IIILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getDate", "()Ljava/time/LocalDate;", "getYear", "()I", "getMonth", "getDay", "getDrawName", "getDrawType", "getNumbers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class Draw {
    public static final int $stable = 0;
    private final LocalDate date;
    private final int day;
    private final String drawName;
    private final String drawType;
    private final String id;
    private final int month;
    private final List<Integer> numbers;
    private final int year;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Draw copy$default(Draw draw, String str, LocalDate localDate, int i, int i2, int i3, String str2, String str3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = draw.id;
        }
        if ((i4 & 2) != 0) {
            localDate = draw.date;
        }
        if ((i4 & 4) != 0) {
            i = draw.year;
        }
        if ((i4 & 8) != 0) {
            i2 = draw.month;
        }
        if ((i4 & 16) != 0) {
            i3 = draw.day;
        }
        if ((i4 & 32) != 0) {
            str2 = draw.drawName;
        }
        if ((i4 & 64) != 0) {
            str3 = draw.drawType;
        }
        if ((i4 & 128) != 0) {
            list = draw.numbers;
        }
        String str4 = str3;
        List list2 = list;
        int i5 = i3;
        String str5 = str2;
        return draw.copy(str, localDate, i, i2, i5, str5, str4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDrawName() {
        return this.drawName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDrawType() {
        return this.drawType;
    }

    public final List<Integer> component8() {
        return this.numbers;
    }

    public final Draw copy(String id, LocalDate date, int year, int month, int day, String drawName, String drawType, List<Integer> numbers) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(drawType, "drawType");
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        return new Draw(id, date, year, month, day, drawName, drawType, numbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Draw)) {
            return false;
        }
        Draw draw = (Draw) other;
        return Intrinsics.areEqual(this.id, draw.id) && Intrinsics.areEqual(this.date, draw.date) && this.year == draw.year && this.month == draw.month && this.day == draw.day && Intrinsics.areEqual(this.drawName, draw.drawName) && Intrinsics.areEqual(this.drawType, draw.drawType) && Intrinsics.areEqual(this.numbers, draw.numbers);
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.year)) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.day)) * 31) + this.drawName.hashCode()) * 31) + this.drawType.hashCode()) * 31) + this.numbers.hashCode();
    }

    public String toString() {
        return "Draw(id=" + this.id + ", date=" + this.date + ", year=" + this.year + ", month=" + this.month + ", day=" + this.day + ", drawName=" + this.drawName + ", drawType=" + this.drawType + ", numbers=" + this.numbers + ")";
    }

    public Draw(String id, LocalDate date, int year, int month, int day, String drawName, String drawType, List<Integer> numbers) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(drawType, "drawType");
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.id = id;
        this.date = date;
        this.year = year;
        this.month = month;
        this.day = day;
        this.drawName = drawName;
        this.drawType = drawType;
        this.numbers = numbers;
    }

    public final String getId() {
        return this.id;
    }

    public final LocalDate getDate() {
        return this.date;
    }

    public final int getYear() {
        return this.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getDay() {
        return this.day;
    }

    public final String getDrawName() {
        return this.drawName;
    }

    public final String getDrawType() {
        return this.drawType;
    }

    public final List<Integer> getNumbers() {
        return this.numbers;
    }
}
