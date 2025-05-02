package com.fitlife.fitlife_backend.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fitlife.fitlife_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}