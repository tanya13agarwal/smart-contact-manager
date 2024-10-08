package com.scmFinal.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scmFinal.entities.User;

@Repository

// used for interacting with the database
// it contains methods that interact with the database
// user is the entity you need to interact with
// type of user id is String
public interface UserRepo extends JpaRepository<User, String> {

    // extra methods db relatedoperations
    // custom query methods
    // custom finder methods

    // spring data is findByEmail ki definition khud se likh deta h, hme likhne ki need ni hai
    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findByEmailToken(String id);

}


// Logic:- user Repositories ko services k andar use krege or
// services ko controllers k andar use krege

// Repositories -> Services -> Controllers