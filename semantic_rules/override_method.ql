/**
 * @name Override
 * @problem.severity warning
 * @kind problem
 * @id java/example/override
 */

 import java

 from Method a, Method b
 where a.overrides(b)
 select a, "overrides $@", b, b.toString()
