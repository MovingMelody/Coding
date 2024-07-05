package MajorityElement_169;
/*
* Created on 05 July 2024
* 
* @author Sai Sumanth
*/

import java.util.HashMap;

class MajorityElement {
    public static void main(String[] args) {
        System.out.println("LC 169 - Majority Element");

        int maj = majorityElement(new int[] { 3, 2, 3 });
        System.out.println("Majority Element : " + maj);

        maj = majorityElementOptimal(new int[] { 2, 2, 1, 1, 1, 2, 2 });
        System.out.println("Optimal Majority Element : " + maj);

    }

    /*
     * Brute Force - Using Hash Map & counting the freq of each element
     */
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res = 0, prevMax = 0;
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) > prevMax) {
                res = x;
                prevMax = map.get(x);
            }
        }
        return res;
    }

    /*
     * Optimal Approach - Moore's Voting Algorithm 🧬
     * 
     * - Assume first element as majority element
     * - Iterate the array if the element is same as assumed majority element then count++ otherwise count--
     * - Once the count becomes 0 then we can say that assumed maj element is not maj till that subarray,
     * - so once counter hits 0 then update the assumed majority element
     */
    public static int majorityElementOptimal(int[] nums) {
        int mayBeMax = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                mayBeMax = nums[i];
            }
            if (mayBeMax == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return mayBeMax;
    }

}
