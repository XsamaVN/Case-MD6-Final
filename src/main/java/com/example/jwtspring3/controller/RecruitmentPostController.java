package com.example.jwtspring3.controller;

import com.example.jwtspring3.model.RecruitmentPost;
import com.example.jwtspring3.repository.RecruitmentPostRepository;
import com.example.jwtspring3.service.RecruitmentPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/recruitment-posts")
public class RecruitmentPostController {

    @Autowired
    RecruitmentPostService recruitmentPostService;

    @GetMapping()
    public ResponseEntity findAll(String position, String address, Long idEnterprise) {
        return new ResponseEntity<>(recruitmentPostService.findAll(position, address, idEnterprise), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity<>(recruitmentPostService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity add(@RequestBody RecruitmentPost recruitmentPost) {
        recruitmentPost.setStatus(true);
        return new ResponseEntity<>(recruitmentPostService.save(recruitmentPost), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity edit(@PathVariable Long id, @RequestBody RecruitmentPost recruitmentPost) {
        recruitmentPost.setId(id);
        return new ResponseEntity<>(recruitmentPostService.save(recruitmentPost), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id, @RequestBody RecruitmentPost recruitmentPost) {
        recruitmentPost.setId(id);
        recruitmentPost.setStatus(false);
        return new ResponseEntity<>(recruitmentPostService.save(recruitmentPost), HttpStatus.OK);
    }
}
