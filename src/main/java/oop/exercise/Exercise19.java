package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman

 */
public class Exercise19
{
    static Scanner input = new Scanner(System.in);
    public static String getHeight(){
        System.out.print("What is your height in inches?");
        String height = input.nextLine();
        while(!height.matches("[0-9.]+"))
        {
            System.out.print("Please enter a numerical value");
            height = input.nextLine();
        }
        return height;
    }
    public static String getWeight(){
        System.out.print("What is your weight in pounds?");
        String weight = input.nextLine();
        while(!weight.matches("[0-9.]+"))
        {
            System.out.print("Please enter a numerical value");
            weight = input.nextLine();
        }
        return weight;
    }
    public static float doMath(String h, String w)
    {
        float height = Float.parseFloat(h);
        float weight = Float.parseFloat(w);

        return (weight / (height * height)) * 703;
    }
    public static void results(float bmi){

        if(bmi > 18.5 && bmi < 25)
            System.out.printf("Your BMI is %.1f.\nYou are within the ideal weight range.", bmi);
        if(bmi <= 18.5)
            System.out.printf("Your BMI is %.1f.\nYou are underweight. You should see your doctor.", bmi);
        if(bmi >= 25)
            System.out.printf("Your BMI is %.1f.\nYou are overweight. You should see your doctor.", bmi);

    }
    public static void main( String[] args ) {
        String height = getHeight();
        String weight = getWeight();
        float bmi = doMath(height, weight);
        results(bmi);
    }
}
