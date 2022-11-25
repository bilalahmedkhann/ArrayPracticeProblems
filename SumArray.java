import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        System.out.println("Enter any 10 numbers ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        SumArray s = new SumArray();
        s.add(arr);
    }

    public void add(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}


