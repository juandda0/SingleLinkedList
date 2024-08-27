package org.juannn.repository.impl;

import org.juannn.data_structures.SingleLinkedList;
import org.juannn.models.User;
import org.juannn.repository.UserRepository;
import org.juannn.data_structures.Node;

public class UserRepositoryImpl implements UserRepository {

    private SingleLinkedList<User> userList;

    // Constructor that initializes the repository with a given SingleLinkedList
    public UserRepositoryImpl(SingleLinkedList<User> userList) {
        this.userList = userList;
    }

    // Saves a new user to the list
    @Override
    public void save(User user) {
        userList.add(user);
    }

    // Finds a user by their ID
    @Override
    public User findById(Long id) {

        for(User user : userList) {
            if(user.getId().equals(id)) {
                return user;
            }
        }
        throw new IllegalArgumentException("User with ID: " + id + " not found.");
    }

    // Returns all users in the list
    @Override
    public SingleLinkedList<User> findAll() {
        return userList;
    }

    // Updates the details of an existing user
    @Override
    public void update(User updatedUser) {
        for(User user : userList){
            if(user.getId().equals(updatedUser.getId())){
                user.setName(updatedUser.getName());
                return;
            }
        }
        throw new IllegalArgumentException("User with ID: " + updatedUser.getId() + " not found.");
    }


    @Override
    public void deleteById(Long id) {

        for(User user : userList) {
            if (user.getId().equals(id)) {
                userList.remove(user);
            }
        }
        throw new IllegalArgumentException("User with ID: " + id + " not found.");
    }


    // Checks if a user exists by their ID
    @Override
    public boolean existsById(Long id) {
        try {
            findById(id);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    // Returns the number of users in the list
    @Override
    public Long count() {
        long count = 0;
        Node<User> current = userList.getFirst();
        while (current != null) {
            count++;
            current = current.getNextNode();
        }
        return count;
    }
}
