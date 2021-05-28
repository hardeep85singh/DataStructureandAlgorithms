package leetCode.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1, 1, nums2, 1);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            } else {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }
        }

        while (n > 0) {
            nums1[m + n - 1] = nums2[n - 1];
            n--;
        }
        System.out.println(Arrays.toString(nums1));

//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//
//        while (k >= 0) {
//            if (j < 0 || (i >= 0 && A[i] > B[j]))
//                A[k--] = A[i--];
//            else
//                A[k--] = B[j--];
//        }
    }
}
