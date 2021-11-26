public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int fe = 1;
        int le = n;
        int result = 0;
        
        while (fe <= le) {
            int mid = le + (fe-le)/2;
            if (isBadVersion(mid)) {
                result = mid;
                le = mid -1;
            } else {
                fe = mid +1;
            }
        }
        return result;

    }
}
