package com.benediht.serviceuser.controllers.impl;

import com.benediht.serviceuser.controllers.DeleteUserController;
import com.benediht.serviceuser.services.user.impl.DeleteUserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Log4j2
public class DeleteUserControllerImpl implements DeleteUserController {

    private final DeleteUserServiceImpl service;

    @Override
    public ResponseEntity<Void> delete(Long id) {
        try{
            log.info("Request received: id={}", id);
            service.delete(id);
            return ResponseEntity.noContent().build();
        }catch(Exception e){
            log.error("{}", e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}