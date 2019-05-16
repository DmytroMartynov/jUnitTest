package com.dmartynov;

import java.util.Scanner;

import static com.dmartynov.UserValidator.checkEmail;
import static com.dmartynov.UserValidator.checkPassword;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pls enter email: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.println("Pls enter password: ");
        String password = scanner.nextLine();
        if (checkPassword(password) && checkEmail(email)) {
            System.out.println("Everything ok");
        } else {
            System.out.println("Your password or email are not valid");
        }
    }
}
