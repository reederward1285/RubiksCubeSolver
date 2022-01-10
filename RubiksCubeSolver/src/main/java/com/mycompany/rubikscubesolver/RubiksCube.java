/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rubikscubesolver;
import java.util.Scanner;

/**
 *
 * @author Daniel, Reeder, Johannes
 */
public class RubiksCube {
    public static void main(String[] arguments)
    {
        // In classes, we can have objects/things, methods, and a main method
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integerFromKeyboard1 = keyboard.nextInt();
        int integerFromKeyboard2 = keyboard.nextInt();
        int integerFromKeyboard0;
        integerFromKeyboard0 = integerFromKeyboard1 - integerFromKeyboard2;
        System.out.println(integerFromKeyboard0);
    }
}