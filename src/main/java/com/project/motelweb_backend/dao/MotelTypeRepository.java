package com.project.motelweb_backend.dao;

import com.project.motelweb_backend.entity.MotelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "motel-type")
public interface MotelTypeRepository extends JpaRepository<MotelType, Integer> {
}
