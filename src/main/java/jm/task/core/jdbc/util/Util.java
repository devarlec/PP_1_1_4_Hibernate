package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
    public static final String USER_TABLE_NAME = "pizzafb";

    // Connect to MySQL
    private final static Configuration configuration = new Configuration().addAnnotatedClass(User.class);

    public static SessionFactory getSessionFactory() {

        return configuration.buildSessionFactory();

    }
}

// only JDBC version
/*
    public static final String DEFAULT_USERNAME = "root";
    public static final String DEFAULT_PASSWORD = "admin";
    public static final String DEFAULT_DB_NAME = "myschema";

    public static Connection getMySQLConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
                DEFAULT_DB_NAME, DEFAULT_USERNAME, DEFAULT_PASSWORD);
        return connection;
    }
*/