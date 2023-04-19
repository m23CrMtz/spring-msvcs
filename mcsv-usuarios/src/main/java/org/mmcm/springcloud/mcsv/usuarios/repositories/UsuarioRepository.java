package org.mmcm.springcloud.mcsv.usuarios.repositories;

import org.mmcm.springcloud.mcsv.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
