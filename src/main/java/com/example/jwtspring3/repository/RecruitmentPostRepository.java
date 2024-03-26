package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.Enterprise;
import com.example.jwtspring3.model.RecruitmentPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecruitmentPostRepository extends JpaRepository<RecruitmentPost, Long> {
    List<RecruitmentPost> findByPositionContainingAndEnterprise_AddressContaining(String position, String address);
    List<RecruitmentPost> findAllByPositionContaining (String position);
    List<RecruitmentPost> findByEnterprise_AddressContaining(String address);
    List<RecruitmentPost> findAllByEnterprise_Id(Long idEnterprise);
    List<RecruitmentPost> findRecruitmentPostsByStatus(boolean status);
}
