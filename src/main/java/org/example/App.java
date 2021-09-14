/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "What is your age? " );
        int age = Integer.parseInt( scan.nextLine() );

        String output = (age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");

        System.out.println( output );
    }
}
