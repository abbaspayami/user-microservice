package com.egs.userservice.repository;

import com.egs.userservice.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User1, Long> {
    User1 findByUserId(Long userId);
}
