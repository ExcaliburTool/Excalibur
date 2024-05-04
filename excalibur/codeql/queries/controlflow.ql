/**
 * @name Controlflow
 * @problem.severity warning
 * @kind problem
 * @id java/example/controlflow
 */

 import java
 import semmle.code.java.ControlFlowGraph

 from ConditionNode cond
 select cond, "branches into $@ and $@", cond.getATrueSuccessor(), cond.getATrueSuccessor().toString(), cond.getAFalseSuccessor(), cond.getAFalseSuccessor().toString()
