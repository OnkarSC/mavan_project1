package org.jspiders.main;

import org.jspiders.data.Data_Users;
import org.jspiders.delete_users.Delete_Users;
import org.jspiders.insert_usersdb.Signup_Users;
import org.jspiders.retrieve_users.Retrieve_Users;
import org.jspiders.update_users.Update_Users;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        Data_Users dataUsers = new Data_Users();
        Delete_Users deleteUsers = new Delete_Users();
        Signup_Users signup_Users = new Signup_Users();
        Update_Users updateUsers = new Update_Users();
        Retrieve_Users retrieveUsers = new Retrieve_Users();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1. FOR Signup_Users \n 2. FOR DELETE DATA \n 3. FOR UPDATE DATA \n 4. FOR RETRIEVE ALL DATA");
        System.out.println("----------------------------------------");
        boolean flag = true;
        do {
            System.out.print("CHOOSE : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter ID: ");
                    dataUsers.setId(scanner.nextInt());
                    System.out.print("Enter Name: ");
                    dataUsers.setName(scanner.next());
                    System.out.print("Enter MailID: ");
                    dataUsers.setMail(scanner.next());
                    System.out.print("Enter Password: ");
                    dataUsers.setPass(scanner.next());
                    signup_Users.signup_Users(dataUsers);
                }
                break;
                case 2: {
                    System.out.print("ENTER MAIL: ");
                    String name = scanner.next();
                    deleteUsers.deleteUsers(name);
                }
                break;
                case 3: {
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter MailID: ");
                    String mail = scanner.next();
                    System.out.print("Enter Password: ");
                    String pass = scanner.next();
                    dataUsers.setId(id);
                    dataUsers.setName(name);
                    dataUsers.setMail(mail);
                    dataUsers.setPass(pass);
                    updateUsers.updateUsers(dataUsers);
                }
                break;
                case 4: {
                    retrieveUsers.retrieve_Users();
                }
                break;
                default:
                    System.out.println("INVALID INPUT..!!!!");
                    flag = false;
            }
        } while (flag);
    }
}
