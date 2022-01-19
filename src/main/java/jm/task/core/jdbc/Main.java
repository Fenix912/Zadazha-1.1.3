package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl obj = new UserServiceImpl();

        obj.createUsersTable();

        obj.saveUser("Dima", "Fateev", (byte) 22);
        obj.saveUser("Anton", "Rakov", (byte) 45);
        obj.saveUser("Igor", "Kuzelev", (byte) 30);
        obj.saveUser("Vlad", "Snegirev", (byte) 31);

        obj.getAllUsers().forEach(System.out::println);
        obj.cleanUsersTable();
        obj.dropUsersTable();
    }
}
