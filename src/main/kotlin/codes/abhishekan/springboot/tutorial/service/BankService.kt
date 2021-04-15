package codes.abhishekan.springboot.tutorial.service

import codes.abhishekan.springboot.tutorial.datasource.BankDataSource
import codes.abhishekan.springboot.tutorial.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank =dataSource.createBank(bank)
}