package com.mycompany.rubikscubesolver;
import java.util.Scanner;

/*
 * @author Daniel, Reeder, Johannes, Ömer
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
        cube = R_prime_Move(cube);
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

    // U'
    public static char[] U_Prime_Move(char[] cube)
   
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

    // R'
    public static char[] R_Prime_Move(char[] cube)
    
    {
        // change the letters to be in the right spots
        char cube2 = cube[2];
        char cube5 = cube[5];
        char cube8 = cube[8];
        char cube20 = cube[20];
        char cube23 = cube[23];
        char cube26 = cube[26];
        char cube38 = cube[38];
        char cube41 = cube[41];
        char cube44 = cube[44];
        char cube47 = cube[47];
        char cube50 = cube[50];
        char cube53 = cube[53];
        char cube27 = cube[27];
        char cube28 = cube[28];
        char cube29 = cube[29];
        char cube30 = cube[30];
        char cube32 = cube[32];
        char cube33 = cube[33];
        char cube34 = cube[34];
        char cube35 = cube[35];

        // spot number 7 is changing to be the Farbe in spot 1
        cube[2] = cube47;

        // spot number 1 is changing to be the Farbe in spot 3
        cube[5] = cube50;

        // spot number 3 is changing to be the Farbe in spot 9
        cube[8] = cube53;

        // spot number 9 is changing to be the Farbe in spot 7
        cube[20] = cube2;

        // spot number 4 is changing to be the Farbe in spot 2
        cube[23] = cube5;

        // spot number 2 is changing to be the Farbe in spot 6
        cube[26] = cube8;

        // spot number 6 is changing to be the Farbe in spot 8
        cube[38] = cube20;

        // spot number 8 is changing to be the Farbe in spot 4
        cube[41] = cube23;

        // spot number 28 is changing to be the Farbe in spot 19
        cube[44] = cube26;

        // spot number 19 is changing to be the Farbe in spot 10
        cube[47] = cube38;

        // spot number 10 is changing to be the Farbe in spot 54
        cube[50] = cube41;

        // spot number 54 is changing to be the Farbe in spot 28
        cube[53] = cube44;
        
        // spot number 29 is changing to be the Farbe in spot 20
        cube[27] = cube33;

        // spot number 20 is changing to be the Farbe in spot 11
        cube[28] = cube30;

        // spot number 11 is changing to be the Farbe in spot 53
        cube[29] = cube27;

        // spot number 53 is changing to be the Farbe in spot 2
        cube[30] = cube34;

        // spot number 30 is changing to be the Farbe in spot 21
        cube[32] = cube28;

        // spot number 21 is changing to be the Farbe in spot 12
        cube[33] = cube35;

        // spot number 12 is changing to be the Farbe in spot 52
        cube[34] = cube32;

        // spot number 52 is changing to be the Farbe in spot 30 
        cube[35] = cube29;

        // return the new array with the correct spots
        return cube;
    }
    
    // R
    public static char[] R_Move(char[] cube)
   
    {
        // change the letters to be in the right spots
        char cube2 = cube[2];
        char cube5 = cube[5];
        char cube8 = cube[8];
        char cube20 = cube[20];
        char cube23 = cube[23];
        char cube26 = cube[26];
        char cube38 = cube[38];
        char cube41 = cube[41];
        char cube44 = cube[44];
        char cube47 = cube[47];
        char cube50 = cube[50];
        char cube53 = cube[53];
        char cube27 = cube[27];
        char cube28 = cube[28];
        char cube29 = cube[29];
        char cube30 = cube[30];
        char cube32 = cube[32];
        char cube33 = cube[33];
        char cube34 = cube[34];
        char cube35 = cube[35];

        // spot number 7 is changing to be the Farbe in spot 1
        cube[2] = cube20;

        // spot number 1 is changing to be the Farbe in spot 3
        cube[5] = cube23;

        // spot number 3 is changing to be the Farbe in spot 9
        cube[8] = cube26;

        // spot number 9 is changing to be the Farbe in spot 7
        cube[20] = cube38;

        // spot number 4 is changing to be the Farbe in spot 2
        cube[23] = cube41;

        // spot number 2 is changing to be the Farbe in spot 6
        cube[26] = cube44;

        // spot number 6 is changing to be the Farbe in spot 8
        cube[38] = cube47;

        // spot number 8 is changing to be the Farbe in spot 4
        cube[41] = cube50;

        // spot number 28 is changing to be the Farbe in spot 19
        cube[44] = cube53;

        // spot number 19 is changing to be the Farbe in spot 10
        cube[47] = cube2;

        // spot number 10 is changing to be the Farbe in spot 54
        cube[50] = cube5;

        // spot number 54 is changing to be the Farbe in spot 28
        cube[53] = cube8;
        
        // spot number 29 is changing to be the Farbe in spot 20
        cube[27] = cube29;

        // spot number 20 is changing to be the Farbe in spot 11
        cube[28] = cube32;

        // spot number 11 is changing to be the Farbe in spot 53
        cube[29] = cube35;

        // spot number 53 is changing to be the Farbe in spot 2
        cube[30] = cube28;

        // spot number 30 is changing to be the Farbe in spot 21
        cube[32] = cube34;

        // spot number 21 is changing to be the Farbe in spot 12
        cube[33] = cube27;

        // spot number 12 is changing to be the Farbe in spot 52
        cube[34] = cube30;

        // spot number 52 is changing to be the Farbe in spot 30 
        cube[35] = cube33;

        // return the new array with the correct spots
        return cube;
    }
    // L
    // L'
    // D
    public static char[] D_Move(char[] cube)
            
    {

        // change the letters to be in the right spots
        char cube15 = cube[15];
        char cube16 = cube[16];
        char cube17 = cube[17];
        char cube24 = cube[24];
        char cube25 = cube[25];
        char cube26 = cube[26];
        char cube33 = cube[33];
        char cube34 = cube[34];
        char cube35 = cube[35];
        char cube45 = cube[45];
        char cube46 = cube[46];
        char cube47 = cube[47];
        char cube36 = cube[36];
        char cube37 = cube[37];
        char cube38 = cube[38];
        char cube39 = cube[39];
        char cube41 = cube[41];
        char cube42 = cube[42];
        char cube43 = cube[43];
        char cube44 = cube[44];


        // spot number 7 is changing to be the Farbe in spot 1
        cube[15] = cube45;

        // spot number 1 is changing to be the Farbe in spot 3
        cube[16] = cube46;

        // spot number 3 is changing to be the Farbe in spot 9
        cube[17] = cube47;

        // spot number 9 is changing to be the Farbe in spot 7
        cube[24] = cube15;

        // spot number 4 is changing to be the Farbe in spot 2
        cube[25] = cube16;

        // spot number 2 is changing to be the Farbe in spot 6
        cube[26] = cube17;

        // spot number 6 is changing to be the Farbe in spot 8
        cube[33] = cube24;

        // spot number 8 is changing to be the Farbe in spot 4
        cube[34] = cube25;

        // spot number 28 is changing to be the Farbe in spot 19
        cube[35] = cube26;

        // spot number 19 is changing to be the Farbe in spot 10
        cube[45] = cube33;

        // spot number 10 is changing to be the Farbe in spot 54
        cube[46] = cube34;

        // spot number 54 is changing to be the Farbe in spot 28
        cube[47] = cube35;
        
        // spot number 29 is changing to be the Farbe in spot 20
        cube[36] = cube38;

        // spot number 20 is changing to be the Farbe in spot 11
        cube[37] = cube41;

        // spot number 11 is changing to be the Farbe in spot 53
        cube[38] = cube44;

        // spot number 53 is changing to be the Farbe in spot 2
        cube[39] = cube37;

        // spot number 30 is changing to be the Farbe in spot 21
        cube[41] = cube43;

        // spot number 21 is changing to be the Farbe in spot 12
        cube[42] = cube36;

        // spot number 12 is changing to be the Farbe in spot 52
        cube[43] = cube39;

        // spot number 52 is changing to be the Farbe in spot 30 
        cube[44] = cube42;

        // return the new array with the correct spots
        return cube;
    }
    
    // D'
    public static char[] D_prime_Move(char[] cube)
            
    {

        // change the letters to be in the right spots
        char cube15 = cube[15];
        char cube16 = cube[16];
        char cube17 = cube[17];
        char cube24 = cube[24];
        char cube25 = cube[25];
        char cube26 = cube[26];
        char cube33 = cube[33];
        char cube34 = cube[34];
        char cube35 = cube[35];
        char cube45 = cube[45];
        char cube46 = cube[46];
        char cube47 = cube[47];
        char cube36 = cube[36];
        char cube37 = cube[37];
        char cube38 = cube[38];
        char cube39 = cube[39];
        char cube41 = cube[41];
        char cube42 = cube[42];
        char cube43 = cube[43];
        char cube44 = cube[44];


        // spot number 7 is changing to be the Farbe in spot 1
        cube[15] = cube24;

        // spot number 1 is changing to be the Farbe in spot 3
        cube[16] = cube25;

        // spot number 3 is changing to be the Farbe in spot 9
        cube[17] = cube26;

        // spot number 9 is changing to be the Farbe in spot 7
        cube[24] = cube33;

        // spot number 4 is changing to be the Farbe in spot 2
        cube[25] = cube34;

        // spot number 2 is changing to be the Farbe in spot 6
        cube[26] = cube35;

        // spot number 6 is changing to be the Farbe in spot 8
        cube[33] = cube45;

        // spot number 8 is changing to be the Farbe in spot 4
        cube[34] = cube46;

        // spot number 28 is changing to be the Farbe in spot 19
        cube[35] = cube47;

        // spot number 19 is changing to be the Farbe in spot 10
        cube[45] = cube15;

        // spot number 10 is changing to be the Farbe in spot 54
        cube[46] = cube16;

        // spot number 54 is changing to be the Farbe in spot 28
        cube[47] = cube17;
        
        // spot number 29 is changing to be the Farbe in spot 20
        cube[36] = cube42;

        // spot number 20 is changing to be the Farbe in spot 11
        cube[37] = cube39;

        // spot number 11 is changing to be the Farbe in spot 53
        cube[38] = cube36;

        // spot number 53 is changing to be the Farbe in spot 2
        cube[39] = cube43;

        // spot number 30 is changing to be the Farbe in spot 21
        cube[41] = cube37;

        // spot number 21 is changing to be the Farbe in spot 12
        cube[42] = cube44;

        // spot number 12 is changing to be the Farbe in spot 52
        cube[43] = cube41;

        // spot number 52 is changing to be the Farbe in spot 30 
        cube[44] = cube38;

        // return the new array with the correct spots
        return cube;
    }
    
    //F
    public static char[] F_Move(char[] cube)
            
    {
       // change the letters to be in the right spots
        char cube6 = cube[6];
        char cube7 = cube[7];
        char cube8 = cube[8];
        char cube18 = cube[18];
        char cube19 = cube[19];
        char cube20 = cube[20];
        char cube21 = cube[21];
        char cube23 = cube[23];
        char cube24 = cube[24];
        char cube25 = cube[25];
        char cube26 = cube[26];
        char cube11 = cube[11];
        char cube14 = cube[14];
        char cube17 = cube[17];
        char cube36 = cube[36];
        char cube37 = cube[37];
        char cube38 = cube[38];
        char cube27 = cube[27];
        char cube30 = cube[30];
        char cube33 = cube[33];
        
        // spot number 7 is changing to be the Farbe in spot 18
        cube[6] = cube17;

        // spot number 8 is changing to be the Farbe in spot 15
        cube[7] = cube14;

        // spot number 9 is changing to be the Farbe in spot 12
        cube[8] = cube11;

        // spot number 19 is changing to be the Farbe in spot 25
        cube[18] = cube24;

        // spot number 20 is changing to be the Farbe in spot 22
        cube[19] = cube21;

        // spot number 21 is changing to be the Farbe in spot 19
        cube[20] = cube18;

        // spot number 22 is changing to be the Farbe in spot 26
        cube[21] = cube25;

        // spot number 24 is changing to be the Farbe in spot 20
        cube[23] = cube19;

        // spot number 25 is changing to be the Farbe in spot 27
        cube[24] = cube26;

        // spot number 26 is changing to be the Farbe in spot 24
        cube[25] = cube23;

        // spot number 27 is changing to be the Farbe in spot 21
        cube[26] = cube20;

        // spot number 12 is changing to be the Farbe in spot 37
        cube[11] = cube36;
        
        // spot number 15 is changing to be the Farbe in spot 38
        cube[14] = cube37;

        // spot number 18 is changing to be the Farbe in spot 39
        cube[17] = cube38;

        // spot number 37 is changing to be the Farbe in spot 34
        cube[36] = cube33;

        // spot number 38 is changing to be the Farbe in spot 31
        cube[37] = cube30;

        // spot number 39 is changing to be the Farbe in spot 28
        cube[38] = cube27;

        // spot number 28 is changing to be the Farbe in spot 7
        cube[27] = cube6;

        // spot number 31 is changing to be the Farbe in spot 8
        cube[30] = cube7;

        // spot number 34 is changing to be the Farbe in spot 9 
        cube[33] = cube8;

        // return the new array with the correct spots
        return cube;
    }
    
    //F'
    public static char[] F_Prime_Move(char[] cube)
            
    {
        // change the letters to be in the right spots
        char cube6 = cube[6];
        char cube7 = cube[7];
        char cube8 = cube[8];
        char cube18 = cube[18];
        char cube19 = cube[19];
        char cube20 = cube[20];
        char cube21 = cube[21];
        char cube23 = cube[23];
        char cube24 = cube[24];
        char cube25 = cube[25];
        char cube26 = cube[26];
        char cube11 = cube[11];
        char cube14 = cube[14];
        char cube17 = cube[17];
        char cube36 = cube[36];
        char cube37 = cube[37];
        char cube38 = cube[38];
        char cube27 = cube[27];
        char cube30 = cube[30];
        char cube33 = cube[33];
        
        // spot number 18 is changing to be the Farbe in spot 7
        cube[17] = cube6;

        // spot number 15 is changing to be the Farbe in spot 8
        cube[14] = cube7;

        // spot number 12 is changing to be the Farbe in spot 9
        cube[11] = cube8;

        // spot number 25 is changing to be the Farbe in spot 19
        cube[24] = cube18;

        // spot number 22 is changing to be the Farbe in spot 20
        cube[21] = cube19;

        // spot number 19 is changing to be the Farbe in spot 21
        cube[18] = cube20;

        // spot number 26 is changing to be the Farbe in spot 22
        cube[25] = cube21;

        // spot number 20 is changing to be the Farbe in spot 24
        cube[19] = cube23;

        // spot number 27 is changing to be the Farbe in spot 25
        cube[26] = cube24;

        // spot number 24 is changing to be the Farbe in spot 26
        cube[23] = cube25;

        // spot number 21 is changing to be the Farbe in spot 27
        cube[20] = cube26;

        // spot number 37 is changing to be the Farbe in spot 12
        cube[36] = cube11;
        
        // spot number 38 is changing to be the Farbe in spot 15
        cube37 = cube14;

        // spot number 39 is changing to be the Farbe in spot 18
        cube[38] = cube17;

        // spot number 34 is changing to be the Farbe in spot 37
        cube[33] = cube36;

        // spot number 31 is changing to be the Farbe in spot 38
        cube[30] = cube37;

        // spot number 28 is changing to be the Farbe in spot 39
        cube[27] = cube38;

        // spot number 7 is changing to be the Farbe in spot 28
        cube[6] = cube27;

        // spot number 8 is changing to be the Farbe in spot 31
        cube[7] = cube30;

        // spot number 9 is changing to be the Farbe in spot 34
        cube[8] = cube33;

        // return the new array with the correct spots
        return cube;
    }
    
    // B
    // B'    
}
