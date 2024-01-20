package com.project.motelweb_backend.dao;

import com.project.motelweb_backend.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "address")
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
