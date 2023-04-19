folder="github"

 for file in "$folder"/*; do
   if [ -f "$file" ]; then
     sed -i.bak '/^http/d' "$file"
   fi
 done
