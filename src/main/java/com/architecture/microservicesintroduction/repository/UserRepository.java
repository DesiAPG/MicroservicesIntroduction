package com.architecture.microservicesintroduction.repository;

import com.architecture.microservicesintroduction.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
