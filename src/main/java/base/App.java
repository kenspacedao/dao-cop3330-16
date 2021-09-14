package base;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("What is your age? ");
        Scanner inp = new Scanner(System.in);
        int age = inp.nextInt();

        if(age < 16)
            System.out.println("You are not old enough to legally drive. ");
        else
        {
            System.out.println("You are old enough to legally drive. ");
        }
    }
}