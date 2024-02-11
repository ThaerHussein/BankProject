package com.letcode.SecureBankSystem.ropsitory;

import com.letcode.SecureBankSystem.entity.RoleEntity;
import com.letcode.SecureBankSystem.util.enums.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    RoleEntity findByTitle(Roles title);
}
