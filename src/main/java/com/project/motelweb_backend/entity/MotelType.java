package com.project.motelweb_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "type_motel")
public class MotelType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private int motelTypeId;
    @Column(name = "motel_type_name")
    private String motelTypeName;

    @OneToMany(mappedBy = "motelType", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<Motel> motelList;
}
