package lecture3;
import java.util.Arrays;
public class arrays {
        static void display(int[] arr){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        static boolean bsearch(int[] arr,int target){
            int low=0 ,  high=arr.length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==target){
                    return true;
                }
                else if(arr[mid]<target){
                    high=mid+1;
                    
                }
                else{
                    low=mid-1;
                   

                }
            }
            return false;
            
    }
        public static void main(String[] args){
            int[] arr={2,4,5,1,6,8,9,5};
            Arrays.sort(arr);
            display(arr);
            System.out.print(bsearch(arr, 1));
            
        } 
    
}

/*
 * class Solution {
    public int searchInsert(int[] arr, int target) {
         int low = 0 ;
         int high = arr.length-1;
         int ans=arr.length;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]<target){
                    low=mid+1;
                    
                }
                else{
                    ans = mid;
                    high=mid-1;
                   

                }
            }
            return ans;
            
    
    }
}
 */