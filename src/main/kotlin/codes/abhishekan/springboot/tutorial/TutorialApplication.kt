package codes.abhishekan.springboot.tutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TutorialApplication

fun main(args: Array<String>) {
	runApplication<TutorialApplication>(*args)
}