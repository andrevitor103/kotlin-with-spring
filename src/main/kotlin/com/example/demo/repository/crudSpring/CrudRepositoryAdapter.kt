package com.example.demo.repository.crudSpring

import com.example.demo.Message
import com.example.demo.repository.Connection
import com.example.demo.repository.MessageRepository

class CrudRepositoryAdapter(private val connection: Connection): MessageRepository {
    override fun findAll(): List<Message> = connection.findAll()
    override fun findById(id: String): List<Message> = connection.findById(id)
    override fun save(message: Message) {
        connection.save(message)
    }
}
