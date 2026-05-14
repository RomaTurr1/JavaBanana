package repository;

import model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        try {
            // Данные взяты из SQL задания
            users.add(new User(1, "Ayan", "ayan@mail.com"));
            users.add(new User(2, "Dana", "dana@mail.com"));
            users.add(new User(3, "Madiyar", "madiyar@mail.com"));
        } catch (Exception e) {
            System.out.println("Ошибка получения пользователей: " + e.getMessage());
        }

        return users;
    }
}
