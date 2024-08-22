package org.juannn.repository.impl;

import org.juannn.models.User;
import org.juannn.repository.UserRepository;
import org.juannn.models.Node;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private Node head;

    @Override
    public void save(User user) {
        Node newNode = new Node(user);
        if (head == null) {
            head = newNode;
        }else{
            Node current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        Node current = head;
        while (current != null) {
            users.add((User) current.getElement());
            current = current.getNext();
        }
        return users;
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
