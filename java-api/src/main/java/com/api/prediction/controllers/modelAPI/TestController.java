package com.api.prediction.controllers.modelAPI;

import com.api.prediction.config.rest.RestTemplateConfig;
import com.api.prediction.models.dto.ResponseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/test")
public class TestController {

    @Autowired
    private RestTemplateConfig restTemplate;

    @GetMapping
    ResponseEntity<ResponseTest> test(){
        String url = "http://localhost:5000/test";
        ResponseTest response = restTemplate.restTemplate().getForEntity(url, ResponseTest.class).getBody();
        return ResponseEntity.ok().body(response);
    }
}
