package patterns.dependency_injection.example1;

import java.util.Iterator;
import java.util.List;

public class UserService {
    UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void filterUsersByRepo() {
        List<User> users = userRepo.getUser();
//        System.out.println(users);
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println("Пользователь: " + user.getUserName() + ", " + user.getAge());
        }
    }
}
