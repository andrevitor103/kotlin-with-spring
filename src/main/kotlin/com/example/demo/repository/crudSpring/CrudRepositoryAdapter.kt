package com.example.demo.repository.crudSpring

import com.example.demo.Message
import com.example.demo.repository.Connection
import org.springframework.context.annotation.Bean

class CrudRepositoryAdapter(private val connection: Connection) {
    fun findAll(): List<Message> = connection.findAll()
    fun findById(id: String): List<Message> = connection.findById(id)
    fun save(message: Message) {
        connection.save(message)
    }
}
