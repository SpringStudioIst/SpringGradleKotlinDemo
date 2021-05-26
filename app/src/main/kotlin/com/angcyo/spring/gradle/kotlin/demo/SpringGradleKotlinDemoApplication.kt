package com.angcyo.spring.gradle.kotlin.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringGradleKotlinDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringGradleKotlinDemoApplication>(*args)
}
