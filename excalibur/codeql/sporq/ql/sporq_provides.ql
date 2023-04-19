import java

query predicate sporq_provides(ProvidesDirective id, string serviceInterface) {
    provides(id, serviceInterface)
}
