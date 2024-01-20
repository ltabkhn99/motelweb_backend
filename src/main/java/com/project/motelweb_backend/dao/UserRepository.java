package com.project.motelweb_backend.dao;

import com.project.motelweb_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, Integer> {
}
