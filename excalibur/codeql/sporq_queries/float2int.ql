/**
 * @name Float2Int
 * @problem.severity warning
 * @id java/example/float_to_int
 * @kind problem
 */

import java

from CastExpr cast
where
    cast.getExpr().getType().getName() = "float" and cast.getType().getName() = "int"
select cast, "Narrowing cast from float to int"
