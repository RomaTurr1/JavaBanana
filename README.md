# Java Rubezh

Учебный Java проект для практического задания.

## Что есть в проекте

- класс User с полями id name email
- FileService для записи пользователей в users.txt
- DatabaseService для имитации подключения к PostgreSQL
- UserRepository возвращает данные из SQL задания
- try-catch для обработки ошибок
- простая архитектура по папкам
- файл database.sql с таблицей users и INSERT данными

## Структура

java-rubezh/
├── src/
│   ├── Main.java
│   ├── model/
│   │   └── User.java
│   ├── repository/
│   │   └── UserRepository.java
│   └── service/
│       ├── DatabaseService.java
│       └── FileService.java
├── database.sql
├── users.txt
└── README.md

## Запуск

```bash
cd src
javac Main.java model/User.java repository/UserRepository.java service/FileService.java service/DatabaseService.java
java Main
```

После запуска в консоли появится:

Список пользователей из базы данных:
1 | Ayan | ayan@mail.com
2 | Dana | dana@mail.com
3 | Madiyar | madiyar@mail.com
Пользователи успешно записаны в файл: users.txt

## Важно

Проект сделан так чтобы запускаться без реальной PostgreSQL базы.
Файл database.sql добавлен чтобы показать таблицу и данные из задания.
