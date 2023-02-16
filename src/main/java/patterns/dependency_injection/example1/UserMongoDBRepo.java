package patterns.dependency_injection.example1;

import java.util.ArrayList;
import java.util.List;

public class UserMongoDBRepo implements UserRepo {
    @Override
    public List<User> getUser() {
        System.out.println("Используем подключение к MONGO и получаем пользователей");
        List<User> users = new ArrayList<>();
        users.add(new User("Пользователь из МОНГО ДБ", 22));
        users.add(new User("Пользователь из МОНГО ДБ", 33));
        return users;
    }
}
