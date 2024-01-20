package com.project.motelweb_backend.dao;

import com.project.motelweb_backend.entity.SavedMotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavedMotelRepository extends JpaRepository<SavedMotel, Integer> {
}
