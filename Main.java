package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        int i=0;
        do{
            String username;
            System.out.println("Enter Your User Name:");
            username=input.nextLine();

            String Password;
            System.out.println("Enter Your  Password:");
            Password=input1.nextLine();
            if(username.contains("Rakib")&&Password.contains("2005783")){
                System.out.println("You have been Logged in.");
                break;
            }
            System.out.println("Wrong User name Or Password,Try Again!!");
        }while(i<=5);
        System.out.println("Successfuly.");
    }
}