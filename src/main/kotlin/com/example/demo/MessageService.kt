package com.example.demo

import com.example.demo.repository.MessageRepositoryAdapter
import org.springframework.stereotype.Service

@Service
class MessageService(val repository: MessageRepositoryAdapter) {
    fun findMessages(): List<Message> = repository.findAll()

    fun findMessageById(id: String): List<Message> = repository.findById(id)
    fun save(message: Message) = repository.save(message)
}
