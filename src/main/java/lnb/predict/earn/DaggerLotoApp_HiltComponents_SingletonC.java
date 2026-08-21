package lnb.predict.earn;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.hilt.work.WorkerAssistedFactory;
import androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.gson.Gson;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import lnb.predict.earn.data.local.AnalysisDao;
import lnb.predict.earn.data.local.AppDatabase;
import lnb.predict.earn.data.local.DrawDao;
import lnb.predict.earn.data.local.IndexedAnalyticsDao;
import lnb.predict.earn.data.local.StatisticsDao;
import lnb.predict.earn.data.remote.LotoApiService;
import lnb.predict.earn.data.repository.AnalysisRepository;
import lnb.predict.earn.data.repository.IndexedAnalyticsRepository;
import lnb.predict.earn.data.repository.LotoRepository;
import lnb.predict.earn.di.DatabaseModule_ProvideAnalysisDaoFactory;
import lnb.predict.earn.di.DatabaseModule_ProvideDatabaseFactory;
import lnb.predict.earn.di.DatabaseModule_ProvideDrawDaoFactory;
import lnb.predict.earn.di.DatabaseModule_ProvideIndexedAnalyticsDaoFactory;
import lnb.predict.earn.di.DatabaseModule_ProvideStatisticsDaoFactory;
import lnb.predict.earn.di.NetworkModule_ProvideGsonFactory;
import lnb.predict.earn.di.NetworkModule_ProvideLotoApiServiceFactory;
import lnb.predict.earn.di.NetworkModule_ProvideOkHttpClientFactory;
import lnb.predict.earn.domain.service.AdvancedAnalysisService;
import lnb.predict.earn.domain.service.StatisticsService;
import lnb.predict.earn.domain.sync.AnalyticsSyncManager;
import lnb.predict.earn.domain.sync.SyncManager;
import lnb.predict.earn.ui.viewmodel.AnalysisViewModel;
import lnb.predict.earn.ui.viewmodel.AnalysisViewModel_HiltModules;
import lnb.predict.earn.ui.viewmodel.AnalysisViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import lnb.predict.earn.ui.viewmodel.AnalysisViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import lnb.predict.earn.ui.viewmodel.LotoViewModel;
import lnb.predict.earn.ui.viewmodel.LotoViewModel_HiltModules;
import lnb.predict.earn.ui.viewmodel.LotoViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import lnb.predict.earn.ui.viewmodel.LotoViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import lnb.predict.earn.worker.LotoUpdateWorker;
import lnb.predict.earn.worker.LotoUpdateWorker_AssistedFactory;
import lnb.predict.earn.worker.SyncWorker;
import lnb.predict.earn.worker.SyncWorker_AssistedFactory;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes13.dex */
public final class DaggerLotoApp_HiltComponents_SingletonC {
    private DaggerLotoApp_HiltComponents_SingletonC() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ApplicationContextModule applicationContextModule;

        private Builder() {
        }

        public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
            this.applicationContextModule = (ApplicationContextModule) Preconditions.checkNotNull(applicationContextModule);
            return this;
        }

        public LotoApp_HiltComponents.SingletonC build() {
            Preconditions.checkBuilderRequirement(this.applicationContextModule, ApplicationContextModule.class);
            return new SingletonCImpl(this.applicationContextModule);
        }
    }

    private static final class ActivityRetainedCBuilder implements LotoApp_HiltComponents.ActivityRetainedC.Builder {
        private SavedStateHandleHolder savedStateHandleHolder;
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public ActivityRetainedCBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder) {
            this.savedStateHandleHolder = (SavedStateHandleHolder) Preconditions.checkNotNull(savedStateHandleHolder);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public LotoApp_HiltComponents.ActivityRetainedC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandleHolder, SavedStateHandleHolder.class);
            return new ActivityRetainedCImpl(this.singletonCImpl, this.savedStateHandleHolder);
        }
    }

    private static final class ActivityCBuilder implements LotoApp_HiltComponents.ActivityC.Builder {
        private Activity activity;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public ActivityCBuilder activity(Activity activity) {
            this.activity = (Activity) Preconditions.checkNotNull(activity);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public LotoApp_HiltComponents.ActivityC build() {
            Preconditions.checkBuilderRequirement(this.activity, Activity.class);
            return new ActivityCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activity);
        }
    }

    private static final class FragmentCBuilder implements LotoApp_HiltComponents.FragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Fragment fragment;
        private final SingletonCImpl singletonCImpl;

        private FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public FragmentCBuilder fragment(Fragment fragment) {
            this.fragment = (Fragment) Preconditions.checkNotNull(fragment);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public LotoApp_HiltComponents.FragmentC build() {
            Preconditions.checkBuilderRequirement(this.fragment, Fragment.class);
            return new FragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragment);
        }
    }

    private static final class ViewWithFragmentCBuilder implements LotoApp_HiltComponents.ViewWithFragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public ViewWithFragmentCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public LotoApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewWithFragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl, this.view);
        }
    }

    private static final class ViewCBuilder implements LotoApp_HiltComponents.ViewC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public ViewCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public LotoApp_HiltComponents.ViewC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.view);
        }
    }

    private static final class ViewModelCBuilder implements LotoApp_HiltComponents.ViewModelC.Builder {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private SavedStateHandle savedStateHandle;
        private final SingletonCImpl singletonCImpl;
        private ViewModelLifecycle viewModelLifecycle;

        private ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(handle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
            this.viewModelLifecycle = (ViewModelLifecycle) Preconditions.checkNotNull(viewModelLifecycle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public LotoApp_HiltComponents.ViewModelC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.viewModelLifecycle, ViewModelLifecycle.class);
            return new ViewModelCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.savedStateHandle, this.viewModelLifecycle);
        }
    }

    private static final class ServiceCBuilder implements LotoApp_HiltComponents.ServiceC.Builder {
        private Service service;
        private final SingletonCImpl singletonCImpl;

        private ServiceCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public ServiceCBuilder service(Service service) {
            this.service = (Service) Preconditions.checkNotNull(service);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public LotoApp_HiltComponents.ServiceC build() {
            Preconditions.checkBuilderRequirement(this.service, Service.class);
            return new ServiceCImpl(this.singletonCImpl, this.service);
        }
    }

    private static final class ViewWithFragmentCImpl extends LotoApp_HiltComponents.ViewWithFragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

        ViewWithFragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl, View viewParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }
    }

    private static final class FragmentCImpl extends LotoApp_HiltComponents.FragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl = this;
        private final SingletonCImpl singletonCImpl;

        FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, Fragment fragmentParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return this.activityCImpl.getHiltInternalFactoryFactory();
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
            return new ViewWithFragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl);
        }
    }

    private static final class ViewCImpl extends LotoApp_HiltComponents.ViewC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewCImpl viewCImpl = this;

        ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }
    }

    private static final class ActivityCImpl extends LotoApp_HiltComponents.ActivityC {
        private final ActivityCImpl activityCImpl = this;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        Map keySetMapOfClassOfAndBooleanBuilder() {
            MapBuilder mapBuilder = MapBuilder.newMapBuilder(2);
            mapBuilder.put(AnalysisViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(AnalysisViewModel_HiltModules.KeyModule.provide()));
            mapBuilder.put(LotoViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(LotoViewModel_HiltModules.KeyModule.provide()));
            return mapBuilder.build();
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public Map<Class<?>, Boolean> getViewModelKeys() {
            return LazyClassKeyMap.of(keySetMapOfClassOfAndBooleanBuilder());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public ViewModelComponentBuilder getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
        public FragmentComponentBuilder fragmentComponentBuilder() {
            return new FragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
        public ViewComponentBuilder viewComponentBuilder() {
            return new ViewCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        @Override // lnb.predict.earn.MainActivity_GeneratedInjector
        public void injectMainActivity(MainActivity mainActivity) {
        }
    }

    private static final class ViewModelCImpl extends LotoApp_HiltComponents.ViewModelC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        Provider<AnalysisViewModel> analysisViewModelProvider;
        Provider<LotoViewModel> lotoViewModelProvider;
        private final SingletonCImpl singletonCImpl;
        private final ViewModelCImpl viewModelCImpl = this;

        ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            initialize(savedStateHandleParam, viewModelLifecycleParam);
        }

        Map hiltViewModelMapMapOfClassOfAndProviderOfViewModelBuilder() {
            MapBuilder mapBuilder = MapBuilder.newMapBuilder(2);
            mapBuilder.put(AnalysisViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.analysisViewModelProvider);
            mapBuilder.put(LotoViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.lotoViewModelProvider);
            return mapBuilder.build();
        }

        private void initialize(final SavedStateHandle savedStateHandleParam, final ViewModelLifecycle viewModelLifecycleParam) {
            this.analysisViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 0);
            this.lotoViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 1);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
            return LazyClassKeyMap.of(hiltViewModelMapMapOfClassOfAndProviderOfViewModelBuilder());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
            return Collections.emptyMap();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;
            private final int id;
            private final SingletonCImpl singletonCImpl;
            private final ViewModelCImpl viewModelCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.viewModelCImpl = viewModelCImpl;
                this.id = id;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public T get() {
                switch (this.id) {
                    case 0:
                        return (T) new AnalysisViewModel(this.singletonCImpl.lotoRepositoryProvider.get(), this.singletonCImpl.analysisRepositoryProvider.get(), this.singletonCImpl.indexedAnalyticsRepositoryProvider.get(), this.singletonCImpl.advancedAnalysisServiceProvider.get(), this.singletonCImpl.provideGsonProvider.get());
                    case 1:
                        return (T) new LotoViewModel(this.singletonCImpl.lotoRepositoryProvider.get(), this.singletonCImpl.syncManagerProvider.get(), this.singletonCImpl.statisticsServiceProvider.get());
                    default:
                        throw new AssertionError(this.id);
                }
            }
        }
    }

    private static final class ActivityRetainedCImpl extends LotoApp_HiltComponents.ActivityRetainedC {
        private final ActivityRetainedCImpl activityRetainedCImpl = this;
        Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;
        private final SingletonCImpl singletonCImpl;

        ActivityRetainedCImpl(SingletonCImpl singletonCImpl, SavedStateHandleHolder savedStateHandleHolderParam) {
            this.singletonCImpl = singletonCImpl;
            initialize(savedStateHandleHolderParam);
        }

        private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
            this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 0));
        }

        @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
        public ActivityComponentBuilder activityComponentBuilder() {
            return new ActivityCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
        public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
            return this.provideActivityRetainedLifecycleProvider.get();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;
            private final int id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.id = id;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public T get() {
                switch (this.id) {
                    case 0:
                        return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();
                    default:
                        throw new AssertionError(this.id);
                }
            }
        }
    }

    private static final class ServiceCImpl extends LotoApp_HiltComponents.ServiceC {
        private final ServiceCImpl serviceCImpl = this;
        private final SingletonCImpl singletonCImpl;

        ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
            this.singletonCImpl = singletonCImpl;
        }
    }

    private static final class SingletonCImpl extends LotoApp_HiltComponents.SingletonC {
        Provider<AdvancedAnalysisService> advancedAnalysisServiceProvider;
        Provider<AnalysisRepository> analysisRepositoryProvider;
        Provider<AnalyticsSyncManager> analyticsSyncManagerProvider;
        private final ApplicationContextModule applicationContextModule;
        Provider<IndexedAnalyticsRepository> indexedAnalyticsRepositoryProvider;
        Provider<LotoRepository> lotoRepositoryProvider;
        Provider<LotoUpdateWorker_AssistedFactory> lotoUpdateWorker_AssistedFactoryProvider;
        Provider<AppDatabase> provideDatabaseProvider;
        Provider<Gson> provideGsonProvider;
        Provider<LotoApiService> provideLotoApiServiceProvider;
        Provider<OkHttpClient> provideOkHttpClientProvider;
        private final SingletonCImpl singletonCImpl = this;
        Provider<StatisticsService> statisticsServiceProvider;
        Provider<SyncManager> syncManagerProvider;
        Provider<SyncWorker_AssistedFactory> syncWorker_AssistedFactoryProvider;

        SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
            this.applicationContextModule = applicationContextModuleParam;
            initialize(applicationContextModuleParam);
        }

        DrawDao drawDao() {
            return DatabaseModule_ProvideDrawDaoFactory.provideDrawDao(this.provideDatabaseProvider.get());
        }

        StatisticsDao statisticsDao() {
            return DatabaseModule_ProvideStatisticsDaoFactory.provideStatisticsDao(this.provideDatabaseProvider.get());
        }

        IndexedAnalyticsDao indexedAnalyticsDao() {
            return DatabaseModule_ProvideIndexedAnalyticsDaoFactory.provideIndexedAnalyticsDao(this.provideDatabaseProvider.get());
        }

        Map mapOfStringAndProviderOfWorkerAssistedFactoryOfBuilder() {
            MapBuilder mapBuilder = MapBuilder.newMapBuilder(2);
            mapBuilder.put("lnb.predict.earn.worker.LotoUpdateWorker", this.lotoUpdateWorker_AssistedFactoryProvider);
            mapBuilder.put("lnb.predict.earn.worker.SyncWorker", this.syncWorker_AssistedFactoryProvider);
            return mapBuilder.build();
        }

        Map<String, javax.inject.Provider<WorkerAssistedFactory<? extends ListenableWorker>>> mapOfStringAndProviderOfWorkerAssistedFactoryOf() {
            return mapOfStringAndProviderOfWorkerAssistedFactoryOfBuilder();
        }

        HiltWorkerFactory hiltWorkerFactory() {
            return WorkerFactoryModule_ProvideFactoryFactory.provideFactory(mapOfStringAndProviderOfWorkerAssistedFactoryOf());
        }

        AnalysisDao analysisDao() {
            return DatabaseModule_ProvideAnalysisDaoFactory.provideAnalysisDao(this.provideDatabaseProvider.get());
        }

        private void initialize(final ApplicationContextModule applicationContextModuleParam) {
            this.provideOkHttpClientProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 3));
            this.provideGsonProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 4));
            this.provideLotoApiServiceProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 2));
            this.provideDatabaseProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 5));
            this.lotoRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 1));
            this.lotoUpdateWorker_AssistedFactoryProvider = SingleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 0));
            this.indexedAnalyticsRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 9));
            this.advancedAnalysisServiceProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 10));
            this.analyticsSyncManagerProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 8));
            this.statisticsServiceProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 11));
            this.syncManagerProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 7));
            this.syncWorker_AssistedFactoryProvider = SingleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 6));
            this.analysisRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 12));
        }

        @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
        public Set<Boolean> getDisableFragmentGetContextFix() {
            return Collections.emptySet();
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
        public ActivityRetainedComponentBuilder retainedComponentBuilder() {
            return new ActivityRetainedCBuilder(this.singletonCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
        public ServiceComponentBuilder serviceComponentBuilder() {
            return new ServiceCBuilder(this.singletonCImpl);
        }

        @Override // lnb.predict.earn.LotoApp_GeneratedInjector
        public void injectLotoApp(LotoApp lotoApp) {
            injectLotoApp2(lotoApp);
        }

        private LotoApp injectLotoApp2(LotoApp instance) {
            LotoApp_MembersInjector.injectWorkerFactory(instance, hiltWorkerFactory());
            return instance;
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final int id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.id = id;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public T get() {
                switch (this.id) {
                    case 0:
                        return (T) new LotoUpdateWorker_AssistedFactory() { // from class: lnb.predict.earn.DaggerLotoApp_HiltComponents_SingletonC.SingletonCImpl.SwitchingProvider.1
                            @Override // androidx.hilt.work.WorkerAssistedFactory
                            public LotoUpdateWorker create(Context context, WorkerParameters params) {
                                return new LotoUpdateWorker(context, params, SwitchingProvider.this.singletonCImpl.lotoRepositoryProvider.get());
                            }
                        };
                    case 1:
                        return (T) new LotoRepository(this.singletonCImpl.provideLotoApiServiceProvider.get(), this.singletonCImpl.drawDao(), this.singletonCImpl.statisticsDao(), this.singletonCImpl.provideGsonProvider.get());
                    case 2:
                        return (T) NetworkModule_ProvideLotoApiServiceFactory.provideLotoApiService(this.singletonCImpl.provideOkHttpClientProvider.get(), this.singletonCImpl.provideGsonProvider.get());
                    case 3:
                        return (T) NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient();
                    case 4:
                        return (T) NetworkModule_ProvideGsonFactory.provideGson();
                    case 5:
                        return (T) DatabaseModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 6:
                        return (T) new SyncWorker_AssistedFactory() { // from class: lnb.predict.earn.DaggerLotoApp_HiltComponents_SingletonC.SingletonCImpl.SwitchingProvider.2
                            @Override // androidx.hilt.work.WorkerAssistedFactory
                            public SyncWorker create(Context context2, WorkerParameters params2) {
                                return new SyncWorker(context2, params2, SwitchingProvider.this.singletonCImpl.syncManagerProvider.get());
                            }
                        };
                    case 7:
                        return (T) new SyncManager(this.singletonCImpl.lotoRepositoryProvider.get(), this.singletonCImpl.analyticsSyncManagerProvider.get(), this.singletonCImpl.statisticsServiceProvider.get(), this.singletonCImpl.statisticsDao(), this.singletonCImpl.provideGsonProvider.get());
                    case 8:
                        return (T) new AnalyticsSyncManager(this.singletonCImpl.lotoRepositoryProvider.get(), this.singletonCImpl.indexedAnalyticsRepositoryProvider.get(), this.singletonCImpl.advancedAnalysisServiceProvider.get(), this.singletonCImpl.provideGsonProvider.get());
                    case 9:
                        return (T) new IndexedAnalyticsRepository(this.singletonCImpl.indexedAnalyticsDao());
                    case 10:
                        return (T) new AdvancedAnalysisService();
                    case 11:
                        return (T) new StatisticsService();
                    case 12:
                        return (T) new AnalysisRepository(this.singletonCImpl.analysisDao());
                    default:
                        throw new AssertionError(this.id);
                }
            }
        }
    }
}
