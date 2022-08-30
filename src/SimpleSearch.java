public class SimpleSearch {
    public static void main(String[] args) {
        int[] arr = {1, 99, 546, 5, 8};
        int k = 99;

        System.out.println(linearSearch(arr, k));

    }

    private static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i;
        }

        return -1;
    }
}
