/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rubikscubesolver;

import java.util.Scanner;

/*
 * @author Daniel, Johannes, Oemer
 */
public class RubiksCube {

    // arrays start counting from zero
    // so, char[] cube: cube[0] is spot number 1,
    // cube[5] is spot number 6
    // test code right here
    public static void main(String[] arguments) {
        char[] cube = {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W',
            'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O',
            'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G',
            'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R',
            'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y',
            'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B',};

        char[] solved = {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W',
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

            if (user_color == 'W' && w_counter < MAX_COLOR) {
                System.out.println("Value has been set");
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

        System.out.println("Here is the scrambled cube:");
        System.out.println(cube);
        
    }

//WHITE-CROSS    
    //White Cross (8-20)    
    public static char[] WhiteCross820(char[] cube, char[] solved) {
        if (cube[7] == solved[7] && cube[19] == solved[19]) // case 1 - 8-20 : 8-20
        {
            // do the moves here
        } else if (cube[7] == solved[5] && cube[19] == solved[28]) // case 2 - 6-29 : 8-20
        {
            cube = R(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = F(cube);
            // do the moves here
        } else if (cube[7] == solved[1] && cube[19] == solved[52]) // case 3 - 2-53 : 8-20
        {
            cube = B(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[7] == solved[3] && cube[19] == solved[10]) // case 4 - 4-11 : 8-20
        {
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[7] == solved[23] && cube[19] == solved[30]) // case 5 - 24-31 : 8-20
        {
            cube = Rp(cube);
            cube = Dp(cube);
            cube = R(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[7] == solved[25] && cube[19] == solved[37]) // case 6 - 26-38 : 8-20
        {
            cube = R(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = Rp(cube);
            cube = L(cube);
        } else if (cube[7] == solved[21] && cube[19] == solved[14]) // case 7 - 22-15 : 8-20
        {
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[7] == solved[41] && cube[19] == solved[34]) // case 8 - 42-35 : 8-20
        {
            cube = Dp(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[7] == solved[43] && cube[19] == solved[46]) // case 9 - 44-47 : 8-20
        {
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[7] == solved[39] && cube[19] == solved[16]) // case 10 - 40-17 : 8-20
        {
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[7] == solved[50] && cube[19] == solved[32]) // case 11 - 51-33 : 8-20
        {
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[7] == solved[48] && cube[19] == solved[12]) // case 12 - 49-13 : 8-20
        {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[7] == solved[19] && cube[19] == solved[7]) // case 13 - 20-8 : 8-20
        {
            cube = F(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = U(cube);
        } else if (cube[7] == solved[28] && cube[19] == solved[5]) // case 14 - 29-6 : 8-20
        {
            cube = Rp(cube);
            cube = Fp(cube);
            cube = R(cube);
        } else if (cube[7] == solved[52] && cube[19] == solved[1]) // case 15 - 53-2 : 8-20
        {
            cube = B(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = U(cube);
        } else if (cube[7] == solved[10] && cube[19] == solved[3]) // case 16 - 11-4 : 8-20
        {
            cube = L(cube);
            cube = F(cube);
            cube = Lp(cube);
        } else if (cube[7] == solved[30] && cube[19] == solved[23]) // case 17 - 31-24 : 8-20
        {
            cube = Fp(cube);
        } else if (cube[7] == solved[37] && cube[19] == solved[25]) // case 18 - 38-26 : 8-20
        {
            cube = F(cube);
            cube = F(cube);
        } else if (cube[7] == solved[14] && cube[19] == solved[21]) // case 19 - 15-22 : 8-20
        {
            cube = F(cube);
        } else if (cube[7] == solved[34] && cube[19] == solved[41]) // case 20 - 35-42 : 8-20
        {
            cube = R(cube);
            cube = Fp(cube);
            cube = Rp(cube);
        } else if (cube[7] == solved[46] && cube[19] == solved[41]) // case 21 - 47-44 : 8-20
        {
            cube = Dp(cube);
            cube = R(cube);
            cube = Fp(cube);
            cube = Rp(cube);
        } else if (cube[7] == solved[16] && cube[19] == solved[39]) // case 22 - 17-40 : 8-20
        {
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
        } else if (cube[7] == solved[32] && cube[19] == solved[50]) // case 23 - 33-51 : 8-20
        {
            cube = R(cube);
            cube = R(cube);
            cube = Fp(cube);
            cube = R(cube);
            cube = R(cube);
        } else if (cube[7] == solved[12] && cube[19] == solved[48]) // case 24 - 13-49 : 8-20
        {
            cube = L(cube);
            cube = L(cube);
            cube = F(cube);
            cube = L(cube);
            cube = L(cube);
        }
        System.out.print("a");
        return (cube);
    }

    //White Cross (4-11)
    public static char[] WhiteCross411(char[] cube, char[] solved) {
        if (cube[3] == solved[3] && cube[10] == solved[10]) // case 1 - 4-11 : 4-11
        {
            // do the moves here
        } else if (cube[3] == solved[7] && cube[10] == solved[19]) // case 2 - 8-20 : 4-11
        {
            cube = F(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (cube[3] == solved[5] && cube[10] == solved[28]) // case 2 - 6-29 : 4-11
        {
            cube = R(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = F(cube);
            // do the moves here
        } else if (cube[3] == solved[1] && cube[10] == solved[52]) // case 3 - 2-53 : 4-11
        {
            cube = B(cube);
            cube = B(cube);
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (cube[3] == solved[23] && cube[10] == solved[30]) // case 4 - 24-31 : 4-11
        {
            cube = F(cube);
            cube = F(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = F(cube);
            // do the moves here
        } else if (cube[3] == solved[25] && cube[10] == solved[37]) // case 5 - 26-38 : 4-11
        {
            cube = F(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            // do the moves here
        } else if (cube[3] == solved[21] && cube[10] == solved[14]) // case 6 - 22-15 : 4-11
        {
            cube = Lp(cube);
            // do the moves here
        } else if (cube[3] == solved[41] && cube[10] == solved[34]) // case 7 - 42-35 : 4-11
        {
            cube = F(cube);
            cube = F(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (cube[3] == solved[43] && cube[10] == solved[46]) // case 8 - 44-47 : 4-11
        {
            cube = F(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (cube[3] == solved[39] && cube[10] == solved[16]) // case 9 - 40-17 : 4-11
        {
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (cube[3] == solved[50] && cube[10] == solved[32]) // case 10 - 51-33 : 4-11
        {
            cube = R(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Rp(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (cube[3] == solved[48] && cube[10] == solved[12]) // case 11 - 49-13 : 4-11
        {
            cube = L(cube);
            // do the moves here
        } else if (cube[3] == solved[19] && cube[10] == solved[7]) // case 12 - 20-8 : 4-11
        {
            cube = Fp(cube);
            cube = Lp(cube);
            cube = F(cube);
            // do the moves here
        } else if (cube[3] == solved[28] && cube[10] == solved[5]) // case 13 - 29-6 : 4-11
        {
            cube = Rp(cube);
            cube = Up(cube);
            cube = Fp(cube);
            cube = U(cube);
            cube = R(cube);
            // do the moves here
        } else if (cube[3] == solved[52] && cube[10] == solved[1]) // case 14 - 53-2 : 4-11
        {
            cube = Bp(cube);
            cube = L(cube);
            cube = B(cube);
            // do the moves here
        } else if (cube[3] == solved[10] && cube[10] == solved[3]) // case 15 - 11-4 : 4-11
        {
            cube = L(cube);
            cube = Up(cube);
            cube = F(cube);
            cube = U(cube);
            // do the moves here
        } else if (cube[3] == solved[30] && cube[10] == solved[23]) // case 16 - 31-24 : 4-11
        {
            cube = F(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            cube = Fp(cube);
            // do the moves here
        } else if (cube[3] == solved[37] && cube[10] == solved[25]) // case 17 - 38-26 : 4-11
        {
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (cube[3] == solved[14] && cube[10] == solved[21]) // case 18 - 15-22 : 4-11
        {
            cube = Up(cube);
            cube = F(cube);
            cube = U(cube);
            cube = Fp(cube);
            // do the moves here
        } else if (cube[3] == solved[34] && cube[10] == solved[41]) // case 19 - 35-42 : 4-11
        {
            cube = Dp(cube);
            cube = L(cube);
            cube = F(cube);
            cube = Lp(cube);
            // do the moves here
        } else if (cube[3] == solved[46] && cube[10] == solved[43]) // case 20 - 47-44 : 4-11
        {
            cube = B(cube);
            cube = L(cube);
            cube = Bp(cube);
            // do the moves here
        } else if (cube[3] == solved[16] && cube[10] == solved[39]) // case 21 - 17-40 : 4-11
        {
            cube = Lp(cube);
            cube = Up(cube);
            cube = F(cube);
            cube = F(cube);
            cube = U(cube);
            // do the moves here
        } else if (cube[3] == solved[32] && cube[10] == solved[50]) // case 22 - 33-51 : 4-11
        {
            cube = U(cube);
            cube = Bp(cube);
            cube = Up(cube);
            // do the moves here
        } else if (cube[3] == solved[12] && cube[10] == solved[48]) // case 23 - 13-49 : 4-11
        {
            cube = U(cube);
            cube = B(cube);
            cube = Up(cube);
            // do the moves here
        }
        return (cube);
    }

    //White Cross (2-53)
    public static char[] WhiteCross253(char[] cube, char[] solved) {

        if (cube[1] == solved[7] && cube[52] == solved[19]) // case 49 - 8-20 : 2-53
        {
            cube = F(cube);
            cube = F(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (cube[1] == solved[5] && cube[52] == solved[28]) // case 50 - 6-29 : 2-53
        {
            cube = R(cube);
            cube = R(cube);
            cube = D(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (cube[1] == solved[1] && cube[52] == solved[52]) // case 51 - 2-53 : 2-53
        {
            //- 
        } else if (cube[1] == solved[3] && cube[52] == solved[10]) // case 52 - 4-11 : 2-53
        {
            cube = L(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (cube[1] == solved[23] && cube[52] == solved[30]) // case 53 - 24-31 : 2-53
        {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (cube[1] == solved[25] && cube[52] == solved[37]) // case 54 - 26-38 : 2-53
        {
            cube = D(cube);
            cube = Rp(cube);
            cube = B(cube);
            cube = R(cube);
        } else if (cube[1] == solved[21] && cube[52] == solved[14]) // case 55 - 22-15 : 2-53
        {
            cube = Up(cube);
            cube = Lp(cube);
            cube = U(cube);
        } else if (cube[1] == solved[41] && cube[52] == solved[34]) // case 56 - 42-35 : 2-53
        {
            cube = D(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (cube[1] == solved[43] && cube[52] == solved[46]) // case 57 - 44-47 : 2-53
        {
            cube = B(cube);
            cube = B(cube);
        } else if (cube[1] == solved[39] && cube[52] == solved[16]) // case 58 - 40-17 : 2-53
        {
            cube = Dp(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (cube[1] == solved[50] && cube[52] == solved[32]) // case 59 - 51-33 : 2-53
        {
            cube = Up(cube);
            cube = Rp(cube);
            cube = U(cube);
        } else if (cube[1] == solved[48] && cube[52] == solved[12]) // case 60 - 49-13 : 2-53
        {
            cube = Up(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[1] == solved[19] && cube[52] == solved[7]) // case 61 - 20-8 : 2-53
        {
            cube = F(cube);
            cube = U(cube);
            cube = R(cube);
            cube = Up(cube);
        } else if (cube[1] == solved[28] && cube[52] == solved[5]) // case 62 - 29-6 : 2-53
        {
            cube = R(cube);
            cube = B(cube);
        } else if (cube[1] == solved[52] && cube[52] == solved[1]) // case 63 - 53-2 : 2-53
        {
            cube = Bp(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = U(cube);
        } else if (cube[1] == solved[10] && cube[52] == solved[3]) // case 64 - 11-4 : 2-53
        {
            cube = Lp(cube);
            cube = Bp(cube);
        } else if (cube[1] == solved[30] && cube[52] == solved[23]) // case 65 - 31-24 : 2-53
        {
            cube = U(cube);
            cube = U(cube);
            cube = Fp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[1] == solved[37] && cube[52] == solved[25]) // case 66 - 38-26 : 2-53
        {
            cube = U(cube);
            cube = U(cube);
            cube = F(cube);
            cube = F(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[1] == solved[14] && cube[52] == solved[21]) // case 67 - 15-22 : 2-53
        {
            cube = U(cube);
            cube = U(cube);
            cube = F(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[1] == solved[34] && cube[52] == solved[41]) // case 68 - 35-42 : 2-53
        {
            cube = Rp(cube);
            cube = B(cube);
            cube = R(cube);
        } else if (cube[1] == solved[46] && cube[52] == solved[41]) // case 69 - 47-44 : 2-53
        {
            cube = B(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
        } else if (cube[1] == solved[16] && cube[52] == solved[39]) // case 70 - 17-40 : 2-53
        {
            cube = U(cube);
            cube = L(cube);
            cube = Up(cube);
            cube = Bp(cube);
        } else if (cube[1] == solved[32] && cube[52] == solved[50]) // case 71 - 33-51 : 2-53
        {
            cube = B(cube);
        } else if (cube[1] == solved[12] && cube[52] == solved[48]) // case 72 - 13-49 : 2-53
        {
            cube = Bp(cube);
        }

        return (cube);
    }

    //White Cross (6-29)
    public static char[] WhiteCross629(char[] cube, char[] solved) {

        if (cube[5] == solved[7] && cube[28] == solved[19]) // case 73 - 8-20 : 6-29
        {
            cube = Up(cube);
            cube = Rp(cube);
            cube = U(cube);
            cube = R(cube);
        } else if (cube[5] == solved[5] && cube[28] == solved[28]) // case 74 - 6-29 : 6-29
        {
            //-
        } else if (cube[5] == solved[1] && cube[28] == solved[52]) // case 75 - 2-53 : 6-29
        {
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
            cube = R(cube);
        } else if (cube[5] == solved[3] && cube[28] == solved[10]) // case 76 - 4-11 : 6-29
        {
            cube = U(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = U(cube);
            cube = U(cube);
            cube = R(cube);
        } else if (cube[5] == solved[23] && cube[28] == solved[30]) // case 77 - 24-31 : 6-29
        {
            cube = R(cube);
        } else if (cube[5] == solved[25] && cube[28] == solved[37]) // case 78 - 26-38 : 6-29
        {
            cube = Fp(cube);
            cube = R(cube);
            cube = F(cube);
        } else if (cube[5] == solved[21] && cube[28] == solved[14]) // case 79 - 22-15 : 6-29
        {
            cube = U(cube);
            cube = U(cube);
            cube = Lp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[5] == solved[41] && cube[28] == solved[34]) // case 80 - 42-35 : 6-29
        {
            cube = R(cube);
            cube = R(cube);
        } else if (cube[5] == solved[43] && cube[28] == solved[46]) // case 81 - 44-47 : 6-29
        {
            cube = B(cube);
            cube = B(cube);
            cube = U(cube);
        } else if (cube[5] == solved[39] && cube[28] == solved[16]) // case 82 - 40-17 : 6-29
        {
            cube = L(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[5] == solved[50] && cube[28] == solved[32]) // case 83 - 51-33 : 6-29
        {
            cube = Rp(cube);
        } else if (cube[5] == solved[48] && cube[28] == solved[12]) // case 84 - 49-13 : 6-29
        {
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[5] == solved[19] && cube[28] == solved[7]) // case 85 - 20-8 : 6-29
        {
            cube = Fp(cube);
            cube = R(cube);
        } else if (cube[5] == solved[28] && cube[28] == solved[5]) // case 86 - 29-6 : 6-29
        {
            cube = U(cube);
            cube = Fp(cube);
            cube = Up(cube);
            cube = R(cube);
        } else if (cube[5] == solved[52] && cube[28] == solved[1]) // case 87 - 53-2 : 6-29
        {
            cube = Bp(cube);
            cube = Rp(cube);
        } else if (cube[5] == solved[10] && cube[28] == solved[3]) // case 88 - 11-4 : 6-29
        {
            cube = L(cube);
            cube = U(cube);
            cube = F(cube);
            cube = Up(cube);
        } else if (cube[5] == solved[30] && cube[28] == solved[23]) // case 89 - 31-24 : 6-29
        {
            cube = U(cube);
            cube = Fp(cube);
            cube = Up(cube);
        } else if (cube[5] == solved[37] && cube[28] == solved[25]) // case 90 - 38-26 : 6-29
        {
            cube = U(cube);
            cube = F(cube);
            cube = F(cube);
            cube = Up(cube);
        } else if (cube[5] == solved[14] && cube[28] == solved[21]) // case 91 - 15-22 : 6-29
        {
            cube = U(cube);
            cube = F(cube);
            cube = Up(cube);
        } else if (cube[5] == solved[34] && cube[28] == solved[41]) // case 92 - 35-42 : 6-29
        {
            cube = Dp(cube);
            cube = Fp(cube);
            cube = R(cube);
            cube = F(cube);
        } else if (cube[5] == solved[46] && cube[28] == solved[41]) // case 93 - 47-44 : 6-29
        {
            cube = B(cube);
            cube = Rp(cube);
            cube = Bp(cube);
        } else if (cube[1] == solved[16] && cube[28] == solved[39]) // case 94 - 17-40 : 6-29
        {
            cube = U(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[5] == solved[32] && cube[28] == solved[50]) // case 95 - 33-51 : 6-29
        {
            cube = Up(cube);
            cube = B(cube);
            cube = U(cube);
        } else if (cube[5] == solved[12] && cube[28] == solved[48]) // case 96 - 13-49 : 6-29
        {
            cube = Up(cube);
            cube = Bp(cube);
            cube = U(cube);
        }

        return (cube);
    }

//F2L
    //F2L corners
    public static char[] F2L_corners11052(char[] cube, char[] solved) {
        if (cube[0] == solved[0]
                && cube[9] == solved[9]
                && cube[51] == solved[51]) {

        } else if (cube[0] == solved[2]
                && cube[9] == solved[53]
                && cube[51] == solved[29]
                && true) {
            cube = Bp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (cube[0] == solved[8]
                && cube[9] == solved[27]
                && cube[51] == solved[20]
                && true) {
            cube = Rp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = L(cube);
        } else if (cube[0] == solved[6]
                && cube[9] == solved[18]
                && cube[51] == solved[11]
                && true) {
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Bp(cube);
        } else if (cube[0] == solved[51]
                && cube[9] == solved[0]
                && cube[51] == solved[9]
                && true) {
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (cube[0] == solved[29]
                && cube[9] == solved[2]
                && cube[51] == solved[53]
                && true) {
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (cube[0] == solved[20]
                && cube[9] == solved[8]
                && cube[51] == solved[27]
                && true) {
            cube = F(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Fp(cube);
        } else if (cube[0] == solved[11]
                && cube[9] == solved[6]
                && cube[51] == solved[18]
                && true) {
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (cube[0] == solved[9]
                && cube[9] == solved[51]
                && cube[51] == solved[0]
                && true) {
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (cube[0] == solved[53]
                && cube[9] == solved[29]
                && cube[51] == solved[2]
                && true) {
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (cube[0] == solved[27]
                && cube[9] == solved[20]
                && cube[51] == solved[8]
                && true) {
            cube = Rp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = R(cube);
        } else if (cube[0] == solved[18]
                && cube[9] == solved[11]
                && cube[51] == solved[6]
                && true) {
            cube = Rp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = R(cube);
            cube = Lp(cube);
        } else if (cube[0] == solved[45]
                && cube[9] == solved[15]
                && cube[51] == solved[42]
                && true) {
            cube = L(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = B(cube);
        } else if (cube[0] == solved[35]
                && cube[9] == solved[47]
                && cube[51] == solved[44]
                && true) {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
        } else if (cube[0] == solved[26]
                && cube[9] == solved[33]
                && cube[51] == solved[38]
                && true) {
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (cube[0] == solved[17]
                && cube[9] == solved[24]
                && cube[51] == solved[36]
                && true) {
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (cube[0] == solved[15]
                && cube[9] == solved[42]
                && cube[51] == solved[45]
                && true) {
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (cube[0] == solved[47]
                && cube[9] == solved[44]
                && cube[51] == solved[35]
                && true) {
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (cube[0] == solved[33]
                && cube[9] == solved[38]
                && cube[51] == solved[26]
                && true) {
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (cube[0] == solved[24]
                && cube[9] == solved[36]
                && cube[51] == solved[17]
                && true) {
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (cube[0] == solved[42]
                && cube[9] == solved[45]
                && cube[51] == solved[15]
                && true) {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
        } else if (cube[0] == solved[44]
                && cube[9] == solved[35]
                && cube[51] == solved[47]
                && true) {
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
        } else if (cube[0] == solved[38]
                && cube[9] == solved[26]
                && cube[51] == solved[33]
                && true) {
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
        } else if (cube[0] == solved[36]
                && cube[9] == solved[17]
                && cube[51] == solved[24]
                && true) {
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
        }
        return cube;
    }

    public static char[] F2L_corners35430(char[] cube, char[] solved) {
        if (cube[2] == solved[2]
                && cube[53] == solved[53]
                && cube[29] == solved[29]) {

        } else if (cube[2] == solved[0]
                && cube[53] == solved[9]
                && cube[29] == solved[51]
                && true) {
            cube = Up(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (cube[2] == solved[8]
                && cube[53] == solved[27]
                && cube[29] == solved[20]
                && true) {
            cube = Up(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[6]
                && cube[53] == solved[18]
                && cube[29] == solved[11]
                && true) {
            cube = Up(cube);
            cube = Rp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[51]
                && cube[53] == solved[0]
                && cube[29] == solved[9]
                && true) {
            cube = Up(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[29]
                && cube[53] == solved[2]
                && cube[29] == solved[53]
                && true) {
            cube = Up(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[20]
                && cube[53] == solved[8]
                && cube[29] == solved[27]
                && true) {
            cube = Up(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[11]
                && cube[53] == solved[6]
                && cube[29] == solved[18]
                && true) {
            cube = Up(cube);
            cube = F(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Fp(cube);
            cube = U(cube);
        } else if (cube[2] == solved[9]
                && cube[53] == solved[51]
                && cube[29] == solved[0]
                && true) {
            cube = Up(cube);
            cube = Rp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = U(cube);
        } else if (cube[2] == solved[53]
                && cube[53] == solved[29]
                && cube[29] == solved[2]
                && true) {
            cube = Up(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[27]
                && cube[53] == solved[20]
                && cube[29] == solved[8]
                && true) {
            cube = Up(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[18]
                && cube[53] == solved[11]
                && cube[29] == solved[6]
                && true) {
            cube = Up(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = R(cube);
            cube = U(cube);
        } else if (cube[2] == solved[45]
                && cube[53] == solved[15]
                && cube[29] == solved[42]
                && true) {
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[35]
                && cube[53] == solved[47]
                && cube[29] == solved[44]
                && true) {
            cube = Up(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = B(cube);
            cube = U(cube);
        } else if (cube[2] == solved[26]
                && cube[53] == solved[33]
                && cube[29] == solved[38]
                && true) {
            cube = Up(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[17]
                && cube[53] == solved[24]
                && cube[29] == solved[36]
                && true) {
            cube = Up(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[15]
                && cube[53] == solved[42]
                && cube[29] == solved[45]
                && true) {
            cube = Up(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[47]
                && cube[53] == solved[44]
                && cube[29] == solved[35]
                && true) {
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (cube[2] == solved[33]
                && cube[53] == solved[38]
                && cube[29] == solved[26]
                && true) {
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[2] == solved[24]
                && cube[53] == solved[36]
                && cube[29] == solved[17]
                && true) {
            cube = Up(cube);
            cube = D(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (cube[2] == solved[42]
                && cube[53] == solved[45]
                && cube[29] == solved[15]
                && true) {
            cube = Up(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (cube[2] == solved[44]
                && cube[53] == solved[35]
                && cube[29] == solved[47]
                && true) {
            cube = Up(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (cube[2] == solved[38]
                && cube[53] == solved[26]
                && cube[29] == solved[33]
                && true) {
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (cube[2] == solved[36]
                && cube[53] == solved[17]
                && cube[29] == solved[24]
                && true) {
            cube = Up(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
        }
        return cube;
    }

    public static char[] F2L_corners61811(char[] cube, char[] solved) {
        if (cube[6] == solved[6]
                && cube[18] == solved[18]
                && cube[11] == solved[11]) {

        } else if (cube[6] == solved[0]
                && cube[18] == solved[9]
                && cube[11] == solved[51]
                && true) {
            cube = U(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[2]
                && cube[18] == solved[53]
                && cube[11] == solved[29]
                && true) {
            cube = U(cube);
            cube = Rp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[8]
                && cube[18] == solved[27]
                && cube[11] == solved[20]
                && true) {
            cube = U(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[51]
                && cube[18] == solved[0]
                && cube[11] == solved[9]
                && true) {
            cube = U(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[29]
                && cube[18] == solved[2]
                && cube[11] == solved[53]
                && true) {
            cube = U(cube);
            cube = F(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Fp(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[20]
                && cube[18] == solved[8]
                && cube[11] == solved[27]
                && true) {
            cube = U(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[11]
                && cube[18] == solved[6]
                && cube[11] == solved[18]
                && true) {
            cube = U(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[9]
                && cube[18] == solved[51]
                && cube[11] == solved[0]
                && true) {
            cube = U(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[53]
                && cube[18] == solved[29]
                && cube[11] == solved[2]
                && true) {
            cube = U(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = R(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[27]
                && cube[18] == solved[20]
                && cube[11] == solved[8]
                && true) {
            cube = U(cube);
            cube = Rp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[18]
                && cube[18] == solved[11]
                && cube[11] == solved[6]
                && true) {
            cube = U(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[45]
                && cube[18] == solved[15]
                && cube[11] == solved[42]
                && true) {
            cube = U(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[35]
                && cube[18] == solved[47]
                && cube[11] == solved[44]
                && true) {
            cube = U(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[26]
                && cube[18] == solved[33]
                && cube[11] == solved[38]
                && true) {
            cube = U(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[17]
                && cube[18] == solved[24]
                && cube[11] == solved[36]
                && true) {
            cube = U(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = B(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[15]
                && cube[18] == solved[42]
                && cube[11] == solved[45]
                && true) {
            cube = U(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (cube[6] == solved[47]
                && cube[18] == solved[44]
                && cube[11] == solved[35]
                && true) {
            cube = U(cube);
            cube = Dp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[33]
                && cube[18] == solved[38]
                && cube[11] == solved[26]
                && true) {
            cube = U(cube);
            cube = Dp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[24]
                && cube[18] == solved[36]
                && cube[11] == solved[17]
                && true) {
            cube = U(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[42]
                && cube[18] == solved[45]
                && cube[11] == solved[15]
                && true) {
            cube = U(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[44]
                && cube[18] == solved[35]
                && cube[11] == solved[47]
                && true) {
            cube = U(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[38]
                && cube[18] == solved[26]
                && cube[11] == solved[33]
                && true) {
            cube = U(cube);
            cube = Dp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (cube[6] == solved[36]
                && cube[18] == solved[17]
                && cube[11] == solved[24]
                && true) {
            cube = U(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = Up(cube);
        }
        return cube;
    }

    public static char[] F2L_corners82710(char[] cube, char[] solved) {
        if (cube[8] == solved[8]
                && cube[27] == solved[27]
                && cube[20] == solved[20]) {

        } else if (cube[8] == solved[0]
                && cube[27] == solved[9]
                && cube[20] == solved[51]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[2]
                && cube[27] == solved[53]
                && cube[20] == solved[29]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[6]
                && cube[27] == solved[18]
                && cube[20] == solved[11]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[51]
                && cube[27] == solved[0]
                && cube[20] == solved[9]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = F(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Fp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[29]
                && cube[27] == solved[2]
                && cube[20] == solved[53]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[20]
                && cube[27] == solved[8]
                && cube[20] == solved[27]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[11]
                && cube[27] == solved[6]
                && cube[20] == solved[18]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[9]
                && cube[27] == solved[51]
                && cube[20] == solved[0]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = R(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[53]
                && cube[27] == solved[29]
                && cube[20] == solved[2]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[27]
                && cube[27] == solved[20]
                && cube[20] == solved[8]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[18]
                && cube[27] == solved[11]
                && cube[20] == solved[6]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[45]
                && cube[27] == solved[15]
                && cube[20] == solved[42]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[35]
                && cube[27] == solved[47]
                && cube[20] == solved[44]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[26]
                && cube[27] == solved[33]
                && cube[20] == solved[38]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = B(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[17]
                && cube[27] == solved[24]
                && cube[20] == solved[36]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[15]
                && cube[27] == solved[42]
                && cube[20] == solved[45]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[47]
                && cube[27] == solved[44]
                && cube[20] == solved[35]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[33]
                && cube[27] == solved[38]
                && cube[20] == solved[26]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[24]
                && cube[27] == solved[36]
                && cube[20] == solved[17]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[42]
                && cube[27] == solved[45]
                && cube[20] == solved[15]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[44]
                && cube[27] == solved[35]
                && cube[20] == solved[47]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[38]
                && cube[27] == solved[26]
                && cube[20] == solved[33]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (cube[8] == solved[36]
                && cube[27] == solved[17]
                && cube[20] == solved[24]
                && true) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
            cube = U(cube);
        }
        return cube;
    }

    //F2L edges
    public static char[] F2L_edges2330(char[] cube, char[] solved) {
        if (cube[23] == solved[23]
                && cube[30] == solved[30]) {

        } else if (cube[23] == solved[14]
                && cube[30] == solved[21]
                && true) {
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = D(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (cube[23] == solved[12]
                && cube[30] == solved[48]
                && true) {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (cube[23] == solved[32]
                && cube[30] == solved[50]
                && true) {
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (cube[23] == solved[16]
                && cube[30] == solved[39]
                && true) {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (cube[23] == solved[25]
                && cube[30] == solved[37]
                && true) {
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (cube[23] == solved[34]
                && cube[30] == solved[41]
                && true) {
            cube = D(cube);
            cube = D(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (cube[23] == solved[43]
                && cube[30] == solved[46]
                && true) {
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
        } else if (cube[23] == solved[30]
                && cube[30] == solved[23]
                && true) {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (cube[23] == solved[21]
                && cube[30] == solved[14]
                && true) {
            cube = F(cube);
            cube = F(cube);
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[23] == solved[48]
                && cube[30] == solved[12]
                && true) {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
        } else if (cube[23] == solved[50]
                && cube[30] == solved[32]
                && true) {
            cube = R(cube);
            cube = R(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = R(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = R(cube);
        } else if (cube[23] == solved[39]
                && cube[30] == solved[16]
                && true) {
            cube = Dp(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
        } else if (cube[23] == solved[37]
                && cube[30] == solved[25]
                && true) {
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
        } else if (cube[23] == solved[41]
                && cube[30] == solved[34]
                && true) {
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
        } else if (cube[23] == solved[46]
                && cube[30] == solved[43]
                && true) {
            cube = D(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        }
        return cube;
    }

    public static char[] F2L_edges1421(char[] cube, char[] solved) {
        if (cube[14] == solved[14]
                && cube[21] == solved[21]) {

        } else if (cube[14] == solved[23]
                && cube[21] == solved[30]
                && true) {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
        } else if (cube[14] == solved[12]
                && cube[21] == solved[48]
                && true) {
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
        } else if (cube[14] == solved[32]
                && cube[21] == solved[50]
                && true) {
            cube = R(cube);
            cube = Dp(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
        } else if (cube[14] == solved[16]
                && cube[21] == solved[39]
                && true) {
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
        } else if (cube[14] == solved[25]
                && cube[21] == solved[37]
                && true) {
            cube = D(cube);
            cube = D(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
        } else if (cube[14] == solved[34]
                && cube[21] == solved[41]
                && true) {
            cube = D(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
        } else if (cube[14] == solved[43]
                && cube[21] == solved[46]
                && true) {
            cube = Dp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
        } else if (cube[14] == solved[30]
                && cube[21] == solved[23]
                && true) {
            cube = F(cube);
            cube = F(cube);
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[14] == solved[21]
                && cube[21] == solved[14]
                && true) {
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
        } else if (cube[14] == solved[48]
                && cube[21] == solved[12]
                && true) {
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
        } else if (cube[14] == solved[50]
                && cube[21] == solved[32]
                && true) {
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = D(cube);
            cube = Fp(cube);
        } else if (cube[14] == solved[39]
                && cube[21] == solved[16]
                && true) {
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
        } else if (cube[14] == solved[37]
                && cube[21] == solved[25]
                && true) {
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Bp(cube);
            cube = Fp(cube);
            cube = B(cube);
            cube = F(cube);
        } else if (cube[14] == solved[41]
                && cube[21] == solved[34]
                && true) {
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Bp(cube);
            cube = Fp(cube);
            cube = B(cube);
            cube = F(cube);
        } else if (cube[14] == solved[46]
                && cube[21] == solved[43]
                && true) {
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
        }
        return cube;
    }

    public static char[] F2L_edges1248(char[] cube, char[] solved) {
        if (cube[12] == solved[12]
                && cube[48] == solved[48]) {

        } else if (cube[12] == solved[14]
                && cube[48] == solved[21]
                && true) {
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
        } else if (cube[12] == solved[23]
                && cube[48] == solved[30]
                && true) {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (cube[12] == solved[32]
                && cube[48] == solved[50]
                && true) {
            cube = B(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (cube[12] == solved[16]
                && cube[48] == solved[39]
                && true) {
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (cube[12] == solved[25]
                && cube[48] == solved[37]
                && true) {
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (cube[12] == solved[34]
                && cube[48] == solved[41]
                && true) {
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (cube[12] == solved[43]
                && cube[48] == solved[46]
                && true) {
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (cube[12] == solved[30]
                && cube[48] == solved[23]
                && true) {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (cube[12] == solved[21]
                && cube[48] == solved[14]
                && true) {
            cube = L(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (cube[12] == solved[48]
                && cube[48] == solved[12]
                && true) {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Lp(cube);
            cube = Bp(cube);
        } else if (cube[12] == solved[50]
                && cube[48] == solved[32]
                && true) {
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (cube[12] == solved[39]
                && cube[48] == solved[16]
                && true) {
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (cube[12] == solved[37]
                && cube[48] == solved[25]
                && true) {
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (cube[12] == solved[41]
                && cube[48] == solved[34]
                && true) {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (cube[12] == solved[46]
                && cube[48] == solved[43]
                && true) {
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        }
        return cube;
    }

    public static char[] F2L_edges3250(char[] cube, char[] solved) {
        if (cube[32] == solved[32]
                && cube[50] == solved[50]) {

        } else if (cube[32] == solved[14]
                && cube[50] == solved[21]
                && true) {
            cube = U(cube);
            cube = U(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = U(cube);
            cube = U(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = R(cube);
        } else if (cube[32] == solved[12]
                && cube[50] == solved[48]
                && true) {
            cube = B(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (cube[32] == solved[23]
                && cube[50] == solved[30]
                && true) {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (cube[32] == solved[16]
                && cube[50] == solved[39]
                && true) {
            cube = D(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
        } else if (cube[32] == solved[25]
                && cube[50] == solved[37]
                && true) {
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
        } else if (cube[32] == solved[34]
                && cube[50] == solved[41]
                && true) {
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
        } else if (cube[32] == solved[43]
                && cube[50] == solved[46]
                && true) {
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (cube[32] == solved[30]
                && cube[50] == solved[23]
                && true) {
            cube = R(cube);
            cube = R(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = R(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = R(cube);
        } else if (cube[32] == solved[21]
                && cube[50] == solved[14]
                && true) {
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (cube[32] == solved[48]
                && cube[50] == solved[12]
                && true) {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (cube[32] == solved[50]
                && cube[50] == solved[32]
                && true) {
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (cube[32] == solved[39]
                && cube[50] == solved[16]
                && true) {
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (cube[32] == solved[37]
                && cube[50] == solved[25]
                && true) {
            cube = Dp(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (cube[32] == solved[41]
                && cube[50] == solved[34]
                && true) {
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (cube[32] == solved[46]
                && cube[50] == solved[43]
                && true) {
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
        }
        return cube;
    }

//OLL
    //OLL edges
    public static char[] OLL_edges(char[] cube, char[] solved) {
        if (cube[39] == solved[39] && cube[37] == solved[37] && cube[41] == solved[41] && cube[43] == solved[43]) // case 1:finished cross - - : -
        {
            // do the moves here
        } else if (cube[37] == solved[37] && cube[43] == solved[43]) // case 2:I-shape vertical - - : -
        {
            cube = D(cube);
            cube = F(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
        } else if (cube[39] == solved[39] && cube[41] == solved[41]) // case 3:I-shape horizontal - - : -
        {
            cube = F(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (cube[37] == solved[37] && cube[39] == solved[39] && cube[41] != solved[41] && cube[43] != solved[43]) // case 4:L-shape left upper - - : -
        {
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Bp(cube);
        } else if (cube[37] == solved[37] && cube[41] == solved[41] && cube[39] != solved[39] && cube[43] != solved[43]) // case 5:L-shape right upper - - : -
        {
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Bp(cube);
        } else if (cube[39] == solved[39] && cube[43] == solved[43] && cube[37] != solved[37] && cube[41] != solved[41]) // case 6:L-shape left lower - - : -
        {
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Bp(cube);
        } else if (cube[41] == solved[41] && cube[43] == solved[43] && cube[39] != solved[39] && cube[37] != solved[37]) // case 7:L-shape right lower - - : -
        {
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Bp(cube);
        } else if (cube[25] != solved[25] && cube[34] != solved[34] && cube[46] != solved[46] && cube[16] != solved[16]) // case 8:dot shape - - : -
        {
            cube = F(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Bp(cube);
        }
        return (cube);
    }

    //OLL corners
    public static char[] OLL_corners(char[] cube, char[] solved) {
        if (cube[36] == solved[36] && cube[38] == solved[38] && cube[42] == solved[42] && cube[44] == solved[44]) // case 1:finished cross - - : -
        {
            // do the moves here
        } else if (cube[42] == solved[40] && cube[47] == solved[40] && cube[33] == solved[40] && cube[24] == solved[40]) // case 2:sune left upper - - : -
        {
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = R(cube);
        } else if (cube[44] == solved[40] && cube[33] == solved[40] && cube[24] == solved[40] && cube[15] == solved[40]) // case 3:sune left lower - - : -
        {
            cube = Dp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = R(cube);
        } else if (cube[36] == solved[40] && cube[15] == solved[40] && cube[47] == solved[40] && cube[33] == solved[40]) // case 4:sune right upper - - : -
        {
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = R(cube);
        } else if (cube[38] == solved[40] && cube[24] == solved[40] && cube[15] == solved[40] && cube[47] == solved[40]) // case 5:sune right lower - - : -
        {
            cube = L(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = Lp(cube);
        } else if (cube[15] == solved[40] && cube[17] == solved[40] && cube[33] == solved[40] && cube[35] == solved[40]) // case 6:H-shape horizontal - - : -
        {
            cube = D(cube);
            cube = F(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (cube[24] == solved[40] && cube[26] == solved[40] && cube[45] == solved[40] && cube[47] == solved[40]) // case 7:H-shape vertical - - : -
        {
            cube = F(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (cube[33] == solved[40] && cube[45] == solved[40]) // case 8:L left upper - - : -
        {
            cube = Dp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            cube = L(cube);
            cube = B(cube);
        } else if (cube[24] == solved[40] && cube[35] == solved[40]) // case 9:L left lower - - : -
        {
            cube = Fp(cube);
            cube = R(cube);
            cube = F(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            cube = Rp(cube);
            cube = F(cube);
            cube = L(cube);
        } else if (cube[17] == solved[40] && cube[47] == solved[40]) // case 10:L right upper - - : -
        {
            cube = Bp(cube);
            cube = L(cube);
            cube = B(cube);
            cube = Rp(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = B(cube);
            cube = R(cube);
        } else if (cube[15] == solved[40] && cube[26] == solved[40]) // case 11:L right lower - - : -
        {
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            cube = L(cube);
            cube = B(cube);
        } else if (cube[33] == solved[40] && cube[35] == solved[40] && cube[24] == solved[40] && cube[45] == solved[40]) // case 12:Pi left - - : -
        {
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (cube[17] == solved[40] && cube[33] == solved[40] && cube[45] == solved[40] && cube[47] == solved[40]) // case 13:Pi back - - : -
        {
            cube = F(cube);
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = F(cube);
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
        } else if (cube[15] == solved[40] && cube[17] == solved[40] && cube[26] == solved[40] && cube[47] == solved[40]) // case 14:Pi right - - : -
        {
            cube = R(cube);
            cube = U(cube);
            cube = U(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = R(cube);
            cube = U(cube);
            cube = U(cube);
            cube = R(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[24] == solved[40] && cube[26] == solved[40] && cube[15] == solved[40] && cube[35] == solved[40]) // case 15:Pi front - - : -
        {
            cube = R(cube);
            cube = U(cube);
            cube = U(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = R(cube);
            cube = U(cube);
            cube = U(cube);
            cube = R(cube);
            cube = F(cube);
        } else if (cube[38] == solved[40] && cube[17] == solved[40] && cube[35] == solved[40] && cube[45] == solved[40]) // case 16:antisune left upper - - : -
        {
            cube = R(cube);
            cube = U(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = Fp(cube);
        } else if (cube[36] == solved[40] && cube[26] == solved[40] && cube[35] == solved[40] && cube[45] == solved[40]) // case 17:anitsune left lower - - : -
        {
            cube = R(cube);
            cube = U(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[44] == solved[40] && cube[17] == solved[40] && cube[26] == solved[40] && cube[45] == solved[40]) // case 18:antisune right upper - - : -
        {
            cube = R(cube);
            cube = U(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = Up(cube);
            cube = Rp(cube);
        } else if (cube[42] == solved[40] && cube[17] == solved[40] && cube[26] == solved[40] && cube[35] == solved[40]) // case 19:antisune right lower - - : -
        {
            cube = R(cube);
            cube = U(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = F(cube);
        } else if (cube[26] == solved[40] && cube[47] == solved[40] && cube[36] == solved[40] && cube[42] == solved[40]) // case 20:T left  - - : -
        {
            cube = R(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = F(cube);
            cube = R(cube);
            cube = Fp(cube);
        } else if (cube[24] == solved[40] && cube[45] == solved[40] && cube[38] == solved[40] && cube[44] == solved[40]) // case 21:T right - - : -
        {
            cube = R(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = F(cube);
            cube = R(cube);
            cube = Fp(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (cube[17] == solved[40] && cube[33] == solved[40] && cube[42] == solved[40] && cube[44] == solved[40]) // case 22:T front - - : -
        {
            cube = R(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = F(cube);
            cube = R(cube);
            cube = Fp(cube);
            cube = F(cube);
        } else if (cube[15] == solved[40] && cube[35] == solved[40] && cube[36] == solved[40] && cube[38] == solved[40]) // case 23:T back - - : -
        {
            cube = R(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = F(cube);
            cube = R(cube);
            cube = Fp(cube);
            cube = Fp(cube);
        } else if (cube[33] == solved[40] && cube[35] == solved[40] && cube[36] == solved[40] && cube[42] == solved[40]) // case 24:U left - - : -
        {
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            cube = U(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
        } else if (cube[15] == solved[40] && cube[17] == solved[40] && cube[38] == solved[40] && cube[44] == solved[40]) // case 25:U right - - : -
        {
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
            cube = U(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
        } else if (cube[24] == solved[40] && cube[26] == solved[40] && cube[42] == solved[40] && cube[44] == solved[40]) // case 26:U front - - : -
        {
            cube = L(cube);
            cube = L(cube);
            cube = U(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
        } else if (cube[45] == solved[40] && cube[47] == solved[40] && cube[36] == solved[40] && cube[38] == solved[40]) // case 27:U back - - : -
        {
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
            cube = U(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
        }
        return (cube);
    }

//PLL 
    //Part 1
    public static char[] PLL_part1(char[] cube, char[] solved) {
        int D = 0;
        while (D == 0){
        if (cube[24] == solved[24]
                && cube[26] == solved[26]
                && cube[45] == solved[45]
                && cube[47] == solved[47]) //finished edges
        {
            
        } else if (cube[24] == solved[22]
                && cube[35] == solved[31]
                && cube[47] == solved[49]
                && cube[17] == solved[13]) //diagonal L front
        {
            cube = Dp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = Fp(cube);
            cube = D(cube);
        } else if (cube[26] == solved[22]
                && cube[33] == solved[31]
                && cube[15] == solved[13]
                && cube[45] == solved[49]) //diagonal R front
        {
            cube = F(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = Fp(cube);
        } else if (cube[15] == solved[13]
                && cube[17] == solved[13]
                && cube[24] == solved[22]
                && cube[45] == solved[49]) //headlights L
        {
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Fp(cube);
        } else if (cube[35] == solved[31]
                && cube[33] == solved[31]
                && cube[27] == solved[22]
                && cube[47] == solved[49]) //headlights R
        {
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = D(cube);
        } else if (cube[17] == solved[13]
                && cube[33] == solved[31]
                && cube[24] == solved[22]
                && cube[26] == solved[22]) //headlights F
        {
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            cube = D(cube);
        } else if (cube[15] == solved[13]
                && cube[35] == solved[31]
                && cube[47] == solved[49]
                && cube[45] == solved[49]) //headlights B
        {
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
        } else{
            cube = D(cube);
            D = 1;
//if no cases correct D and repeat
        }
        }
        return (cube);
    }

    //Part 2
    public static char[] PLL_part2(char[] cube, char[] solved) {
        if (cube[25] == solved[22]
                && cube[16] == solved[13]
                && cube[34] == solved[31]
                && cube[46] == solved[49]) //finished edges
        {
            
        } else if (cube[25] == solved[49]
                && cube[34] == solved[13]
                && cube[46] == solved[22]
                && cube[16] == solved[31]) //H
        {
            cube = R(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = U(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = U(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Lp(cube);
        } else if (cube[25] == solved[49]
                && cube[34] == solved[13]
                && cube[46] == solved[22]
                && cube[16] == solved[31]) //UaL
        {
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            cube = Dp(cube);
        } else if (cube[25] == solved[49]
                && cube[13] == solved[13]
                && cube[34] == solved[22]
                && cube[46] == solved[31]) //UaR
        {
            cube = Dp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
        } else if (cube[16] == solved[49]
                && cube[34] == solved[13]
                && cube[25] == solved[22]
                && cube[46] == solved[31]) //UaF
        {
            cube = Dp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
        } else if (cube[46] == solved[49]
                && cube[25] == solved[13]
                && cube[34] == solved[22]
                && cube[16] == solved[31]) //UaB
        {
            cube = L(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
        } else if (cube[25] == solved[49]
                && cube[46] == solved[13]
                && cube[16] == solved[22]
                && cube[34] == solved[31]) //UbL
        {
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
        } else if (cube[34] == solved[49]
                && cube[16] == solved[13]
                && cube[46] == solved[22]
                && cube[25] == solved[31]) //UbR
        {
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
        } else if (cube[46] == solved[49]
                && cube[34] == solved[13]
                && cube[16] == solved[22]
                && cube[25] == solved[31]) //UbF
        {
            cube = Dp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
        } else if (cube[34] == solved[49]
                && cube[46] == solved[13]
                && cube[25] == solved[22]
                && cube[16] == solved[31]) //UbB
        {
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = Lp(cube);
        } else if (cube[16] == solved[49]
                && cube[46] == solved[13]
                && cube[34] == solved[22]
                && cube[25] == solved[31]) //Z front to left
        {
            cube = Dp(cube);
            cube = Rp(cube);
            cube = L(cube);
            cube = Bp(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = Bp(cube);
            cube = Rp(cube);
            cube = L(cube);
            cube = Up(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
        } else if (cube[34] == solved[49]
                && cube[25] == solved[13]
                && cube[16] == solved[22]
                && cube[46] == solved[31]) //Z front to right
        {
            cube = Rp(cube);
            cube = L(cube);
            cube = Bp(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = Bp(cube);
            cube = Rp(cube);
            cube = L(cube);
            cube = Up(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = D(cube);
        }
        return (cube);
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
        System.out.println("U");
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
        System.out.println("U'");
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
        System.out.println("R");
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
        System.out.println("R'");
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

        // spot number 25 is changing to be the Farbe in spot 27 
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
        System.out.println("L");
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
        System.out.println("L'");
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
        cube[45] = cube35;

        // spot number 47 is changing to be the Farbe in spot 35
        cube[46] = cube34;

        // spot number 48 is changing to be the Farbe in spot 36
        cube[47] = cube33;

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
        System.out.println("D");
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
        cube[45] = cube17;

        // spot number 47 is changing to be the Farbe in spot 17
        cube[46] = cube16;

        // spot number 48 is changing to be the Farbe in spot 18
        cube[47] = cube15;

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
        System.out.println("D'");
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
        System.out.println("F");
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
        System.out.println("F'");
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
        System.out.println("B");
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

        // spot number 43 is changing to be the Farbe in spot 36
        cube[42] = cube35;

        // spot number 44 is changing to be the Farbe in spot 33
        cube[43] = cube32;

        // spot number 45 is changing to be the Farbe in spot 30
        cube[44] = cube29;

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
        System.out.println("B'");
        return cube;
    }
}
