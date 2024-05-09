package sindri.lab.dagger2sample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import sindri.lab.dagger2sample.di.DaggerUserRegistrationComponent
import javax.inject.Inject

class StartingActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_starting)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fun comment1(){
            //compiler will not generate DaggerUserRegistrationComponent if you don't use
            //plugins {
            //    id("kotlin-kapt")
            //} &
            // kapt("com.google.dagger:dagger-android-processor:2.51.1")
            // kapt("com.google.dagger:dagger-compiler:2.51.1")
            // instead of annotationProcessor("com.google.dagger:dagger-compiler:2.51.1"), etc only
            //--before inject fun at UserRegistrationService is used--
            //userRegistrationService = DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()
        }

        val component = (application as UserApplication).daggerUserRegistrationComponent
        component.inject(this)

        userRegistrationService.registerUser("rajesh@gmail.com","12345678")
    }

}