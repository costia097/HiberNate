package com.net.service;

import com.net.model.Customer;
import com.net.model.User;
import com.net.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findUserByName() {
        return userRepository.findByName();
    }

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    public void saveCustomer(Customer customer) {
        userRepository.saveCustomer(customer);
    }

    public boolean validateUser(User user) {
        return user.getPassword() != null && user.getEmail() != null && user.getName() != null;
    }
}
