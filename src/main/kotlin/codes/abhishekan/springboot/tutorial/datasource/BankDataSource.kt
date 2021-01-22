package codes.abhishekan.springboot.tutorial.datasource

import codes.abhishekan.springboot.tutorial.model.Bank

interface BankDataSource {
    fun retrieveBanks():Collection<Bank>
}