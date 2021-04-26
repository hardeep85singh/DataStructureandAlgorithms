package sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 0, 20, -2, 9};

        selectionSort1(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallest = arr[index];
            arr[index] = arr[i];
            arr[i] = smallest;
        }
        return arr;
    }

    public static int[] selectionSort1(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int index = i;
            for (int j = i; j< arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}
