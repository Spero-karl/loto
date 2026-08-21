package lnb.predict.earn.ui.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lnb.predict.earn.domain.model.Draw;

/* JADX INFO: compiled from: LotoViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Llnb/predict/earn/ui/viewmodel/DrawListItem;", "", "<init>", "()V", "DayHeader", "DrawItem", "Llnb/predict/earn/ui/viewmodel/DrawListItem$DayHeader;", "Llnb/predict/earn/ui/viewmodel/DrawListItem$DrawItem;", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class DrawListItem {
    public static final int $stable = 0;

    public /* synthetic */ DrawListItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DrawListItem() {
    }

    /* JADX INFO: compiled from: LotoViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Llnb/predict/earn/ui/viewmodel/DrawListItem$DayHeader;", "Llnb/predict/earn/ui/viewmodel/DrawListItem;", "date", "", "<init>", "(Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DayHeader extends DrawListItem {
        public static final int $stable = 0;
        private final String date;

        public static /* synthetic */ DayHeader copy$default(DayHeader dayHeader, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dayHeader.date;
            }
            return dayHeader.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public final DayHeader copy(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return new DayHeader(date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DayHeader) && Intrinsics.areEqual(this.date, ((DayHeader) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return "DayHeader(date=" + this.date + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DayHeader(String date) {
            super(null);
            Intrinsics.checkNotNullParameter(date, "date");
            this.date = date;
        }

        public final String getDate() {
            return this.date;
        }
    }

    /* JADX INFO: compiled from: LotoViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Llnb/predict/earn/ui/viewmodel/DrawListItem$DrawItem;", "Llnb/predict/earn/ui/viewmodel/DrawListItem;", "draw", "Llnb/predict/earn/domain/model/Draw;", "<init>", "(Llnb/predict/earn/domain/model/Draw;)V", "getDraw", "()Llnb/predict/earn/domain/model/Draw;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DrawItem extends DrawListItem {
        public static final int $stable = 0;
        private final Draw draw;

        public static /* synthetic */ DrawItem copy$default(DrawItem drawItem, Draw draw, int i, Object obj) {
            if ((i & 1) != 0) {
                draw = drawItem.draw;
            }
            return drawItem.copy(draw);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Draw getDraw() {
            return this.draw;
        }

        public final DrawItem copy(Draw draw) {
            Intrinsics.checkNotNullParameter(draw, "draw");
            return new DrawItem(draw);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DrawItem) && Intrinsics.areEqual(this.draw, ((DrawItem) other).draw);
        }

        public int hashCode() {
            return this.draw.hashCode();
        }

        public String toString() {
            return "DrawItem(draw=" + this.draw + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DrawItem(Draw draw) {
            super(null);
            Intrinsics.checkNotNullParameter(draw, "draw");
            this.draw = draw;
        }

        public final Draw getDraw() {
            return this.draw;
        }
    }
}
