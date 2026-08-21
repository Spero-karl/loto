package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisEntities.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\fHÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Llnb/predict/earn/data/local/PredictionEntity;", "", "id", "", "timestamp", "date", "", "drawName", "predictedNumbers", "predictedScores", "actualNumbers", "matchCount", "", "evaluated", "", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getId", "()J", "getTimestamp", "getDate", "()Ljava/lang/String;", "getDrawName", "getPredictedNumbers", "getPredictedScores", "getActualNumbers", "getMatchCount", "()I", "getEvaluated", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PredictionEntity {
    public static final int $stable = 0;
    private final String actualNumbers;
    private final String date;
    private final String drawName;
    private final boolean evaluated;
    private final long id;
    private final int matchCount;
    private final String predictedNumbers;
    private final String predictedScores;
    private final long timestamp;

    public static /* synthetic */ PredictionEntity copy$default(PredictionEntity predictionEntity, long j, long j2, String str, String str2, String str3, String str4, String str5, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = predictionEntity.id;
        }
        return predictionEntity.copy(j, (i2 & 2) != 0 ? predictionEntity.timestamp : j2, (i2 & 4) != 0 ? predictionEntity.date : str, (i2 & 8) != 0 ? predictionEntity.drawName : str2, (i2 & 16) != 0 ? predictionEntity.predictedNumbers : str3, (i2 & 32) != 0 ? predictionEntity.predictedScores : str4, (i2 & 64) != 0 ? predictionEntity.actualNumbers : str5, (i2 & 128) != 0 ? predictionEntity.matchCount : i, (i2 & 256) != 0 ? predictionEntity.evaluated : z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDrawName() {
        return this.drawName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPredictedNumbers() {
        return this.predictedNumbers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPredictedScores() {
        return this.predictedScores;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getActualNumbers() {
        return this.actualNumbers;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMatchCount() {
        return this.matchCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getEvaluated() {
        return this.evaluated;
    }

    public final PredictionEntity copy(long id, long timestamp, String date, String drawName, String predictedNumbers, String predictedScores, String actualNumbers, int matchCount, boolean evaluated) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(predictedNumbers, "predictedNumbers");
        Intrinsics.checkNotNullParameter(predictedScores, "predictedScores");
        return new PredictionEntity(id, timestamp, date, drawName, predictedNumbers, predictedScores, actualNumbers, matchCount, evaluated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredictionEntity)) {
            return false;
        }
        PredictionEntity predictionEntity = (PredictionEntity) other;
        return this.id == predictionEntity.id && this.timestamp == predictionEntity.timestamp && Intrinsics.areEqual(this.date, predictionEntity.date) && Intrinsics.areEqual(this.drawName, predictionEntity.drawName) && Intrinsics.areEqual(this.predictedNumbers, predictionEntity.predictedNumbers) && Intrinsics.areEqual(this.predictedScores, predictionEntity.predictedScores) && Intrinsics.areEqual(this.actualNumbers, predictionEntity.actualNumbers) && this.matchCount == predictionEntity.matchCount && this.evaluated == predictionEntity.evaluated;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.timestamp)) * 31) + this.date.hashCode()) * 31) + this.drawName.hashCode()) * 31) + this.predictedNumbers.hashCode()) * 31) + this.predictedScores.hashCode()) * 31) + (this.actualNumbers == null ? 0 : this.actualNumbers.hashCode())) * 31) + Integer.hashCode(this.matchCount)) * 31) + Boolean.hashCode(this.evaluated);
    }

    public String toString() {
        return "PredictionEntity(id=" + this.id + ", timestamp=" + this.timestamp + ", date=" + this.date + ", drawName=" + this.drawName + ", predictedNumbers=" + this.predictedNumbers + ", predictedScores=" + this.predictedScores + ", actualNumbers=" + this.actualNumbers + ", matchCount=" + this.matchCount + ", evaluated=" + this.evaluated + ")";
    }

    public PredictionEntity(long id, long timestamp, String date, String drawName, String predictedNumbers, String predictedScores, String actualNumbers, int matchCount, boolean evaluated) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(drawName, "drawName");
        Intrinsics.checkNotNullParameter(predictedNumbers, "predictedNumbers");
        Intrinsics.checkNotNullParameter(predictedScores, "predictedScores");
        this.id = id;
        this.timestamp = timestamp;
        this.date = date;
        this.drawName = drawName;
        this.predictedNumbers = predictedNumbers;
        this.predictedScores = predictedScores;
        this.actualNumbers = actualNumbers;
        this.matchCount = matchCount;
        this.evaluated = evaluated;
    }

    public /* synthetic */ PredictionEntity(long j, long j2, String str, String str2, String str3, String str4, String str5, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, str, str2, str3, str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? false : z);
    }

    public final long getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDrawName() {
        return this.drawName;
    }

    public final String getPredictedNumbers() {
        return this.predictedNumbers;
    }

    public final String getPredictedScores() {
        return this.predictedScores;
    }

    public final String getActualNumbers() {
        return this.actualNumbers;
    }

    public final int getMatchCount() {
        return this.matchCount;
    }

    public final boolean getEvaluated() {
        return this.evaluated;
    }
}
