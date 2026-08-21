package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StatisticsModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Llnb/predict/earn/domain/model/GlobalStatistics;", "", "totalDraws", "", "byFrequency", "", "Llnb/predict/earn/domain/model/NumberStats;", "byDelay", "hotNumbers", "coldNumbers", "allNumbers", "", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getTotalDraws", "()I", "getByFrequency", "()Ljava/util/List;", "getByDelay", "getHotNumbers", "getColdNumbers", "getAllNumbers", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class GlobalStatistics {
    public static final int $stable = 0;
    private final Map<Integer, NumberStats> allNumbers;
    private final List<NumberStats> byDelay;
    private final List<NumberStats> byFrequency;
    private final List<NumberStats> coldNumbers;
    private final List<NumberStats> hotNumbers;
    private final int totalDraws;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlobalStatistics copy$default(GlobalStatistics globalStatistics, int i, List list, List list2, List list3, List list4, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = globalStatistics.totalDraws;
        }
        if ((i2 & 2) != 0) {
            list = globalStatistics.byFrequency;
        }
        if ((i2 & 4) != 0) {
            list2 = globalStatistics.byDelay;
        }
        if ((i2 & 8) != 0) {
            list3 = globalStatistics.hotNumbers;
        }
        if ((i2 & 16) != 0) {
            list4 = globalStatistics.coldNumbers;
        }
        if ((i2 & 32) != 0) {
            map = globalStatistics.allNumbers;
        }
        List list5 = list4;
        Map map2 = map;
        return globalStatistics.copy(i, list, list2, list3, list5, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalDraws() {
        return this.totalDraws;
    }

    public final List<NumberStats> component2() {
        return this.byFrequency;
    }

    public final List<NumberStats> component3() {
        return this.byDelay;
    }

    public final List<NumberStats> component4() {
        return this.hotNumbers;
    }

    public final List<NumberStats> component5() {
        return this.coldNumbers;
    }

    public final Map<Integer, NumberStats> component6() {
        return this.allNumbers;
    }

    public final GlobalStatistics copy(int totalDraws, List<NumberStats> byFrequency, List<NumberStats> byDelay, List<NumberStats> hotNumbers, List<NumberStats> coldNumbers, Map<Integer, NumberStats> allNumbers) {
        Intrinsics.checkNotNullParameter(byFrequency, "byFrequency");
        Intrinsics.checkNotNullParameter(byDelay, "byDelay");
        Intrinsics.checkNotNullParameter(hotNumbers, "hotNumbers");
        Intrinsics.checkNotNullParameter(coldNumbers, "coldNumbers");
        Intrinsics.checkNotNullParameter(allNumbers, "allNumbers");
        return new GlobalStatistics(totalDraws, byFrequency, byDelay, hotNumbers, coldNumbers, allNumbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalStatistics)) {
            return false;
        }
        GlobalStatistics globalStatistics = (GlobalStatistics) other;
        return this.totalDraws == globalStatistics.totalDraws && Intrinsics.areEqual(this.byFrequency, globalStatistics.byFrequency) && Intrinsics.areEqual(this.byDelay, globalStatistics.byDelay) && Intrinsics.areEqual(this.hotNumbers, globalStatistics.hotNumbers) && Intrinsics.areEqual(this.coldNumbers, globalStatistics.coldNumbers) && Intrinsics.areEqual(this.allNumbers, globalStatistics.allNumbers);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.totalDraws) * 31) + this.byFrequency.hashCode()) * 31) + this.byDelay.hashCode()) * 31) + this.hotNumbers.hashCode()) * 31) + this.coldNumbers.hashCode()) * 31) + this.allNumbers.hashCode();
    }

    public String toString() {
        return "GlobalStatistics(totalDraws=" + this.totalDraws + ", byFrequency=" + this.byFrequency + ", byDelay=" + this.byDelay + ", hotNumbers=" + this.hotNumbers + ", coldNumbers=" + this.coldNumbers + ", allNumbers=" + this.allNumbers + ")";
    }

    public GlobalStatistics(int totalDraws, List<NumberStats> byFrequency, List<NumberStats> byDelay, List<NumberStats> hotNumbers, List<NumberStats> coldNumbers, Map<Integer, NumberStats> allNumbers) {
        Intrinsics.checkNotNullParameter(byFrequency, "byFrequency");
        Intrinsics.checkNotNullParameter(byDelay, "byDelay");
        Intrinsics.checkNotNullParameter(hotNumbers, "hotNumbers");
        Intrinsics.checkNotNullParameter(coldNumbers, "coldNumbers");
        Intrinsics.checkNotNullParameter(allNumbers, "allNumbers");
        this.totalDraws = totalDraws;
        this.byFrequency = byFrequency;
        this.byDelay = byDelay;
        this.hotNumbers = hotNumbers;
        this.coldNumbers = coldNumbers;
        this.allNumbers = allNumbers;
    }

    public final int getTotalDraws() {
        return this.totalDraws;
    }

    public final List<NumberStats> getByFrequency() {
        return this.byFrequency;
    }

    public final List<NumberStats> getByDelay() {
        return this.byDelay;
    }

    public final List<NumberStats> getHotNumbers() {
        return this.hotNumbers;
    }

    public final List<NumberStats> getColdNumbers() {
        return this.coldNumbers;
    }

    public final Map<Integer, NumberStats> getAllNumbers() {
        return this.allNumbers;
    }
}
