package lecture3;

import java.util.Arrays;

public class upperbound {
    static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static int upper_bound(int[] arr, int num){
        int low=0;
        int ans=-1;
        int high = arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }
            else if(arr[mid]<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
            int[] arr={1,1,2,2,2,3,3,4,4,4,5};
            Arrays.sort(arr);
            display(arr);
            System.out.print(upper_bound(arr, 5));
            
        } 
}
