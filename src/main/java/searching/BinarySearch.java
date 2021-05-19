package searching;

public class BinarySearch {

    int size;
    int k;

//    public int[] sort(int[] array) {
//        MergeSort mergeSort = new MergeSort();
//        mergeSort.sort(array, 0, array.length - 1);
//        return array;
//    }

    public static int binarySearch(int[] array, int left, int right, int number) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (array[mid] == number) {
                return mid;
            }
            if (array[mid] > number) {
                return binarySearch(array, left, mid - 1, number);
            } else {
                return binarySearch(array, mid + 1, right, number);
            }
        }
        return -1;
    }

    public int[] rotateArray(int[] array, int k) {
        int count = 0;
        while (count < k) {
            int temp = array[0];
            for (int j = 1; j < array.length; j++) {
                array[j - 1] = array[j];
            }
            array[array.length - 1] = temp;
            count++;
        }
        return array;
    }

    public static int binarySearch1(int[] arr, int left, int right, int number){
        if(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == number){
                return mid;
            } else if (number < arr[mid]){
                return binarySearch1(arr, left, mid -1, number);
            } else {
                return binarySearch1(arr, mid + 1, right, number);
            }
        }
        return -1;
    }

    public int binarySearch2(int[] arr, int left, int right, int number){
        if(left<= right){
            int mid = (left + right) /2;

            if(arr[mid] == number){
                return mid;
            }
            if ( number < arr[mid]){
                return binarySearch2(arr, left, mid -1, number);
            } else {
                return binarySearch2(arr, mid+1, right, number);
            }
        }
        return -1;
    }

    public static void main(String[]args){
        int[] array = {1,3,5,7,9,10};
        int x = binarySearch(array, 0, 6, 5);
        System.out.println(x);
    }

}
