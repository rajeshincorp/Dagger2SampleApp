package sindri.lab.dagger2sample.di.components

import dagger.Component
import sindri.lab.dagger2sample.AnalyticsService
import sindri.lab.dagger2sample.UserRegistrationService
import sindri.lab.dagger2sample.di.modules.AnalyticsServiceModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsServiceModule::class])
interface AppComponent {

    fun getUserRegistrationComponentBuilder() : UserRegistrationComponent.Builder

}