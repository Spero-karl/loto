package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IndexedAnalyticsEntities.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Llnb/predict/earn/data/local/TripletIndexEntity;", "", "tripletKey", "", "count", "", "lastSeen", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTripletKey", "()Ljava/lang/String;", "getCount", "()I", "getLastSeen", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class TripletIndexEntity {
    public static final int $stable = 0;
    private final int count;
    private final String lastSeen;
    private final String tripletKey;

    public static /* synthetic */ TripletIndexEntity copy$default(TripletIndexEntity tripletIndexEntity, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tripletIndexEntity.tripletKey;
        }
        if ((i2 & 2) != 0) {
            i = tripletIndexEntity.count;
        }
        if ((i2 & 4) != 0) {
            str2 = tripletIndexEntity.lastSeen;
        }
        return tripletIndexEntity.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTripletKey() {
        return this.tripletKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastSeen() {
        return this.lastSeen;
    }

    public final TripletIndexEntity copy(String tripletKey, int count, String lastSeen) {
        Intrinsics.checkNotNullParameter(tripletKey, "tripletKey");
        Intrinsics.checkNotNullParameter(lastSeen, "lastSeen");
        return new TripletIndexEntity(tripletKey, count, lastSeen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripletIndexEntity)) {
            return false;
        }
        TripletIndexEntity tripletIndexEntity = (TripletIndexEntity) other;
        return Intrinsics.areEqual(this.tripletKey, tripletIndexEntity.tripletKey) && this.count == tripletIndexEntity.count && Intrinsics.areEqual(this.lastSeen, tripletIndexEntity.lastSeen);
    }

    public int hashCode() {
        return (((this.tripletKey.hashCode() * 31) + Integer.hashCode(this.count)) * 31) + this.lastSeen.hashCode();
    }

    public String toString() {
        return "TripletIndexEntity(tripletKey=" + this.tripletKey + ", count=" + this.count + ", lastSeen=" + this.lastSeen + ")";
    }

    public TripletIndexEntity(String tripletKey, int count, String lastSeen) {
        Intrinsics.checkNotNullParameter(tripletKey, "tripletKey");
        Intrinsics.checkNotNullParameter(lastSeen, "lastSeen");
        this.tripletKey = tripletKey;
        this.count = count;
        this.lastSeen = lastSeen;
    }

    public final String getTripletKey() {
        return this.tripletKey;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getLastSeen() {
        return this.lastSeen;
    }
}
