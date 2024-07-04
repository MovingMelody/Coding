import java.util.Arrays;

// https://www.naukri.com/code360/problems/print-1-to-n_628290

class OneToNwithoutLoop {
    public static void main(String[] args) {
        int[] res = printNos(15);
        System.out.println(Arrays.toString(res));
    }

    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] res = new int[x];
        addNumsToArray(res, x);
        return res;
    }

    public static void addNumsToArray(int[] nums, int x) {
        if (x != 0) {
            nums[x - 1] = x;
            // System.out.println("Added " + x + " to array");
            addNumsToArray(nums, x - 1);
        }
        // return;
    }
}
