package org.mmcm.springcloud.mcsv.cursos.repositories;

import org.mmcm.springcloud.mcsv.cursos.models.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
