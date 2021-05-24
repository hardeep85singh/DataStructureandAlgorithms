package leetCode.easy;

public class RemoveElement {

    public static void main(String [] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        int j = length-1;

        for (int i = length-1; i>=0; i--){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        return j+1;
    }
}
