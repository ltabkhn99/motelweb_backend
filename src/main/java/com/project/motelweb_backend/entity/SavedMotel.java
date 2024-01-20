package com.project.motelweb_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "saved_motel")
public class SavedMotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "saved_motel_id")
    private int savedMotelId;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "motel_id", nullable = false)
    private Motel motel;
}
