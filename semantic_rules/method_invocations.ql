/**
 * @name Invocation
 * @problem.severity warning
 * @kind problem
 * @id java/example/invocation
 */

 import java

 from MethodAccess ma, Method def
 where def = ma.getMethod()
 select ma, "calls $@", def, def.toString()
