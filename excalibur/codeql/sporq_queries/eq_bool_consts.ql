/**
 * @name EqBoolConsts
 * @problem.severity warning
 * @id java/example/eq_bool_const
 * @kind problem
 */

import java

from EQExpr expr, BooleanLiteral bl
where
    bl.getParent() = expr
select expr, "Should not compare boolean literals with ==."
