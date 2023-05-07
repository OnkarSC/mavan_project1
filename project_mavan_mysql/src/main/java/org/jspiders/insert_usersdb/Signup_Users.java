package org.jspiders.insert_usersdb;

import org.jspiders.data.Data_Users;
import org.jspiders.get_connetion.Get_Connetion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Signup_Users {
    public void signup_Users(Data_Users dataUsers) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = Get_Connetion.getConnetion();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO FACEBOOK VALUES(?,?,?,?);");
        preparedStatement.setInt(1, dataUsers.getId());
        preparedStatement.setString(2, dataUsers.getName());
        preparedStatement.setString(3, dataUsers.getMail());
        preparedStatement.setString(4, dataUsers.getPass());
        int resultSet = preparedStatement.executeUpdate();
        if (resultSet == 1) {
            System.out.println("Signup_Successful.......");
        } else {
            System.out.println("Failed Signup_Users..!!!");
        }
        connection.close();
        System.out.println("--------------------------------");
    }
}
