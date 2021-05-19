package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {0, -2, 2, 1, 10, -5};
        mergeSort1(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (right > left) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static int[] merge(int[] arr, int left, int middle, int right) {

        int[] arrLeft = new int[middle - left + 1];
        int[] arrRight = new int[right - middle];

        for (int i = 0; i < arrLeft.length; i++) {
            arrLeft[i] = arr[left + i];
        }

        for (int i = 0; i < arrRight.length; i++) {
            arrRight[i] = arr[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < arrLeft.length && j < arrRight.length) {
            if (arrLeft[i] < arrRight[j]) {
                arr[k] = arrLeft[i];
                i++;
            } else {
                arr[k] = arrRight[j];
                j++;
            }
            k++;
        }

        while (i < arrLeft.length) {
            arr[k] = arrLeft[i];
            i++;
            k++;
        }

        while (j < arrRight.length) {
            arr[k] = arrRight[j];
            j++;
            k++;
        }

        return arr;
    }

    public static int[] mergeSort1(int[] arr, int left, int right){
        if(left < right){
            int middle = (left + right) / 2;
            mergeSort1(arr, left, middle);
            mergeSort1(arr, middle+1, right);
            merge1(arr, left, middle, right);
        }
        return arr;
    }

    public static int[] merge1(int[] arr, int left, int middle, int right){
        int l1 = middle - left + 1;
        int l2 = right - middle;

        int[] arrLeft = new int[l1];
        int[] arrRight = new int[l2];

        for (int i = 0; i< l1; i++){
            arrLeft[i] = arr[left + i];
        }

        for (int i = 0; i< l2; i++){
            arrRight[i] = arr[middle + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < l1 && j < l2){
            if(arrLeft[i] < arrRight[j]){
                arr[k] = arrLeft[i];
                i++;
            } else {
                arr[k] = arrRight[j];
                j++;
            }
            k++;
        }

        while (i < l1){
            arr[k] = arrLeft[i];
            i++;
            k++;
        }

        while (j < l2){
            arr[k] = arrRight[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void mergeSort3(int[] arr, int left, int right){
        if(left < right){
            int middle = (left + right) /2;

            mergeSort3(arr, left, middle);
            mergeSort3(arr, middle + 1, right);
            merge3(arr, left, middle, right);
        }

    }

    public static int[] merge3(int[] arr, int left, int middle, int right){
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int [] arrLeft = new int[n1];
        int [] arrRight = new int[n2];

        for (int i = 0; i < n1; i++){
            arrLeft[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++){
            arrRight[i] = arr[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2 ){
            if(arrLeft[i] < arrRight[j]){
                arr[k] = arrLeft[i];
                i++;
            } else {
                arr[k] = arrRight[j];
                j++;
            }

            k++;
        }

        while (i < n1){
            arr[k] = arrLeft[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = arrRight[j];
            j++;
            k++;
        }
        return arr;
    }
}
