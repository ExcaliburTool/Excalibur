# Excalibur

## Appendix
The `appendix.pdf` includes:
* Wildcard patterns
* Prompt

## Semantic Rules
See `semantic_rules`

## Benchmark
See `excalibur/benchmarks/github` and `excalibur/benchmarks/sporq`

Each task has a file describing the task and a file specifying the example.
* The input example is between `input` and `output`;
* The output examples are specified after `output` and separated by `~`.

## Reproduction

You may need `git lfs` to download the compiled jar file. See [this](https://git-lfs.com/).

Required software: [`souffle`](https://souffle-lang.github.io/install), `java >= 11`

To run the baseline (sporq), run the following commands. Note that the execution may take around 20 hours. Results would be logged to `excalibur/temp`.
```
cd excalibur; ./runSporq.sh
```

To run Excalibur, run the following commands. Results would be tabulated as `.csv` files and also logged as `.log` in `excalibur/temp`.
```
cd excalibur; ./runExcalibur.sh
```
Note that you may specify the estimation to use by changing the `-m` option (model) and the `-t` option (trial).
They together locate the estimation results stored in `excalibur/estimate_results`.
For example, given `-m gpt-4 -t 2`, the files `*_gpt-4_2.txt` would be used.

Other settings can be changed in `excalibur/config.json`.

## Source Code
The source code would be released upon acceptance.
