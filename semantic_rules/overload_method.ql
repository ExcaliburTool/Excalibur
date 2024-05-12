/**
 * @name Overload_method
 * @problem.severity warning
 * @kind problem
 * @id java/example/overload_method
 */

 import java

 from Method m1, Method m2
 where m1.getName() = m2.getName() and m1 != m2 and m1.getDeclaringType() = m2.getDeclaringType()
 select m1, "overload"
