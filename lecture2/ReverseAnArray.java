 package lecture2;

public class ReverseAnArray {

    static void reverse(int[] arr){
        int[] temp=new int[arr.length];
         for(int i=0;i<arr.length;i++){
            temp[arr.length-1-i]=arr[i];
             
            }
            //arr=temp;
            for(int i=0;i<arr.length;i++){
                arr[i]=temp[i];
            }
            
        }
        static void display(int[] arr){
            for(int i:arr){
                System.out.println(i+" ");
            }
        }
      public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        reverse(arr);
        display(arr);
    
    
    }
   
}    