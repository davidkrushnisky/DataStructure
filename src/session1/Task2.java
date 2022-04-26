package session1;

import java.util.Scanner;

public class Task2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] data;

        try{
            //Ask user to enter width and height
            System.out.println("Enter the width and height of an array");

            int width = input.nextInt();
            int height = input.nextInt();
            if (width < 1 || height < 1){
                throw new IllegalArgumentException("Error: Please enter a number greater than 1");
            }

            data = new int[width][height];

            //give random numbers to the array
            for(int row=0; row<data.length; row++){
                for(int col=0; col<data[row].length; col++){
                    data[row][col] = -99 + (int)(Math.random()* 199);
                }
            }

            //print the array
            for(int row=0; row<data.length; row++){
                for(int col=0; col<data[row].length; col++){
                    //Printf = print format. %s for string, %d for digit.
                    System.out.printf("%s%4d", col==0 ? "" : ",", data[row][col]);
                }
                System.out.println();
            }

            printSumNumbers(data);
            printSumRows(data);
            printSumColumns(data);
            //stdDeviation(data)
            //findPairsOfPrime(data)

        } catch(IllegalArgumentException exc){
            System.out.println(exc.getMessage());
        }
    }

    private static void printSumRows(int[][] data){
        for(int row=0; row<data.length; row++){
            int sum = 0;
            for(int col=0; col<data[row].length; col++){
                sum += data[row][col];
            }
            System.out.printf("The sum of row %d is : %d", row + 1, sum);
            System.out.println();
        }
    }

    private static void printSumNumbers(int[][] data) {
        double sum = 0;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                sum += data[row][col];
                System.out.println("sum of all the numbers is: " + sum);
            }
        }
    }

    private static void printSumColumns(int[][] data){
        for(int col=0; col<data[0].length; col++){
            int sum = 0;
            for (int row = 0; row < data.length; row++) {
                sum += data[row][col];
            }
            System.out.printf("The sum of column %d is : %d", col + 1, sum);
            System.out.println();
        }
    }

//    private static void stdDeviation(int[][] data){
//
//    }
//
//    private static boolean isPrime(int val){
//        return false;
//    }
//
//    private static void findPairsOfPrime(int[][] data){
//
//    }
}
