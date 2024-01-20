package com.project.motelweb_backend.dao;

import com.project.motelweb_backend.entity.PostType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "post-type")
public interface PostTypeRepository extends JpaRepository<PostType, Integer> {
}
