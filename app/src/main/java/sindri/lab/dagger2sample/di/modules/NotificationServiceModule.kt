package sindri.lab.dagger2sample.di.modules

import dagger.Module
import dagger.Provides
import sindri.lab.dagger2sample.EmailService
import sindri.lab.dagger2sample.MessageService
import sindri.lab.dagger2sample.NotificationService
import sindri.lab.dagger2sample.di.annotations.MessageQualifier
import javax.inject.Named

@Module
class NotificationServiceModule {
//"(private val retryCount: Int)" is removed because we are using factory now in UserRegistrationComponent
    //@MessageQualifier is alternative to @Named("message"), so because to prevent typo
    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService {
        //retryCount is a dynamic value that we are passing at runtime
        return MessageService(41)
    }

    @Named("email")
    @Provides
    fun getEmaNotificationService() : NotificationService {
        return EmailService()
    }

}