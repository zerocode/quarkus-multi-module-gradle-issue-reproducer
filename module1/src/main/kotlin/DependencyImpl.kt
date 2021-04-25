import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class DependencyImpl : Dependency {
    override fun id(): String {
        return "some_id"
    }
}