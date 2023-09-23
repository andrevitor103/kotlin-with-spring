package com.example.demo.repository.sql

import com.example.demo.Message
import com.example.demo.repository.Connection
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import java.util.*

class SqlConnectionAdapter(private val db: JdbcTemplate) : Connection {
    override fun findAll(): List<Message> = db.query("select * from messages") {
        response, _ -> Message(response.getString("id"), response.getString("text"))
    }

    override fun findById(id: String): List<Message> = db.query("select * from messages where id = ?", id) {
        response, _ -> Message(response.getString("id"), response.getString("text"))
    }
    override fun save(message: Message) {
        val id = message.id ?: UUID.randomUUID().toString()
        db.update("insert into messages values (?, ?)", id, message.text)
    }
    private fun <T : Any> Optional<out T>.toList(): List<T> = if (isPresent) listOf(get()) else emptyList()
}
