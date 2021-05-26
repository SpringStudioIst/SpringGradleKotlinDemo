package com.angcyo.spring.gradle.kotlin.demo

import com.angcyo.spring.util.Util
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringGradleKotlinDemoApplication : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        println(Util.Test)
    }
}

fun main(args: Array<String>) {
    runApplication<SpringGradleKotlinDemoApplication>(*args)
}
