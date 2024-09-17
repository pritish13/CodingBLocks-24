package Lecture4;



public class presum {
    static int count(int[] arr,int k){
       int[] preSum= new int[arr.length];
      
       preSum[0]=arr[0];
       for(int i=1;i<arr.length;i++){
        preSum[i]=preSum[i-1]+arr[i];
       }
       int count=0;
       for(int i=0;i<arr.length;i++){
         for(int j=i;j<arr.length;j++){
            int subarraysum;
            if(i==0){
                subarraysum=preSum[j];
            }
            else{
                subarraysum=preSum[j]-preSum[i-1];
            }
            if(subarraysum==k){
                count++;
            }
        }
        return count;
    }
    return count;
}
    public static void main(String[] args){
        int[] arr={4,2,1,4,2,3,3,1,5};
        int k=9;
        count(arr, k);
    }

}
