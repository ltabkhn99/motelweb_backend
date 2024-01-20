package com.project.motelweb_backend.dao;

import com.project.motelweb_backend.entity.Motel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotelRepository extends JpaRepository<Motel, Integer> {

}
