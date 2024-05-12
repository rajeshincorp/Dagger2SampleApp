package sindri.lab.dagger2sample

import android.util.Log
import sindri.lab.dagger2sample.di.annotations.ActivityScope
import javax.inject.Inject

interface NotificationService{
    fun send(to: String, from: String, body: String?)
}

@ActivityScope
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