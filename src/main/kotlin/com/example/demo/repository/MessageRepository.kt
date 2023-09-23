package com.example.demo.repository

import com.example.demo.Message

interface MessageRepository
{
    fun findAll(): List<Message>
    fun findById(id: String): List<Message>
    fun save(message: Message)
}
