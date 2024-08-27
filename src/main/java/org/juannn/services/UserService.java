package org.juannn.services;

import org.juannn.data_structures.SingleLinkedList;
import org.juannn.models.User;
import org.juannn.repository.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Save a new user
    public void save(User user) {
        userRepository.save(user);
    }

    // Find a user by their ID
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    // Return all users
    public SingleLinkedList<User> findAll() {
        return userRepository.findAll();
    }

    // Update an existing user
    public void update(User updatedUser) {
        userRepository.update(updatedUser);
    }

    // Delete a user by their ID
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    // Check if a user exists by their ID
    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }

    // Return the number of users
    public Long count() {
        return userRepository.count();
    }
}
