package Lecture4;

public class subarray {
    public static int countMaxArray(int[] arr,int k){
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;)
        {
            int tempSum=0;
            int count=0;
             k=4;
            for(int j=i;j<arr.length;j++){
                tempSum+=arr[j];
                maxSum = Math.max(tempSum,maxSum);
                tempSum+=arr[i];
                maxSum=Math.max(tempSum,maxSum);
                if(tempSum==k)
                {
                    
                    count++;
                }
            }
            return count;
        }
        return maxSum;
        
    }
    
    public static void main(String[] args){
        
        int[] arr = {4,2,1,4,2,3,3,1,5};
        
        
        System.out.println("Subarrays with sum 4 = "+ countMaxArray(arr, 4));
    }
}
