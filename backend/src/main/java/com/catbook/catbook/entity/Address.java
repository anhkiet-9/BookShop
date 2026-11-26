package com.catbook.catbook.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "recipient_name", length = 100)
    private String recipientName;

    @Column(length = 20)
    private String phone;

    @Column(length = 100)
    private String province;

    @Column(length = 100)
    private String district;

    @Column(length = 100)
    private String ward;

    @Column(name = "street_address", length = 255)
    private String streetAddress;

    @Column(name = "is_default")
    private Boolean isDefault;

    public Address() {
    }
}