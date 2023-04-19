import java

class ClassOrInterfaceOrCallable extends @classorinterfaceorcallable { string toString() { result = "ClassOrInterfaceOrCallable" } }

query predicate sporq_typeArgs(RefType argumentid, int pos, ClassOrInterfaceOrCallable parentid) {
    typeArgs(argumentid, pos, parentid)
}
