package com.scmFinal.entities;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// create an entity named user
@Entity(name="user")
// by default table name is users but here we have given table name as users
@Table(name="users")

// create Getters, Setters, Constructors through Lambok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder 


public class User {

    @Id 
    // user information
    private String userId;

    // customized name for name field which is "user_name" and is a required field therefore nullable=false
    @Column(name="user_name",nullable=false)
    private String name;

    // email should be unique and not null
    @Column(nullable=false, unique=true)
    private String email;

    private String phoneNumber;

    // length of about field is increased so we use TEXT definition
    // Alternate method:-
    // @Column(length=1000)
    @Column(columnDefinition = "TEXT")
    private String about;

    private String password;
    
    @Column(columnDefinition = "TEXT")
    private String profilePic;

    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    // user signup/login options
    // SELF, GOOGLE, FACEBOOK, TWITTER, LINKEDIN, GITHUB
    // create an enum for provider options and initially set it to self
    private Providers provider = Providers.SELF;
    private String providerUserId;

    // add more fields if needed

    // since one user can have multiple contacts saved, therefore 1 to N mapping
    // since hme bi-directional mapping ni krni h which is by-default therefore 
    // to avoid multiple mapping, hmne srf user se mapping ki h
    // additional features - cascade type is if user is deleted, delete all its contacts also
    // also if new user is added, all its contacts will be added automatically
    // fetch type LAZY means jb tak hm user k contacts ko fetch ni krege tb tak no automatic query execution
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    // therefore create a list of contacts where List is of Contact schema type
    private List<Contact> contacts = new ArrayList<>();

}
