import java

query predicate sporq_locations_default(Location id, File file, int beginLine, int beginColumn, int endLine, int endColumn) {
    locations_default(id, file, beginLine, beginColumn, endLine, endColumn)
}
