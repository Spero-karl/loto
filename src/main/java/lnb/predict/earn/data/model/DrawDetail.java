package lnb.predict.earn.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Llnb/predict/earn/data/model/DrawDetail;", "", "drawName", "", "winningNumbers", "machineNumbers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDrawName", "()Ljava/lang/String;", "getWinningNumbers", "getMachineNumbers", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DrawDetail {
    public static final int $stable = 0;

    @SerializedName("drawName")
    private final String drawName;

    @SerializedName("machineNumbers")
    private final String machineNumbers;

    @SerializedName("winningNumbers")
    private final String winningNumbers;

    public static /* synthetic */ DrawDetail copy$default(DrawDetail drawDetail, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = drawDetail.drawName;
        }
        if ((i & 2) != 0) {
            str2 = drawDetail.winningNumbers;
        }
        if ((i & 4) != 0) {
            str3 = drawDetail.machineNumbers;
        }
        return drawDetail.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDrawName() {
        return this.drawName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWinningNumbers() {
        return this.winningNumbers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMachineNumbers() {
        return this.machineNumbers;
    }

    public final DrawDetail copy(String drawName, String winningNumbers, String machineNumbers) {
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(winningNumbers, "winningNumbers");
        Intrinsics.checkNotNullParameter(machineNumbers, "machineNumbers");
        return new DrawDetail(drawName, winningNumbers, machineNumbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawDetail)) {
            return false;
        }
        DrawDetail drawDetail = (DrawDetail) other;
        return Intrinsics.areEqual(this.drawName, drawDetail.drawName) && Intrinsics.areEqual(this.winningNumbers, drawDetail.winningNumbers) && Intrinsics.areEqual(this.machineNumbers, drawDetail.machineNumbers);
    }

    public int hashCode() {
        return (((this.drawName.hashCode() * 31) + this.winningNumbers.hashCode()) * 31) + this.machineNumbers.hashCode();
    }

    public String toString() {
        return "DrawDetail(drawName=" + this.drawName + ", winningNumbers=" + this.winningNumbers + ", machineNumbers=" + this.machineNumbers + ")";
    }

    public DrawDetail(String drawName, String winningNumbers, String machineNumbers) {
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(winningNumbers, "winningNumbers");
        Intrinsics.checkNotNullParameter(machineNumbers, "machineNumbers");
        this.drawName = drawName;
        this.winningNumbers = winningNumbers;
        this.machineNumbers = machineNumbers;
    }

    public final String getDrawName() {
        return this.drawName;
    }

    public final String getWinningNumbers() {
        return this.winningNumbers;
    }

    public final String getMachineNumbers() {
        return this.machineNumbers;
    }
}
