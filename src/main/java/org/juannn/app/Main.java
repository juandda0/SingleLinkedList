package org.juannn.app;

import org.juannn.data_structures.SingleLinkedList;
import org.juannn.models.User;
import org.juannn.repository.UserRepository;
import org.juannn.repository.impl.UserRepositoryImpl;
import org.juannn.services.UserService;

public class Main {
    public static void main(String[] args) {


        SingleLinkedList users = new SingleLinkedList();
        UserRepository userRepository = new UserRepositoryImpl(users);
        UserService userService = new UserService(userRepository);

        User user1 = new User(1L, "Juan");
        User user2 = new User(2L, "Rafael");
        User user3 = new User(3L, "Maria");

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);

        for (User user : userRepository.findAll()) {
            System.out.println(user.getNombre());
        }
    }
}