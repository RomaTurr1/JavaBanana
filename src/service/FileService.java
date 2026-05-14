package service;

import model.User;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileService {
    public void saveUsersToFile(List<User> users, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (User user : users) {
                writer.write(user.toString() + "\n");
            }

            System.out.println("Пользователи успешно записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
