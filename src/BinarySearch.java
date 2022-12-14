public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {-1, 3, 5, 8, 10, 15, 16, 20}, 5));
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < arr[middle]) {
                high = middle - 1;
            } else if (key > arr[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
