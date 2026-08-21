package lnb.predict.earn.data.mapper;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lnb.predict.earn.data.remote.DailyResultDto;
import lnb.predict.earn.data.remote.DrawDetailDto;
import lnb.predict.earn.data.remote.LotoResponse;
import lnb.predict.earn.data.remote.WeeklyResultDto;
import lnb.predict.earn.domain.model.Draw;

/* JADX INFO: compiled from: LotoMapper.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"toDrawList", "", "Llnb/predict/earn/domain/model/Draw;", "Llnb/predict/earn/data/remote/LotoResponse;", "isValid", "", "Llnb/predict/earn/data/remote/DrawDetailDto;", "toDomain", "date", "Ljava/time/LocalDate;", "index", "", "app_debug"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LotoMapperKt {
    public static final List<Draw> toDrawList(LotoResponse $this$toDrawList) {
        Object objM7068constructorimpl;
        Intrinsics.checkNotNullParameter($this$toDrawList, "<this>");
        List draws = new ArrayList();
        Iterable<WeeklyResultDto> drawsResultsWeekly = $this$toDrawList.getDrawsResultsWeekly();
        int i = 0;
        for (WeeklyResultDto weeklyResultDto : drawsResultsWeekly) {
            String str = (String) CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence) weeklyResultDto.getStartDate(), new String[]{"/"}, false, 0, 6, (Object) null));
            String str2 = "2025";
            if (str != null) {
                if (str.length() != 4) {
                    str = "2025";
                }
                if (str != null) {
                    str2 = str;
                }
            }
            for (DailyResultDto dailyResultDto : weeklyResultDto.getDrawResultsDaily()) {
                Iterable iterable = drawsResultsWeekly;
                String date = new Regex("\\d{4}").containsMatchIn(dailyResultDto.getDate()) ? dailyResultDto.getDate() : dailyResultDto.getDate() + "/" + str2;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    try {
                        objM7068constructorimpl = Result.m7068constructorimpl(LocalDate.parse((String) CollectionsKt.last(StringsKt.split$default((CharSequence) date, new String[]{" "}, false, 0, 6, (Object) null)), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM7068constructorimpl = Result.m7068constructorimpl(ResultKt.createFailure(th));
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                if (Result.m7074isFailureimpl(objM7068constructorimpl)) {
                    objM7068constructorimpl = null;
                }
                LocalDate localDate = (LocalDate) objM7068constructorimpl;
                if (localDate != null) {
                    List<DrawDetailDto> standardDraws = dailyResultDto.getDrawResults().getStandardDraws();
                    if (standardDraws == null) {
                        standardDraws = CollectionsKt.emptyList();
                    }
                    List<DrawDetailDto> list = standardDraws;
                    List<DrawDetailDto> nightDraws = dailyResultDto.getDrawResults().getNightDraws();
                    if (nightDraws == null) {
                        nightDraws = CollectionsKt.emptyList();
                    }
                    List listPlus = CollectionsKt.plus((Collection) list, (Iterable) nightDraws);
                    List list2 = listPlus;
                    int i2 = 0;
                    for (Object obj : list2) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        List list3 = listPlus;
                        DrawDetailDto drawDetailDto = (DrawDetailDto) obj;
                        if (isValid(drawDetailDto)) {
                            draws.add(toDomain(drawDetailDto, localDate, i2));
                        }
                        i2 = i3;
                        listPlus = list3;
                        list2 = list2;
                        i = i;
                    }
                }
                drawsResultsWeekly = iterable;
                i = i;
            }
        }
        return draws;
    }

    private static final boolean isValid(DrawDetailDto $this$isValid) {
        return (StringsKt.isBlank($this$isValid.getDrawName()) || Intrinsics.areEqual($this$isValid.getDrawName(), "-") || StringsKt.isBlank($this$isValid.getWinningNumbers()) || Intrinsics.areEqual($this$isValid.getWinningNumbers(), "-")) ? false : true;
    }

    private static final Draw toDomain(DrawDetailDto $this$toDomain, LocalDate date, int index) {
        String type;
        Iterable iterableSplit$default = StringsKt.split$default((CharSequence) $this$toDomain.getWinningNumbers(), new String[]{"-"}, false, 0, 6, (Object) null);
        Collection arrayList = new ArrayList();
        Iterator it = iterableSplit$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) it.next()).toString());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        List numbers = (List) arrayList;
        if (StringsKt.contains((CharSequence) $this$toDomain.getDrawName(), (CharSequence) "Fortune", true)) {
            type = "Fortune";
        } else if (StringsKt.contains((CharSequence) $this$toDomain.getDrawName(), (CharSequence) "Star", true)) {
            type = "Star";
        } else if (StringsKt.contains((CharSequence) $this$toDomain.getDrawName(), (CharSequence) "Digital", true)) {
            type = "Digital";
        } else {
            String str = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) $this$toDomain.getDrawName(), new String[]{" "}, false, 0, 6, (Object) null));
            if (str == null) {
                str = "Autre";
            }
            type = str;
        }
        return new Draw(date + "_" + StringsKt.replace$default($this$toDomain.getDrawName(), " ", "_", false, 4, (Object) null) + "_" + index, date, date.getYear(), date.getMonthValue(), date.getDayOfMonth(), StringsKt.trim((CharSequence) $this$toDomain.getDrawName()).toString(), type, numbers);
    }
}
