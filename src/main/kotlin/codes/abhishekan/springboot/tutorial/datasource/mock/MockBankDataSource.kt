package codes.abhishekan.springboot.tutorial.datasource.mock

import codes.abhishekan.springboot.tutorial.datasource.BankDataSource
import codes.abhishekan.springboot.tutorial.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1232", 3.15, 0),
        Bank("1235", 0.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}