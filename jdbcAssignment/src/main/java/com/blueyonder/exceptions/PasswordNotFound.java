package com.blueyonder.exceptions;

public class PasswordNotFound extends Throwable{
    public PasswordNotFound() {
        super("Wrong Password ,pls retry!\n");
    }
}