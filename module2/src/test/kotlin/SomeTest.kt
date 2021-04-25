import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject

@QuarkusTest
class SomeTest {

    @Inject
    private lateinit var dependency: Dependency

    @Test
    fun `some test`() {
        assertEquals("some_id", dependency.id())
    }
}