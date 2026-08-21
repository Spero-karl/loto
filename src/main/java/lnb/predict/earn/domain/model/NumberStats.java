package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StatisticsModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\""}, d2 = {"Llnb/predict/earn/domain/model/NumberStats;", "", "number", "", "frequency", "delay", "lastAppearances", "", "Ljava/time/LocalDate;", "hotScore", "coldScore", "<init>", "(IIILjava/util/List;II)V", "getNumber", "()I", "getFrequency", "getDelay", "getLastAppearances", "()Ljava/util/List;", "getHotScore", "getColdScore", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class NumberStats {
    public static final int $stable = 0;
    private final int coldScore;
    private final int delay;
    private final int frequency;
    private final int hotScore;
    private final List<LocalDate> lastAppearances;
    private final int number;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NumberStats copy$default(NumberStats numberStats, int i, int i2, int i3, List list, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = numberStats.number;
        }
        if ((i6 & 2) != 0) {
            i2 = numberStats.frequency;
        }
        if ((i6 & 4) != 0) {
            i3 = numberStats.delay;
        }
        if ((i6 & 8) != 0) {
            list = numberStats.lastAppearances;
        }
        if ((i6 & 16) != 0) {
            i4 = numberStats.hotScore;
        }
        if ((i6 & 32) != 0) {
            i5 = numberStats.coldScore;
        }
        int i7 = i4;
        int i8 = i5;
        return numberStats.copy(i, i2, i3, list, i7, i8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    public final List<LocalDate> component4() {
        return this.lastAppearances;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHotScore() {
        return this.hotScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getColdScore() {
        return this.coldScore;
    }

    public final NumberStats copy(int number, int frequency, int delay, List<LocalDate> lastAppearances, int hotScore, int coldScore) {
        Intrinsics.checkNotNullParameter(lastAppearances, "lastAppearances");
        return new NumberStats(number, frequency, delay, lastAppearances, hotScore, coldScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumberStats)) {
            return false;
        }
        NumberStats numberStats = (NumberStats) other;
        return this.number == numberStats.number && this.frequency == numberStats.frequency && this.delay == numberStats.delay && Intrinsics.areEqual(this.lastAppearances, numberStats.lastAppearances) && this.hotScore == numberStats.hotScore && this.coldScore == numberStats.coldScore;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.number) * 31) + Integer.hashCode(this.frequency)) * 31) + Integer.hashCode(this.delay)) * 31) + this.lastAppearances.hashCode()) * 31) + Integer.hashCode(this.hotScore)) * 31) + Integer.hashCode(this.coldScore);
    }

    public String toString() {
        return "NumberStats(number=" + this.number + ", frequency=" + this.frequency + ", delay=" + this.delay + ", lastAppearances=" + this.lastAppearances + ", hotScore=" + this.hotScore + ", coldScore=" + this.coldScore + ")";
    }

    public NumberStats(int number, int frequency, int delay, List<LocalDate> lastAppearances, int hotScore, int coldScore) {
        Intrinsics.checkNotNullParameter(lastAppearances, "lastAppearances");
        this.number = number;
        this.frequency = frequency;
        this.delay = delay;
        this.lastAppearances = lastAppearances;
        this.hotScore = hotScore;
        this.coldScore = coldScore;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final List<LocalDate> getLastAppearances() {
        return this.lastAppearances;
    }

    public final int getHotScore() {
        return this.hotScore;
    }

    public final int getColdScore() {
        return this.coldScore;
    }
}
