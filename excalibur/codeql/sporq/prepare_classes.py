import json

# This json is extracted from https://codeql.github.com/codeql-standard-libraries/java/ on Mar 7th
with open('documentPairs.json') as file:
    documentData = json.load(file)
    # flatten
    documentData = [pair for table in documentData for pair in table]

allClasses = [key for key, desc in documentData if desc.startswith('class declared')]
print(len(allClasses))

# This
