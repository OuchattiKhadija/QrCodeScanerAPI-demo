package net.maribat.qrcannerapi.demo.users;

import net.maribat.qrcannerapi.demo.error.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User getUserById(String id) {
        Optional<User> productDb = this.userRepository.findById(id);

        if (productDb.isPresent()) {
            return productDb.get();
        } else {
            throw new NotFoundException("Record not found with id : " + id);
        }
    }

    List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}


