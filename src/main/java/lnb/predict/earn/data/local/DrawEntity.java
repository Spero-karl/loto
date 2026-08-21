package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DrawEntity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Llnb/predict/earn/data/local/DrawEntity;", "", "id", "", "date", "year", "", "month", "day", "drawName", "drawType", "numbers", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getDate", "getYear", "()I", "getMonth", "getDay", "getDrawName", "getDrawType", "getNumbers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DrawEntity {
    public static final int $stable = 0;
    private final String date;
    private final int day;
    private final String drawName;
    private final String drawType;
    private final String id;
    private final int month;
    private final String numbers;
    private final int year;

    public static /* synthetic */ DrawEntity copy$default(DrawEntity drawEntity, String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = drawEntity.id;
        }
        if ((i4 & 2) != 0) {
            str2 = drawEntity.date;
        }
        if ((i4 & 4) != 0) {
            i = drawEntity.year;
        }
        if ((i4 & 8) != 0) {
            i2 = drawEntity.month;
        }
        if ((i4 & 16) != 0) {
            i3 = drawEntity.day;
        }
        if ((i4 & 32) != 0) {
            str3 = drawEntity.drawName;
        }
        if ((i4 & 64) != 0) {
            str4 = drawEntity.drawType;
        }
        if ((i4 & 128) != 0) {
            str5 = drawEntity.numbers;
        }
        String str6 = str4;
        String str7 = str5;
        int i5 = i3;
        String str8 = str3;
        return drawEntity.copy(str, str2, i, i2, i5, str8, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
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

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNumbers() {
        return this.numbers;
    }

    public final DrawEntity copy(String id, String date, int year, int month, int day, String drawName, String drawType, String numbers) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(drawType, "drawType");
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        return new DrawEntity(id, date, year, month, day, drawName, drawType, numbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawEntity)) {
            return false;
        }
        DrawEntity drawEntity = (DrawEntity) other;
        return Intrinsics.areEqual(this.id, drawEntity.id) && Intrinsics.areEqual(this.date, drawEntity.date) && this.year == drawEntity.year && this.month == drawEntity.month && this.day == drawEntity.day && Intrinsics.areEqual(this.drawName, drawEntity.drawName) && Intrinsics.areEqual(this.drawType, drawEntity.drawType) && Intrinsics.areEqual(this.numbers, drawEntity.numbers);
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.year)) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.day)) * 31) + this.drawName.hashCode()) * 31) + this.drawType.hashCode()) * 31) + this.numbers.hashCode();
    }

    public String toString() {
        return "DrawEntity(id=" + this.id + ", date=" + this.date + ", year=" + this.year + ", month=" + this.month + ", day=" + this.day + ", drawName=" + this.drawName + ", drawType=" + this.drawType + ", numbers=" + this.numbers + ")";
    }

    public DrawEntity(String id, String date, int year, int month, int day, String drawName, String drawType, String numbers) {
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

    public final String getDate() {
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

    public final String getNumbers() {
        return this.numbers;
    }
}
