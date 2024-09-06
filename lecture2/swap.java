package lecture2;

public class swap {
   
   
    static void SwapElements(int[] arr,int i,int j){
        
       int temp =arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
     
     SwapElements(arr,i,j);

    }
}

