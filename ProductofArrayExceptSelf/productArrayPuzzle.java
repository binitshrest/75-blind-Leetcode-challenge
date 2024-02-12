package ProductofArrayExceptSelf;

import java.util.Arrays;
import java.util.List;

public class productArrayPuzzle {

    public static void productOfAll(int[] nums, int[] pf, int[] sf) {
        int n = nums.length;
        pf[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] * nums[i];
        }

        sf[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sf[i] = sf[i + 1] * nums[i];
        }
    }

    public static int[] productArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] sf = new int[n];
        int[] pf = new int[n];
        productOfAll(nums, pf, sf);
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res[i] = sf[i + 1];
            } else if (i == n - 1) {
                res[i] = pf[i - 1];
            } else {
                res[i] = pf[i - 1] * sf[i + 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] res = productArray(input);
        System.out.println("res ->" + Arrays.toString(res));

    }

}
