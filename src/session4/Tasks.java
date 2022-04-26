package session4;

public class Tasks {

    public static void main(String[] args) {

        int[] array = {1, 5, 4, 10, 5, 8};
        System.out.println(maximumValue(array));
    }

    static int maximumValue(int[] arr){
        int maxValue = arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
