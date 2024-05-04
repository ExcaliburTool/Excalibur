/**
 * @name DangerousThreadStop
 * @problem.severity warning
 * @id java/example/dangerous_thread_stop
 * @kind problem
 */

import java

from MethodAccess ma, RefType sub, RefType thread
where
    thread.getName() = "Thread" and
    ma.getMethod().hasName("stop") and
    sub = ma.getQualifier().getType() and
    sub.extendsOrImplements(thread)
select ma, "Use of dangerous Thread::stop"
