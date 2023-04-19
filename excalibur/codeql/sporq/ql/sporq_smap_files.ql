import java

query predicate sporq_smap_files(File outputFileId, string stratum, int inputFileNum, string inputFileName, File inputFileId) {
    smap_files(outputFileId, stratum, inputFileNum, inputFileName, inputFileId)
}
