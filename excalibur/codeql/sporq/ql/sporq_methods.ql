import java

query predicate sporq_methods(Method id, string nodeName, string signature, Type typeid, RefType parentid, Method sourceid) {
    methods(id, nodeName, signature, typeid, parentid, sourceid)
}
