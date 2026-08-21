package lnb.predict.earn.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Llnb/predict/earn/data/model/FlatDraw;", "", "date", "", "drawName", "winningNumbers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getDrawName", "getWinningNumbers", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class FlatDraw {
    public static final int $stable = 0;
    private final String date;
    private final String drawName;
    private final String winningNumbers;

    public static /* synthetic */ FlatDraw copy$default(FlatDraw flatDraw, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flatDraw.date;
        }
        if ((i & 2) != 0) {
            str2 = flatDraw.drawName;
        }
        if ((i & 4) != 0) {
            str3 = flatDraw.winningNumbers;
        }
        return flatDraw.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDrawName() {
        return this.drawName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWinningNumbers() {
        return this.winningNumbers;
    }

    public final FlatDraw copy(String date, String drawName, String winningNumbers) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(winningNumbers, "winningNumbers");
        return new FlatDraw(date, drawName, winningNumbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlatDraw)) {
            return false;
        }
        FlatDraw flatDraw = (FlatDraw) other;
        return Intrinsics.areEqual(this.date, flatDraw.date) && Intrinsics.areEqual(this.drawName, flatDraw.drawName) && Intrinsics.areEqual(this.winningNumbers, flatDraw.winningNumbers);
    }

    public int hashCode() {
        return (((this.date.hashCode() * 31) + this.drawName.hashCode()) * 31) + this.winningNumbers.hashCode();
    }

    public String toString() {
        return "FlatDraw(date=" + this.date + ", drawName=" + this.drawName + ", winningNumbers=" + this.winningNumbers + ")";
    }

    public FlatDraw(String date, String drawName, String winningNumbers) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(winningNumbers, "winningNumbers");
        this.date = date;
        this.drawName = drawName;
        this.winningNumbers = winningNumbers;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDrawName() {
        return this.drawName;
    }

    public final String getWinningNumbers() {
        return this.winningNumbers;
    }
}
