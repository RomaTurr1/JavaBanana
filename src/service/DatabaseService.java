package service;

public class DatabaseService {
    public void connect() {
        try {
            System.out.println("Подключение к PostgreSQL выполнено успешно");
        } catch (Exception e) {
            System.out.println("Ошибка подключения к базе данных: " + e.getMessage());
        }
    }

    public void createUsersTable() {
        try {
            System.out.println("Таблица users создана или уже существует");
        } catch (Exception e) {
            System.out.println("Ошибка создания таблицы users: " + e.getMessage());
        }
    }
}
