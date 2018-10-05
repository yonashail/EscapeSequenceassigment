package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sides;
        System.out.print("Enter the length of the side of the rectangle: ");
        sides = input.nextInt();

        int count = 0;
        int counter = 1;

        // Prints out the first row
        while (count < sides) {
            System.out.print("*");
            count++;
        }
        System.out.println();
        count = 0;

        // Prints out the hollow part
        while (counter < sides-1) {
            System.out.print("*");  // Prints the '*' at the beginning of the row
            while (count < sides - 2) {
                System.out.print(" "); // Prints the spaces
                count++;
            }
            System.out.println("*"); // Prints the '*' at the end of the row
            count=0;
            counter++;
        }

        // Prints out the last row(same as the first one)
        while (count < sides) {
            System.out.print("*");
            count++;
        }
    }
    }

