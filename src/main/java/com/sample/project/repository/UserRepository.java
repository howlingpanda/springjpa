package com.sample.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
