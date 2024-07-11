package org.wababe.jwttest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wababe.jwttest.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<Object> findByUsernameOrEmail(String username,String email);
}
