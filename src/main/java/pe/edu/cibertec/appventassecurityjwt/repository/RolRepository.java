package pe.edu.cibertec.appventassecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.appventassecurityjwt.model.Rol;

public interface RolRepository extends
        JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nomrol);
    //select * from rol where nomrol=?
}
