public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;

        while(low<=high) {
            int mid = (low+high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        SearchInsertPosition binarySearch = new SearchInsertPosition();
        int[] num = {1,3,5,6};
        int target = 7;
        System.out.println(binarySearch.searchInsert(num, target));
    }
}
