package com.example.demo.repository

import com.example.demo.Message

class MessageRepositoryAdapter(private val connection: Connection): MessageRepository {
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