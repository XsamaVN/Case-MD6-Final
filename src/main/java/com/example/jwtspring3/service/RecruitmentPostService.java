package com.example.jwtspring3.service;

import com.example.jwtspring3.model.RecruitmentPost;

public interface RecruitmentPostService extends IGeneralService<RecruitmentPost>{
    Object findAll(String position, String address,Long idEnterprise);
}
