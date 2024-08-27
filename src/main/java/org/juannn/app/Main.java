package org.juannn.app;

import org.juannn.data_structures.SingleLinkedList;
import org.juannn.models.User;
import org.juannn.repository.UserRepository;
import org.juannn.repository.impl.UserRepositoryImpl;
import org.juannn.services.UserService;

public class Main {
    public static void main(String[] args) {
        // Create a new SingleLinkedList for User objects
        SingleLinkedList<User> userList = new SingleLinkedList<>();

        // Create a UserRepository implementation with the userList
        UserRepository userRepository = new UserRepositoryImpl(userList);

        // Create a UserService with the userRepository
        UserService userService = new UserService(userRepository);

        // Test save method
        User user1 = new User(1L, "Alice");
        User user2 = new User(2L, "Bob");

        userService.save(user1);
        userService.save(user2);

        System.out.println("Users after save:");
        userService.findAll().printForward();

        // Test findById method
        System.out.println("Finding user with ID 1:");
        User foundUser = userService.findById(1L);
        System.out.println("Found user: " + foundUser.getName());

        // Test update method
        User updatedUser = new User(1L, "Alice Updated");
        userService.update(updatedUser);
        System.out.println("Users after update:");
        userService.findAll().printForward();

        // Test existsById method
        System.out.println("Checking existence of user with ID 1:");
        boolean exists = userService.existsById(1L);
        System.out.println("User with ID 1 exists: " + exists);

        // Test count method
        System.out.println("Counting number of users:");
        Long count = userService.count();
        System.out.println("Number of users: " + count);

        // Test deleteById method
        userService.deleteById(1L);
        System.out.println("Users after deleting user with ID 1:");
        userService.findAll().printForward();

        // Test count method after deletion
        System.out.println("Counting number of users after deletion:");
        count = userService.count();
        System.out.println("Number of users: " + count);
    }
}
