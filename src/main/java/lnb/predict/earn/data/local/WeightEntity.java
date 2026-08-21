package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisEntities.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Llnb/predict/earn/data/local/WeightEntity;", "", "id", "", "freqWeight", "", "delayWeight", "transitionWeight", "hourlyWeight", "repetitionWeight", "lastUpdate", "", "<init>", "(Ljava/lang/String;FFFFFJ)V", "getId", "()Ljava/lang/String;", "getFreqWeight", "()F", "getDelayWeight", "getTransitionWeight", "getHourlyWeight", "getRepetitionWeight", "getLastUpdate", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class WeightEntity {
    public static final int $stable = 0;
    private final float delayWeight;
    private final float freqWeight;
    private final float hourlyWeight;
    private final String id;
    private final long lastUpdate;
    private final float repetitionWeight;
    private final float transitionWeight;

    public static /* synthetic */ WeightEntity copy$default(WeightEntity weightEntity, String str, float f, float f2, float f3, float f4, float f5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weightEntity.id;
        }
        if ((i & 2) != 0) {
            f = weightEntity.freqWeight;
        }
        if ((i & 4) != 0) {
            f2 = weightEntity.delayWeight;
        }
        if ((i & 8) != 0) {
            f3 = weightEntity.transitionWeight;
        }
        if ((i & 16) != 0) {
            f4 = weightEntity.hourlyWeight;
        }
        if ((i & 32) != 0) {
            f5 = weightEntity.repetitionWeight;
        }
        if ((i & 64) != 0) {
            j = weightEntity.lastUpdate;
        }
        long j2 = j;
        float f6 = f4;
        float f7 = f5;
        return weightEntity.copy(str, f, f2, f3, f6, f7, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getFreqWeight() {
        return this.freqWeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getDelayWeight() {
        return this.delayWeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getTransitionWeight() {
        return this.transitionWeight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getHourlyWeight() {
        return this.hourlyWeight;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getRepetitionWeight() {
        return this.repetitionWeight;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastUpdate() {
        return this.lastUpdate;
    }

    public final WeightEntity copy(String id, float freqWeight, float delayWeight, float transitionWeight, float hourlyWeight, float repetitionWeight, long lastUpdate) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new WeightEntity(id, freqWeight, delayWeight, transitionWeight, hourlyWeight, repetitionWeight, lastUpdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightEntity)) {
            return false;
        }
        WeightEntity weightEntity = (WeightEntity) other;
        return Intrinsics.areEqual(this.id, weightEntity.id) && Float.compare(this.freqWeight, weightEntity.freqWeight) == 0 && Float.compare(this.delayWeight, weightEntity.delayWeight) == 0 && Float.compare(this.transitionWeight, weightEntity.transitionWeight) == 0 && Float.compare(this.hourlyWeight, weightEntity.hourlyWeight) == 0 && Float.compare(this.repetitionWeight, weightEntity.repetitionWeight) == 0 && this.lastUpdate == weightEntity.lastUpdate;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + Float.hashCode(this.freqWeight)) * 31) + Float.hashCode(this.delayWeight)) * 31) + Float.hashCode(this.transitionWeight)) * 31) + Float.hashCode(this.hourlyWeight)) * 31) + Float.hashCode(this.repetitionWeight)) * 31) + Long.hashCode(this.lastUpdate);
    }

    public String toString() {
        return "WeightEntity(id=" + this.id + ", freqWeight=" + this.freqWeight + ", delayWeight=" + this.delayWeight + ", transitionWeight=" + this.transitionWeight + ", hourlyWeight=" + this.hourlyWeight + ", repetitionWeight=" + this.repetitionWeight + ", lastUpdate=" + this.lastUpdate + ")";
    }

    public WeightEntity(String id, float freqWeight, float delayWeight, float transitionWeight, float hourlyWeight, float repetitionWeight, long lastUpdate) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.freqWeight = freqWeight;
        this.delayWeight = delayWeight;
        this.transitionWeight = transitionWeight;
        this.hourlyWeight = hourlyWeight;
        this.repetitionWeight = repetitionWeight;
        this.lastUpdate = lastUpdate;
    }

    public /* synthetic */ WeightEntity(String str, float f, float f2, float f3, float f4, float f5, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "current_weights" : str, f, f2, f3, f4, f5, j);
    }

    public final String getId() {
        return this.id;
    }

    public final float getFreqWeight() {
        return this.freqWeight;
    }

    public final float getDelayWeight() {
        return this.delayWeight;
    }

    public final float getTransitionWeight() {
        return this.transitionWeight;
    }

    public final float getHourlyWeight() {
        return this.hourlyWeight;
    }

    public final float getRepetitionWeight() {
        return this.repetitionWeight;
    }

    public final long getLastUpdate() {
        return this.lastUpdate;
    }
}
