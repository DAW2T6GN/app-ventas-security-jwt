package pe.edu.cibertec.appventassecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.appventassecurityjwt.model.Usuario;

public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer> {

    Usuario findByNomusuario(String nomusuario);
    //select * from usuario where nomusuario=?

    boolean existsByNomusuario(String nomusuario);
    boolean existsByEmail(String email);
}
