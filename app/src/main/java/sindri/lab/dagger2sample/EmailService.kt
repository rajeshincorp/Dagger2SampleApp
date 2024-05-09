package sindri.lab.dagger2sample

import android.util.Log
import sindri.lab.dagger2sample.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(to: String, from: String, body: String?)
}

@ApplicationScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?){
        Log.d("TAG","Email sent")
    }
}

class MessageService @Inject constructor(private val retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d("TAG","Message sent - Retry count : $retryCount")
    }
}