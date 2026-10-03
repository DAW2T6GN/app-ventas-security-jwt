package pe.edu.cibertec.appventassecurityjwt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.appventassecurityjwt.dto.ErrorMessage;
import pe.edu.cibertec.appventassecurityjwt.dto.GenericResponse;
import pe.edu.cibertec.appventassecurityjwt.dto.Login;
import pe.edu.cibertec.appventassecurityjwt.dto.UsuarioJwt;
import pe.edu.cibertec.appventassecurityjwt.model.Usuario;
import pe.edu.cibertec.appventassecurityjwt.security.JwtService;
import pe.edu.cibertec.appventassecurityjwt.service.DetalleUsuarioService;
import pe.edu.cibertec.appventassecurityjwt.service.UsuarioService;


import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final DetalleUsuarioService detalleUsuarioService;;
    private final JwtService jwtService;
    private final AuthenticationManager authManager;
    private final UsuarioService usuarioService;

    //localhost:8080/api/v1/auth/login
    @PostMapping("/login")
    public ResponseEntity<GenericResponse<UsuarioJwt>>
        login(@RequestBody Login login) {
        GenericResponse<UsuarioJwt> response;
        return null;
    }
}
