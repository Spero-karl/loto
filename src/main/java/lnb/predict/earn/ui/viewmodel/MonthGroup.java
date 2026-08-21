package lnb.predict.earn.ui.viewmodel;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Llnb/predict/earn/ui/viewmodel/MonthGroup;", "", HintConstants.AUTOFILL_HINT_NAME, "", "key", "items", "", "Llnb/predict/earn/ui/viewmodel/DrawListItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getKey", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MonthGroup {
    public static final int $stable = 0;
    private final List<DrawListItem> items;
    private final String key;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonthGroup copy$default(MonthGroup monthGroup, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = monthGroup.name;
        }
        if ((i & 2) != 0) {
            str2 = monthGroup.key;
        }
        if ((i & 4) != 0) {
            list = monthGroup.items;
        }
        return monthGroup.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final List<DrawListItem> component3() {
        return this.items;
    }

    public final MonthGroup copy(String name, String key, List<? extends DrawListItem> items) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(items, "items");
        return new MonthGroup(name, key, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthGroup)) {
            return false;
        }
        MonthGroup monthGroup = (MonthGroup) other;
        return Intrinsics.areEqual(this.name, monthGroup.name) && Intrinsics.areEqual(this.key, monthGroup.key) && Intrinsics.areEqual(this.items, monthGroup.items);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.key.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "MonthGroup(name=" + this.name + ", key=" + this.key + ", items=" + this.items + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MonthGroup(String name, String key, List<? extends DrawListItem> items) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(items, "items");
        this.name = name;
        this.key = key;
        this.items = items;
    }

    public final List<DrawListItem> getItems() {
        return this.items;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }
}
