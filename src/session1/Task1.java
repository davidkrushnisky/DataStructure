package session1;

import java.util.Scanner;

public class Task1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int[] data;
        try{
            System.out.println("Enter the size of the array");
            int size = input.nextInt();
            if (size < 1){
                throw new IllegalArgumentException("Error: Please enter a number greater than 1");
            }

            data = new int[size];

            for(int i=0; i<data.length; i++){
                data[i] = (int) (Math.random()*100+1);
            }

            for(int i=0; i<data.length; i++){
                System.out.printf("%s %d", i==0 ? "" : ",", data[i]);
            }

            System.out.println();
            System.out.println("Prime Numbers");

            boolean isFirst = true;
            for(int i=0; i<data.length; i++){
                if(isPrime(data[i])){
                    System.out.printf("%s %d,", isFirst ? "" : ",", data[i]);
                    isFirst = false;
                }
            }

        }catch (IllegalArgumentException exc){
            System.out.println(exc.getMessage());
        }
    }

    private static boolean isPrime(int number){
        for(int n=2; n<Math.sqrt(number); n++){
            if(number % n == 0){
                return false;
            }
        }
        if(number < 2){
            return false;
        }
        return true;
    }
}
