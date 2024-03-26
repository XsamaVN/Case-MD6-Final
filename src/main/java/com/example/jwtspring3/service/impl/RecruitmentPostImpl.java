package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.RecruitmentPost;
import com.example.jwtspring3.repository.EnterpriseRepository;
import com.example.jwtspring3.repository.RecruitmentPostRepository;
import com.example.jwtspring3.service.RecruitmentPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecruitmentPostImpl implements RecruitmentPostService {
@Autowired
    RecruitmentPostRepository recruitmentPostRepository;

    @Override
    public List<RecruitmentPost> findAll(String position, String address, Long idEnterprise) {
        if (position != null && address != null) {
            return recruitmentPostRepository.findByPositionContainingAndEnterprise_AddressContaining(position, address);
        } else if (position != null) {
            return recruitmentPostRepository.findAllByPositionContaining(position);
        } else if (address != null) {
            return recruitmentPostRepository.findByEnterprise_AddressContaining(address);
        } else if (idEnterprise != null) {
            return recruitmentPostRepository.findAllByEnterprise_Id(idEnterprise);
        } else {
            return recruitmentPostRepository.findRecruitmentPostsByStatus(true);
        }
    }

    @Override
    public Iterable<RecruitmentPost> findAll() {
        return recruitmentPostRepository.findAll();
    }

    @Override
    public RecruitmentPost save(RecruitmentPost recruitmentPost) {
        return recruitmentPostRepository.save(recruitmentPost);
    }

    @Override
    public Optional<RecruitmentPost> findById(Long id) {
        return recruitmentPostRepository.findById(id);
    }

    @Override
    public void remove(Long id) {

    }
}
