/**
 * @name Dataflow
 * @problem.severity warning
 * @kind problem
 * @id java/example/dataflow
 */

 import java
 import semmle.code.java.dataflow.DataFlow

 from Expr src1, Expr src2
 where
   DataFlow::localFlow(DataFlow::exprNode(src1), DataFlow::exprNode(src2)) and src1 != src2
 select src1, "flow to $@", src2, src2.toString()