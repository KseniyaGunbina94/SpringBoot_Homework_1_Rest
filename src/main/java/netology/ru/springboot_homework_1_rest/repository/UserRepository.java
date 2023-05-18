package netology.ru.springboot_homework_1_rest.repository;

import netology.ru.springboot_homework_1_rest.controller.Authorities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    Map<String, String> userRepository;

    public UserRepository() {
        userRepository = new HashMap<>();
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (!isEmpty(userRepository)) {
            if (userRepository.containsKey(user)) {
                if (userRepository.get(user).equals(password)) {
                    for (Authorities auth : Authorities.values()) {
                        authorities.add(auth);
                    }
                }
            }
        }
        return authorities;
    }

    private boolean isEmpty(Map<?, ?> str) {
        return str == null || str.isEmpty();
    }
}
