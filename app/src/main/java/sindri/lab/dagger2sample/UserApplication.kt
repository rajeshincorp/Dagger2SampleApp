package sindri.lab.dagger2sample

import android.app.Application
import sindri.lab.dagger2sample.di.DaggerUserRegistrationComponent
import sindri.lab.dagger2sample.di.UserRegistrationComponent

class UserApplication : Application() {

    lateinit var daggerUserRegistrationComponent: UserRegistrationComponent

    @Override
    override fun onCreate() {
        super.onCreate()
        daggerUserRegistrationComponent = DaggerUserRegistrationComponent.factory().create(9)
    }
}