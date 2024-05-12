/**
 * @name Types
 * @problem.severity warning
 * @kind problem
 * @id java/example/type
 */

 import java

 from Expr expr
 select expr, "has type: $@", expr.getType(), expr.getType().toString()
