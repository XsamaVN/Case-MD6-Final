package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.Enterprise;
import com.example.jwtspring3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise,Long> {
//    User findByName(String name);
}
