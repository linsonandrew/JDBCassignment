package com.blueyonder.exceptions;

public class UserNotFound extends Exception{
        public UserNotFound(){
            super("User is not found in the database\n");
        }
}
