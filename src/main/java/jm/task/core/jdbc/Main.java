package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();

//        User user1 = new User("Gordan", "Freeman", (byte) 27);
//        User user2 = new User("Bobby", "Dig", (byte) 31);
//        User user3 = new User("Lione", "Poll", (byte) 24);
//        User user4 = new User("zzz", "xxx", (byte) 27);
    }
}
