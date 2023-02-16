package patterns.dependency_injection.example1;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(new UserPostgesDBRepo());
        userService.filterUsersByRepo();
    }
}
