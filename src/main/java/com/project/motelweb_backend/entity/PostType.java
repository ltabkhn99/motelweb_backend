package com.project.motelweb_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "post_type")
public class PostType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_type_id")
    private int postTypeId;
    @Column(name = "post_type_name")
    private String postTypeName;
}
