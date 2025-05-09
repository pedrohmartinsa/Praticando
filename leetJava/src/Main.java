import leetcode.challenge.easy.TwoSum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        int target = 6;

        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(3);

        System.out.println(TwoSum.solution(nums, target));
    }
}