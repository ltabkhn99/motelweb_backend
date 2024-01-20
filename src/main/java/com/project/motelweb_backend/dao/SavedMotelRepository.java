package com.project.motelweb_backend.dao;

import com.project.motelweb_backend.entity.SavedMotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "saved-motel")
public interface SavedMotelRepository extends JpaRepository<SavedMotel, Integer> {
}
