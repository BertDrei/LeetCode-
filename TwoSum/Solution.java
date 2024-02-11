package TwoSum;
import java.util.Scanner;
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] nums = {2,7,11,15};
        int target  = 18;

        //int[] answer = twoSum(nums, target);

       // System.out.println(Arrays.toString(answer));
    }




    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return nums;
    }
}
