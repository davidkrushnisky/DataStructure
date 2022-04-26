package session5;

public class ArrayStack {
    private int top;
    private Employee[] stack;
    private int size = 0;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        stack[size] = employee;
        size++;
    }

    public Employee pop() {
        Employee emp = stack[size-1];
        stack[size-1] = null;
        size--;
        return emp;
    }

    public Employee peek() {
        return stack[size-1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if(size==0) return true;
        else return false;
    }

    public void printStack() {
        System.out.println();
    }
}

class Employee{
    private String firstName;
    private String lastName;
    private int id;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
