package com.project.motelweb_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "motel")
public class Motel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "motel_id")
    private int motelId;
    @Column(name = "motel_name")
    private String motelName;
    @Column(name = "description", columnDefinition = "text")
    private String description;
    @Column(name = "price")
    private long price;
    @Column(name = "area")
    private float area;
    @Column(name = "people_max")
    private int peopleMax;
    @Column(name = "post_time")
    private Date postTime;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;


    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "motel_type_id")
    private MotelType motelType;

    @OneToMany(mappedBy = "motel", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REMOVE
    })
    private List<Image> imageList;

    @OneToMany(mappedBy = "motel", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REMOVE
    })
    private List<Feedback> feedbackList;

    @OneToMany(mappedBy = "motel", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REMOVE
    })
    private List<SavedMotel> savedMotelList;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
