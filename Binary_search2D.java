public class Binary_search2D {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 5;
        System.out.println(Binary_search(a, k)); // Output: true
    }

    public static boolean Binary_search(int[][] a, int k) {
        int l = 0, r = a.length - 1, mid = 0, c = a[0].length, x = -1;

        // Binary search to find the correct row
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (a[mid][0] <= k && k <= a[mid][c - 1]) {
                x = mid;
                break;
            } else if (a[mid][0] > k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        if (x == -1) {
            return false;
        }

        // Binary search within the selected row
        l = 0;
        r = a[x].length - 1;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (a[x][mid] == k) {
                return true;
            } else if (a[x][mid] > k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return false;
    }
}
