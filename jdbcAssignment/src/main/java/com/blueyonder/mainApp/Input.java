package com.blueyonder.mainApp;

import com.blueyonder.exceptions.PasswordNotFound;
import com.blueyonder.exceptions.UserNotFound;
import com.blueyonder.model.User;
import com.blueyonder.service.Service;
import com.blueyonder.service.ServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws UserNotFound, SQLException, PasswordNotFound {

        Scanner sd = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String un = sd.nextLine();
        System.out.println("Hi "+un+", Enter Password : ");
        String pas = sd.nextLine();

        Service userservice = new ServiceImpl();
        try{
            User usr = userservice.getPassword(un,pas);
            System.out.println(usr.toString());
        }
        catch(UserNotFound | SQLException  | PasswordNotFound e){
            System.out.println(e);
        }
    }
}
