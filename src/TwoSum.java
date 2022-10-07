/*
Given an array of integers nums and an integer target, return indices of the two numbers such that
they add up to target.
 */
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] test = {2, 7, 11, 15};
        twoSum(test, 9);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {

                result[1] = i;
                result[0] = map.get(target - nums[i]);

                return result;
            }

            map.put(nums[i], i);
        }

        return result;
    }
}
