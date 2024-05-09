package sindri.lab.dagger2sample

import androidx.versionedparcelable.ParcelImpl
import sindri.lab.dagger2sample.di.MessageQualifier
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService) {

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        notificationService.send(email,"rajesh@gmail.com","Hi, you are registered!")
    }

}