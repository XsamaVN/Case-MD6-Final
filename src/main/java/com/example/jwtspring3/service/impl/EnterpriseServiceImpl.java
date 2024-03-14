package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.Enterprise;
import com.example.jwtspring3.repository.EnterpriseRepository;
import com.example.jwtspring3.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
    @Autowired
    EnterpriseRepository enterpriseRepository;



    @Override
    public List<Enterprise> findAll(String name, String nickName, String address) {
        if (name != null && nickName != null && address != null) {
            return enterpriseRepository.findAllByNameContainingAndNickNameContainingAndAddressContaining(name,nickName,address);
        } else if (name != null && nickName != null) {
            return enterpriseRepository.findAllByNameContainingAndNickNameContaining(name, nickName);
        } else if (name != null && address != null) {
            return enterpriseRepository.findAllByNameContainingAndAddressContaining(name, address);
        } else if (nickName != null && address != null) {
            return enterpriseRepository.findAllByNickNameContainingAndAddressContaining(nickName, address);
        } else if (name != null) {
            return enterpriseRepository.findAllByNameContaining(name);
        } else if (nickName != null) {
            return enterpriseRepository.findAllByNickNameContaining(nickName);
        } else if (address != null) {
            return enterpriseRepository.findAllByAddressContaining(address);
        } else {
            return enterpriseRepository.findAll();
        }
    }
    @Override
    public Enterprise getOne(Long id) {
        return enterpriseRepository.findEnterpriseById(id);
    }


    @Override
    public Iterable<Enterprise> findAll() {
        return enterpriseRepository.findAll();
    }

    @Override
    public Enterprise save(Enterprise enterprise) {
        return enterpriseRepository.save(enterprise);
    }

    @Override
    public Optional<Enterprise> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void remove(Long id) {

    }
}
