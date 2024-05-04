# Evaluating Sporq-like Baseline

## Generate QLs
Following the advice from a CodeQL developer, we can define queries to extract the EDB.
Specifically, we try to prepare most queries automatically from two important documents: `API Index` and `EDB scheme`.
* `documentPairs.json`
* `semmlecode_java.dbscheme`

### Excluded some relations that are not relevant to our scope:
* compilation info
* Kotlin related
* XML related
* javadoc related

### Manual Process QL
Some issues need to be manually fixed:
* CodeQL class names and @type names are different `->` `additionalMap` in `PreprocessExtensionalDB.scala`
* Needs to import additional libs before query
* Needs to define types (usually union types) `->` `injectMap` in `PreprocessExtensionalDB.scala`

### The final QLs are prepared in the `ql` folder

## Generate Kinds

## Built Dataset
Since extracting and filtering the relations is time-consuming, we have prepared a built dataset that is used in our evaluation:  
