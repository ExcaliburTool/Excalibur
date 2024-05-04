import java

predicate match_filtering(Expr id) {

}

query predicate add_exprs(Expr id, int kind, Type typeid, ExprParent parent, int idx)  {
    exprs(id, kind, typeid, parent, idx) and kind = 27
}
