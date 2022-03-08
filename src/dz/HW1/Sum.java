package dz.HW1;

import java.util.Arrays;

public class Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        res[0] = j;
                        res[1] = i;
                        return res;
                    }
                } else break;
            }
        }
        return res;
    }
}

class Test {
    public static void main(String[] args) {
        Sum s = new Sum();
        int[] nums = {2, 7, 11, 15};
        int[] result = s.twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }
}

