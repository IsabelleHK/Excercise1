/*
    UCF COP3330 Fall 2021 Assignment 1 Solution
    Copyright 2021 Isabelle Kenny
 */

package com.helpme;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username: ");

        String userName=myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}

