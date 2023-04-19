import java

class ClassOrArray extends @classorarray { string toString() { result = "ClassOrArray" } }

query predicate sporq_implInterface(ClassOrArray id1, ClassOrInterface id2) {
    implInterface(id1, id2)
}
