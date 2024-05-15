package sindri.lab.dagger2sample.di.modules

import dagger.Binds
import dagger.Module
import sindri.lab.dagger2sample.SQLRepository
import sindri.lab.dagger2sample.UserRepository

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository

}