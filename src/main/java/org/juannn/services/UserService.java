package org.juannn.services;

import org.juannn.models.User;
import org.juannn.repository.UserRepository;

import java.util.List;

public class UserService {

    UserRepository userRepository;

    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void save(User user){
        userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
