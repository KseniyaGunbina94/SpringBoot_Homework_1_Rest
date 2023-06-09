package netology.ru.springboot_homework_1_rest.service;

import netology.ru.springboot_homework_1_rest.controller.Authorities;
import netology.ru.springboot_homework_1_rest.exception.InvalidCredentials;
import netology.ru.springboot_homework_1_rest.exception.UnauthorizedUser;
import netology.ru.springboot_homework_1_rest.repository.UserRepository;

import java.util.List;

public class AuthorizationService {
    UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}