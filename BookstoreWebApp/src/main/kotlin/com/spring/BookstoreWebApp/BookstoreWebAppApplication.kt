package com.spring.BookstoreWebApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookstoreWebAppApplication

fun main(args: Array<String>) {
	runApplication<BookstoreWebAppApplication>(*args)
}
