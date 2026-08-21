package lnb.predict.earn.data.remote;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoDto.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Llnb/predict/earn/data/remote/DrawDetailDto;", "", "drawName", "", "winningNumbers", "machineNumbers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDrawName", "()Ljava/lang/String;", "getWinningNumbers", "getMachineNumbers", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DrawDetailDto {
    public static final int $stable = 0;
    private final String drawName;
    private final String machineNumbers;
    private final String winningNumbers;

    public static /* synthetic */ DrawDetailDto copy$default(DrawDetailDto drawDetailDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = drawDetailDto.drawName;
        }
        if ((i & 2) != 0) {
            str2 = drawDetailDto.winningNumbers;
        }
        if ((i & 4) != 0) {
            str3 = drawDetailDto.machineNumbers;
        }
        return drawDetailDto.copy(str, str2, str3);
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

    public final DrawDetailDto copy(String drawName, String winningNumbers, String machineNumbers) {
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(winningNumbers, "winningNumbers");
        Intrinsics.checkNotNullParameter(machineNumbers, "machineNumbers");
        return new DrawDetailDto(drawName, winningNumbers, machineNumbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawDetailDto)) {
            return false;
        }
        DrawDetailDto drawDetailDto = (DrawDetailDto) other;
        return Intrinsics.areEqual(this.drawName, drawDetailDto.drawName) && Intrinsics.areEqual(this.winningNumbers, drawDetailDto.winningNumbers) && Intrinsics.areEqual(this.machineNumbers, drawDetailDto.machineNumbers);
    }

    public int hashCode() {
        return (((this.drawName.hashCode() * 31) + this.winningNumbers.hashCode()) * 31) + this.machineNumbers.hashCode();
    }

    public String toString() {
        return "DrawDetailDto(drawName=" + this.drawName + ", winningNumbers=" + this.winningNumbers + ", machineNumbers=" + this.machineNumbers + ")";
    }

    public DrawDetailDto(String drawName, String winningNumbers, String machineNumbers) {
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
