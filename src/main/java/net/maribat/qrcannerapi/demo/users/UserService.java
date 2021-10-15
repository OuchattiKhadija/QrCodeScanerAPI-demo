package net.maribat.qrcannerapi.demo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public User getUserById(String id);

    public List<User> getAllUsers();

    public User createUser(User user);
}


