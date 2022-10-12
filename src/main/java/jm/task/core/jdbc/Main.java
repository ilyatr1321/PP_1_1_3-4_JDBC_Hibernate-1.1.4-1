package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Alex","Pipkin", (byte) 22);
        System.out.println("User с именем: Alex добавлен в базу данных");
        userService.saveUser("Dima","Pipkin", (byte) 23);
        System.out.println("User с именем: Dima добавлен в базу данных");
        userService.saveUser("Roma","Pipkin", (byte) 24);
        System.out.println("User с именем: Roma добавлен в базу данных");
        userService.saveUser("Lesha","Pipkin", (byte) 25);
        System.out.println("User с именем: Lesha добавлен в базу данных");

        userService.getAllUsers().toString();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }

}
