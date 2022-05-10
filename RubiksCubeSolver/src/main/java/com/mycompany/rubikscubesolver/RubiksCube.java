package com.mycompany.rubikscubesolver;

import java.util.Scanner;

/*
 * @author Daniel, Johannes, Ömer
 */
public class RubiksCube {

    // arrays start counting from zero
    // so, char[] cube: cube[0] is spot number 1,
    // cube[5] is spot number 6
    public static void main(String[] arguments) {
        char[] cube =  {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W',
                        'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O',
                        'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G',
                        'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R',
                        'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y',
                        'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B',};
        
        char[] cube1 = {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W',
                        'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O',
                        'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G',
                        'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R',
                        'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y',
                        'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B',};

        String printCube = new String(cube);

        int w_counter = 0;
        int o_counter = 0;
        int g_counter = 0;
        int r_counter = 0;
        int y_counter = 0;
        int b_counter = 0;
        final int MAX_COLOR = 9;
        int cubeLength = cube.length;

        System.out.println("RUBIK'S CUBE SOLVER");
        System.out.println("");
        System.out.println("Add your colors");
        Scanner eingabe = new Scanner(System.in);

        for (int whichSpot = 0; whichSpot < cubeLength; whichSpot++) {
            System.out.println("Give " + whichSpot + ": ");
            //bool is_value_set = false;
            // while is_value_set != false
            char user_color = eingabe.next().charAt(0);

            if (user_color == 'W' && w_counter < 9) {
                cube[whichSpot] = user_color;
                w_counter++;
            } else if (user_color == 'O' && o_counter < MAX_COLOR) {
                System.out.println("Value has been set");
                cube[whichSpot] = user_color;
                o_counter++;
            } else if (user_color == 'G' && g_counter < MAX_COLOR) {
                System.out.println("Value has been set");
                cube[whichSpot] = user_color;
                g_counter++;
            } else if (user_color == 'R' && r_counter < MAX_COLOR) {
                System.out.println("Value has been set");
                cube[whichSpot] = user_color;
                r_counter++;
            } else if (user_color == 'Y' && y_counter < MAX_COLOR) {
                System.out.println("Value has been set");
                cube[whichSpot] = user_color;
                y_counter++;
            } else if (user_color == 'B' && b_counter < MAX_COLOR) {
                System.out.println("Value has been set");
                cube[whichSpot] = user_color;
                b_counter++;
            } else {
                System.out.println();

                if (user_color == 'B'
                        || user_color == 'Y'
                        || user_color == 'R'
                        || user_color == 'W'
                        || user_color == 'G'
                        || user_color == 'O') {
                    System.out.println("Color maximum used. Please re-try.");
                } else {
                    System.out.println("Value hasn't been set. Not a valid color.");
                }

                System.out.println();
                whichSpot--;
            }
        }

        System.out.println("Here is the cube un-scrambled:");
        System.out.println(printCube);
        System.out.println("Here is the scrambled cube:");
        System.out.println(cube);
    }

//WHITE-CROSS    
    //White Cross (8-20)    
    public static char[] WhiteCross820(char[] cube, char[] cube1) {
        if (cube[7] == cube1[7] && cube[19] == cube1[19]) // case 1 - 8-20 : 8-20
        {
            // do the moves here
        }
        else if (cube[7] == cube1[5] && cube[19] == cube1[28]) // case 2 - 6-29 : 8-20
        {
            R(cube);
            R(cube);
            Dp(cube);
            F(cube);
            F(cube);
            // do the moves here
        } 
        else if (cube[7] == cube1[1] && cube[19] == cube1[52]) // case 3 - 2-53 : 8-20
        {
            B(cube);
            B(cube);
            D(cube);
            D(cube);
            F(cube);
            F(cube);
        }
        else if (cube[7] == cube[3] && cube[19] == cube[10]) // case 4 - 4-11 : 8-20
        {
            L(cube);
            L(cube);
            D(cube);
            L(cube);
            L(cube);
            F(cube);
            F(cube);
        } 
        else if (cube[7] == cube[23] && cube[19] == cube[30]) // case 5 - 24-31 : 8-20
        {
            Rp(cube);
            Dp(cube);
            R(cube);
            F(cube);
            F(cube);
        } 
        else if (cube[7] == cube[25] && cube[19] == cube[37]) // case 6 - 26-38 : 8-20
        {
            R(cube);
            Lp(cube);
            F(cube);
            Rp(cube);
            L(cube);
        } 
        else if (cube[7] == cube[21] && cube[19] == cube[14]) // case 7 - 22-15 : 8-20
        {
            L(cube);
            D(cube);
            Lp(cube);
            F(cube);
            F(cube);
        } 
        else if (cube[7] == cube[41] && cube[19] == cube[34]) // case 8 - 42-35 : 8-20
        {
            Dp(cube);
            F(cube);
            F(cube);
        } 
        else if (cube[7] == cube[43] && cube[19] == cube[46]) // case 9 - 44-47 : 8-20
        {
            D(cube);
            D(cube);
            F(cube);
            F(cube);
        } 
        else if (cube[7] == cube[39] && cube[19] == cube[16]) // case 10 - 40-17 : 8-20
        {
            D(cube);
            F(cube);
            F(cube);
        } else if (cube[7] == cube[50] && cube[19] == cube[32]) // case 11 - 51-33 : 8-20
        {
            R(cube);
            Dp(cube);
            Rp(cube);
            F(cube);
            F(cube);
        } else if (cube[7] == cube[48] && cube[19] == cube[12]) // case 12 - 49-13 : 8-20
        {
            Lp(cube);
            D(cube);
            L(cube);
            F(cube);
            F(cube);
        } else if (cube[7] == cube[19] && cube[19] == cube[7]) // case 13 - 20-8 : 8-20
        {
            F(cube);
            Up(cube);
            R(cube);
            U(cube);
        } else if (cube[7] == cube[28] && cube[19] == cube[5]) // case 14 - 29-6 : 8-20
        {
            Rp(cube);
            Fp(cube);
            R(cube);
        } else if (cube[7] == cube[52] && cube[19] == cube[1]) // case 15 - 53-2 : 8-20
        {
            B(cube);
            Up(cube);
            R(cube);
            U(cube);
        } else if (cube[7] == cube[10] && cube[19] == cube[3]) // case 16 - 11-4 : 8-20
        {
            L(cube);
            F(cube);
            Lp(cube);
        } else if (cube[7] == cube[30] && cube[19] == cube[23]) // case 17 - 31-24 : 8-20
        {
            Fp(cube);
        } else if (cube[7] == cube[37] && cube[19] == cube[25]) // case 18 - 38-26 : 8-20
        {
            F(cube);
            F(cube);
        } else if (cube[7] == cube[14] && cube[19] == cube[21]) // case 19 - 15-22 : 8-20
        {
            F(cube);
        } else if (cube[7] == cube[34] && cube[19] == cube[41]) // case 20 - 35-42 : 8-20
        {
            R(cube);
            Fp(cube);
            Rp(cube);
        } else if (cube[7] == cube[46] && cube[19] == cube[41]) // case 21 - 47-44 : 8-20
        {
            Dp(cube);
            R(cube);
            Fp(cube);
            Rp(cube);
        } else if (cube[7] == cube[16] && cube[19] == cube[39]) // case 22 - 17-40 : 8-20
        {
            Lp(cube);
            F(cube);
            L(cube);
        } else if (cube[7] == cube[32] && cube[19] == cube[50]) // case 23 - 33-51 : 8-20
        {
            R(cube);
            R(cube);
            Fp(cube);
            R(cube);
            R(cube);
        } else if (cube[7] == cube[12] && cube[19] == cube[48]) // case 24 - 13-49 : 8-20
        {
            L(cube);
            L(cube);
            F(cube);
            L(cube);
            L(cube);
        }
        return (cube);
    }

    //White Cross (4-11)
    public static char[] WhiteCross411(char[] cube) {
        if (cube[3] == cube[3] && cube[10] == cube[10]) // case 1 - 4-11 : 4-11
        {
            // do the moves here
        } 
        else if (cube[3] == cube[7] && cube[10] == cube[19]) // case 2 - 8-20 : 4-11
        {
            F(cube);
            F(cube);
            Dp(cube);
            L(cube);
            L(cube);
            // do the moves here
        } else if (cube[3] == cube[5] && cube[10] == cube[28]) // case 2 - 6-29 : 4-11
        {
            R(cube);
            R(cube);
            Dp(cube);
            F(cube);
            F(cube);
            // do the moves here
        } else if (cube[3] == cube[1] && cube[10] == cube[52]) // case 3 - 2-53 : 4-11
        {
            B(cube);
            B(cube);
            D(cube);
            L(cube);
            L(cube);
            // do the moves here
        } else if (cube[3] == cube[23] && cube[10] == cube[30]) // case 4 - 24-31 : 4-11
        {
            F(cube);
            F(cube);
            Lp(cube);
            F(cube);
            F(cube);
            // do the moves here
        } else if (cube[3] == cube[25] && cube[10] == cube[37]) // case 5 - 26-38 : 4-11
        {
            F(cube);
            Lp(cube);
            Fp(cube);
            // do the moves here
        } else if (cube[3] == cube[21] && cube[10] == cube[14]) // case 6 - 22-15 : 4-11
        {
            Lp(cube);
            // do the moves here
        } else if (cube[3] == cube[41] && cube[10] == cube[34]) // case 7 - 42-35 : 4-11
        {
            F(cube);
            F(cube);
            L(cube);
            L(cube);
            // do the moves here
        } else if (cube[3] == cube[43] && cube[10] == cube[46]) // case 8 - 44-47 : 4-11
        {
            F(cube);
            L(cube);
            L(cube);
            // do the moves here
        } else if (cube[3] == cube[39] && cube[10] == cube[16]) // case 9 - 40-17 : 4-11
        {
            L(cube);
            L(cube);
            // do the moves here
        } else if (cube[3] == cube[50] && cube[10] == cube[32]) // case 10 - 51-33 : 4-11
        {
            R(cube);
            D(cube);
            D(cube);
            Rp(cube);
            L(cube);
            L(cube);
            // do the moves here
        } else if (cube[3] == cube[48] && cube[10] == cube[12]) // case 11 - 49-13 : 4-11
        {
            L(cube);
            // do the moves here
        } else if (cube[3] == cube[19] && cube[10] == cube[7]) // case 12 - 20-8 : 4-11
        {
            Fp(cube);
            Lp(cube);
            F(cube);
            // do the moves here
        } else if (cube[3] == cube[28] && cube[10] == cube[5]) // case 13 - 29-6 : 4-11
        {
            Rp(cube);
            Up(cube);
            Fp(cube);
            U(cube);
            R(cube);
            // do the moves here
        } else if (cube[3] == cube[52] && cube[10] == cube[1]) // case 14 - 53-2 : 4-11
        {
            Bp(cube);
            L(cube);
            B(cube);
            // do the moves here
        } else if (cube[3] == cube[10] && cube[10] == cube[3]) // case 15 - 11-4 : 4-11
        {
            L(cube);
            Up(cube);
            F(cube);
            U(cube);
            // do the moves here
        } else if (cube[3] == cube[30] && cube[10] == cube[23]) // case 16 - 31-24 : 4-11
        {
            F(cube);
            Dp(cube);
            L(cube);
            L(cube);
            Fp(cube);
            // do the moves here
        } else if (cube[3] == cube[37] && cube[10] == cube[25]) // case 17 - 38-26 : 4-11
        {
            Dp(cube);
            L(cube);
            L(cube);
            // do the moves here
        } else if (cube[3] == cube[14] && cube[10] == cube[21]) // case 18 - 15-22 : 4-11
        {
            Up(cube);
            F(cube);
            U(cube);
            Fp(cube);
            // do the moves here
        } else if (cube[3] == cube[34] && cube[10] == cube[41]) // case 19 - 35-42 : 4-11
        {
            Dp(cube);
            L(cube);
            F(cube);
            Lp(cube);
            // do the moves here
        } else if (cube[3] == cube[46] && cube[10] == cube[43]) // case 20 - 47-44 : 4-11
        {
            B(cube);
            L(cube);
            Bp(cube);
            // do the moves here
        } else if (cube[3] == cube[16] && cube[10] == cube[39]) // case 21 - 17-40 : 4-11
        {
            Lp(cube);
            Up(cube);
            F(cube);
            F(cube);
            U(cube);
            // do the moves here
        } else if (cube[3] == cube[32] && cube[10] == cube[50]) // case 22 - 33-51 : 4-11
        {
            U(cube);
            Bp(cube);
            Up(cube);
            // do the moves here
        } else if (cube[3] == cube[12] && cube[10] == cube[48]) // case 23 - 13-49 : 4-11
        {
            U(cube);
            B(cube);
            Up(cube);
            // do the moves here
        }
        return (cube);
    }

    //White Cross (2-53)
    public static char[] WhiteCross253(char[] cube) {
        if (cube[] == cube[] && cube[] == cube[]) // case 1 - - : -
        {
            // do the moves here
        } else if (cube[] == cube[] && cube[] == cube[]) // case 2 - - : -
        {
            (cube);
            (cube);
            (cube);
            (cube);
            (cube);
            // do the moves here
        }
        return (cube);
    }

    //White Cross (6-29)
    public static char[] WhiteCross629(char[] cube) {
        if (cube[] == cube[] && cube[] == cube[]) // case 1 - - : -
        {
            // do the moves here
        } else if (cube[] == cube[] && cube[] == cube[]) // case 2 - - : -
        {
            (cube);
            (cube);
            (cube);
            (cube);
            (cube);
            // do the moves here
        }
        return (cube);
    }

//F2L
    public static char[] F2L(char[] cube){
        
    }
    
//OLL

    
//PLL 
    
    
    
    public static char[] AdjacentEdgeSwap(char[] cube) {
        // Rp L Fp R2 L2 Bp R2 L2 Fp Rp L D2 R2 L2 U
        cube = Rp(cube);
        cube = L(cube);
        cube = Fp(cube);
        cube = R(cube);
        cube = R(cube);
        cube = L(cube);
        cube = L(cube);
        cube = Bp(cube);
        cube = R(cube);
        cube = R(cube);
        cube = L(cube);
        cube = L(cube);
        cube = Fp(cube);
        cube = Rp(cube);
        cube = L(cube);
        cube = D(cube);
        cube = D(cube);
        cube = R(cube);
        cube = R(cube);
        cube = L(cube);
        cube = L(cube);
        cube = U(cube);

        return cube;
    }

    public static char[] Turns(char[] cube) {
        cube = Fp(cube);
        cube = R(cube);
        cube = Up(cube);
        cube = L(cube);
        cube = D(cube);
        cube = Bp(cube);
        cube = Rp(cube);
        cube = U(cube);

        return cube;
    }

    // U
    public static char[] U(char[] cube) {
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
    public static char[] Up(char[] cube) {
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
    public static char[] R(char[] cube) {
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

        // spot number 3 is changing to be the Farbe in spot 21
        cube[2] = cube20;

        // spot number 6 is changing to be the Farbe in spot 24
        cube[5] = cube23;

        // spot number 9 is changing to be the Farbe in spot 27
        cube[8] = cube26;

        // spot number 21 is changing to be the Farbe in spot 39
        cube[20] = cube38;

        // spot number 24 is changing to be the Farbe in spot 42
        cube[23] = cube41;

        // spot number 27 is changing to be the Farbe in spot 45
        cube[26] = cube44;

        // spot number 39 is changing to be the Farbe in spot 48
        cube[38] = cube47;

        // spot number 42 is changing to be the Farbe in spot 51
        cube[41] = cube50;

        // spot number 45 is changing to be the Farbe in spot 54
        cube[44] = cube53;

        // spot number 48 is changing to be the Farbe in spot 3
        cube[47] = cube2;

        // spot number 51 is changing to be the Farbe in spot 6
        cube[50] = cube5;

        // spot number 54 is changing to be the Farbe in spot 9
        cube[53] = cube8;

        // spot number 28 is changing to be the Farbe in spot 30
        cube[27] = cube33;

        // spot number 29 is changing to be the Farbe in spot 33
        cube[28] = cube30;

        // spot number 30 is changing to be the Farbe in spot 36
        cube[29] = cube27;

        // spot number 31 is changing to be the Farbe in spot 29
        cube[30] = cube34;

        // spot number 33 is changing to be the Farbe in spot 35
        cube[32] = cube28;

        // spot number 34 is changing to be the Farbe in spot 28
        cube[33] = cube35;

        // spot number 35 is changing to be the Farbe in spot 31
        cube[34] = cube32;

        // spot number 36 is changing to be the Farbe in spot 34
        cube[35] = cube29;

        // return the new array with the correct spots
        return cube;
    }

    // R'
    public static char[] Rp(char[] cube) {
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

        // spot number 3 is changing to be the Farbe in spot 48
        cube[2] = cube47;

        // spot number 6 is changing to be the Farbe in spot 51
        cube[5] = cube50;

        // spot number 9 is changing to be the Farbe in spot 54
        cube[8] = cube53;

        // spot number 21 is changing to be the Farbe in spot 3
        cube[20] = cube2;

        // spot number 24 is changing to be the Farbe in spot 6
        cube[23] = cube5;

        // spot number 27 is changing to be the Farbe in spot 9
        cube[26] = cube8;

        // spot number 39 is changing to be the Farbe in spot 21
        cube[38] = cube20;

        // spot number 42 is changing to be the Farbe in spot 24
        cube[41] = cube23;

        // spot number 45 is changing to be the Farbe in spot 27
        cube[44] = cube26;

        // spot number 48 is changing to be the Farbe in spot 39
        cube[47] = cube38;

        // spot number 51 is changing to be the Farbe in spot 42
        cube[50] = cube41;

        // spot number 54 is changing to be the Farbe in spot 45
        cube[53] = cube44;

        // spot number 28 is changing to be the Farbe in spot 34
        cube[27] = cube29;

        // spot number 29 is changing to be the Farbe in spot 31
        cube[28] = cube32;

        // spot number 30 is changing to be the Farbe in spot 28
        cube[29] = cube35;

        // spot number 31 is changing to be the Farbe in spot 35
        cube[30] = cube28;

        // spot number 33 is changing to be the Farbe in spot 29
        cube[32] = cube34;

        // spot number 34 is changing to be the Farbe in spot 36
        cube[33] = cube27;

        // spot number 35 is changing to be the Farbe in spot 33
        cube[34] = cube30;

        // spot number 36 is changing to be the Farbe in spot 30 
        cube[35] = cube33;

        // return the new array with the correct spots
        return cube;
    }

    // L
    public static char[] L(char[] cube) {
        // change the letters to be in the right spots
        char cube9 = cube[9];
        char cube10 = cube[10];
        char cube11 = cube[11];
        char cube12 = cube[12];
        char cube14 = cube[14];
        char cube15 = cube[15];
        char cube16 = cube[16];
        char cube17 = cube[17];
        char cube0 = cube[0];
        char cube3 = cube[3];
        char cube6 = cube[6];
        char cube18 = cube[18];
        char cube21 = cube[21];
        char cube24 = cube[24];
        char cube36 = cube[36];
        char cube39 = cube[39];
        char cube42 = cube[42];
        char cube45 = cube[45];
        char cube48 = cube[48];
        char cube51 = cube[51];

        // spot number 19 is changing to be the Farbe in spot 1
        cube[18] = cube0;

        // spot number 22 is changing to be the Farbe in spot 4
        cube[21] = cube3;

        // spot number 25 is changing to be the Farbe in spot 7
        cube[24] = cube6;

        // spot number 37 is changing to be the Farbe in spot 25
        cube[36] = cube18;

        // spot number 40 is changing to be the Farbe in spot 22
        cube[39] = cube21;

        // spot number 43 is changing to be the Farbe in spot 19
        cube[42] = cube24;

        // spot number 22 is changing to be the Farbe in spot 26
        cube[45] = cube36;

        // spot number 24 is changing to be the Farbe in spot 20
        cube[48] = cube39;

        // spot number 25 is changing to be the Farbe in spot 27 hier
        cube[51] = cube42;

        // spot number 26 is changing to be the Farbe in spot 24
        cube[0] = cube45;

        // spot number 27 is changing to be the Farbe in spot 21
        cube[3] = cube48;

        // spot number 12 is changing to be the Farbe in spot 37
        cube[6] = cube51;

        // spot number 15 is changing to be the Farbe in spot 38
        cube[9] = cube15;

        // spot number 37 is changing to be the Farbe in spot 34
        cube[10] = cube12;

        // spot number 34 is changing to be the Farbe in spot 9 
        cube[11] = cube9;

        // spot number 38 is changing to be the Farbe in spot 31
        cube[12] = cube16;

        // spot number 39 is changing to be the Farbe in spot 28
        cube[14] = cube10;

        // spot number 28 is changing to be the Farbe in spot 7
        cube[15] = cube17;

        // spot number 31 is changing to be the Farbe in spot 8
        cube[16] = cube14;

        // spot number 34 is changing to be the Farbe in spot 9 
        cube[17] = cube11;

        // return the new array with the correct spots
        return cube;
    }

    // L'
    public static char[] Lp(char[] cube) {
        // change the letters to be in the right spots
        char cube9 = cube[9];
        char cube10 = cube[10];
        char cube11 = cube[11];
        char cube12 = cube[12];
        char cube14 = cube[14];
        char cube15 = cube[15];
        char cube16 = cube[16];
        char cube17 = cube[17];
        char cube0 = cube[0];
        char cube3 = cube[3];
        char cube6 = cube[6];
        char cube18 = cube[18];
        char cube21 = cube[21];
        char cube24 = cube[24];
        char cube36 = cube[36];
        char cube39 = cube[39];
        char cube42 = cube[42];
        char cube45 = cube[45];
        char cube48 = cube[48];
        char cube51 = cube[51];

        // spot number 1 is changing to be the Farbe in spot 19
        cube[0] = cube18;

        // spot number 4 is changing to be the Farbe in spot 22
        cube[3] = cube21;

        // spot number 7 is changing to be the Farbe in spot 25
        cube[6] = cube24;

        // spot number 19 is changing to be the Farbe in spot 37
        cube[18] = cube36;

        // spot number 22 is changing to be the Farbe in spot 40
        cube[21] = cube39;

        // spot number 25 is changing to be the Farbe in spot 43
        cube[24] = cube42;

        // spot number 37 is changing to be the Farbe in spot 46
        cube[36] = cube45;

        // spot number 40 is changing to be the Farbe in spot 49
        cube[39] = cube48;

        // spot number 43 is changing to be the Farbe in spot 52
        cube[42] = cube51;

        // spot number 46 is changing to be the Farbe in spot 1
        cube[45] = cube0;

        // spot number 49 is changing to be the Farbe in spot 4
        cube[48] = cube3;

        // spot number 52 is changing to be the Farbe in spot 7
        cube[51] = cube6;

        // spot number 10 is changing to be the Farbe in spot 12
        cube[9] = cube11;

        // spot number 11 is changing to be the Farbe in spot 15
        cube[10] = cube14;

        // spot number 12 is changing to be the Farbe in spot 18
        cube[11] = cube17;

        // spot number 15 is changing to be the Farbe in spot 17
        cube[14] = cube16;

        // spot number 18 is changing to be the Farbe in spot 16
        cube[17] = cube15;

        // spot number 17 is changing to be the Farbe in spot 13
        cube[16] = cube12;

        // spot number 16 is changing to be the Farbe in spot 10
        cube[15] = cube9;

        // spot number 13 is changing to be the Farbe in spot 11
        cube[12] = cube10;

        // return the new array with the correct spots
        return cube;
    }

    // D
    public static char[] D(char[] cube) {
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

        // spot number 16 is changing to be the Farbe in spot 48
        cube[15] = cube47;

        // spot number 17 is changing to be the Farbe in spot 47
        cube[16] = cube46;

        // spot number 18 is changing to be the Farbe in spot 46
        cube[17] = cube45;

        // spot number 25 is changing to be the Farbe in spot 16
        cube[24] = cube15;

        // spot number 26 is changing to be the Farbe in spot 17
        cube[25] = cube16;

        // spot number 27 is changing to be the Farbe in spot 18
        cube[26] = cube17;

        // spot number 34 is changing to be the Farbe in spot 25
        cube[33] = cube24;

        // spot number 35 is changing to be the Farbe in spot 26
        cube[34] = cube25;

        // spot number 36 is changing to be the Farbe in spot 27
        cube[35] = cube26;

        // spot number 46 is changing to be the Farbe in spot 34
        cube[45] = cube33;

        // spot number 47 is changing to be the Farbe in spot 35
        cube[46] = cube34;

        // spot number 48 is changing to be the Farbe in spot 36
        cube[47] = cube35;

        // spot number 37 is changing to be the Farbe in spot 43
        cube[36] = cube42;

        // spot number 38 is changing to be the Farbe in spot 40
        cube[37] = cube39;

        // spot number 39 is changing to be the Farbe in spot 37
        cube[38] = cube36;

        // spot number 40 is changing to be the Farbe in spot 44
        cube[39] = cube43;

        // spot number 42 is changing to be the Farbe in spot 38
        cube[41] = cube37;

        // spot number 43 is changing to be the Farbe in spot 45
        cube[42] = cube44;

        // spot number 44 is changing to be the Farbe in spot 42
        cube[43] = cube41;

        // spot number 45 is changing to be the Farbe in spot 39
        cube[44] = cube38;

        // return the new array with the correct spots
        return cube;
    }

    // D'
    public static char[] Dp(char[] cube) {
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

        // spot number 16 is changing to be the Farbe in spot 25
        cube[15] = cube24;

        // spot number 17 is changing to be the Farbe in spot 26
        cube[16] = cube25;

        // spot number 18 is changing to be the Farbe in spot 27
        cube[17] = cube26;

        // spot number 25 is changing to be the Farbe in spot 34
        cube[24] = cube33;

        // spot number 26 is changing to be the Farbe in spot 35
        cube[25] = cube34;

        // spot number 27 is changing to be the Farbe in spot 36
        cube[26] = cube35;

        // spot number 34 is changing to be the Farbe in spot 48
        cube[33] = cube47;

        // spot number 35 is changing to be the Farbe in spot 47
        cube[34] = cube46;

        // spot number 36 is changing to be the Farbe in spot 46
        cube[35] = cube45;

        // spot number 46 is changing to be the Farbe in spot 16
        cube[45] = cube15;

        // spot number 47 is changing to be the Farbe in spot 17
        cube[46] = cube16;

        // spot number 48 is changing to be the Farbe in spot 18
        cube[47] = cube17;

        // spot number 37 is changing to be the Farbe in spot 39
        cube[36] = cube38;

        // spot number 38 is changing to be the Farbe in spot 42
        cube[37] = cube41;

        // spot number 39 is changing to be the Farbe in spot 45
        cube[38] = cube44;

        // spot number 40 is changing to be the Farbe in spot 38
        cube[39] = cube37;

        // spot number 42 is changing to be the Farbe in spot 44
        cube[41] = cube43;

        // spot number 43 is changing to be the Farbe in spot 37
        cube[42] = cube36;

        // spot number 44 is changing to be the Farbe in spot 40
        cube[43] = cube39;

        // spot number 45 is changing to be the Farbe in spot 43
        cube[44] = cube42;

        // return the new array with the correct spots
        return cube;
    }

    // F
    public static char[] F(char[] cube) {
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

    // F'
    public static char[] Fp(char[] cube) {
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
        cube[37] = cube14;

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
    public static char[] B(char[] cube) {
        // change the letters to be in the right spots
        char cube0 = cube[0];
        char cube1 = cube[1];
        char cube2 = cube[2];
        char cube9 = cube[9];
        char cube12 = cube[12];
        char cube15 = cube[15];
        char cube29 = cube[29];
        char cube32 = cube[32];
        char cube35 = cube[35];
        char cube42 = cube[42];
        char cube43 = cube[43];
        char cube44 = cube[44];
        char cube45 = cube[45];
        char cube46 = cube[46];
        char cube47 = cube[47];
        char cube48 = cube[48];
        char cube50 = cube[50];
        char cube51 = cube[51];
        char cube52 = cube[52];
        char cube53 = cube[53];

        // spot number 1 is changing to be the Farbe in spot 30
        cube[0] = cube29;

        // spot number 2 is changing to be the Farbe in spot 33
        cube[1] = cube32;

        // spot number 3 is changing to be the Farbe in spot 36
        cube[2] = cube35;

        // spot number 10 is changing to be the Farbe in spot 3
        cube[9] = cube2;

        // spot number 11 is changing to be the Farbe in spot 2
        cube[12] = cube1;

        // spot number 12 is changing to be the Farbe in spot 1
        cube[15] = cube0;

        // spot number 30 is changing to be the Farbe in spot 45
        cube[29] = cube44;

        // spot number 33 is changing to be the Farbe in spot 44
        cube[32] = cube43;

        // spot number 36 is changing to be the Farbe in spot 43
        cube[35] = cube42;

        // spot number 43 is changing to be the Farbe in spot 10
        cube[42] = cube9;

        // spot number 44 is changing to be the Farbe in spot 13
        cube[43] = cube12;

        // spot number 45 is changing to be the Farbe in spot 16
        cube[44] = cube15;

        // spot number 46 is changing to be the Farbe in spot 48
        cube[45] = cube47;

        // spot number 47 is changing to be the Farbe in spot 51
        cube[46] = cube50;

        // spot number 48 is changing to be the Farbe in spot 54
        cube[47] = cube53;

        // spot number 49 is changing to be the Farbe in spot 47
        cube[48] = cube46;

        // spot number 51 is changing to be the Farbe in spot 53
        cube[50] = cube52;

        // spot number 52 is changing to be the Farbe in spot 46
        cube[51] = cube45;

        // spot number 53 is changing to be the Farbe in spot 49
        cube[52] = cube48;

        // spot number 54 is changing to be the Farbe in spot 52
        cube[53] = cube51;

        // return the new array with the correct spots
        return cube;
    }

    // B'
    public static char[] Bp(char[] cube) {
        // change the letters to be in the right spots
        char cube0 = cube[0];
        char cube1 = cube[1];
        char cube2 = cube[2];
        char cube9 = cube[9];
        char cube12 = cube[12];
        char cube15 = cube[15];
        char cube29 = cube[29];
        char cube32 = cube[32];
        char cube35 = cube[35];
        char cube42 = cube[42];
        char cube43 = cube[43];
        char cube44 = cube[44];
        char cube45 = cube[45];
        char cube46 = cube[46];
        char cube47 = cube[47];
        char cube48 = cube[48];
        char cube50 = cube[50];
        char cube51 = cube[51];
        char cube52 = cube[52];
        char cube53 = cube[53];

        // spot number 1 is changing to be the Farbe in spot 16
        cube[0] = cube15;

        // spot number 2 is changing to be the Farbe in spot 13
        cube[1] = cube12;

        // spot number 3 is changing to be the Farbe in spot 10
        cube[2] = cube9;

        // spot number 10 is changing to be the Farbe in spot 43
        cube[9] = cube42;

        // spot number 13 is changing to be the Farbe in spot 44
        cube[12] = cube43;

        // spot number 16 is changing to be the Farbe in spot 45
        cube[15] = cube44;

        // spot number 30 is changing to be the Farbe in spot 1
        cube[29] = cube0;

        // spot number 33 is changing to be the Farbe in spot 2
        cube[32] = cube1;

        // spot number 36 is changing to be the Farbe in spot 3
        cube[35] = cube2;

        // spot number 43 is changing to be the Farbe in spot 30
        cube[42] = cube29;

        // spot number 44 is changing to be the Farbe in spot 33
        cube[43] = cube32;

        // spot number 45 is changing to be the Farbe in spot 36
        cube[44] = cube35;

        // spot number 46 is changing to be the Farbe in spot 52
        cube[45] = cube51;

        // spot number 47 is changing to be the Farbe in spot 49
        cube[46] = cube48;

        // spot number 48 is changing to be the Farbe in spot 46
        cube[47] = cube45;

        // spot number 49 is changing to be the Farbe in spot 53
        cube[48] = cube52;

        // spot number 51 is changing to be the Farbe in spot 47
        cube[50] = cube46;

        // spot number 52 is changing to be the Farbe in spot 54
        cube[51] = cube53;

        // spot number 53 is changing to be the Farbe in spot 51
        cube[52] = cube50;

        // spot number 54 is changing to be the Farbe in spot 48
        cube[53] = cube47;

        // return the new array with the correct spots
        return cube;
    }
}
