/**
 * @name StaticMember
 * @problem.severity warning
 * @kind problem
 * @id java/example/static_member
 */

 import java

 from Member m
 where m.isStatic()
 select m, "static"
