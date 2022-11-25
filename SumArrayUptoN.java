import java.util.Scanner;

public class SumArrayUptoN {
    public static void main(String[] args) {
        System.out.println("Enter any 10 numbers ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

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
