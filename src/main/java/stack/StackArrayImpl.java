package stack;

public class StackArrayImpl implements Stack {

    private int[] arr;
    private int size;
    private int current;

    public StackArrayImpl() {
        arr = new int[10];
        size = 10;
        current = 0;
    }

    @Override
    public void push(int data) {
        if (current > arr.length) {
            int[] newArr = new int[arr.length * 2];
            size = size * 2;
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        } else {
            arr[current] = data;
            current++;
        }
    }

    @Override
    public int pop() {
        if (current == 0){
            throw new IllegalArgumentException("No element to pop");
        }
        current--;
        return arr[current+1];
    }

    @Override
    public int top() {
        if (current == 0){
            throw new IllegalArgumentException("No element to pop");
        }
        return arr[current];
    }

    @Override
    public int size() {
        return current;
    }

    @Override
    public boolean isEmpty() {
        if (current == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (current == size){
            return true;
        }
        return false;
    }
}
