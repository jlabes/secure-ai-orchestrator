package org.example.controller;

import com.exemplo.api.UsuariosApi;
import com.exemplo.model.UsuarioRequest;
import com.exemplo.model.UsuarioResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementacao do contrato gerado pelo OpenAPI Generator.
 *
 * A validacao de "id" e "nome" nao nulos e feita de forma declarativa:
 * o modelo gerado possui @NotNull e a interface declara @Valid no corpo da
 * requisicao, entao o Spring rejeita a requisicao com HTTP 400 antes de
 * chegar aqui.
 */
@RestController
public class UsuariosController implements UsuariosApi {

    @Override
    public ResponseEntity<UsuarioResponse> criarUsuario(UsuarioRequest usuarioRequest) {
        UsuarioResponse response = new UsuarioResponse()
                .id(usuarioRequest.getId())
                .nome(usuarioRequest.getNome());

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}

