package codes.abhishekan.springboot.tutorial.controller

import codes.abhishekan.springboot.tutorial.model.Bank
import codes.abhishekan.springboot.tutorial.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/banks")
class BankController(private val service: BankService) {
    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()
}