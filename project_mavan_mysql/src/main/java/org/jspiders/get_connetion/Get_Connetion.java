package org.jspiders.get_connetion;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Get_Connetion {
    public static Connection getConnetion() throws IOException, SQLException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("config.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        Class.forName(properties.getProperty("className"));
        return DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("pass"));
    }
}
