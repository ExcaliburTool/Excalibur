/**
 * @name Dataflow
 * @problem.severity warning
 * @kind problem
 * @id java/example/dataflow
 */

 import java
 import semmle.code.java.dataflow.DataFlow

 from Parameter p, Expr dst
 where
   DataFlow::localFlow(DataFlow::parameterNode(p), DataFlow::exprNode(dst))
 select p, "flow to $@", dst, dst.toString()
