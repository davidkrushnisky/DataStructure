package session2;

public class CustomArrayTest {

    public static void main(String[] args) {
        CustomArray array = new CustomArray();

        array.add(1);
        int x = array.get(0);
        System.out.println(x);

        array.add(2);
        try{
            x = array.get(1);
            System.out.println(x);
        } catch (IllegalArgumentException exc){
            System.out.println(exc.getMessage());
        }


        array.add(3);
        x = array.get(2);
        System.out.println(x);

        System.out.println("the size is " + array.size());

        array.deleteByIndex(1);

        System.out.println("the size after delete is " + array.size());

        x = array.get(1);
        System.out.println(x);
    }

}
