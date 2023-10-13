package me.dio.santanderbootcampdev2023.service;

import me.dio.santanderbootcampdev2023.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
