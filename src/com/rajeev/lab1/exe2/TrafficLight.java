package com.rajeev.lab1.exe2;

import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter 1 to make traffic light RED");
            System.out.println("Enter 2 to make traffic light YELLOW");
            System.out.println("Enter 3 to make traffic light GREEN");
            System.out.println("PRESS 0 to exit");

            int userInput = sc.nextInt();

            if(userInput==0){
                System.out.println("EXIT successfully");
                break;
            }

            switch (userInput) {
                case 1:
                    System.out.println("RED");
                    break;
                case 2:
                    System.out.println("YELLOW");
                    break;
                case 3:
                    System.out.println("GREEN");
                    break;
                default:
                    System.out.println("PLEASE pick within 1,2,3");
            }
        }
    }
}
