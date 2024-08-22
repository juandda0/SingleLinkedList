package org.juannn.services;

import org.juannn.data_structures.SingleLinkedList;
import org.juannn.models.User;
import org.juannn.repository.UserRepository;


public class UserService {

    UserRepository userRepository;

    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void save(User user){
        userRepository.save(user);
    }

    public SingleLinkedList<User> findAll(){
        return userRepository.findAll();
    }
}
