package com.api.prediction.controllers.auth;

import com.api.prediction.infra.security.TokenService;
import com.api.prediction.models.dto.LoginRequest;
import com.api.prediction.models.dto.LoginResponse;
import com.api.prediction.models.entities.UserEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/login")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity login(@RequestBody @Valid LoginRequest loginRequest){
        var user = new UsernamePasswordAuthenticationToken(loginRequest.accessKey(), loginRequest.password());
        var auth = this.authenticationManager.authenticate(user);
        var token = tokenService.generateToken((UserEntity) auth.getPrincipal());
        return ResponseEntity.ok(new LoginResponse(token));
    }
}
