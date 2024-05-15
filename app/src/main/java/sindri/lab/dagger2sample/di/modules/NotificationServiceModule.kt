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
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int) : NotificationService {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmaNotificationService() : NotificationService {
        return EmailService()
    }

}