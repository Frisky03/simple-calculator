package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        chooseFunction();
        Scanner select = new Scanner(System.in);
        System.out.print("Please enter your choice: ");
        int choice = select.nextInt();
        while(choice != 5){
            Scanner number = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int firstNum = number.nextInt();
            System.out.print("Enter second number: ");
            int secondNum = number.nextInt();
            int result = 0;
            switch (choice) {
                case 1:
                    result = firstNum + secondNum;
                    break;
                case 2:
                    result = firstNum - secondNum;
                    break;
                case 3:
                    result = firstNum * secondNum;
                    break;
                case 4:
                    result = firstNum / secondNum;
                    break;
                case 5:
                    System.out.println("Will now exit the program");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Result: " + result);
            chooseFunction();
            System.out.print("Please enter your choice: ");
            choice = select.nextInt();
        }
    }
    static void chooseFunction(){
        System.out.println("Please select from below choices:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Exit the program");
    }
}