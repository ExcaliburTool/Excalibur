import java

query predicate sporq_classes_or_interfaces(ClassOrInterface id, string nodeName, Package parentid, ClassOrInterface sourceid) {
    id.getPackage() = parentid and id.hasName(nodeName) and id.getSourceDeclaration() = sourceid and nodeName = "String"
}
