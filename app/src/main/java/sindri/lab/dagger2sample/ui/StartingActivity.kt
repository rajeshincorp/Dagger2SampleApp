package sindri.lab.dagger2sample.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import sindri.lab.dagger2sample.R
import sindri.lab.dagger2sample.UserApplication
import sindri.lab.dagger2sample.UserRegistrationService
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

        val appComponent = (application as UserApplication).appComponent

        val component = appComponent.getUserRegistrationComponentBuilder().retryCount(37).build()
        component.inject(this)

        userRegistrationService.registerUser("rajesh@gmail.com","12345678")
    }

}