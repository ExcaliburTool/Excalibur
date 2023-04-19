import java

class ClassOrInterfaceOrCallable extends @classorinterfaceorcallable { string toString() { result = "ClassOrInterfaceOrCallable" } }

query predicate sporq_typeVars(TypeVariable id, string nodeName, int pos, int kind, ClassOrInterfaceOrCallable parentid) {
    typeVars(id, nodeName, pos, kind, parentid)
}
