package session3;

public class LinkedListArrayOfString {

    private class Container{
        Container next;
        String value;
    }

    private Container start, end;
    private int size;

    public void addToFront(String value) {
        Container newNode = new Container();
        newNode.value = value;

        //size = 0
        if(size==0){
            start = newNode;
            end = newNode;
            size++;
        } else {
            //size > 0
            newNode.next = start; //pointing to the ex-first element
            start = newNode;
            size++;
        }
    }

    public void addToEnd(String value){
        Container newNode = new Container();
        newNode.value = value;

        if(size==0) {
            start = newNode;
            end = newNode;
            size++;
        } else {
            end.next = newNode;
            end = newNode;
            size++;
        }
    }


    public String get(int index){
        //check the index -> index out of bound
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        //if index = size - 1
        if(index == size-1) {
            return end.value;
        }

        //if index = 0 -> return start.value
        if(index == 0){
            return start.value;
        }

        //If middle element, use while loop
        Container curContainer = start;
        int counter = 0;
        while (curContainer != null){
            if(counter == index){
                return curContainer.value;
            }
            counter++;
            curContainer = curContainer.next;
        }
        throw new RuntimeException("Internal error");
    }

    public void insertValueAtIndex(int index, String value){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if(size == 0 || index == size){
            this.addToEnd(value);
            return;
        }
        if(index==0){
            addToFront(value);
            return;
        }
        //find the container just before the index specified
        Container before = start;
        for (int i=0; i<index-1; i++){
            before = before.next;
        }
        Container newNode = new Container();
        newNode.value = value;

        newNode.next = before.next;
        before.next = newNode;
        size++;
    }

    public void deleteByIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if (index ==0){
            start = start.next;
            size--;
            return;
        }
        Container before = start;
        for (int i=0; i<index-1; i++){
            before = before.next;
        }
        //for removing the last node
        if(index == size -1){
            end = before;
        }
        before.next = before.next.next;
        size--;
    }

    public boolean deleteByValue(String value){
        Container cur = start;
        int counter = 0;
        while (cur!=null){
            if(cur.value.equals(value)){
                deleteByIndex(counter);
                return true;
            }
            counter++;
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString(){
        Container curr = start;
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (curr !=null){
            builder.append(curr == start ? "" : ",");
            builder.append(curr.value);
            curr = curr.next;
        }
        builder.append("]");
        return builder.toString();
    } // comma-separated values list similar to: [5,8,11]
}
