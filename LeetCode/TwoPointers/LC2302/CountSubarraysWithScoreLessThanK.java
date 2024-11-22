/*
* Created on 26 Oct 2024
* 
* @author Sai Sumanth
*/
package LC2302;

public class CountSubarraysWithScoreLessThanK {
    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[] { 2, 1, 4, 3, 5 }, 10));
    }

    public static long countSubarrays(int[] nums, long k) {
        long count = 0, sum = 0;
        int leftPointer = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            long score = sum * (i - leftPointer + 1);
            while (score >= k) {
                sum -= nums[leftPointer++];
                score = sum * (i - leftPointer + 1);
            }
            count += i - leftPointer + 1;
            System.out.println(count);
        }
        return count;
    }

}
