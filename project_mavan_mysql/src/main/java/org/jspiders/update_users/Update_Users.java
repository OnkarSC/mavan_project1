package org.jspiders.update_users;

import org.jspiders.data.Data_Users;
import org.jspiders.get_connetion.Get_Connetion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_Users {
    public void updateUsers(Data_Users dataUsers) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = Get_Connetion.getConnetion();
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE FACEBOOK SET NAME=?,MAIL=?,PASSWORD=? WHERE ID=?");
        preparedStatement.setString(1,dataUsers.getName());
        preparedStatement.setString(2,dataUsers.getMail());
        preparedStatement.setString(3,dataUsers.getPass());
        preparedStatement.setInt(4,dataUsers.getId());
        int a =preparedStatement.executeUpdate();
        if(a==1){
            System.out.println("DATA UPDATED...");
        }else {
            System.out.println("DATA NOT UPDATE..!!");
        }
        connection.close();
        System.out.println("----------------------------");
    }
}
