//Find a peak element which is not smaller than its neighbours
public class PeakElement {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 2, 4, 1, 0 };
        int n = arr.length;
        PeakElement m = new PeakElement();

        System.out.println(m.element(arr, n));
    }

    public int element(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        if (arr[0] >= arr[1]) {
            return 0;
        }
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if ((arr[i] >= arr[i - 1]) && (arr[i] >= arr[i + 1])) {
                return i;
            }
        }
        return 0;
    }
}
