# Excalibur

## Benchmarks
See `excalibur/benchmarks/github` and `excalibur/benchmarks/sporq`

In each file,
the input example is between `input` and `output`;
the output examples are specified after `output` and separated by `~`

## Reproduction

Required software: [`souffle`](https://souffle-lang.github.io/install), `java >= 11`

To run the baseline, run the following commands. Note that the execution may take around 20 hours. Results would be logged to `excalibur/temp`.
```
cd excalibur
java -cp Excalibur-0.1.0.jar sporq.Executor
```

To run Excalibur, run the following commands. Results would be logged as `.csv` files in `excalibur/temp`.
```
cd excalibur
java -cp Excalibur-0.1.0.jar MyTestRunner
```

The default setting is `NoMinmax`. You can modify `excalibur/config.json` to enable different settings:
* Full-featured Excalibur, by setting `useTraceSet` as `true` and `random` as `false`
* NoVS, by setting  `useTraceSet` as `false` and `random` as `false`

## Proofs
See `appendix.pdf`

## Found Issues
* n at line 591 of the submitted paper is any subtree, i.e., not limited to terminals
