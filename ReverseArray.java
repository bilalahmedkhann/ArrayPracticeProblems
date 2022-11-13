//Write a program to reverse the array
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        ReverseArray r = new ReverseArray();
        r.reverse(arr, n);

    }

    public void reverse(int[] arr, int n) {
        System.out.println("Reversed array is : ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
