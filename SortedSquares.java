public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i<nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        SortedSquares sortedSquares = new SortedSquares();
        int[] nums = {-7,-3,2,3,11};
        sortedSquares.sortedSquares(nums);


        for(int num: nums) {
            System.out.println(num);
        }
    }
}
