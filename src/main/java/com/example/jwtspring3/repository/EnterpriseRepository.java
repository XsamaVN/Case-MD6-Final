package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise,Long> {
List<Enterprise> findAllByNameContaining(String name);
List<Enterprise> findAllByNameContainingAndNickNameContainingAndAddressContaining(String name, String nickName, String Address);
List<Enterprise> findAllByNameContainingAndNickNameContaining(String name, String nickName);
List<Enterprise> findAllByNameContainingAndAddressContaining(String name, String address);
List<Enterprise> findAllByNickNameContaining(String nickName);
List<Enterprise> findAllByNickNameContainingAndAddressContaining(String nickName, String address);
List<Enterprise> findAllByAddressContaining(String address);
Enterprise findEnterpriseById(Long id);
}
