package session3;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedListArrayOfString customLinkedList = new LinkedListArrayOfString();
        customLinkedList.addToFront("B");
        customLinkedList.addToEnd("I");
        customLinkedList.addToEnd("N");
//        customLinkedList.add("G");
//        customLinkedList.add("O");

        System.out.println(customLinkedList.toString());
    }
}
