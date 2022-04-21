import java.util.Scanner;

public class Task2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] data;

        try{
            System.out.println("Enter the width of an array: ");
            try{
                int width = input.nextInt();
            } catch(IllegalArgumentException exc){
                System.out.println("Please enter an integer");
            }
        } catch(IllegalArgumentException exc){

        }
    }
}
