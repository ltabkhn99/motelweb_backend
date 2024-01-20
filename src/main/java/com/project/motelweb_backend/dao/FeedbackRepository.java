package com.project.motelweb_backend.dao;

import com.project.motelweb_backend.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "feedback")
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
