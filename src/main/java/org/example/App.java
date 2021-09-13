/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        double temp=0;
        double tempFinal=0;
        String result="";
        Scanner input=new Scanner(System.in);
        System.out.printf("Press C to convert from Fahrenheit to Celsius.%nPress F to convert from Celsius to Fahrenheit.%n");
        System.out.print("Your choice: ");
        String choice=input.next();


        if(choice.equals("C") || choice.equals("c"))
        {
            result=result+"Celsius";
            System.out.print("Please enter the temperature in Fahrenheit ");
            temp=input.nextDouble();

            tempFinal=((temp-32)*5/9);
        }
        if(choice.equals("F") || choice.equals("f"))
        {
            result=result+"Fahrenheit";
            System.out.print("Please enter the temperature in Celsius ");
            temp=input.nextDouble();

            tempFinal=((temp*9/5)+32);
        }

        System.out.printf("The temperature in %s is %.0f",result,tempFinal);
    }
}
