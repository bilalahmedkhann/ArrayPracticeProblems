//Remove array element 
public class RemovingElementArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 15, 14, 32, 65, 78};
        int removableElement = 2;
        for (int i = removableElement; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
