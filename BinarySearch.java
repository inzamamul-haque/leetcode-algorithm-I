public class BinarySearch {
    public int search(int[] nums, int target) {
        int fe = 0;
        int le = nums.length-1;
        while(fe<=le) {
            int mid = (fe+le) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid]<target) {
                fe = mid + 1;
            } else {
                le = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] num = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(binarySearch.search(num, target));
    }
}
