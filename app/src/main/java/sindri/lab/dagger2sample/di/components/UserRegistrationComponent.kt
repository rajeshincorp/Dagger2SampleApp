package sindri.lab.dagger2sample.di.components

import dagger.BindsInstance
import dagger.Component
import sindri.lab.dagger2sample.di.annotations.ActivityScope
import sindri.lab.dagger2sample.ui.StartingActivity
import sindri.lab.dagger2sample.di.modules.NotificationServiceModule
import sindri.lab.dagger2sample.di.modules.UserRepositoryModule

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface UserRegistrationComponent {

    fun inject(activity: StartingActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int, appComponent: AppComponent): UserRegistrationComponent
    }

}