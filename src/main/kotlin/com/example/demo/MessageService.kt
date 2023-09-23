package com.example.demo

import com.example.demo.repository.crudSpring.CrudRepositoryAdapter
import org.springframework.stereotype.Service

@Service
class MessageService(val db: CrudRepositoryAdapter) {
    fun findMessages(): List<Message> = db.findAll()

    fun findMessageById(id: String): List<Message> = db.findById(id)
    fun save(message: Message) = db.save(message)
}
