public class Occurences {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,2,2,5,5,4,3,6,7,7,8,6,4,3,7};
        //int res=0;
        int x=2;
        int n= arr.length;
        bilal b = new bilal();
        System.out.println(b.occur(arr,n,x));
       // System.out.println(res);
    }

}
class bilal{
    public int occur(int []arr,int n,int x){
        int res=0;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                res++;
            }
        }
        return res;

    }

}
