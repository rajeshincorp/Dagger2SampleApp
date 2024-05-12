package sindri.lab.dagger2sample

import android.app.Application
import sindri.lab.dagger2sample.di.components.AppComponent
import sindri.lab.dagger2sample.di.components.DaggerAppComponent

class UserApplication : Application() {

    lateinit var appComponent: AppComponent

    @Override
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}