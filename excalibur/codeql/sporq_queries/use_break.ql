/**
 * @name UseBreak
 * @problem.severity warning
 * @id java/example/use_break
 * @kind problem
 */

import java

from BreakStmt stmt
where
    stmt.hasLabel()
select stmt, "break with label."

