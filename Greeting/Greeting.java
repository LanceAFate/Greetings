package Greeting;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();
            System.out.println("Hello there, " + name + "!");
        }
    }
    
}
