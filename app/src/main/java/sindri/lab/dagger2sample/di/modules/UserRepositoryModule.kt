package sindri.lab.dagger2sample.di.modules

import dagger.Binds
import dagger.Module
import sindri.lab.dagger2sample.SQLRepository
import sindri.lab.dagger2sample.UserRepository

@Module
abstract class UserRepositoryModule {

    /*@Provides
    fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository {
        return sqlRepository
    }

    alternative to this code is below with @Bind, making fun abstract leads to make this class abstract,
    which was normal class in the case of @Provide
     */

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository

}