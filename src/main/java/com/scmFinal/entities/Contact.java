package com.scmFinal.entities;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity

public class Contact {

    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String picture;

    @Column(length = 1000)
    private String description;

    private boolean favorite = false;
    private String websiteLink;
    private String linkedInLink;

    // many contacts are mapped with one user therefore Many to One mapping
    @ManyToOne
    // since contact and user are mapped together, to jb bhi contact p ayege, user access hoga and vice-versa
    // means if we have contact, we can find whose the user and vice-versa
    private User user;


    // now create mapping of 1 to N from contact to social link
    // each user has multiple Social Links
    // fetch EAGER says that whenever we fetch user, his social links are also fetched
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<SocialLink> links = new ArrayList<>();
}
