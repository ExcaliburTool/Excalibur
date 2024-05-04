/**
 * @name UnusedLocals
 * @problem.severity warning
 * @id java/example/unused_locals
 * @kind problem
 */

import java
import semmle.code.java.dataflow.DefUse

from VariableUpdate def
where
    forall(RValue use | not defUsePair(def, use) )
select def, "unused source."
