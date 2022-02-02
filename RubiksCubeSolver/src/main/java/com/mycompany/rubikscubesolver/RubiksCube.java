package com.mycompany.rubikscubesolver;
import java.util.Scanner;

/*
 * @author Daniel, Reeder, Johannes
 */
public class RubiksCube {
    // arrays start counting from zero
    // so, char[] cube: cube[0] is spot number 1,
    // cube[5] is spot number 6
    public static void main(String[] arguments)
    {
        char[] cube = { 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W',
                        'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O',
                        'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G',
                        'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R',
                        'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y',
                        'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B',
                      };
        
        System.out.println(cube);
        cube = U_Move(cube);
//        char cube6 = cube[6];
//        cube[0] = cube[6];
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
        char cube1 = cube[1];
        char cube5 = cube[5];
        char cube7 = cube[7];
        char cube3 = cube[3];
        char cube18 = cube[18];
        char cube19 = cube[19];
        char cube20 = cube[20];
        char cube27 = cube[27];
        char cube28 = cube[28];
        char cube29 = cube[29];
        char cube9 = cube[9];
        char cube10 = cube[10];
        char cube11 = cube[11];
        char cube51 = cube[51];
        char cube52 = cube[52];
        char cube53 = cube[53];
        
        // spot number 1 is changing to be the Farbe in spot 7
        cube[0] = cube6;
        
        // spot number 3 is changing to be the Farbe in spot 1
        cube[2] = cube0;
        
        // spot number 9 is changing to be the Farbe in spot 3
        cube[8] = cube2;
        
        // spot number 7 is changing to be the Farbe in spot 9
        cube[6] = cube8;
        
        // spot number 2 is changing to be the Farbe in spot 4
        cube[1] = cube3;
        
        // spot number 6 is changing to be the Farbe in spot 2
        cube[5] = cube1;
        
        // spot number 8 is changing to be the Farbe in spot 6
        cube[7] = cube5;
        
        // spot number 4 is changing to be the Farbe in spot 8
        cube[3] = cube7;
        
        // spot number 19 is changing to be the Farbe in spot 28
        cube[18] = cube27;
        
        // spot number 10 is changing to be the Farbe in spot 19
        cube[9] = cube18;
        
        // spot number 54 is changing to be the Farbe in spot 10
        cube[53] = cube9;
        
        // spot number 28 is changing to be the Farbe in spot 54
        cube[27] = cube53;

        // spot number 20 is changing to be the Farbe in spot 29
        cube[19] = cube28;
        
        // spot number 11 is changing to be the Farbe in spot 20
        cube[10] = cube19;
        
        // spot number 53 is changing to be the Farbe in spot 11
        cube[52] = cube10;
        
        // spot number 29 is changing to be the Farbe in spot 53
        cube[28] = cube52;

        // spot number 21 is changing to be the Farbe in spot 30
        cube[20] = cube29;
        
        // spot number 12 is changing to be the Farbe in spot 21
        cube[11] = cube20;
        
        // spot number 52 is changing to be the Farbe in spot 12
        cube[51] = cube11;
        
        // spot number 30 is changing to be the Farbe in spot 52
        cube[29] = cube51;
        
        // return the new array with the correct spots
        return cube;
    }
      

    public static char[] U_prime_Move(char[] cube)
    {
        // change the letters to be in the right spots
        char cube6 = cube[6];
        char cube0 = cube[0];
        char cube2 = cube[2];
        char cube8 = cube[8];
        char cube1 = cube[1];
        char cube5 = cube[5];
        char cube7 = cube[7];
        char cube3 = cube[3];
        char cube18 = cube[18];
        char cube19 = cube[19];
        char cube20 = cube[20];
        char cube27 = cube[27];
        char cube28 = cube[28];
        char cube29 = cube[29];
        char cube9 = cube[9];
        char cube10 = cube[10];
        char cube11 = cube[11];
        char cube51 = cube[51];
        char cube52 = cube[52];
        char cube53 = cube[53];

        // spot number 7 is changing to be the Farbe in spot 1
        cube[6] = cube0;

        // spot number 1 is changing to be the Farbe in spot 3
        cube[0] = cube2;

        // spot number 3 is changing to be the Farbe in spot 9
        cube[2] = cube8;

        // spot number 9 is changing to be the Farbe in spot 7
        cube[8] = cube6;

        // spot number 4 is changing to be the Farbe in spot 2
        cube[3] = cube1;

        // spot number 2 is changing to be the Farbe in spot 6
        cube[1] = cube5;

        // spot number 6 is changing to be the Farbe in spot 8
        cube[5] = cube7;

        // spot number 8 is changing to be the Farbe in spot 4
        cube[7] = cube3;

        // spot number 28 is changing to be the Farbe in spot 19
        cube[27] = cube18;

        // spot number 19 is changing to be the Farbe in spot 10
        cube[18] = cube9;

        // spot number 10 is changing to be the Farbe in spot 54
        cube[9] = cube53;

        // spot number 54 is changing to be the Farbe in spot 28
        cube[53] = cube27;
        
        // spot number 29 is changing to be the Farbe in spot 20
        cube[28] = cube19;

        // spot number 20 is changing to be the Farbe in spot 11
        cube[19] = cube10;

        // spot number 11 is changing to be the Farbe in spot 53
        cube[10] = cube52;

        // spot number 53 is changing to be the Farbe in spot 2
        cube[52] = cube28;

        // spot number 30 is changing to be the Farbe in spot 21
        cube[29] = cube20;

        // spot number 21 is changing to be the Farbe in spot 12
        cube[20] = cube11;

        // spot number 12 is changing to be the Farbe in spot 52
        cube[11] = cube51;

        // spot number 52 is changing to be the Farbe in spot 30 
        cube[51] = cube29;

        // return the new array with the correct spots
        return cube;
    }

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
