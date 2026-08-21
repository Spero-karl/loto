package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IndexedAnalyticsEntities.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Llnb/predict/earn/data/local/TransitionIndexEntity;", "", "transitionKey", "", "count", "", "tType", "<init>", "(Ljava/lang/String;II)V", "getTransitionKey", "()Ljava/lang/String;", "getCount", "()I", "getTType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class TransitionIndexEntity {
    public static final int $stable = 0;
    private final int count;
    private final int tType;
    private final String transitionKey;

    public static /* synthetic */ TransitionIndexEntity copy$default(TransitionIndexEntity transitionIndexEntity, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = transitionIndexEntity.transitionKey;
        }
        if ((i3 & 2) != 0) {
            i = transitionIndexEntity.count;
        }
        if ((i3 & 4) != 0) {
            i2 = transitionIndexEntity.tType;
        }
        return transitionIndexEntity.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransitionKey() {
        return this.transitionKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTType() {
        return this.tType;
    }

    public final TransitionIndexEntity copy(String transitionKey, int count, int tType) {
        Intrinsics.checkNotNullParameter(transitionKey, "transitionKey");
        return new TransitionIndexEntity(transitionKey, count, tType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionIndexEntity)) {
            return false;
        }
        TransitionIndexEntity transitionIndexEntity = (TransitionIndexEntity) other;
        return Intrinsics.areEqual(this.transitionKey, transitionIndexEntity.transitionKey) && this.count == transitionIndexEntity.count && this.tType == transitionIndexEntity.tType;
    }

    public int hashCode() {
        return (((this.transitionKey.hashCode() * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.tType);
    }

    public String toString() {
        return "TransitionIndexEntity(transitionKey=" + this.transitionKey + ", count=" + this.count + ", tType=" + this.tType + ")";
    }

    public TransitionIndexEntity(String transitionKey, int count, int tType) {
        Intrinsics.checkNotNullParameter(transitionKey, "transitionKey");
        this.transitionKey = transitionKey;
        this.count = count;
        this.tType = tType;
    }

    public final String getTransitionKey() {
        return this.transitionKey;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getTType() {
        return this.tType;
    }
}
