package netology.ru.springboot_homework_1_rest.config;

import netology.ru.springboot_homework_1_rest.controller.AuthorizationController;
import netology.ru.springboot_homework_1_rest.repository.UserRepository;
import netology.ru.springboot_homework_1_rest.service.AuthorizationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {


    @Bean
    public AuthorizationService authorizationService(UserRepository userRepository) {
        return new AuthorizationService(userRepository);
    }
    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
//    @Bean
//    public AuthorizationController authorizationController() {
//        return new AuthorizationController();
//    }
}
