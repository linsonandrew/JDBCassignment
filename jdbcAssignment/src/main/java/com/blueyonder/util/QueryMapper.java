package com.blueyonder.util;

public class QueryMapper {
    public static final String CHECKING_STRING = "select password from users where username=?";
    public static final String OUTPUT_STRING = "select id,username,password from users where username=?";
}
