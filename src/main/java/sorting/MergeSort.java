package sorting;

public class MergeSort {

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
}
