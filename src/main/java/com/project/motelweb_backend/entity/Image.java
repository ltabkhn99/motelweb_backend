package com.project.motelweb_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int imageId;
    @Column(name = "image_name", length = 256)
    private String imageName;
    @Column(name = "is_icon") // tiny int
    private boolean isIcon;
    @Column(name = "link")
    private String imageLink;

    @Column(name = "image_data")
    @Lob
    private String imageData;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "motel_id", nullable = false)
    private Motel motel;
}
