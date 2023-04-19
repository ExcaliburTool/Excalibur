import java

class NamedExprOrStmt extends @namedexprorstmt { string toString() { result = "NamedExprOrStmt" } }

query predicate sporq_namestrings(string name, string value, NamedExprOrStmt parent) {
    namestrings(name, value, parent)
}
