package leetCode.easy;

public class SearchInsertPosition {

    public static void main(String[] args){
        int[] nums = {1,3,5,9};
        System.out.println(searchInsert(nums, 9));
    }

    public static int searchInsert(int[] nums, int target) {
      int i = 0;
      int j = nums.length-1;

      while(i<=j){
          int mid = (i+j) /2;

          if(target > nums[mid]){
              i = mid + 1;
          } else if(target < nums[mid]){
              j = mid-1;
          } else {
              return mid;
          }
      }
      return i;
    }
}
