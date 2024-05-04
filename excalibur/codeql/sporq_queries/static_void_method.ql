/**
 * @name StaticVoidMethod
 * @problem.severity warning
 * @id java/example/static_void_method
 * @kind problem
 */

import java

from Method m
where
    m.isStatic() and m.getReturnType().getName() = "void"
select m, "Static method with no return value."
