package leetcode.challenge.easy;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static List<Integer> solution(List<Integer> nums, int target) {
        List<Integer> indexSum = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int n = 0; n < nums.size(); n++) {
                if (nums.get(i).equals(nums.get(n))) {
                    sum = 0;
                } else {
                    sum = nums.get(i) + nums.get(n);
                    if (sum == target) {
                        indexSum.add(i);
                        indexSum.add(n);
                    }
                }
            } if (indexSum.size() == 2) {
                break;
            }
        }
        return indexSum;
    }
}
