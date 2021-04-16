package codes.abhishekan.springboot.tutorial.datasource.mock

import codes.abhishekan.springboot.tutorial.datasource.BankDataSource
import codes.abhishekan.springboot.tutorial.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = mutableListOf(
        Bank("1234", 3.14, 17),
        Bank("1232", 3.15, 0),
        Bank("1235", 0.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank = banks.firstOrNull { it.accountNumber == accountNumber }
        ?: throw  NoSuchElementException("Could not find a bank with account number $accountNumber")

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exists.")
        }
        banks.add(bank)
        return bank
    }

    override fun updateBank(bank: Bank): Bank {
        val currentBank = banks.firstOrNull { it.accountNumber == bank.accountNumber }
            ?: throw  NoSuchElementException("Could not find bank with account numnber ${bank.accountNumber}")
        banks.remove(currentBank)
        banks.add(bank)
        return bank
    }

}