import model.User;
import repository.UserRepository;
import service.DatabaseService;
import service.FileService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseService databaseService = new DatabaseService();
        UserRepository userRepository = new UserRepository();
        FileService fileService = new FileService();

        databaseService.connect();
        databaseService.createUsersTable();

        List<User> users = userRepository.getUsers();

        System.out.println("Список пользователей из базы данных:");
        for (User user : users) {
            System.out.println(user);
        }

        fileService.saveUsersToFile(users, "users.txt");
    }
}
