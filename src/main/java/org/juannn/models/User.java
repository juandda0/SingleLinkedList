package org.juannn.models;

public class User {

    private Long id;
    private String name;

    public User() {
    }

    public User(Long id, String nombre) {
        this.id = id;
        this.name = nombre;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
