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
    // arrays start counting from zero
    // so, char[] cube: cube[0] is spot number 1,
    // cube[5] is spot number 6
    public static void main(String[] arguments)
    {
        char[] cube = { 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W',
                        'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G',
                        'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y',
                        'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R',
                        'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B',
                        'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O',
                      };
        
        System.out.println(cube);
        cube = U_Move(cube);
        char cube6 = cube[6];
        cube[0] = cube[6];
        System.out.println(cube);
    }
    
    // U
    public static char[] U_Move(char[] cube)
    {
        // change the letters to be in the right spots
        char cube6 = cube[6];
        char cube0 = cube[0];
        char cube2 = cube[2];
        char cube8 = cube[8];
        
        // spot number 1 is changing to be the Farbe in spot 7
        cube[0] = cube6;
        
        // spot number 3 is changing to be the Farbe in spot 1
        cube[2] = cube0;
        
        // spot number 9 is changing to be the Farbe in spot 3
        cube[8] = cube2;
        
        // spot number 7 is changing to be the Farbe in spot 9
        cube[6] = cube8;
        
        // return the new array with the correct spots
        return cube;
    }
    // U'
    // R
    // R'
    // L
    // L'
    // D
    // D'
    // F
    // F'
    // B
    // B'    
}