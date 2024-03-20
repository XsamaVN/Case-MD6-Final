package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.RecruitmentPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitmentPostRepository extends JpaRepository<RecruitmentPost, Long> {

}
