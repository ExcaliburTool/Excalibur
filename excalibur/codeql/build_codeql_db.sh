python3 prepare_codeql_mvn.py
cd ..
rm -rf relationDB
codeql database create relationDB --language=java --source-root=benchmarks/ForCodeQL
