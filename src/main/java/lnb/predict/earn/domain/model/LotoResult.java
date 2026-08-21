package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoResult.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Llnb/predict/earn/domain/model/LotoResult;", "", "id", "", "date", "drawName", "numbers", "", "", "parsedDate", "Ljava/time/LocalDate;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/LocalDate;)V", "getId", "()Ljava/lang/String;", "getDate", "getDrawName", "getNumbers", "()Ljava/util/List;", "getParsedDate", "()Ljava/time/LocalDate;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class LotoResult {
    public static final int $stable = 8;
    private final String date;
    private final String drawName;
    private final String id;
    private final List<Integer> numbers;
    private final LocalDate parsedDate;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LotoResult copy$default(LotoResult lotoResult, String str, String str2, String str3, List list, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lotoResult.id;
        }
        if ((i & 2) != 0) {
            str2 = lotoResult.date;
        }
        if ((i & 4) != 0) {
            str3 = lotoResult.drawName;
        }
        if ((i & 8) != 0) {
            list = lotoResult.numbers;
        }
        if ((i & 16) != 0) {
            localDate = lotoResult.parsedDate;
        }
        LocalDate localDate2 = localDate;
        String str4 = str3;
        return lotoResult.copy(str, str2, str4, list, localDate2);
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
    public final String getDrawName() {
        return this.drawName;
    }

    public final List<Integer> component4() {
        return this.numbers;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LocalDate getParsedDate() {
        return this.parsedDate;
    }

    public final LotoResult copy(String id, String date, String drawName, List<Integer> numbers, LocalDate parsedDate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        return new LotoResult(id, date, drawName, numbers, parsedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotoResult)) {
            return false;
        }
        LotoResult lotoResult = (LotoResult) other;
        return Intrinsics.areEqual(this.id, lotoResult.id) && Intrinsics.areEqual(this.date, lotoResult.date) && Intrinsics.areEqual(this.drawName, lotoResult.drawName) && Intrinsics.areEqual(this.numbers, lotoResult.numbers) && Intrinsics.areEqual(this.parsedDate, lotoResult.parsedDate);
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.date.hashCode()) * 31) + this.drawName.hashCode()) * 31) + this.numbers.hashCode()) * 31) + (this.parsedDate == null ? 0 : this.parsedDate.hashCode());
    }

    public String toString() {
        return "LotoResult(id=" + this.id + ", date=" + this.date + ", drawName=" + this.drawName + ", numbers=" + this.numbers + ", parsedDate=" + this.parsedDate + ")";
    }

    public LotoResult(String id, String date, String drawName, List<Integer> numbers, LocalDate parsedDate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.id = id;
        this.date = date;
        this.drawName = drawName;
        this.numbers = numbers;
        this.parsedDate = parsedDate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LotoResult(String str, String str2, String str3, List list, LocalDate localDate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        LocalDate localDate2;
        if ((i & 16) == 0) {
            localDate2 = localDate;
        } else {
            localDate2 = null;
        }
        this(str, str2, str3, list, localDate2);
    }

    public final String getId() {
        return this.id;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDrawName() {
        return this.drawName;
    }

    public final List<Integer> getNumbers() {
        return this.numbers;
    }

    public final LocalDate getParsedDate() {
        return this.parsedDate;
    }
}
