package containsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class containsDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 4, 5, 6);
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        boolean ans = (set.size() != nums.size()) ? true : false;
        System.out.println(ans);
    }
}
