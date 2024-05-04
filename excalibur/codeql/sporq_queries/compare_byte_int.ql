/**
 * @name CompareByteInt
 * @problem.severity warning
 * @id java/example/compare_byte_int
 * @kind problem
 */

import java

from BinaryExpr expr, Expr sub1, Expr sub2
where
    sub1.getParent() = expr and
    sub2.getParent() = expr and
    sub1.getType().getName().toString() = "int" and
    sub2.getType().getName().toString() = "byte"
select expr, "Comparing byte and int."
