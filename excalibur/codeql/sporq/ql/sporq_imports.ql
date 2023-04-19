import java

class ClassOrInterfaceOrPackage extends @classorinterfaceorpackage { string toString() { result = "ClassOrInterfaceOrPackage" } }

query predicate sporq_imports(Import id, ClassOrInterfaceOrPackage holder, string name, int kind) {
    imports(id, holder, name, kind)
}
