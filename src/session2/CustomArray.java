package session2;

public class CustomArray {

    private int[] data = new int[1]; // only grows by doubling size, never shrinks
    private int size = 0; // how many items do you really have

    public int size() {
        return size;
    }

    public void add(int value) {
        if(size == data.length){
            growStorage();
        }
        data[size] = value;
        size++;
    }

    public void deleteByIndex(int index) {
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        //shifting the data from right to left
        for(int i = index + 1; i < size; i++){
            data[i - 1] = data[i];
        }
        size--;

        //shrink -> optional
        if((double) size / data.length * 100 < 25){
            shrinkStorage();
        }
    }

    public boolean deleteByValue(int value) {
        for(int i=0; i<data.length; i++){
            if (data[i] == value){
                this.deleteByIndex(i);
                return true;
            }
        }
        return false;
    } // delete first value matching, true if value found, false otherwise

    public void insertValueAtIndex(int value, int index) {
        if(size == data.length){
            this.growStorage();
        }
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        //shift for inserting a new element in the middle
        for(int i = size -1; i>index; i--){
            data[i+1] = data[i];
        }
        data[index] = value;
        size++;
    }

    public void clear() {
        size = 0;
    }

    public int get(int index) {
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public int[] getSlice(int startIdx, int length) {
        if(startIdx < 0 || length < 0 || startIdx + length > size){
            throw new IndexOutOfBoundsException();
        }
        int[] slice = new int[length];
        for(int i=0; i < length; i++){
            slice[i] = data[i+startIdx];
        }
        return slice;
    }


    @Override
    public String toString() {
        return null;
    } // returns String similar to: [3, 5, 6, -23]

    private void growStorage(){
        int[] newData = new int[data.length * 2];
        for(int i=0; i<data.length; i++){
            newData[i] = data[i];
        }
        //The old array of integer will be collected by garbage collector.
        data = newData;
    }

    private void shrinkStorage(){
        int[] newData = new int[data.length / 2];
        for(int i=0; i<size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

}
