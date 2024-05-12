package sindri.lab.dagger2sample.di.modules

import dagger.Binds
import dagger.Module
import dagger.Provides
import sindri.lab.dagger2sample.AnalyticsService
import sindri.lab.dagger2sample.Mixpanel

@Module
class AnalyticsServiceModule {
    @Provides
    fun providesAnalyticsService(): AnalyticsService{
        return Mixpanel()
    }
}