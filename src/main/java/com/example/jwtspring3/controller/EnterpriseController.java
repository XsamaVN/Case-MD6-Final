package com.example.jwtspring3.controller;

import com.example.jwtspring3.model.Enterprise;
import com.example.jwtspring3.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/enterprises")
public class EnterpriseController {
    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping
    public ResponseEntity findAll(String name, String nickName, String address) {
        return new ResponseEntity<>(enterpriseService.findAll(name, nickName, address), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        return new ResponseEntity<>(enterpriseService.getOne(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity save(@RequestBody Enterprise enterprise){
        enterprise.setStatus(true);
        return new ResponseEntity<>(enterpriseService.save(enterprise), HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity save(@PathVariable Long id,@RequestBody Enterprise enterprise){
        enterprise.setId(id);
        enterprise.setStatus(true);
        return new ResponseEntity<>(enterpriseService.save(enterprise), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id,@RequestBody Enterprise enterprise){
        enterprise.setId(id);
        enterprise.setStatus(false);
        return new ResponseEntity<>(enterpriseService.save(enterprise), HttpStatus.OK);
    }
}
