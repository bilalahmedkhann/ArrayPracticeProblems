//Find the minimum and maximum element in an array
public class MinMax {
    public static void main(String[] args) {
        int max;
        int min;
        int[]arr = {1,3,5,7,9,79,45,32,65,43,112,65,3,53423,232,3455,32,25,67};
        int n = arr.length;
        max=min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            } else if (arr[i]<min) {
                min = arr[i];

            }
        }
        System.out.println("Minimum element is: "+min);
        System.out.println("Maximum element is: "+max);

    }
}
