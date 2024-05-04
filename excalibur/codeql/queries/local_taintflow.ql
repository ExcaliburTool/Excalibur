/**
 * @name Taintflow
 * @problem.severity warning
 * @kind problem
 * @id java/example/taintflow
 */

 import java
 import semmle.code.java.dataflow.TaintTracking

 from Expr src1, Expr src2
 where
   TaintTracking::localTaint(DataFlow::exprNode(src1), DataFlow::exprNode(src2)) and src1 != src2
 select src1, "taints $@", src2, src2.toString()
