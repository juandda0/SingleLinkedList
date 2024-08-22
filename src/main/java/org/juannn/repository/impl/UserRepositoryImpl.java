package org.juannn.repository.impl;

import org.juannn.data_structures.SingleLinkedList;
import org.juannn.models.User;
import org.juannn.repository.UserRepository;
import org.juannn.data_structures.Node;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    SingleLinkedList<User> userList;

    public UserRepositoryImpl(SingleLinkedList<User> userList){
        this.userList = userList;
    }

    @Override
    public void save(User user) {
        userList.add(user);
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public SingleLinkedList<User> findAll() {
        return userList;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public Long count() {
        return 0l;
    }

}
