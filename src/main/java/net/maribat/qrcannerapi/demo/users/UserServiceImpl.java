package net.maribat.qrcannerapi.demo.users;

import net.maribat.qrcannerapi.demo.error.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User getUserById(String id) {
        Optional< User > productDb = this.userRepository.findById(id);

        if (productDb.isPresent()) {
            return productDb.get();
        } else {
            throw new NotFoundException("Record not found with id : " + id);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
