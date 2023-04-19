import java

query predicate sporq_providesWith(ProvidesDirective id, string serviceImpl) {
    providesWith(id, serviceImpl)
}
