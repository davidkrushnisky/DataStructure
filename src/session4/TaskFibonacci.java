package session4;

public class TaskFibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(2));
    }

    static int fibo(int number){
        if (number == 0) return 0;
        if (number == 1) return 1;
        return fibo(number - 1) + fibo(number -2);
    }
}
