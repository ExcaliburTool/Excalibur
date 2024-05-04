/**
 * @name Double2Float
 * @problem.severity warning
 * @id java/example/double_to_float
 * @kind problem
 */

import java

from CastExpr cast
where
    cast.getExpr().getType().getName() = "double" and cast.getType().getName() = "float"
select cast, "Narrowing cast from double to float"
