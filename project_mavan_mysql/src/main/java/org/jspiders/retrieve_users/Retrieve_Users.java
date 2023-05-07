package org.jspiders.retrieve_users;

import org.jspiders.get_connetion.Get_Connetion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Retrieve_Users {
    public void retrieve_Users() throws SQLException, IOException, ClassNotFoundException {
        Connection connection = Get_Connetion.getConnetion();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM FACEBOOK");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("ID") + "\t" + resultSet.getString("NAME") + "\t" + resultSet.getString("MAIL") + "\t" + resultSet.getString("PASSWORD"));
        }
        connection.close();
        System.out.println("--------------------------------------");
    }
}
