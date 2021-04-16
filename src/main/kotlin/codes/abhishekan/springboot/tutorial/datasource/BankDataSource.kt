package codes.abhishekan.springboot.tutorial.datasource

import codes.abhishekan.springboot.tutorial.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
}