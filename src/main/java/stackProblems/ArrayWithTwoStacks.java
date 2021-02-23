package stackProblems;

import java.util.EmptyStackException;

public class ArrayWithTwoStacks {
    private int[] arr;
    private int size;
    private int topOne;
    private int topTwo;

    public ArrayWithTwoStacks(int size){
        if(size < 2){
            throw new IllegalStateException(
                    "size <2 is not permissible"
            );
        }
        arr = new int[size];
        this.size = size;
        topOne = -1;
        topTwo = size;
    }

    public void push(int stackId, int data){
        if(topTwo == topOne + 1){
            throw new IllegalArgumentException("Array is full");
        }
        if(stackId == 1){
            arr[topOne++] = data;
        } else if(stackId == 2){
            arr[topTwo--] = data;
        } else {
            return;
        }
    }

    public int pop(int stackId){
        if(stackId ==1){
            if(topOne == -1){
                throw new EmptyStackException();
            }
            int toPop = arr[topOne];
            arr[topOne--] = 0;
            return toPop;
        } else if(stackId == 2){
            if(topTwo == this.size){
                throw new EmptyStackException();
            }
            int toPop = arr[topTwo];
            arr[topTwo++] = 0;
            return toPop;
        } else{
            return 0;
        }
    }
}
