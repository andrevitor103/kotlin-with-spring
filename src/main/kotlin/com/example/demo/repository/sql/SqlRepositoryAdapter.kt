package com.example.demo.repository.sql

import com.example.demo.Message
import com.example.demo.repository.MessageRepository

class SqlRepositoryAdapter(private val connection: SqlConnectionAdapter) : MessageRepository {
    override fun findAll(): List<Message> {
        return connection.findAll()
    }

    override fun findById(id: String): List<Message> {
        return connection.findById(id)
    }

    override fun save(message: Message) {
        connection.save(message)
    }
}
