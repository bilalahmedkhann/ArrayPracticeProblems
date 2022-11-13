public class SortArray {
    public static void main(String[] args) {
        int[]arr = {1,9,2,8,3,7,4,6,5};
        int n= arr.length;
        int temp=0;
        SortArray s = new SortArray();
        s.sorted(arr,n,temp);
    }
    public void sorted(int[]arr,int n,int temp){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //System.out.println(i);
        for (int j : arr) {
            System.out.print(j + " ");
        }
}}
