/**
 * @name TypeAccess
 * @problem.severity warning
 * @kind problem
 * @id java/example/type_access
 */

 import java

 from TypeAccess ta, Type def
 where ta.getType() = def
 select ta, "access $@", def, def.toString()
