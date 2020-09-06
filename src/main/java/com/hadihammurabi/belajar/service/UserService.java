package com.hadihammurabi.belajar.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.hadihammurabi.belajar.model.User;
import com.hadihammurabi.belajar.repository.UserRepository;

@Service
public class UserService {
  private UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(User user) {
    return this.userRepository.save(user);
  }

  public List<User> getUsers() {
    return this.userRepository.findAll();
  }
}