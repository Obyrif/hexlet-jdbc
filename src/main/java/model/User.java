package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private String phone;

    public User(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.phone = description;
    }

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
