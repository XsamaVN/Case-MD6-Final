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
    public List<RecruitmentPost> findAll(String position, String address) {
        if (position != null && address != null) {
            return recruitmentPostRepository.findByPositionContainingAndEnterprise_AddressContaining(position, address);
        } else if (position != null) {
            return recruitmentPostRepository.findAllByPositionContaining(position);
        } else if (address != null) {
            return recruitmentPostRepository.findByEnterprise_AddressContaining(address);
        } else {
            return recruitmentPostRepository.findAll();
        }
    }

    @Override
    public Iterable<RecruitmentPost> findAll() {
        return recruitmentPostRepository.findAll();
    }

    @Override
    public RecruitmentPost save(RecruitmentPost recruitmentPost) {
        return null;
    }

    @Override
    public Optional<RecruitmentPost> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void remove(Long id) {

    }
}
