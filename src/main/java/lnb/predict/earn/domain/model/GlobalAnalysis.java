package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\n\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003J\u0015\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\nHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\nHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003HÆ\u0003J»\u0001\u00101\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\n2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u000bHÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001c¨\u00068"}, d2 = {"Llnb/predict/earn/domain/model/GlobalAnalysis;", "", "frequencies", "", "Llnb/predict/earn/domain/model/FrequencyStats;", "delays", "Llnb/predict/earn/domain/model/DelayStats;", "repetitions", "Llnb/predict/earn/domain/model/RepetitionStats;", "associations", "", "", "Llnb/predict/earn/domain/model/AssociationStats;", "transitions", "Llnb/predict/earn/domain/model/TransitionStats;", "hourly", "Llnb/predict/earn/domain/model/HourlyStats;", "pairs", "Llnb/predict/earn/domain/model/PairStats;", "triplets", "Llnb/predict/earn/domain/model/TripletStats;", "scores", "", "learningHistory", "Llnb/predict/earn/domain/model/LearningHistory;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "getFrequencies", "()Ljava/util/List;", "getDelays", "getRepetitions", "getAssociations", "()Ljava/util/Map;", "getTransitions", "getHourly", "getPairs", "getTriplets", "getScores", "getLearningHistory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class GlobalAnalysis {
    public static final int $stable = 0;
    private final Map<Integer, AssociationStats> associations;
    private final List<DelayStats> delays;
    private final List<FrequencyStats> frequencies;
    private final List<HourlyStats> hourly;
    private final List<LearningHistory> learningHistory;
    private final List<PairStats> pairs;
    private final List<RepetitionStats> repetitions;
    private final Map<Integer, Double> scores;
    private final Map<Integer, TransitionStats> transitions;
    private final List<TripletStats> triplets;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlobalAnalysis copy$default(GlobalAnalysis globalAnalysis, List list, List list2, List list3, Map map, Map map2, List list4, List list5, List list6, Map map3, List list7, int i, Object obj) {
        if ((i & 1) != 0) {
            list = globalAnalysis.frequencies;
        }
        if ((i & 2) != 0) {
            list2 = globalAnalysis.delays;
        }
        if ((i & 4) != 0) {
            list3 = globalAnalysis.repetitions;
        }
        if ((i & 8) != 0) {
            map = globalAnalysis.associations;
        }
        if ((i & 16) != 0) {
            map2 = globalAnalysis.transitions;
        }
        if ((i & 32) != 0) {
            list4 = globalAnalysis.hourly;
        }
        if ((i & 64) != 0) {
            list5 = globalAnalysis.pairs;
        }
        if ((i & 128) != 0) {
            list6 = globalAnalysis.triplets;
        }
        if ((i & 256) != 0) {
            map3 = globalAnalysis.scores;
        }
        if ((i & 512) != 0) {
            list7 = globalAnalysis.learningHistory;
        }
        Map map4 = map3;
        List list8 = list7;
        List list9 = list5;
        List list10 = list6;
        Map map5 = map2;
        List list11 = list4;
        return globalAnalysis.copy(list, list2, list3, map, map5, list11, list9, list10, map4, list8);
    }

    public final List<FrequencyStats> component1() {
        return this.frequencies;
    }

    public final List<LearningHistory> component10() {
        return this.learningHistory;
    }

    public final List<DelayStats> component2() {
        return this.delays;
    }

    public final List<RepetitionStats> component3() {
        return this.repetitions;
    }

    public final Map<Integer, AssociationStats> component4() {
        return this.associations;
    }

    public final Map<Integer, TransitionStats> component5() {
        return this.transitions;
    }

    public final List<HourlyStats> component6() {
        return this.hourly;
    }

    public final List<PairStats> component7() {
        return this.pairs;
    }

    public final List<TripletStats> component8() {
        return this.triplets;
    }

    public final Map<Integer, Double> component9() {
        return this.scores;
    }

    public final GlobalAnalysis copy(List<FrequencyStats> frequencies, List<DelayStats> delays, List<RepetitionStats> repetitions, Map<Integer, AssociationStats> associations, Map<Integer, TransitionStats> transitions, List<HourlyStats> hourly, List<PairStats> pairs, List<TripletStats> triplets, Map<Integer, Double> scores, List<LearningHistory> learningHistory) {
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        Intrinsics.checkNotNullParameter(delays, "delays");
        Intrinsics.checkNotNullParameter(repetitions, "repetitions");
        Intrinsics.checkNotNullParameter(associations, "associations");
        Intrinsics.checkNotNullParameter(transitions, "transitions");
        Intrinsics.checkNotNullParameter(hourly, "hourly");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Intrinsics.checkNotNullParameter(triplets, "triplets");
        Intrinsics.checkNotNullParameter(scores, "scores");
        Intrinsics.checkNotNullParameter(learningHistory, "learningHistory");
        return new GlobalAnalysis(frequencies, delays, repetitions, associations, transitions, hourly, pairs, triplets, scores, learningHistory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalAnalysis)) {
            return false;
        }
        GlobalAnalysis globalAnalysis = (GlobalAnalysis) other;
        return Intrinsics.areEqual(this.frequencies, globalAnalysis.frequencies) && Intrinsics.areEqual(this.delays, globalAnalysis.delays) && Intrinsics.areEqual(this.repetitions, globalAnalysis.repetitions) && Intrinsics.areEqual(this.associations, globalAnalysis.associations) && Intrinsics.areEqual(this.transitions, globalAnalysis.transitions) && Intrinsics.areEqual(this.hourly, globalAnalysis.hourly) && Intrinsics.areEqual(this.pairs, globalAnalysis.pairs) && Intrinsics.areEqual(this.triplets, globalAnalysis.triplets) && Intrinsics.areEqual(this.scores, globalAnalysis.scores) && Intrinsics.areEqual(this.learningHistory, globalAnalysis.learningHistory);
    }

    public int hashCode() {
        return (((((((((((((((((this.frequencies.hashCode() * 31) + this.delays.hashCode()) * 31) + this.repetitions.hashCode()) * 31) + this.associations.hashCode()) * 31) + this.transitions.hashCode()) * 31) + this.hourly.hashCode()) * 31) + this.pairs.hashCode()) * 31) + this.triplets.hashCode()) * 31) + this.scores.hashCode()) * 31) + this.learningHistory.hashCode();
    }

    public String toString() {
        return "GlobalAnalysis(frequencies=" + this.frequencies + ", delays=" + this.delays + ", repetitions=" + this.repetitions + ", associations=" + this.associations + ", transitions=" + this.transitions + ", hourly=" + this.hourly + ", pairs=" + this.pairs + ", triplets=" + this.triplets + ", scores=" + this.scores + ", learningHistory=" + this.learningHistory + ")";
    }

    public GlobalAnalysis(List<FrequencyStats> frequencies, List<DelayStats> delays, List<RepetitionStats> repetitions, Map<Integer, AssociationStats> associations, Map<Integer, TransitionStats> transitions, List<HourlyStats> hourly, List<PairStats> pairs, List<TripletStats> triplets, Map<Integer, Double> scores, List<LearningHistory> learningHistory) {
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        Intrinsics.checkNotNullParameter(delays, "delays");
        Intrinsics.checkNotNullParameter(repetitions, "repetitions");
        Intrinsics.checkNotNullParameter(associations, "associations");
        Intrinsics.checkNotNullParameter(transitions, "transitions");
        Intrinsics.checkNotNullParameter(hourly, "hourly");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Intrinsics.checkNotNullParameter(triplets, "triplets");
        Intrinsics.checkNotNullParameter(scores, "scores");
        Intrinsics.checkNotNullParameter(learningHistory, "learningHistory");
        this.frequencies = frequencies;
        this.delays = delays;
        this.repetitions = repetitions;
        this.associations = associations;
        this.transitions = transitions;
        this.hourly = hourly;
        this.pairs = pairs;
        this.triplets = triplets;
        this.scores = scores;
        this.learningHistory = learningHistory;
    }

    public final List<FrequencyStats> getFrequencies() {
        return this.frequencies;
    }

    public final List<DelayStats> getDelays() {
        return this.delays;
    }

    public final List<RepetitionStats> getRepetitions() {
        return this.repetitions;
    }

    public final Map<Integer, AssociationStats> getAssociations() {
        return this.associations;
    }

    public final Map<Integer, TransitionStats> getTransitions() {
        return this.transitions;
    }

    public final List<HourlyStats> getHourly() {
        return this.hourly;
    }

    public final List<PairStats> getPairs() {
        return this.pairs;
    }

    public final List<TripletStats> getTriplets() {
        return this.triplets;
    }

    public final Map<Integer, Double> getScores() {
        return this.scores;
    }

    public final List<LearningHistory> getLearningHistory() {
        return this.learningHistory;
    }
}
