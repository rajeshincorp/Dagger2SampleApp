package sindri.lab.dagger2sample.di.components

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import sindri.lab.dagger2sample.di.annotations.ActivityScope
import sindri.lab.dagger2sample.ui.StartingActivity
import sindri.lab.dagger2sample.di.modules.NotificationServiceModule
import sindri.lab.dagger2sample.di.modules.UserRepositoryModule

@ActivityScope
@Subcomponent(modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface UserRegistrationComponent {

    fun inject(activity: StartingActivity)

    /*@Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }*/

}