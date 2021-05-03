package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 0, 20, -2, 9};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] bubbleSort(int[] arr){

        for(int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSort2(int[] arr){
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j< arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
