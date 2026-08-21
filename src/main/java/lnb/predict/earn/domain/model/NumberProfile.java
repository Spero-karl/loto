package lnb.predict.earn.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalysisModels.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Llnb/predict/earn/domain/model/NumberProfile;", "", "number", "", "freq", "Llnb/predict/earn/domain/model/FrequencyStats;", "delay", "Llnb/predict/earn/domain/model/DelayStats;", "repetitions", "Llnb/predict/earn/domain/model/RepetitionStats;", "associations", "Llnb/predict/earn/domain/model/AssociationStats;", "hours", "Llnb/predict/earn/domain/model/HourlyStats;", "score", "", "<init>", "(ILlnb/predict/earn/domain/model/FrequencyStats;Llnb/predict/earn/domain/model/DelayStats;Llnb/predict/earn/domain/model/RepetitionStats;Llnb/predict/earn/domain/model/AssociationStats;Llnb/predict/earn/domain/model/HourlyStats;D)V", "getNumber", "()I", "getFreq", "()Llnb/predict/earn/domain/model/FrequencyStats;", "getDelay", "()Llnb/predict/earn/domain/model/DelayStats;", "getRepetitions", "()Llnb/predict/earn/domain/model/RepetitionStats;", "getAssociations", "()Llnb/predict/earn/domain/model/AssociationStats;", "getHours", "()Llnb/predict/earn/domain/model/HourlyStats;", "getScore", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class NumberProfile {
    public static final int $stable = 0;
    private final AssociationStats associations;
    private final DelayStats delay;
    private final FrequencyStats freq;
    private final HourlyStats hours;
    private final int number;
    private final RepetitionStats repetitions;
    private final double score;

    public static /* synthetic */ NumberProfile copy$default(NumberProfile numberProfile, int i, FrequencyStats frequencyStats, DelayStats delayStats, RepetitionStats repetitionStats, AssociationStats associationStats, HourlyStats hourlyStats, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = numberProfile.number;
        }
        if ((i2 & 2) != 0) {
            frequencyStats = numberProfile.freq;
        }
        if ((i2 & 4) != 0) {
            delayStats = numberProfile.delay;
        }
        if ((i2 & 8) != 0) {
            repetitionStats = numberProfile.repetitions;
        }
        if ((i2 & 16) != 0) {
            associationStats = numberProfile.associations;
        }
        if ((i2 & 32) != 0) {
            hourlyStats = numberProfile.hours;
        }
        if ((i2 & 64) != 0) {
            d = numberProfile.score;
        }
        double d2 = d;
        AssociationStats associationStats2 = associationStats;
        HourlyStats hourlyStats2 = hourlyStats;
        return numberProfile.copy(i, frequencyStats, delayStats, repetitionStats, associationStats2, hourlyStats2, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FrequencyStats getFreq() {
        return this.freq;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DelayStats getDelay() {
        return this.delay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RepetitionStats getRepetitions() {
        return this.repetitions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AssociationStats getAssociations() {
        return this.associations;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HourlyStats getHours() {
        return this.hours;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    public final NumberProfile copy(int number, FrequencyStats freq, DelayStats delay, RepetitionStats repetitions, AssociationStats associations, HourlyStats hours, double score) {
        Intrinsics.checkNotNullParameter(freq, "freq");
        Intrinsics.checkNotNullParameter(delay, "delay");
        Intrinsics.checkNotNullParameter(repetitions, "repetitions");
        Intrinsics.checkNotNullParameter(associations, "associations");
        Intrinsics.checkNotNullParameter(hours, "hours");
        return new NumberProfile(number, freq, delay, repetitions, associations, hours, score);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumberProfile)) {
            return false;
        }
        NumberProfile numberProfile = (NumberProfile) other;
        return this.number == numberProfile.number && Intrinsics.areEqual(this.freq, numberProfile.freq) && Intrinsics.areEqual(this.delay, numberProfile.delay) && Intrinsics.areEqual(this.repetitions, numberProfile.repetitions) && Intrinsics.areEqual(this.associations, numberProfile.associations) && Intrinsics.areEqual(this.hours, numberProfile.hours) && Double.compare(this.score, numberProfile.score) == 0;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.number) * 31) + this.freq.hashCode()) * 31) + this.delay.hashCode()) * 31) + this.repetitions.hashCode()) * 31) + this.associations.hashCode()) * 31) + this.hours.hashCode()) * 31) + Double.hashCode(this.score);
    }

    public String toString() {
        return "NumberProfile(number=" + this.number + ", freq=" + this.freq + ", delay=" + this.delay + ", repetitions=" + this.repetitions + ", associations=" + this.associations + ", hours=" + this.hours + ", score=" + this.score + ")";
    }

    public NumberProfile(int number, FrequencyStats freq, DelayStats delay, RepetitionStats repetitions, AssociationStats associations, HourlyStats hours, double score) {
        Intrinsics.checkNotNullParameter(freq, "freq");
        Intrinsics.checkNotNullParameter(delay, "delay");
        Intrinsics.checkNotNullParameter(repetitions, "repetitions");
        Intrinsics.checkNotNullParameter(associations, "associations");
        Intrinsics.checkNotNullParameter(hours, "hours");
        this.number = number;
        this.freq = freq;
        this.delay = delay;
        this.repetitions = repetitions;
        this.associations = associations;
        this.hours = hours;
        this.score = score;
    }

    public final int getNumber() {
        return this.number;
    }

    public final FrequencyStats getFreq() {
        return this.freq;
    }

    public final DelayStats getDelay() {
        return this.delay;
    }

    public final RepetitionStats getRepetitions() {
        return this.repetitions;
    }

    public final AssociationStats getAssociations() {
        return this.associations;
    }

    public final HourlyStats getHours() {
        return this.hours;
    }

    public final double getScore() {
        return this.score;
    }
}
