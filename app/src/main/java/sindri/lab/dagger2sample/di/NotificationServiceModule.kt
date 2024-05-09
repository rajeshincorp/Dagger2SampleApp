package sindri.lab.dagger2sample.di

import dagger.Module
import dagger.Provides
import sindri.lab.dagger2sample.EmailService
import sindri.lab.dagger2sample.MessageService
import sindri.lab.dagger2sample.NotificationService
import sindri.lab.dagger2sample.UserRepository
import javax.inject.Named

@Module
class NotificationServiceModule {

    //@MessageQualifier is alternative to @Named("message"), so because to prevent typo
    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService {
        return MessageService()
    }

    @Named("email")
    @Provides
    fun getEmaNotificationServicece() : NotificationService {
        return EmailService()
    }

}