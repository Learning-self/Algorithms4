package first.learn;

public class BinarySearch {
    public static int rank(int key, int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            System.out.println("middle:" + middle);
            if (key > arr[middle]) {
                low = middle + 1;
            } else if (key < arr[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    //二分查找递归写法
    public static int recursion(int key, int[] arr, int low, int high) {
        if (low > high) return -1;
        int mid = low + (low + high) / 2;
        if (key > arr[mid]) return recursion(key, arr, mid + 1, high);
        else if (key < arr[mid]) return recursion(key, arr, low, mid - 1);
        else return mid;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 13, 17, 23, 34, 56, 93};

        System.out.println(rank(2, arr));
    }
}
