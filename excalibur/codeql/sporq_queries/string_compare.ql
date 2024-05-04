/**
 * @name StringCompare
 * @problem.severity warning
 * @id java/example/string_compare
 * @kind problem
 */

import java

from BinaryExpr expr
where
    expr.getLeftOperand().getType().getName() = "String"
    and expr.getLeftOperand().getType().getName() = "String"
select expr, "Should not compare strings with ==."
