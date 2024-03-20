package com.example.jwtspring3.controller;

import com.example.jwtspring3.model.RecruitmentPost;
import com.example.jwtspring3.repository.RecruitmentPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/recruitmentPosts")
public class RecruitmentPostController {
   @Autowired
    RecruitmentPostRepository recruitmentPostRepository;
   @GetMapping()
    public ResponseEntity<?> showList() {
       return new ResponseEntity<>(recruitmentPostRepository.findAll() ,HttpStatus.OK);
   }
   @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
       return new ResponseEntity<>(recruitmentPostRepository.findById(id), HttpStatus.OK);
   }
   @PostMapping
    public ResponseEntity<?> saveAdd(@RequestBody RecruitmentPost recruitmentPost) {
       return new ResponseEntity<>(recruitmentPostRepository.save(recruitmentPost) ,HttpStatus.OK);
   }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        recruitmentPostRepository.deleteById(id);
        return new ResponseEntity<>("??", HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> editStudent(@PathVariable Long id, @RequestBody RecruitmentPost recruitmentPost) {
        recruitmentPost.setId(id);
        return new ResponseEntity<>(recruitmentPostRepository.save(recruitmentPost), HttpStatus.OK);
    }
}
