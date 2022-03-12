package com.company;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Nice");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed");
            e.printStackTrace();
        }
    }
}
