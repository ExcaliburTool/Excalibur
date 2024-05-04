/**
 * @name Taintflow_assign
 * @problem.severity warning
 * @kind problem
 * @id java/example/taintflow_assign
 */

 import java
 import semmle.code.java.dataflow.TaintTracking

 from Expr src1, Expr src2, Assignment assign, Expr var
 where
   TaintTracking::localTaint(DataFlow::exprNode(src1), DataFlow::exprNode(src2))
   and src1 != src2
   and var = assign.getDest()
   and src1 = assign.getRhs()
   and src2 != assign
 select var, "taints $@", src2, src2.toString()
