package com.scmFinal.services;

import java.util.List;
import java.util.Optional;

import com.scmFinal.entities.User;

// contains all standard methods jo user p kiye hoge
public interface UserService {

    // to save the user
    User saveUser(User user);

    // get user by id
    // Optional ka mtlb hai ki if user mila theek hai, else optional h
    Optional<User> getUserById(String id);

    // update the user
    Optional<User> updateUser(User user);

    // delete the user
    void deleteUser(String id);

    // to check if user exist or not
    boolean isUserExist(String userId);

    // to check through email
    boolean isUserExistByEmail(String email);

    List<User> getAllUsers();

    User getUserByEmail(String email);

    // add more methods here related user service[logic]

}