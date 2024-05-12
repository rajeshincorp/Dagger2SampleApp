package sindri.lab.dagger2sample

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor(private val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d("TAG","User saved in DB")
        analyticsService.trackEvent("UserRepository","User saved in DB")
    }
}

class FirebaseRepository @Inject constructor(private val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d("TAG","User saved in Firebase")
        analyticsService.trackEvent("UserRepository","User saved in Firebase")
    }
}

