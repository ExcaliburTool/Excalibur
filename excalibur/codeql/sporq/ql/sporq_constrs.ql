import java

query predicate sporq_constrs(Constructor id, string nodeName, string signature, Type typeid, RefType parentid, Constructor sourceid) {
    constrs(id, nodeName, signature, typeid, parentid, sourceid)
}
