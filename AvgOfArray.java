import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class AvgOfArray {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();

    public static void main(String[] args) {
        System.out.println("Enter length of array");

        System.out.println("Enter any 10 numbers ");

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        AvgOfArray s = new AvgOfArray();
        s.add(arr);
    }

    public void add(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int avg = 0;
        avg = sum / n;
        System.out.println("Sum of array numbers is :" + sum + " Avg of number is " + avg);
    }
}
