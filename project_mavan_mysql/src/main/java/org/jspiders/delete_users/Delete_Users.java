package org.jspiders.delete_users;

import org.jspiders.get_connetion.Get_Connetion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete_Users {
    public void deleteUsers(String mail) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = Get_Connetion.getConnetion();
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM FACEBOOK WHERE MAIL = ?");
        preparedStatement.setString(1, mail);
        int resultSet = preparedStatement.executeUpdate();
        if (resultSet==1){
            System.out.println("DATA DELETE SUCCESSFUL");
        }
        else {
            System.out.println("DATA NOT DELETED..!!!");
        }
        connection.close();
        System.out.println("------------------------------------");
    }
}
