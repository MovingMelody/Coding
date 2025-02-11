package LC229;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        System.out.print(majorityElement(new int[] { 2, 1, 1, 3, 1, 4, 5, 6 }));

    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> majElements = new ArrayList<>();
        int count1 = 0, count2 = 0, mayBeMaj1 = 0, mayBeMaj2 = 0;
        for (int x : nums) {
            if (mayBeMaj1 == x) {
                count1++;
            } else if (mayBeMaj2 == x) {
                count2++;
            } else if (count1 == 0) {
                mayBeMaj1 = x;
                count1++;
            } else if (count2 == 0) {
                mayBeMaj2 = x;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int x : nums) {
            if (x == mayBeMaj1)
                count1++;
            else if (x == mayBeMaj2)
                count2++;
        }

        if (count1 > nums.length / 3) {
            majElements.add(mayBeMaj1);
        }

        if (count2 > nums.length / 3) {
            majElements.add(mayBeMaj2);
        }

        return majElements;
    }
}
