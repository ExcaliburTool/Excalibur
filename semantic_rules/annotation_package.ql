/**
 * @name AnnotationPackage
 * @problem.severity warning
 * @kind problem
 * @id java/example/annotation_package
 */

import java

from Annotation anno, Package pack
where anno.getType().getPackage() = pack
select anno, "from $@", pack, pack.toString()
