package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IndexedAnalyticsEntities.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Llnb/predict/earn/data/local/MonthlyAnalyticsEntity;", "", "periodKey", "", "jsonContent", "lastDrawId", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getPeriodKey", "()Ljava/lang/String;", "getJsonContent", "getLastDrawId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MonthlyAnalyticsEntity {
    public static final int $stable = 0;
    private final String jsonContent;
    private final String lastDrawId;
    private final String periodKey;
    private final long timestamp;

    public static /* synthetic */ MonthlyAnalyticsEntity copy$default(MonthlyAnalyticsEntity monthlyAnalyticsEntity, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = monthlyAnalyticsEntity.periodKey;
        }
        if ((i & 2) != 0) {
            str2 = monthlyAnalyticsEntity.jsonContent;
        }
        if ((i & 4) != 0) {
            str3 = monthlyAnalyticsEntity.lastDrawId;
        }
        if ((i & 8) != 0) {
            j = monthlyAnalyticsEntity.timestamp;
        }
        String str4 = str3;
        return monthlyAnalyticsEntity.copy(str, str2, str4, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPeriodKey() {
        return this.periodKey;
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

    public final MonthlyAnalyticsEntity copy(String periodKey, String jsonContent, String lastDrawId, long timestamp) {
        Intrinsics.checkNotNullParameter(periodKey, "periodKey");
        Intrinsics.checkNotNullParameter(jsonContent, "jsonContent");
        Intrinsics.checkNotNullParameter(lastDrawId, "lastDrawId");
        return new MonthlyAnalyticsEntity(periodKey, jsonContent, lastDrawId, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthlyAnalyticsEntity)) {
            return false;
        }
        MonthlyAnalyticsEntity monthlyAnalyticsEntity = (MonthlyAnalyticsEntity) other;
        return Intrinsics.areEqual(this.periodKey, monthlyAnalyticsEntity.periodKey) && Intrinsics.areEqual(this.jsonContent, monthlyAnalyticsEntity.jsonContent) && Intrinsics.areEqual(this.lastDrawId, monthlyAnalyticsEntity.lastDrawId) && this.timestamp == monthlyAnalyticsEntity.timestamp;
    }

    public int hashCode() {
        return (((((this.periodKey.hashCode() * 31) + this.jsonContent.hashCode()) * 31) + this.lastDrawId.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "MonthlyAnalyticsEntity(periodKey=" + this.periodKey + ", jsonContent=" + this.jsonContent + ", lastDrawId=" + this.lastDrawId + ", timestamp=" + this.timestamp + ")";
    }

    public MonthlyAnalyticsEntity(String periodKey, String jsonContent, String lastDrawId, long timestamp) {
        Intrinsics.checkNotNullParameter(periodKey, "periodKey");
        Intrinsics.checkNotNullParameter(jsonContent, "jsonContent");
        Intrinsics.checkNotNullParameter(lastDrawId, "lastDrawId");
        this.periodKey = periodKey;
        this.jsonContent = jsonContent;
        this.lastDrawId = lastDrawId;
        this.timestamp = timestamp;
    }

    public final String getPeriodKey() {
        return this.periodKey;
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
