package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisEntities.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Llnb/predict/earn/data/local/BacktestResultEntity;", "", "id", "", "jsonContent", "lastDrawId", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getJsonContent", "getLastDrawId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BacktestResultEntity {
    public static final int $stable = 0;
    private final String id;
    private final String jsonContent;
    private final String lastDrawId;
    private final long timestamp;

    public static /* synthetic */ BacktestResultEntity copy$default(BacktestResultEntity backtestResultEntity, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = backtestResultEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = backtestResultEntity.jsonContent;
        }
        if ((i & 4) != 0) {
            str3 = backtestResultEntity.lastDrawId;
        }
        if ((i & 8) != 0) {
            j = backtestResultEntity.timestamp;
        }
        String str4 = str3;
        return backtestResultEntity.copy(str, str2, str4, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJsonContent() {
        return this.jsonContent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastDrawId() {
        return this.lastDrawId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final BacktestResultEntity copy(String id, String jsonContent, String lastDrawId, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(jsonContent, "jsonContent");
        Intrinsics.checkNotNullParameter(lastDrawId, "lastDrawId");
        return new BacktestResultEntity(id, jsonContent, lastDrawId, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacktestResultEntity)) {
            return false;
        }
        BacktestResultEntity backtestResultEntity = (BacktestResultEntity) other;
        return Intrinsics.areEqual(this.id, backtestResultEntity.id) && Intrinsics.areEqual(this.jsonContent, backtestResultEntity.jsonContent) && Intrinsics.areEqual(this.lastDrawId, backtestResultEntity.lastDrawId) && this.timestamp == backtestResultEntity.timestamp;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.jsonContent.hashCode()) * 31) + this.lastDrawId.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "BacktestResultEntity(id=" + this.id + ", jsonContent=" + this.jsonContent + ", lastDrawId=" + this.lastDrawId + ", timestamp=" + this.timestamp + ")";
    }

    public BacktestResultEntity(String id, String jsonContent, String lastDrawId, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(jsonContent, "jsonContent");
        Intrinsics.checkNotNullParameter(lastDrawId, "lastDrawId");
        this.id = id;
        this.jsonContent = jsonContent;
        this.lastDrawId = lastDrawId;
        this.timestamp = timestamp;
    }

    public /* synthetic */ BacktestResultEntity(String str, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "latest" : str, str2, str3, j);
    }

    public final String getId() {
        return this.id;
    }

    public final String getJsonContent() {
        return this.jsonContent;
    }

    public final String getLastDrawId() {
        return this.lastDrawId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
