package net.maribat.qrcannerapi.demo.users;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    @NotNull(message = "firstName is required")
    @Size(min = 3, message = "firstName must be at least 3 characters long")
    private String firstName;
    @NotNull(message = "lastName is required")
    @Size(min = 3, message = "lastName must be at least 3 characters long")
    private String lastName;
    @NotNull
    private int age;
    @NotNull
    private Long timestamp;

    public User() {
        this.timestamp = System.currentTimeMillis();
    }

    public User(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.timestamp = System.currentTimeMillis();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
