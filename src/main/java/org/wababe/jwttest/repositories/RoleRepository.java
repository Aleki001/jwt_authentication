package org.wababe.jwttest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wababe.jwttest.models.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
