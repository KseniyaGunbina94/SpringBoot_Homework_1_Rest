package netology.ru.springboot_homework_1_rest.exception;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
