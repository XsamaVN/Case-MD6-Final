package com.example.jwtspring3.service;


import com.example.jwtspring3.model.Enterprise;

import java.util.List;
import java.util.Optional;

public interface EnterpriseService extends IGeneralService<Enterprise>{
    Object findAll(String name, String nickName, String address);
    Enterprise getOne(Long id);
}
