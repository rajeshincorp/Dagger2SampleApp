package sindri.lab.dagger2sample.di

import androidx.activity.ComponentActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import sindri.lab.dagger2sample.StartingActivity
import sindri.lab.dagger2sample.UserRegistrationService
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {

    //--constructor di injection--
    // previously dependency of UserRegistrationService is created like below

    //fun getUserRegistrationService() : UserRegistrationService
    //fun getEmailService() : EmailService

    //--field di injection--
    //this is new and alternative approach to upper approach
    //you can change the fun name from 'inject' to something else
    //now you will have use
    //
    fun inject(activity: StartingActivity)

    //Factory added to pass dynamic value to dependencies, previously done through modules
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }

}