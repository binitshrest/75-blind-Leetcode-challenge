package TwoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = { -1, -1 };
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n - 1; i++) {
            int a = nums[i];
            int b = target - a;
            if (map.containsKey(b)) {
                res[0] = i;
                res[1] = map.get(b);
            }
            map.put(a, i);
        }
        return res;
    }

    public static void main(String args[]) {
        // List<Integer> li = Arrays.asList(2, 7, 11, 15);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scn.nextInt();
        System.out.println("Enter target:");
        int target = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
        scn.close();
    }
}