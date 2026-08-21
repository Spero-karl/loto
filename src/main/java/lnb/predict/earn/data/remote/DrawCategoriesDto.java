package lnb.predict.earn.data.remote;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LotoDto.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Llnb/predict/earn/data/remote/DrawCategoriesDto;", "", "nightDraws", "", "Llnb/predict/earn/data/remote/DrawDetailDto;", "standardDraws", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getNightDraws", "()Ljava/util/List;", "getStandardDraws", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DrawCategoriesDto {
    public static final int $stable = 8;
    private final List<DrawDetailDto> nightDraws;
    private final List<DrawDetailDto> standardDraws;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawCategoriesDto copy$default(DrawCategoriesDto drawCategoriesDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = drawCategoriesDto.nightDraws;
        }
        if ((i & 2) != 0) {
            list2 = drawCategoriesDto.standardDraws;
        }
        return drawCategoriesDto.copy(list, list2);
    }

    public final List<DrawDetailDto> component1() {
        return this.nightDraws;
    }

    public final List<DrawDetailDto> component2() {
        return this.standardDraws;
    }

    public final DrawCategoriesDto copy(List<DrawDetailDto> nightDraws, List<DrawDetailDto> standardDraws) {
        return new DrawCategoriesDto(nightDraws, standardDraws);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawCategoriesDto)) {
            return false;
        }
        DrawCategoriesDto drawCategoriesDto = (DrawCategoriesDto) other;
        return Intrinsics.areEqual(this.nightDraws, drawCategoriesDto.nightDraws) && Intrinsics.areEqual(this.standardDraws, drawCategoriesDto.standardDraws);
    }

    public int hashCode() {
        return ((this.nightDraws == null ? 0 : this.nightDraws.hashCode()) * 31) + (this.standardDraws != null ? this.standardDraws.hashCode() : 0);
    }

    public String toString() {
        return "DrawCategoriesDto(nightDraws=" + this.nightDraws + ", standardDraws=" + this.standardDraws + ")";
    }

    public DrawCategoriesDto(List<DrawDetailDto> list, List<DrawDetailDto> list2) {
        this.nightDraws = list;
        this.standardDraws = list2;
    }

    public final List<DrawDetailDto> getNightDraws() {
        return this.nightDraws;
    }

    public final List<DrawDetailDto> getStandardDraws() {
        return this.standardDraws;
    }
}
