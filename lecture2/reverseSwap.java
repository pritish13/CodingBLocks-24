package lecture2;

public class reverseSwap {
    
    public static void display(int[] arr){
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
    static void reverseArray(int[] arr){
        int[] temp= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            temp[arr.length-1-i]= arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
    static void swapElements(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    //Reverse using Swap
    static void reverseUsingSwap(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j)
            swapElements(arr, i++, j--);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int i=2;
        int j=3;
        reverseUsingSwap(arr);
        display(arr);

    }

}
 