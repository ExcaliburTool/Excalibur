import java

class SourceLine extends @sourceline { string toString() { result = "SourceLine" } }

query predicate sporq_numlines(SourceLine element_id, int num_lines, int num_code, int num_comment) {
    numlines(element_id, num_lines, num_code, num_comment)
}
