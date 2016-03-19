package com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Problem_8 {
    public static void main(String[] args) throws IOException {
        InputStream fileInputStream =  Problem_8.class.getClassLoader().getResourceAsStream("test.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
    }
}
