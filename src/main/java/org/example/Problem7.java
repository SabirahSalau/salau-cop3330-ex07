/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Sabirah Salau
 */

package org.example;
import java.util.Scanner;

public class Problem7
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        int length = input.nextInt();

        System.out.println("What is the width of the room in feet?");
        int width = input.nextInt();

        int area = width * length;
        double conversion = 0.09290304;
        double areaInSquareMeters = area * conversion;

        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");
        System.out.printf("The area is \n" + area + " square feet\n%.3f square meters", areaInSquareMeters);


    }
}
