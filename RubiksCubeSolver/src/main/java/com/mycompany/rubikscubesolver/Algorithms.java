package com.mycompany.rubikscubesolver;

import static com.mycompany.rubikscubesolver.RubiksCube.B;
import static com.mycompany.rubikscubesolver.RubiksCube.Bp;
import static com.mycompany.rubikscubesolver.RubiksCube.D;
import static com.mycompany.rubikscubesolver.RubiksCube.Dp;
import static com.mycompany.rubikscubesolver.RubiksCube.F;
import static com.mycompany.rubikscubesolver.RubiksCube.Fp;
import static com.mycompany.rubikscubesolver.RubiksCube.L;
import static com.mycompany.rubikscubesolver.RubiksCube.Lp;
import static com.mycompany.rubikscubesolver.RubiksCube.R;
import static com.mycompany.rubikscubesolver.RubiksCube.Rp;
import static com.mycompany.rubikscubesolver.RubiksCube.U;
import static com.mycompany.rubikscubesolver.RubiksCube.Up;

/*
 * @author Daniel, Reeder, Johannes, Ömer
 */
public class Algorithms
{
//WHITE-CROSS    
    //White Cross (8-20)    
    public static char[] WhiteCross820(char[] cube, char[] solved) {
        if (solved[7] == cube[7] && solved[19] == cube[19]) // case 1 - 8-20 : 8-20
        {
            return (cube);// do the moves here
        } else if (solved[7] == cube[5] && solved[19] == cube[28]) // case 2 - 6-29 : 8-20
        {
            cube = R(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = F(cube);
            // do the moves here
        } else if (solved[7] == cube[1] && solved[19] == cube[52]) // case 3 - 2-53 : 8-20
        {
            cube = B(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (solved[7] == cube[3] && solved[19] == cube[10]) // case 4 - 4-11 : 8-20
        {
            cube = L(cube);
            cube = L(cube);
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (solved[7] == cube[23] && solved[19] == cube[30]) // case 5 - 24-31 : 8-20
        {
            cube = Rp(cube);
            cube = Dp(cube);
            cube = R(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (solved[7] == cube[25] && solved[19] == cube[37]) // case 6 - 26-38 : 8-20
        {
            cube = Dp(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
        } else if (solved[7] == cube[21] && solved[19] == cube[14]) // case 7 - 22-15 : 8-20
        {
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (solved[7] == cube[41] && solved[19] == cube[34]) // case 8 - 42-35 : 8-20
        {
            cube = Dp(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (solved[7] == cube[43] && solved[19] == cube[46]) // case 9 - 44-47 : 8-20
        {
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (solved[7] == cube[39] && solved[19] == cube[16]) // case 10 - 40-17 : 8-20
        {
            cube = D(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (solved[7] == cube[50] && solved[19] == cube[32]) // case 11 - 51-33 : 8-20
        {
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (solved[7] == cube[48] && solved[19] == cube[12]) // case 12 - 49-13 : 8-20
        {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = F(cube);
            cube = F(cube);
        } else if (solved[7] == cube[19] && solved[19] == cube[7]) // case 13 - 20-8 : 8-20
        {
            cube = F(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = U(cube);
        } else if (solved[7] == cube[28] && solved[19] == cube[5]) // case 14 - 29-6 : 8-20
        {
            cube = Rp(cube);
            cube = Fp(cube);
            cube = R(cube);
        } else if (solved[7] == cube[52] && solved[19] == cube[1]) // case 15 - 53-2 : 8-20
        {
            cube = B(cube);
            cube = Up(cube);
            cube = R(cube);
            cube = U(cube);
        } else if (solved[7] == cube[10] && solved[19] == cube[3]) // case 16 - 11-4 : 8-20
        {
            cube = L(cube);
            cube = F(cube);
            cube = Lp(cube);
        } else if (solved[7] == cube[30] && solved[19] == cube[23]) // case 17 - 31-24 : 8-20
        {
            cube = Fp(cube);
        } else if (solved[7] == cube[37] && solved[19] == cube[25]) // case 18 - 38-26 : 8-20
        {
            cube = F(cube);
            cube = F(cube);
        } else if (solved[7] == cube[14] && solved[19] == cube[21]) // case 19 - 15-22 : 8-20
        {
            cube = F(cube);
        } else if (solved[7] == cube[34] && solved[19] == cube[41]) // case 20 - 35-42 : 8-20
        {
            cube = R(cube);
            cube = Fp(cube);
            cube = Rp(cube);
        } else if (solved[7] == cube[46] && solved[19] == cube[41]) // case 21 - 47-44 : 8-20
        {
            cube = Dp(cube);
            cube = R(cube);
            cube = Fp(cube);
            cube = Rp(cube);
            cube = Fp(cube);
        } else if (solved[7] == cube[16] && solved[19] == cube[39]) // case 22 - 17-40 : 8-20
        {
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
        } else if (solved[7] == cube[32] && solved[19] == cube[50]) // case 23 - 33-51 : 8-20
        {
            cube = R(cube);
            cube = R(cube);
            cube = Fp(cube);
            cube = R(cube);
            cube = R(cube);
        } else if (solved[7] == cube[12] && solved[19] == cube[48]) // case 24 - 13-49 : 8-20
        {
            cube = L(cube);
            cube = L(cube);
            cube = F(cube);
            cube = L(cube);
            cube = L(cube);
        }
        System.out.println("719");
        return (cube);
    }

    //White Cross (4-11)
    public static char[] WhiteCross411(char[] cube, char[] solved) {
        if (solved[3] == cube[3] && solved[10] == cube[10]) // case 1 - 4-11 : 4-11
        {
            return (cube);// do the moves here
        } else if (solved[3] == cube[7] && solved[10] == cube[19]) // case 2 - 8-20 : 4-11
        {
            cube = F(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (solved[3] == cube[5] && solved[10] == cube[28]) // case 2 - 6-29 : 4-11
        {
            cube = R(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = F(cube);
            // do the moves here
        } else if (solved[3] == cube[1] && solved[10] == cube[52]) // case 3 - 2-53 : 4-11
        {
            cube = B(cube);
            cube = B(cube);
            cube = D(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (solved[3] == cube[23] && solved[10] == cube[30]) // case 4 - 24-31 : 4-11
        {
            cube = F(cube);
            cube = F(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = F(cube);
            // do the moves here
        } else if (solved[3] == cube[25] && solved[10] == cube[37]) // case 5 - 26-38 : 4-11
        {
            cube = F(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            // do the moves here
        } else if (solved[3] == cube[21] && solved[10] == cube[14]) // case 6 - 22-15 : 4-11
        {
            cube = Lp(cube);
            // do the moves here
        } else if (solved[3] == cube[41] && solved[10] == cube[34]) // case 7 - 42-35 : 4-11
        {
            cube = F(cube);
            cube = F(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (solved[3] == cube[43] && solved[10] == cube[46]) // case 8 - 44-47 : 4-11
        {
            cube = F(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (solved[3] == cube[39] && solved[10] == cube[16]) // case 9 - 40-17 : 4-11
        {
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (solved[3] == cube[50] && solved[10] == cube[32]) // case 10 - 51-33 : 4-11
        {
            cube = R(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Rp(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (solved[3] == cube[48] && solved[10] == cube[12]) // case 11 - 49-13 : 4-11
        {
            cube = L(cube);
            // do the moves here
        } else if (solved[3] == cube[19] && solved[10] == cube[7]) // case 12 - 20-8 : 4-11
        {
            cube = Fp(cube);
            cube = Lp(cube);
            cube = F(cube);
            // do the moves here
        } else if (solved[3] == cube[28] && solved[10] == cube[5]) // case 13 - 29-6 : 4-11
        {
            cube = Rp(cube);
            cube = Up(cube);
            cube = Fp(cube);
            cube = U(cube);
            cube = R(cube);
            // do the moves here
        } else if (solved[3] == cube[52] && solved[10] == cube[1]) // case 14 - 53-2 : 4-11
        {
            cube = B(cube);
            cube = L(cube);
            // do the moves here
        } else if (solved[3] == cube[10] && solved[10] == cube[3]) // case 15 - 11-4 : 4-11
        {
            cube = L(cube);
            cube = Up(cube);
            cube = F(cube);
            cube = U(cube);
            // do the moves here
        } else if (solved[3] == cube[30] && solved[10] == cube[23]) // case 16 - 31-24 : 4-11
        {
            cube = F(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            cube = Fp(cube);
            // do the moves here
        } else if (solved[3] == cube[37] && solved[10] == cube[25]) // case 17 - 38-26 : 4-11
        {
            cube = Dp(cube);
            cube = L(cube);
            cube = L(cube);
            // do the moves here
        } else if (solved[3] == cube[14] && solved[10] == cube[21]) // case 18 - 15-22 : 4-11
        {
            cube = Up(cube);
            cube = F(cube);
            cube = U(cube);
            // do the moves here
        } else if (solved[3] == cube[34] && solved[10] == cube[41]) // case 19 - 35-42 : 4-11
        {
            cube = Dp(cube);
            cube = F(cube);
            cube = Lp(cube);
            cube = Fp(cube);
            // do the moves here
        } else if (solved[3] == cube[46] && solved[10] == cube[43]) // case 20 - 47-44 : 4-11
        {
            cube = Bp(cube);
            cube = L(cube);
            cube = B(cube);
            // do the moves here
        } else if (solved[3] == cube[16] && solved[10] == cube[39]) // case 21 - 17-40 : 4-11
        {
            cube = Lp(cube);
            cube = Up(cube);
            cube = F(cube);
            cube = F(cube);
            cube = U(cube);
            // do the moves here
        } else if (solved[3] == cube[32] && solved[10] == cube[50]) // case 22 - 33-51 : 4-11
        {
            cube = U(cube);
            cube = B(cube);
            cube = Up(cube);
            // do the moves here
        } else if (solved[3] == cube[12] && solved[10] == cube[48]) // case 23 - 13-49 : 4-11
        {
            cube = U(cube);
            cube = Bp(cube);
            cube = Up(cube);
            // do the moves here
        }
        System.out.println("310");
        return (cube);
    }

    //White Cross (2-53)
    public static char[] WhiteCross253(char[] cube, char[] solved) {

        if (solved[1] == cube[7] && solved[52] == cube[19]) // case 49 - 8-20 : 2-53
        {
            cube = F(cube);
            cube = F(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (solved[1] == cube[5] && solved[52] == cube[28]) // case 50 - 6-29 : 2-53
        {
            cube = R(cube);
            cube = R(cube);
            cube = D(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (solved[1] == cube[1] && solved[52] == cube[52]) // case 51 - 2-53 : 2-53
        {
            return (cube);//- 
        } else if (solved[1] == cube[3] && solved[52] == cube[10]) // case 52 - 4-11 : 2-53
        {
            cube = L(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (solved[1] == cube[23] && solved[52] == cube[30]) // case 53 - 24-31 : 2-53
        {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (solved[1] == cube[25] && solved[52] == cube[37]) // case 54 - 26-38 : 2-53
        {
            cube = D(cube);
            cube = Rp(cube);
            cube = B(cube);
            cube = R(cube);
        } else if (solved[1] == cube[21] && solved[52] == cube[14]) // case 55 - 22-15 : 2-53
        {
            cube = Up(cube);
            cube = Lp(cube);
            cube = U(cube);
        } else if (solved[1] == cube[41] && solved[52] == cube[34]) // case 56 - 42-35 : 2-53
        {
            cube = D(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (solved[1] == cube[43] && solved[52] == cube[46]) // case 57 - 44-47 : 2-53
        {
            cube = B(cube);
            cube = B(cube);
        } else if (solved[1] == cube[39] && solved[52] == cube[16]) // case 58 - 40-17 : 2-53
        {
            cube = Dp(cube);
            cube = B(cube);
            cube = B(cube);
        } else if (solved[1] == cube[50] && solved[52] == cube[32]) // case 59 - 51-33 : 2-53
        {
            cube = Up(cube);
            cube = Rp(cube);
            cube = U(cube);
        } else if (solved[1] == cube[48] && solved[52] == cube[12]) // case 60 - 49-13 : 2-53
        {
            cube = Up(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[1] == cube[19] && solved[52] == cube[7]) // case 61 - 20-8 : 2-53
        {
            cube = F(cube);
            cube = U(cube);
            cube = R(cube);
            cube = Up(cube);
        } else if (solved[1] == cube[28] && solved[52] == cube[5]) // case 62 - 29-6 : 2-53
        {
            cube = R(cube);
            cube = B(cube);
        } else if (solved[1] == cube[52] && solved[52] == cube[1]) // case 63 - 53-2 : 2-53
        {
            cube = Bp(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = U(cube);
        } else if (solved[1] == cube[10] && solved[52] == cube[3]) // case 64 - 11-4 : 2-53
        {
            cube = Lp(cube);
            cube = Bp(cube);
        } else if (solved[1] == cube[30] && solved[52] == cube[23]) // case 65 - 31-24 : 2-53
        {
            cube = U(cube);
            cube = U(cube);
            cube = Fp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[1] == cube[37] && solved[52] == cube[25]) // case 66 - 38-26 : 2-53
        {
            cube = U(cube);
            cube = U(cube);
            cube = F(cube);
            cube = F(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[1] == cube[14] && solved[52] == cube[21]) // case 67 - 15-22 : 2-53
        {
            cube = U(cube);
            cube = U(cube);
            cube = F(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[1] == cube[34] && solved[52] == cube[41]) // case 68 - 35-42 : 2-53
        {
            cube = Rp(cube);
            cube = B(cube);
            cube = R(cube);
        } else if (solved[1] == cube[46] && solved[52] == cube[43]) // case 69 - 47-44 : 2-53
        {
            cube = B(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
        } else if (solved[1] == cube[16] && solved[52] == cube[39]) // case 70 - 17-40 : 2-53
        {
            cube = U(cube);
            cube = L(cube);
            cube = Up(cube);
            cube = Bp(cube);
        } else if (solved[1] == cube[32] && solved[52] == cube[50]) // case 71 - 33-51 : 2-53
        {
            cube = B(cube);
        } else if (solved[1] == cube[12] && solved[52] == cube[48]) // case 72 - 13-49 : 2-53
        {
            cube = Bp(cube);
        }
        System.out.println("152");
        return (cube);
    }

    //White Cross (6-29)
    public static char[] WhiteCross629(char[] cube, char[] solved) {

        if (solved[5] == cube[7] && solved[28] == cube[19]) // case 73 - 8-20 : 6-29
        {
            cube = Up(cube);
            cube = Rp(cube);
            cube = U(cube);
            cube = R(cube);
        } else if (solved[5] == cube[5] && solved[28] == cube[28]) // case 74 - 6-29 : 6-29
        {
            return (cube);//-
        } else if (solved[5] == cube[1] && solved[28] == cube[52]) // case 75 - 2-53 : 6-29
        {
            cube = U(cube);
            cube = Rp(cube);
            cube = Up(cube);
            cube = R(cube);
        } else if (solved[5] == cube[3] && solved[28] == cube[10]) // case 76 - 4-11 : 6-29
        {
            cube = U(cube);
            cube = U(cube);
            cube = Rp(cube);
            cube = U(cube);
            cube = U(cube);
            cube = R(cube);
        } else if (solved[5] == cube[23] && solved[28] == cube[30]) // case 77 - 24-31 : 6-29
        {
            cube = R(cube);
        } else if (solved[5] == cube[25] && solved[28] == cube[37]) // case 78 - 26-38 : 6-29
        {
            cube = Fp(cube);
            cube = R(cube);
            cube = F(cube);
        } else if (solved[5] == cube[21] && solved[28] == cube[14]) // case 79 - 22-15 : 6-29
        {
            cube = U(cube);
            cube = U(cube);
            cube = Lp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[5] == cube[41] && solved[28] == cube[34]) // case 80 - 42-35 : 6-29
        {
            cube = R(cube);
            cube = R(cube);
        } else if (solved[5] == cube[43] && solved[28] == cube[46]) // case 81 - 44-47 : 6-29
        {
            cube = B(cube);
            cube = B(cube);
            cube = U(cube);
        } else if (solved[5] == cube[39] && solved[28] == cube[16]) // case 82 - 40-17 : 6-29
        {
            cube = L(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[5] == cube[50] && solved[28] == cube[32]) // case 83 - 51-33 : 6-29
        {
            cube = Rp(cube);
        } else if (solved[5] == cube[48] && solved[28] == cube[12]) // case 84 - 49-13 : 6-29
        {
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[5] == cube[19] && solved[28] == cube[7]) // case 85 - 20-8 : 6-29
        {
            cube = Fp(cube);
            cube = R(cube);
        } else if (solved[5] == cube[28] && solved[28] == cube[5]) // case 86 - 29-6 : 6-29
        {
            cube = U(cube);
            cube = Fp(cube);
            cube = Up(cube);
            cube = R(cube);
        } else if (solved[5] == cube[52] && solved[28] == cube[1]) // case 87 - 53-2 : 6-29
        {
            cube = Bp(cube);
            cube = Rp(cube);
        } else if (solved[5] == cube[10] && solved[28] == cube[3]) // case 88 - 11-4 : 6-29
        {
            cube = L(cube);
            cube = U(cube);
            cube = F(cube);
            cube = Up(cube);
        } else if (solved[5] == cube[30] && solved[28] == cube[23]) // case 89 - 31-24 : 6-29
        {
            cube = U(cube);
            cube = Fp(cube);
            cube = Up(cube);
        } else if (solved[5] == cube[37] && solved[28] == cube[25]) // case 90 - 38-26 : 6-29
        {
            cube = Up(cube);
            cube = F(cube);
            cube = F(cube);
            cube = U(cube);
        } else if (solved[5] == cube[14] && solved[28] == cube[21]) // case 91 - 15-22 : 6-29
        {
            cube = U(cube);
            cube = F(cube);
            cube = Up(cube);
        } else if (solved[5] == cube[34] && solved[28] == cube[41]) // case 92 - 35-42 : 6-29
        {
            cube = Dp(cube);
            cube = Fp(cube);
            cube = R(cube);
            cube = F(cube);
        } else if (solved[5] == cube[46] && solved[28] == cube[41]) // case 93 - 47-44 : 6-29
        {
            cube = B(cube);
            cube = Rp(cube);
            cube = Bp(cube);
        } else if (solved[5] == cube[16] && solved[28] == cube[39]) // case 94 - 17-40 : 6-29
        {
            cube = U(cube);
            cube = Lp(cube);
            cube = F(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[5] == cube[32] && solved[28] == cube[50]) // case 95 - 33-51 : 6-29
        {
            cube = Up(cube);
            cube = B(cube);
            cube = U(cube);
        } else if (solved[5] == cube[12] && solved[28] == cube[48]) // case 96 - 13-49 : 6-29
        {
            cube = Up(cube);
            cube = Bp(cube);
            cube = U(cube);
        }
        System.out.println("528");
        return (cube);
    }

//F2L
    //F2L corners
    public static char[] F2L_corners11052(char[] cube, char[] solved) {
        if (solved[0] == cube[0]
                && solved[9] == cube[9]
                && solved[51] == cube[51]) {
            return (cube);
        } else if (solved[0] == cube[2]
                && solved[9] == cube[53]
                && solved[51] == cube[29]) {
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (solved[0] == cube[8]
                && solved[9] == cube[27]
                && solved[51] == cube[20]) {
            cube = Rp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = L(cube);
        } else if (solved[0] == cube[6]
                && solved[9] == cube[18]
                && solved[51] == cube[11]) {
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Bp(cube);
        } else if (solved[0] == cube[51]
                && solved[9] == cube[0]
                && solved[51] == cube[9]) {
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (solved[0] == cube[29]
                && solved[9] == cube[2]
                && solved[51] == cube[53]) {
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (solved[0] == cube[20]
                && solved[9] == cube[8]
                && solved[51] == cube[27]) {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (solved[0] == cube[11]
                && solved[9] == cube[6]
                && solved[51] == cube[18]) {
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (solved[0] == cube[9]
                && solved[9] == cube[51]
                && solved[51] == cube[0]) {
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (solved[0] == cube[53]
                && solved[9] == cube[29]
                && solved[51] == cube[2]) {
            cube = Bp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (solved[0] == cube[27]
                && solved[9] == cube[20]
                && solved[51] == cube[8]) {
            cube = Rp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = R(cube);
        } else if (solved[0] == cube[18]
                && solved[9] == cube[11]
                && solved[51] == cube[6]) {
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (solved[0] == cube[45]
                && solved[9] == cube[15]
                && solved[51] == cube[42]) {
            cube = L(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = B(cube);
        } else if (solved[0] == cube[35]
                && solved[9] == cube[47]
                && solved[51] == cube[44]) {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (solved[0] == cube[26]
                && solved[9] == cube[33]
                && solved[51] == cube[38]) {
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (solved[0] == cube[17]
                && solved[9] == cube[24]
                && solved[52] == cube[36]) {
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (solved[0] == cube[15]
                && solved[9] == cube[42]
                && solved[51] == cube[45]) {
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (solved[0] == cube[47]
                && solved[9] == cube[44]
                && solved[51] == cube[35]) {
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
        } else if (solved[0] == cube[33]
                && solved[9] == cube[38]
                && solved[51] == cube[26]) {
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (solved[0] == cube[24]
                && solved[9] == cube[36]
                && solved[51] == cube[17]) {
            cube = B(cube);
            cube = Dp(cube);
            cube = B(cube);
        } else if (solved[0] == cube[42]
                && solved[9] == cube[45]
                && solved[51] == cube[15]) {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
        } else if (solved[0] == cube[44]
                && solved[9] == cube[35]
                && solved[51] == cube[47]) {
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
        } else if (solved[0] == cube[38]
                && solved[9] == cube[26]
                && solved[51] == cube[33]) {
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
        } else if (solved[0] == cube[36]
                && solved[9] == cube[17]
                && solved[51] == cube[24]) {
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
        }
        System.out.println("0951");
        return cube;
    }

    public static char[] F2L_corners35430(char[] cube, char[] solved) {
        if (solved[2] == cube[2]
                && solved[53] == cube[53]
                && solved[29] == cube[29]) {
            return (cube);
        } else if (solved[2] == cube[0]
                && solved[53] == cube[9]
                && solved[29] == cube[51]) {
            cube = Up(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (solved[2] == cube[8]
                && solved[53] == cube[27]
                && solved[29] == cube[20]) {
            cube = Up(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[6]
                && solved[53] == cube[18]
                && solved[29] == cube[11]) {
            cube = Up(cube);
            cube = Rp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[51]
                && solved[53] == cube[0]
                && solved[29] == cube[9]) {
            cube = Up(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[29]
                && solved[53] == cube[2]
                && solved[29] == cube[53]) {
            cube = Up(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[20]
                && solved[53] == cube[8]
                && solved[29] == cube[27]) {
            cube = Up(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[11]
                && solved[53] == cube[6]
                && solved[29] == cube[18]) {
            cube = Up(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[9]
                && solved[53] == cube[51]
                && solved[29] == cube[0]) {
            cube = Up(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[53]
                && solved[53] == cube[29]
                && solved[29] == cube[2]) {
            cube = Up(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[27]
                && solved[53] == cube[20]
                && solved[29] == cube[8]) {
            cube = Up(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[18]
                && solved[53] == cube[11]
                && solved[29] == cube[6]) {
            cube = Up(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = R(cube);
            cube = U(cube);
        } else if (solved[2] == cube[45]
                && solved[53] == cube[15]
                && solved[29] == cube[42]) {
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[35]
                && solved[53] == cube[47]
                && solved[29] == cube[44]) {
            cube = Up(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = B(cube);
            cube = U(cube);
        } else if (solved[2] == cube[26]
                && solved[53] == cube[33]
                && solved[29] == cube[38]) {
            cube = Up(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[17]
                && solved[53] == cube[24]
                && solved[29] == cube[36]) {
            cube = Up(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[15]
                && solved[53] == cube[42]
                && solved[29] == cube[45]) {
            cube = Up(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (solved[2] == cube[47]
                && solved[53] == cube[44]
                && solved[29] == cube[35]) {
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (solved[2] == cube[33]
                && solved[53] == cube[38]
                && solved[29] == cube[26]) {
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[2] == cube[24]
                && solved[53] == cube[36]
                && solved[29] == cube[17]) {
            cube = Up(cube);
            cube = D(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (solved[2] == cube[42]
                && solved[53] == cube[45]
                && solved[29] == cube[15]) {
            cube = Up(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = U(cube);
        } else if (solved[2] == cube[44]
                && solved[53] == cube[35]
                && solved[29] == cube[47]) {
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
        } else if (solved[2] == cube[38]
                && solved[53] == cube[26]
                && solved[29] == cube[33]) {
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
        } else if (solved[2] == cube[36]
                && solved[53] == cube[17]
                && solved[29] == cube[24]) {
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
        System.out.println("25329");
        return cube;
    }

    public static char[] F2L_corners61811(char[] cube, char[] solved) {
        if (solved[6] == cube[6]
                && solved[18] == cube[18]
                && solved[11] == cube[11]) {
            System.out.println("61811");
            return (cube);
        } else if (solved[6] == cube[0]
                && solved[18] == cube[9]
                && solved[11] == cube[51]) {
            cube = U(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[2]
                && solved[18] == cube[53]
                && solved[11] == cube[29]) {
            cube = U(cube);
            cube = Rp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[8]
                && solved[18] == cube[27]
                && solved[11] == cube[20]) {
            cube = U(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[51]
                && solved[18] == cube[0]
                && solved[11] == cube[9]) {
            cube = U(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[29]
                && solved[18] == cube[2]
                && solved[11] == cube[53]) {
            cube = U(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[20]
                && solved[18] == cube[8]
                && solved[11] == cube[27]) {
            cube = U(cube);
            cube = L(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[11]
                && solved[18] == cube[6]
                && solved[11] == cube[18]) {
            cube = U(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[9]
                && solved[18] == cube[51]
                && solved[11] == cube[0]) {
            cube = U(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[53]
                && solved[18] == cube[29]
                && solved[11] == cube[2]) {
            cube = U(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = R(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[27]
                && solved[18] == cube[20]
                && solved[11] == cube[8]) {
            cube = U(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = F(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[18]
                && solved[18] == cube[11]
                && solved[11] == cube[6]) {
            cube = U(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[45]
                && solved[18] == cube[15]
                && solved[11] == cube[42]) {
            cube = U(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[35]
                && solved[18] == cube[47]
                && solved[11] == cube[44]) {
            cube = U(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[26]
                && solved[18] == cube[33]
                && solved[11] == cube[38]) {
            cube = U(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[17]
                && solved[18] == cube[24]
                && solved[11] == cube[36]) {
            cube = U(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = Bp(cube);
            cube = Lp(cube);
            cube = B(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[15]
                && solved[18] == cube[42]
                && solved[11] == cube[45]) {
            cube = U(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
        } else if (solved[6] == cube[47]
                && solved[18] == cube[44]
                && solved[11] == cube[35]) {
            cube = U(cube);
            cube = Dp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[33]
                && solved[18] == cube[38]
                && solved[11] == cube[26]) {
            cube = U(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[24]
                && solved[18] == cube[36]
                && solved[11] == cube[17]) {
            cube = U(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[42]
                && solved[18] == cube[45]
                && solved[11] == cube[15]) {
            cube = U(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Bp(cube);
            cube = Up(cube);
        } else if (solved[6] == cube[44]
                && solved[18] == cube[35]
                && solved[11] == cube[47]) {
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
        } else if (solved[6] == cube[38]
                && solved[18] == cube[26]
                && solved[11] == cube[33]) {
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
        } else if (solved[6] == cube[36]
                && solved[18] == cube[17]
                && solved[11] == cube[24]) {
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
        System.out.println("61811");
        return cube;
    }

    public static char[] F2L_corners82710(char[] cube, char[] solved) {
        if (solved[8] == cube[8]
                && solved[27] == cube[27]
                && solved[20] == cube[20]) {
            return (cube);
        } else if (solved[8] == cube[0]
                && solved[27] == cube[9]
                && solved[20] == cube[51]) {
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
        } else if (solved[8] == cube[2]
                && solved[27] == cube[53]
                && solved[20] == cube[29]) {
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
        } else if (solved[8] == cube[6]
                && solved[27] == cube[18]
                && solved[20] == cube[11]) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[8] == cube[51]
                && solved[27] == cube[0]
                && solved[20] == cube[9]) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[8] == cube[29]
                && solved[27] == cube[2]
                && solved[20] == cube[53]) {
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
        } else if (solved[8] == cube[20]
                && solved[27] == cube[8]
                && solved[20] == cube[27]) {
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
        } else if (solved[8] == cube[11]
                && solved[27] == cube[6]
                && solved[20] == cube[18]) {
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
        } else if (solved[8] == cube[9]
                && solved[27] == cube[51]
                && solved[20] == cube[0]) {
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
        } else if (solved[8] == cube[53]
                && solved[27] == cube[29]
                && solved[20] == cube[2]) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[8] == cube[27]
                && solved[27] == cube[20]
                && solved[20] == cube[8]) {
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
        } else if (solved[8] == cube[18]
                && solved[27] == cube[11]
                && solved[20] == cube[6]) {
            cube = Up(cube);
            cube = Up(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = B(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[8] == cube[45]
                && solved[27] == cube[15]
                && solved[20] == cube[42]) {
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
        } else if (solved[8] == cube[35]
                && solved[27] == cube[47]
                && solved[20] == cube[44]) {
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
        } else if (solved[8] == cube[26]
                && solved[27] == cube[33]
                && solved[20] == cube[38]) {
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
        } else if (solved[8] == cube[17]
                && solved[27] == cube[24]
                && solved[20] == cube[36]) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[8] == cube[15]
                && solved[27] == cube[42]
                && solved[20] == cube[45]) {
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
        } else if (solved[8] == cube[47]
                && solved[27] == cube[44]
                && solved[20] == cube[35]) {
            cube = Up(cube);
            cube = Up(cube);
            cube = D(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = U(cube);
            cube = U(cube);
        } else if (solved[8] == cube[33]
                && solved[27] == cube[38]
                && solved[20] == cube[26]) {
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
        } else if (solved[8] == cube[24]
                && solved[27] == cube[36]
                && solved[20] == cube[17]) {
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
        } else if (solved[8] == cube[42]
                && solved[27] == cube[45]
                && solved[20] == cube[15]) {
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
        } else if (solved[8] == cube[44]
                && solved[27] == cube[35]
                && solved[20] == cube[47]) {
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
        } else if (solved[8] == cube[38]
                && solved[27] == cube[26]
                && solved[20] == cube[33]) {
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
        } else if (solved[8] == cube[36]
                && solved[27] == cube[17]
                && solved[20] == cube[24]) {
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
        System.out.println("82720");
        return cube;
    }

    //F2L edges
    public static char[] F2L_edges2330(char[] cube, char[] solved) {
        if (solved[23] == cube[23]
                && solved[30] == cube[30]) {
            return (cube);
        } else if (solved[23] == cube[14]
                && solved[30] == cube[21]) {
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
        } else if (solved[23] == cube[12]
                && solved[30] == cube[48]) {
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
        } else if (solved[23] == cube[32]
                && solved[30] == cube[50]) {
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
        } else if (solved[23] == cube[16]
                && solved[30] == cube[39]) {
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (solved[23] == cube[25]
                && solved[30] == cube[37]) {
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (solved[23] == cube[34]
                && solved[30] == cube[41]) {
            cube = D(cube);
            cube = D(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        } else if (solved[23] == cube[43]
                && solved[30] == cube[46]) {
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
        } else if (solved[23] == cube[30]
                && solved[30] == cube[23]) {
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
        } else if (solved[23] == cube[21]
                && solved[30] == cube[14]) {
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
        } else if (solved[23] == cube[48]
                && solved[30] == cube[12]) {
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
        } else if (solved[23] == cube[50]
                && solved[30] == cube[32]) {
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
        } else if (solved[23] == cube[39]
                && solved[30] == cube[16]) {
            cube = Dp(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
        } else if (solved[23] == cube[37]
                && solved[30] == cube[25]) {
            cube = D(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
        } else if (solved[23] == cube[41]
                && solved[30] == cube[34]) {
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
        } else if (solved[23] == cube[46]
                && solved[30] == cube[43]) {
            cube = D(cube);
            cube = Rp(cube);
            cube = D(cube);
            cube = R(cube);
            cube = D(cube);
            cube = F(cube);
            cube = Dp(cube);
            cube = Fp(cube);
        }
        System.out.println("2330");
        return cube;
    }

    public static char[] F2L_edges1421(char[] cube, char[] solved) {
        if (solved[14] == cube[14]
                && solved[21] == cube[21]) {
            return (cube);
        } else if (solved[14] == cube[23]
                && solved[21] == cube[30]) {
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
        } else if (solved[14] == cube[12]
                && solved[21] == cube[48]) {
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
        } else if (solved[14] == cube[32]
                && solved[21] == cube[50]) {
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
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
        } else if (solved[14] == cube[16]
                && solved[21] == cube[39]) {
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
        } else if (solved[14] == cube[25]
                && solved[21] == cube[37]) {
            cube = D(cube);
            cube = D(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
        } else if (solved[14] == cube[34]
                && solved[21] == cube[41]) {
            cube = D(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
        } else if (solved[14] == cube[43]
                && solved[21] == cube[46]) {
            cube = Dp(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
        } else if (solved[14] == cube[30]
                && solved[21] == cube[23]) {
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
        } else if (solved[14] == cube[21]
                && solved[21] == cube[14]) {
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
        } else if (solved[14] == cube[48]
                && solved[21] == cube[12]) {
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
        } else if (solved[14] == cube[50]
                && solved[21] == cube[32]) {
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
        } else if (solved[14] == cube[39]
                && solved[21] == cube[16]) {
            cube = D(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
        } else if (solved[14] == cube[37]
                && solved[21] == cube[25]) {
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
        } else if (solved[14] == cube[41]
                && solved[21] == cube[34]) {
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = Dp(cube);
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
        } else if (solved[14] == cube[46]
                && solved[21] == cube[43]) {
            cube = Fp(cube);
            cube = D(cube);
            cube = F(cube);
            cube = D(cube);
            cube = L(cube);
            cube = Dp(cube);
            cube = Lp(cube);
        }
        System.out.println("1421");
        return cube;
    }

    public static char[] F2L_edges1248(char[] cube, char[] solved) {
        if (solved[12] == cube[12]
                && solved[48] == cube[48]) {
            return (cube);
        } else if (solved[12] == cube[14]
                && solved[48] == cube[21]) {
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
        } else if (solved[12] == cube[23]
                && solved[48] == cube[30]) {
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
        } else if (solved[12] == cube[32]
                && solved[48] == cube[50]) {
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
        } else if (solved[12] == cube[16]
                && solved[48] == cube[39]) {
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (solved[12] == cube[25]
                && solved[48] == cube[37]) {
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (solved[12] == cube[34]
                && solved[48] == cube[41]) {
            cube = Dp(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
        } else if (solved[12] == cube[43]
                && solved[48] == cube[46]) {
            cube = Dp(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (solved[12] == cube[30]
                && solved[48] == cube[23]) {
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
        } else if (solved[12] == cube[21]
                && solved[48] == cube[14]) {
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
        } else if (solved[12] == cube[48]
                && solved[48] == cube[12]) {
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
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (solved[12] == cube[50]
                && solved[48] == cube[32]) {
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
        } else if (solved[12] == cube[39]
                && solved[48] == cube[16]) {
            cube = D(cube);
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (solved[12] == cube[37]
                && solved[48] == cube[25]) {
            cube = D(cube);
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (solved[12] == cube[41]
                && solved[48] == cube[34]) {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
        } else if (solved[12] == cube[46]
                && solved[48] == cube[43]) {
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
        System.out.println("1248");
        return cube;
    }

    public static char[] F2L_edges3250(char[] cube, char[] solved) {
        if (solved[32] == cube[32]
                && solved[50] == cube[50]) {
            return (cube);
        } else if (solved[32] == cube[14]
                && solved[50] == cube[21]) {
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
            cube = Rp(cube);
        } else if (solved[32] == cube[12]
                && solved[50] == cube[48]) {
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
        } else if (solved[32] == cube[23]
                && solved[50] == cube[30]) {
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
        } else if (solved[32] == cube[16]
                && solved[50] == cube[39]) {
            cube = D(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
        } else if (solved[32] == cube[25]
                && solved[50] == cube[37]) {
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
        } else if (solved[32] == cube[34]
                && solved[50] == cube[41]) {
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
        } else if (solved[32] == cube[43]
                && solved[50] == cube[46]) {
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (solved[32] == cube[30]
                && solved[50] == cube[23]) {
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
        } else if (solved[32] == cube[21]
                && solved[50] == cube[14]) {
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
        } else if (solved[32] == cube[48]
                && solved[50] == cube[12]) {
            cube = Lp(cube);
            cube = D(cube);
            cube = L(cube);
            cube = D(cube);
            cube = B(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = Dp(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (solved[32] == cube[50]
                && solved[50] == cube[32]) {
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
        } else if (solved[32] == cube[39]
                && solved[50] == cube[16]) {
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (solved[32] == cube[37]
                && solved[50] == cube[25]) {
            cube = Dp(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (solved[32] == cube[41]
                && solved[50] == cube[34]) {
            cube = D(cube);
            cube = D(cube);
            cube = R(cube);
            cube = Dp(cube);
            cube = Rp(cube);
            cube = Dp(cube);
            cube = Bp(cube);
            cube = D(cube);
            cube = B(cube);
        } else if (solved[32] == cube[46]
                && solved[50] == cube[43]) {
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
        System.out.println("3250");
        return cube;
    }
}
/*TO do
-Make list of cases
-Make functions for one case and the algorithm to solve it
*/