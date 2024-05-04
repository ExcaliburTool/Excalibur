/**
 * @name Taintflow_para
 * @problem.severity warning
 * @kind problem
 * @id java/example/taintflow_para
 */

 import java
 import semmle.code.java.dataflow.TaintTracking

 from Parameter source, Expr sink
 where
   TaintTracking::localTaint(DataFlow::parameterNode(source), DataFlow::exprNode(sink))
 select source, "taints $@", sink, sink.toString()
