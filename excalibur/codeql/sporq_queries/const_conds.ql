/**
 * @name ConstConditions
 * @problem.severity warning
 * @id java/example/const_conditions
 * @kind problem
 */

import java

from ConditionalStmt stmt, BooleanLiteral bl
where
    stmt.getCondition().toString() = bl.toString()
select stmt, "Const conditions"
