package edu.eci.ieti.app.service;

import edu.eci.ieti.app.entities.User;
import edu.eci.ieti.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceMongoDB implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User create(User user) throws UserServiceException {
        return userRepository.save(user);
    }

    @Override
    public User findById(String id) throws UserServiceException {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAll() throws UserServiceException {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(String id) throws UserServiceException {
        userRepository.deleteById(id);
    }

    @Override
    public User update(User user, String userId) throws UserServiceException {
        return null;
    }
}
