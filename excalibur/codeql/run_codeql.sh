cd ..
mkdir -p extracted_relations
for file in "codeql/queries"/*.ql
do
  filename="$(basename -- $file)"
  name="${filename%.*}"
  echo "$name"
  codeql database analyze relationDB --format=sarifv2.1.0 --output="extracted_relations/$name.json" codeql/queries/"$filename" --download # --rerun
done
