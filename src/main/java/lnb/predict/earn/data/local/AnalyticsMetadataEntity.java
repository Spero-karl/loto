package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IndexedAnalyticsEntities.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Llnb/predict/earn/data/local/AnalyticsMetadataEntity;", "", "id", "", "lastProcessedDrawId", "globalJsonContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLastProcessedDrawId", "getGlobalJsonContent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AnalyticsMetadataEntity {
    public static final int $stable = 0;
    private final String globalJsonContent;
    private final String id;
    private final String lastProcessedDrawId;

    public static /* synthetic */ AnalyticsMetadataEntity copy$default(AnalyticsMetadataEntity analyticsMetadataEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsMetadataEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = analyticsMetadataEntity.lastProcessedDrawId;
        }
        if ((i & 4) != 0) {
            str3 = analyticsMetadataEntity.globalJsonContent;
        }
        return analyticsMetadataEntity.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastProcessedDrawId() {
        return this.lastProcessedDrawId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGlobalJsonContent() {
        return this.globalJsonContent;
    }

    public final AnalyticsMetadataEntity copy(String id, String lastProcessedDrawId, String globalJsonContent) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new AnalyticsMetadataEntity(id, lastProcessedDrawId, globalJsonContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsMetadataEntity)) {
            return false;
        }
        AnalyticsMetadataEntity analyticsMetadataEntity = (AnalyticsMetadataEntity) other;
        return Intrinsics.areEqual(this.id, analyticsMetadataEntity.id) && Intrinsics.areEqual(this.lastProcessedDrawId, analyticsMetadataEntity.lastProcessedDrawId) && Intrinsics.areEqual(this.globalJsonContent, analyticsMetadataEntity.globalJsonContent);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + (this.lastProcessedDrawId == null ? 0 : this.lastProcessedDrawId.hashCode())) * 31) + (this.globalJsonContent != null ? this.globalJsonContent.hashCode() : 0);
    }

    public String toString() {
        return "AnalyticsMetadataEntity(id=" + this.id + ", lastProcessedDrawId=" + this.lastProcessedDrawId + ", globalJsonContent=" + this.globalJsonContent + ")";
    }

    public AnalyticsMetadataEntity(String id, String lastProcessedDrawId, String globalJsonContent) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.lastProcessedDrawId = lastProcessedDrawId;
        this.globalJsonContent = globalJsonContent;
    }

    public /* synthetic */ AnalyticsMetadataEntity(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "singleton" : str, str2, str3);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastProcessedDrawId() {
        return this.lastProcessedDrawId;
    }

    public final String getGlobalJsonContent() {
        return this.globalJsonContent;
    }
}
