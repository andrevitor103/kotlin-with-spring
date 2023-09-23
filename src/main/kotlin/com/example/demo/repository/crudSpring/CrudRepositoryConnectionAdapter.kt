package com.example.demo.repository.crudSpring

import com.example.demo.Message
import com.example.demo.repository.Connection
import org.springframework.data.repository.CrudRepository
import java.util.Optional

class CrudRepositoryConnectionAdapter(val db: CrudRepository<Message, String>) : Connection {
    override fun findAll(): List<Message> {
        return db.findAll().toList()
    }

    override fun findById(id: String): List<Message> {
        return db.findById(id).toList()
    }

    override fun save(message: Message) {
        db.save(message)
    }
    private fun <T : Any> Optional<out T>.toList(): List<T> =
            if (isPresent) listOf(get()) else emptyList()
}
