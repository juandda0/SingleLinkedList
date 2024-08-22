package org.juannn.repository;

import org.juannn.models.User;

import java.util.List;

public interface UserRepository {

    public void save(User user);
    public User findById(Long id);
    public List<User> findAll();
    public void update(User user);
    public void delete(Long id);
    public void deleteById(Long id);
    public boolean existsById(Long id);
    public Long count();

}
