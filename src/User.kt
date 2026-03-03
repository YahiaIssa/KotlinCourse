import java.util.UUID
import java.util.UUID.randomUUID

data class User(
    val username: String,
                val password: String,
                val id: UUID = randomUUID())