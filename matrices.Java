
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZULAIKHA
 */
public class Matrix {

    private static Scanner inputValues = new Scanner(System.in);
    public static int[][] A = new int[3][3];
    public static int[][] B = new int[3][3];
    private static double[][] C = new double[3][3];

    public static double Determinant() {
        double sum;
        int i;
        int j;
        int k;
        i = (A[0][0] * ((A[1][1]) * A[2][2] - (A[1][2]) * A[2][1]));
        j = (A[0][1] * ((A[1][0]) * A[2][2] - (A[1][2]) * A[2][0]));
        k = (A[0][2] * ((A[1][0]) * A[2][1] - (A[1][1]) * A[2][0]));
        sum = i - j + k;
        return sum;
    }

    public static void Transpose() {
        System.out.println("THE TRANSPOSE OF THIS MATRIX IS :");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(A[c][r] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void Cofactor() {

        B[0][0] = (A[1][1] * A[2][2]) - (A[1][2] * A[2][1]);
        B[0][1] = -((A[1][0] * A[2][2] - A[1][2] * A[2][0]));
        B[0][2] = (A[1][0] * A[2][1]) - (A[1][1] * A[2][0]);
        B[1][0] = -((A[0][1] * A[2][2]) - (A[0][2] * A[2][1]));
        B[1][1] = (A[1][0] * A[2][2]) - (A[1][2] * A[2][0]);
        B[1][2] = -((A[1][0] * A[2][1] - A[1][1] * A[2][0]));
        B[2][0] = (A[0][1] * A[1][2]) - (A[0][2] * A[1][1]);
        B[2][1] = -((A[0][0] * A[1][2] - A[0][2] * A[1][0]));
        B[2][2] = (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
        System.out.println("THE COFACTOR MATRIX IS :");

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(B[r][c] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("THE TRANSPOSE OF THe COFACTOR IS :");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(B[c][r] + "\t");
                C[r][c]= B[c][r];
            }
            System.out.print("\n");
        }
    }
    

    public static void main(String[] args) {
        /*  int [][] A = new int[3][3];
         int i;
         int j;
         int k;
         double Determinant;*/

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("enter value of ROW:" + r + " , COLUMN:" + c);
                A[r][c] = inputValues.nextInt();
            }
        }
        System.out.println("THE GIVEN MATRIX IS");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(A[r][c] + "\t");
            }
            System.out.print("\n");
        }
        /* i = (A[0][0]*((A[1][1])*A[2][2])-((A[1][2])*A[2][1]));
         j = (A[0][1]*((A[1][0])*A[2][2])-((A[1][2])*A[2][0]));
         k = (A[0][2]*((A[1][0])*A[2][1])-((A[1][1])*A[2][0]));
         Determinant =i-j+k;
         System.out.println( "DETERMINANT = "+Determinant);*/
        System.out.println("DETERMINANT = " + Determinant());
        Transpose();
        Cofactor();
        inverse(Determinant());
             // System.out.println( "INVERSE = "+Cofactor() +"" +Determinant()); 
      /*         
         for( int r = 0; r<3; r++){
         for(int c = 0; c<3; c++){
         A[r][c] = A[c][r];
         }
         }
               
         for( int r = 0; r<3; r++){
         for(int c = 0; c<3; c++){
         System.out.print( A[r][c]+"\t");
         }
         System.out.print("\n");
         } */
    }

    

    private static void inverse(double determinant) {
        System.out.println("The inverse of the matrix is:");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                C[r][c] /= determinant;
                System.out.printf("%.3f\t", C[r][c]);
            }
            System.out.println();
        }
    }
}
