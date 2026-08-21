package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StatisticsEntity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Llnb/predict/earn/data/local/StatisticsEntity;", "", "id", "", "jsonContent", "lastUpdated", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getJsonContent", "getLastUpdated", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class StatisticsEntity {
    public static final int $stable = 0;
    private final String id;
    private final String jsonContent;
    private final long lastUpdated;

    public static /* synthetic */ StatisticsEntity copy$default(StatisticsEntity statisticsEntity, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statisticsEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = statisticsEntity.jsonContent;
        }
        if ((i & 4) != 0) {
            j = statisticsEntity.lastUpdated;
        }
        return statisticsEntity.copy(str, str2, j);
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
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final StatisticsEntity copy(String id, String jsonContent, long lastUpdated) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(jsonContent, "jsonContent");
        return new StatisticsEntity(id, jsonContent, lastUpdated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsEntity)) {
            return false;
        }
        StatisticsEntity statisticsEntity = (StatisticsEntity) other;
        return Intrinsics.areEqual(this.id, statisticsEntity.id) && Intrinsics.areEqual(this.jsonContent, statisticsEntity.jsonContent) && this.lastUpdated == statisticsEntity.lastUpdated;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.jsonContent.hashCode()) * 31) + Long.hashCode(this.lastUpdated);
    }

    public String toString() {
        return "StatisticsEntity(id=" + this.id + ", jsonContent=" + this.jsonContent + ", lastUpdated=" + this.lastUpdated + ")";
    }

    public StatisticsEntity(String id, String jsonContent, long lastUpdated) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(jsonContent, "jsonContent");
        this.id = id;
        this.jsonContent = jsonContent;
        this.lastUpdated = lastUpdated;
    }

    public /* synthetic */ StatisticsEntity(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "global_stats" : str, str2, (i & 4) != 0 ? System.currentTimeMillis() : j);
    }

    public final String getId() {
        return this.id;
    }

    public final String getJsonContent() {
        return this.jsonContent;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }
}
