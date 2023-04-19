import java

query predicate sporq_stmts(Stmt id, int kind, StmtParent parent, int idx, Callable bodydecl) {
    stmts(id, kind, parent, idx, bodydecl)
}
