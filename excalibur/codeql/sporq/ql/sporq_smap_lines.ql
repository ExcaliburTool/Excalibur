import java

query predicate sporq_smap_lines(File outputFileId, string stratum, int inputFileNum, int inputStartLine, int inputLineCount, int outputStartLine, int outputLineIncrement) {
    smap_lines(outputFileId, stratum, inputFileNum, inputStartLine, inputLineCount, outputStartLine, outputLineIncrement)
}
