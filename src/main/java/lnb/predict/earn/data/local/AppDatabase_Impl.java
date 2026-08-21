package lnb.predict.earn.data.local;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppDatabase_Impl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J*\u0010\u0015\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00170\u00190\u0016H\u0014J\u0016\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u00170\u001bH\u0016J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\u001a\u0010\u001f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u0017\u0012\u0004\u0012\u00020\u001c0\u0016H\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\bH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Llnb/predict/earn/data/local/AppDatabase_Impl;", "Llnb/predict/earn/data/local/AppDatabase;", "<init>", "()V", "_drawDao", "Lkotlin/Lazy;", "Llnb/predict/earn/data/local/DrawDao;", "_statisticsDao", "Llnb/predict/earn/data/local/StatisticsDao;", "_analysisDao", "Llnb/predict/earn/data/local/AnalysisDao;", "_indexedAnalyticsDao", "Llnb/predict/earn/data/local/IndexedAnalyticsDao;", "createOpenHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "config", "Landroidx/room/DatabaseConfiguration;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverters", "", "Ljava/lang/Class;", "", "", "getRequiredAutoMigrationSpecs", "", "Landroidx/room/migration/AutoMigrationSpec;", "getAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "drawDao", "statisticsDao", "analysisDao", "indexedAnalyticsDao", "app_debug"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AppDatabase_Impl extends AppDatabase {
    public static final int $stable = 8;
    private final Lazy<DrawDao> _drawDao = LazyKt.lazy(new Function0() { // from class: lnb.predict.earn.data.local.AppDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._drawDao$lambda$0(this.f$0);
        }
    });
    private final Lazy<StatisticsDao> _statisticsDao = LazyKt.lazy(new Function0() { // from class: lnb.predict.earn.data.local.AppDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._statisticsDao$lambda$1(this.f$0);
        }
    });
    private final Lazy<AnalysisDao> _analysisDao = LazyKt.lazy(new Function0() { // from class: lnb.predict.earn.data.local.AppDatabase_Impl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._analysisDao$lambda$2(this.f$0);
        }
    });
    private final Lazy<IndexedAnalyticsDao> _indexedAnalyticsDao = LazyKt.lazy(new Function0() { // from class: lnb.predict.earn.data.local.AppDatabase_Impl$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._indexedAnalyticsDao$lambda$3(this.f$0);
        }
    });

    static final DrawDao_Impl _drawDao$lambda$0(AppDatabase_Impl this$0) {
        return new DrawDao_Impl(this$0);
    }

    static final StatisticsDao_Impl _statisticsDao$lambda$1(AppDatabase_Impl this$0) {
        return new StatisticsDao_Impl(this$0);
    }

    static final AnalysisDao_Impl _analysisDao$lambda$2(AppDatabase_Impl this$0) {
        return new AnalysisDao_Impl(this$0);
    }

    static final IndexedAnalyticsDao_Impl _indexedAnalyticsDao$lambda$3(AppDatabase_Impl this$0) {
        return new IndexedAnalyticsDao_Impl(this$0);
    }

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate() { // from class: lnb.predict.earn.data.local.AppDatabase_Impl$createOpenHelper$_openCallback$1
            {
                super(6);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("CREATE TABLE IF NOT EXISTS `draws` (`id` TEXT NOT NULL, `date` TEXT NOT NULL, `year` INTEGER NOT NULL, `month` INTEGER NOT NULL, `day` INTEGER NOT NULL, `drawName` TEXT NOT NULL, `drawType` TEXT NOT NULL, `numbers` TEXT NOT NULL, PRIMARY KEY(`id`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `statistics` (`id` TEXT NOT NULL, `jsonContent` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `predictions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `date` TEXT NOT NULL, `drawName` TEXT NOT NULL, `predictedNumbers` TEXT NOT NULL, `predictedScores` TEXT NOT NULL, `actualNumbers` TEXT, `matchCount` INTEGER NOT NULL, `evaluated` INTEGER NOT NULL)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `analysis_weights` (`id` TEXT NOT NULL, `freqWeight` REAL NOT NULL, `delayWeight` REAL NOT NULL, `transitionWeight` REAL NOT NULL, `hourlyWeight` REAL NOT NULL, `repetitionWeight` REAL NOT NULL, `lastUpdate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `monthly_analytics` (`periodKey` TEXT NOT NULL, `jsonContent` TEXT NOT NULL, `lastDrawId` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`periodKey`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `pair_index` (`pairKey` TEXT NOT NULL, `count` INTEGER NOT NULL, `lastSeen` TEXT NOT NULL, PRIMARY KEY(`pairKey`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `triplet_index` (`tripletKey` TEXT NOT NULL, `count` INTEGER NOT NULL, `lastSeen` TEXT NOT NULL, PRIMARY KEY(`tripletKey`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `transition_index` (`transitionKey` TEXT NOT NULL, `count` INTEGER NOT NULL, `tType` INTEGER NOT NULL, PRIMARY KEY(`transitionKey`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `analytics_metadata` (`id` TEXT NOT NULL, `lastProcessedDrawId` TEXT, `globalJsonContent` TEXT, PRIMARY KEY(`id`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `backtest_results` (`id` TEXT NOT NULL, `jsonContent` TEXT NOT NULL, `lastDrawId` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                db.execSQL(RoomMasterTable.CREATE_QUERY);
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0054824cd736e4812cdd62f318c45388')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("DROP TABLE IF EXISTS `draws`");
                db.execSQL("DROP TABLE IF EXISTS `statistics`");
                db.execSQL("DROP TABLE IF EXISTS `predictions`");
                db.execSQL("DROP TABLE IF EXISTS `analysis_weights`");
                db.execSQL("DROP TABLE IF EXISTS `monthly_analytics`");
                db.execSQL("DROP TABLE IF EXISTS `pair_index`");
                db.execSQL("DROP TABLE IF EXISTS `triplet_index`");
                db.execSQL("DROP TABLE IF EXISTS `transition_index`");
                db.execSQL("DROP TABLE IF EXISTS `analytics_metadata`");
                db.execSQL("DROP TABLE IF EXISTS `backtest_results`");
                List<RoomDatabase.Callback> _callbacks = this.this$0.mCallbacks;
                if (_callbacks != null) {
                    for (RoomDatabase.Callback _callback : _callbacks) {
                        _callback.onDestructiveMigration(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                List<RoomDatabase.Callback> _callbacks = this.this$0.mCallbacks;
                if (_callbacks != null) {
                    for (RoomDatabase.Callback _callback : _callbacks) {
                        _callback.onCreate(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                this.this$0.mDatabase = db;
                this.this$0.internalInitInvalidationTracker(db);
                List<RoomDatabase.Callback> _callbacks = this.this$0.mCallbacks;
                if (_callbacks != null) {
                    for (RoomDatabase.Callback _callback : _callbacks) {
                        _callback.onOpen(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                DBUtil.dropFtsSyncTriggers(db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                HashMap _columnsDraws = new HashMap(8);
                _columnsDraws.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsDraws.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
                _columnsDraws.put("year", new TableInfo.Column("year", "INTEGER", true, 0, null, 1));
                _columnsDraws.put("month", new TableInfo.Column("month", "INTEGER", true, 0, null, 1));
                _columnsDraws.put("day", new TableInfo.Column("day", "INTEGER", true, 0, null, 1));
                _columnsDraws.put("drawName", new TableInfo.Column("drawName", "TEXT", true, 0, null, 1));
                _columnsDraws.put("drawType", new TableInfo.Column("drawType", "TEXT", true, 0, null, 1));
                _columnsDraws.put("numbers", new TableInfo.Column("numbers", "TEXT", true, 0, null, 1));
                HashSet _foreignKeysDraws = new HashSet(0);
                HashSet _indicesDraws = new HashSet(0);
                TableInfo _infoDraws = new TableInfo("draws", _columnsDraws, _foreignKeysDraws, _indicesDraws);
                TableInfo _existingDraws = TableInfo.INSTANCE.read(db, "draws");
                if (!_infoDraws.equals(_existingDraws)) {
                    return new RoomOpenHelper.ValidationResult(false, "draws(lnb.predict.earn.data.local.DrawEntity).\n Expected:\n" + _infoDraws + "\n Found:\n" + _existingDraws);
                }
                HashMap _columnsStatistics = new HashMap(3);
                _columnsStatistics.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsStatistics.put("jsonContent", new TableInfo.Column("jsonContent", "TEXT", true, 0, null, 1));
                _columnsStatistics.put("lastUpdated", new TableInfo.Column("lastUpdated", "INTEGER", true, 0, null, 1));
                HashSet _foreignKeysStatistics = new HashSet(0);
                HashSet _indicesStatistics = new HashSet(0);
                TableInfo _infoStatistics = new TableInfo("statistics", _columnsStatistics, _foreignKeysStatistics, _indicesStatistics);
                TableInfo _existingStatistics = TableInfo.INSTANCE.read(db, "statistics");
                if (!_infoStatistics.equals(_existingStatistics)) {
                    return new RoomOpenHelper.ValidationResult(false, "statistics(lnb.predict.earn.data.local.StatisticsEntity).\n Expected:\n" + _infoStatistics + "\n Found:\n" + _existingStatistics);
                }
                HashMap _columnsPredictions = new HashMap(9);
                _columnsPredictions.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                _columnsPredictions.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                _columnsPredictions.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
                _columnsPredictions.put("drawName", new TableInfo.Column("drawName", "TEXT", true, 0, null, 1));
                _columnsPredictions.put("predictedNumbers", new TableInfo.Column("predictedNumbers", "TEXT", true, 0, null, 1));
                _columnsPredictions.put("predictedScores", new TableInfo.Column("predictedScores", "TEXT", true, 0, null, 1));
                _columnsPredictions.put("actualNumbers", new TableInfo.Column("actualNumbers", "TEXT", false, 0, null, 1));
                _columnsPredictions.put("matchCount", new TableInfo.Column("matchCount", "INTEGER", true, 0, null, 1));
                _columnsPredictions.put("evaluated", new TableInfo.Column("evaluated", "INTEGER", true, 0, null, 1));
                HashSet _foreignKeysPredictions = new HashSet(0);
                HashSet _indicesPredictions = new HashSet(0);
                TableInfo _infoPredictions = new TableInfo("predictions", _columnsPredictions, _foreignKeysPredictions, _indicesPredictions);
                TableInfo _existingPredictions = TableInfo.INSTANCE.read(db, "predictions");
                if (!_infoPredictions.equals(_existingPredictions)) {
                    return new RoomOpenHelper.ValidationResult(false, "predictions(lnb.predict.earn.data.local.PredictionEntity).\n Expected:\n" + _infoPredictions + "\n Found:\n" + _existingPredictions);
                }
                HashMap _columnsAnalysisWeights = new HashMap(7);
                _columnsAnalysisWeights.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsAnalysisWeights.put("freqWeight", new TableInfo.Column("freqWeight", "REAL", true, 0, null, 1));
                _columnsAnalysisWeights.put("delayWeight", new TableInfo.Column("delayWeight", "REAL", true, 0, null, 1));
                _columnsAnalysisWeights.put("transitionWeight", new TableInfo.Column("transitionWeight", "REAL", true, 0, null, 1));
                _columnsAnalysisWeights.put("hourlyWeight", new TableInfo.Column("hourlyWeight", "REAL", true, 0, null, 1));
                _columnsAnalysisWeights.put("repetitionWeight", new TableInfo.Column("repetitionWeight", "REAL", true, 0, null, 1));
                _columnsAnalysisWeights.put("lastUpdate", new TableInfo.Column("lastUpdate", "INTEGER", true, 0, null, 1));
                HashSet _foreignKeysAnalysisWeights = new HashSet(0);
                HashSet _indicesAnalysisWeights = new HashSet(0);
                TableInfo _infoAnalysisWeights = new TableInfo("analysis_weights", _columnsAnalysisWeights, _foreignKeysAnalysisWeights, _indicesAnalysisWeights);
                TableInfo _existingAnalysisWeights = TableInfo.INSTANCE.read(db, "analysis_weights");
                if (!_infoAnalysisWeights.equals(_existingAnalysisWeights)) {
                    return new RoomOpenHelper.ValidationResult(false, "analysis_weights(lnb.predict.earn.data.local.WeightEntity).\n Expected:\n" + _infoAnalysisWeights + "\n Found:\n" + _existingAnalysisWeights);
                }
                HashMap _columnsMonthlyAnalytics = new HashMap(4);
                _columnsMonthlyAnalytics.put("periodKey", new TableInfo.Column("periodKey", "TEXT", true, 1, null, 1));
                _columnsMonthlyAnalytics.put("jsonContent", new TableInfo.Column("jsonContent", "TEXT", true, 0, null, 1));
                _columnsMonthlyAnalytics.put("lastDrawId", new TableInfo.Column("lastDrawId", "TEXT", true, 0, null, 1));
                _columnsMonthlyAnalytics.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                HashSet _foreignKeysMonthlyAnalytics = new HashSet(0);
                HashSet _indicesMonthlyAnalytics = new HashSet(0);
                TableInfo _infoMonthlyAnalytics = new TableInfo("monthly_analytics", _columnsMonthlyAnalytics, _foreignKeysMonthlyAnalytics, _indicesMonthlyAnalytics);
                TableInfo _existingMonthlyAnalytics = TableInfo.INSTANCE.read(db, "monthly_analytics");
                if (!_infoMonthlyAnalytics.equals(_existingMonthlyAnalytics)) {
                    return new RoomOpenHelper.ValidationResult(false, "monthly_analytics(lnb.predict.earn.data.local.MonthlyAnalyticsEntity).\n Expected:\n" + _infoMonthlyAnalytics + "\n Found:\n" + _existingMonthlyAnalytics);
                }
                HashMap _columnsPairIndex = new HashMap(3);
                _columnsPairIndex.put("pairKey", new TableInfo.Column("pairKey", "TEXT", true, 1, null, 1));
                _columnsPairIndex.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, 1));
                _columnsPairIndex.put("lastSeen", new TableInfo.Column("lastSeen", "TEXT", true, 0, null, 1));
                HashSet _foreignKeysPairIndex = new HashSet(0);
                HashSet _indicesPairIndex = new HashSet(0);
                TableInfo _infoPairIndex = new TableInfo("pair_index", _columnsPairIndex, _foreignKeysPairIndex, _indicesPairIndex);
                TableInfo _existingPairIndex = TableInfo.INSTANCE.read(db, "pair_index");
                if (!_infoPairIndex.equals(_existingPairIndex)) {
                    return new RoomOpenHelper.ValidationResult(false, "pair_index(lnb.predict.earn.data.local.PairIndexEntity).\n Expected:\n" + _infoPairIndex + "\n Found:\n" + _existingPairIndex);
                }
                HashMap _columnsTripletIndex = new HashMap(3);
                _columnsTripletIndex.put("tripletKey", new TableInfo.Column("tripletKey", "TEXT", true, 1, null, 1));
                _columnsTripletIndex.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, 1));
                _columnsTripletIndex.put("lastSeen", new TableInfo.Column("lastSeen", "TEXT", true, 0, null, 1));
                HashSet _foreignKeysTripletIndex = new HashSet(0);
                HashSet _indicesTripletIndex = new HashSet(0);
                TableInfo _infoTripletIndex = new TableInfo("triplet_index", _columnsTripletIndex, _foreignKeysTripletIndex, _indicesTripletIndex);
                TableInfo _existingTripletIndex = TableInfo.INSTANCE.read(db, "triplet_index");
                if (!_infoTripletIndex.equals(_existingTripletIndex)) {
                    return new RoomOpenHelper.ValidationResult(false, "triplet_index(lnb.predict.earn.data.local.TripletIndexEntity).\n Expected:\n" + _infoTripletIndex + "\n Found:\n" + _existingTripletIndex);
                }
                HashMap _columnsTransitionIndex = new HashMap(3);
                _columnsTransitionIndex.put("transitionKey", new TableInfo.Column("transitionKey", "TEXT", true, 1, null, 1));
                _columnsTransitionIndex.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, 1));
                _columnsTransitionIndex.put("tType", new TableInfo.Column("tType", "INTEGER", true, 0, null, 1));
                HashSet _foreignKeysTransitionIndex = new HashSet(0);
                HashSet _indicesTransitionIndex = new HashSet(0);
                TableInfo _infoTransitionIndex = new TableInfo("transition_index", _columnsTransitionIndex, _foreignKeysTransitionIndex, _indicesTransitionIndex);
                TableInfo _existingTransitionIndex = TableInfo.INSTANCE.read(db, "transition_index");
                if (!_infoTransitionIndex.equals(_existingTransitionIndex)) {
                    return new RoomOpenHelper.ValidationResult(false, "transition_index(lnb.predict.earn.data.local.TransitionIndexEntity).\n Expected:\n" + _infoTransitionIndex + "\n Found:\n" + _existingTransitionIndex);
                }
                HashMap _columnsAnalyticsMetadata = new HashMap(3);
                _columnsAnalyticsMetadata.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsAnalyticsMetadata.put("lastProcessedDrawId", new TableInfo.Column("lastProcessedDrawId", "TEXT", false, 0, null, 1));
                _columnsAnalyticsMetadata.put("globalJsonContent", new TableInfo.Column("globalJsonContent", "TEXT", false, 0, null, 1));
                HashSet _foreignKeysAnalyticsMetadata = new HashSet(0);
                HashSet _indicesAnalyticsMetadata = new HashSet(0);
                TableInfo _infoAnalyticsMetadata = new TableInfo("analytics_metadata", _columnsAnalyticsMetadata, _foreignKeysAnalyticsMetadata, _indicesAnalyticsMetadata);
                TableInfo _existingAnalyticsMetadata = TableInfo.INSTANCE.read(db, "analytics_metadata");
                if (!_infoAnalyticsMetadata.equals(_existingAnalyticsMetadata)) {
                    return new RoomOpenHelper.ValidationResult(false, "analytics_metadata(lnb.predict.earn.data.local.AnalyticsMetadataEntity).\n Expected:\n" + _infoAnalyticsMetadata + "\n Found:\n" + _existingAnalyticsMetadata);
                }
                HashMap _columnsBacktestResults = new HashMap(4);
                _columnsBacktestResults.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsBacktestResults.put("jsonContent", new TableInfo.Column("jsonContent", "TEXT", true, 0, null, 1));
                _columnsBacktestResults.put("lastDrawId", new TableInfo.Column("lastDrawId", "TEXT", true, 0, null, 1));
                _columnsBacktestResults.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                HashSet _foreignKeysBacktestResults = new HashSet(0);
                HashSet _indicesBacktestResults = new HashSet(0);
                TableInfo _infoBacktestResults = new TableInfo("backtest_results", _columnsBacktestResults, _foreignKeysBacktestResults, _indicesBacktestResults);
                TableInfo _existingBacktestResults = TableInfo.INSTANCE.read(db, "backtest_results");
                if (!_infoBacktestResults.equals(_existingBacktestResults)) {
                    return new RoomOpenHelper.ValidationResult(false, "backtest_results(lnb.predict.earn.data.local.BacktestResultEntity).\n Expected:\n" + _infoBacktestResults + "\n Found:\n" + _existingBacktestResults);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "0054824cd736e4812cdd62f318c45388", "bbb9f49e1b8d1e651074884aec382003");
        SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(config.context).name(config.name).callback(_openCallback).build();
        SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
        return _helper;
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        HashMap _shadowTablesMap = new HashMap(0);
        HashMap _viewTables = new HashMap(0);
        return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "draws", "statistics", "predictions", "analysis_weights", "monthly_analytics", "pair_index", "triplet_index", "transition_index", "analytics_metadata", "backtest_results");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            _db.execSQL("DELETE FROM `draws`");
            _db.execSQL("DELETE FROM `statistics`");
            _db.execSQL("DELETE FROM `predictions`");
            _db.execSQL("DELETE FROM `analysis_weights`");
            _db.execSQL("DELETE FROM `monthly_analytics`");
            _db.execSQL("DELETE FROM `pair_index`");
            _db.execSQL("DELETE FROM `triplet_index`");
            _db.execSQL("DELETE FROM `transition_index`");
            _db.execSQL("DELETE FROM `analytics_metadata`");
            _db.execSQL("DELETE FROM `backtest_results`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            _db.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!_db.inTransaction()) {
                _db.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<? extends Object>, List<Class<? extends Object>>> getRequiredTypeConverters() {
        HashMap _typeConvertersMap = new HashMap();
        _typeConvertersMap.put(DrawDao.class, DrawDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(StatisticsDao.class, StatisticsDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(AnalysisDao.class, AnalysisDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(IndexedAnalyticsDao.class, IndexedAnalyticsDao_Impl.INSTANCE.getRequiredConverters());
        return _typeConvertersMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        HashSet _autoMigrationSpecsSet = new HashSet();
        return _autoMigrationSpecsSet;
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        List _autoMigrations = new ArrayList();
        return _autoMigrations;
    }

    @Override // lnb.predict.earn.data.local.AppDatabase
    public DrawDao drawDao() {
        return this._drawDao.getValue();
    }

    @Override // lnb.predict.earn.data.local.AppDatabase
    public StatisticsDao statisticsDao() {
        return this._statisticsDao.getValue();
    }

    @Override // lnb.predict.earn.data.local.AppDatabase
    public AnalysisDao analysisDao() {
        return this._analysisDao.getValue();
    }

    @Override // lnb.predict.earn.data.local.AppDatabase
    public IndexedAnalyticsDao indexedAnalyticsDao() {
        return this._indexedAnalyticsDao.getValue();
    }
}
