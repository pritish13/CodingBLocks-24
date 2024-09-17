package lecture5;

public class reversektimes {
    static void display(int[] arr){
        for( int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    // static void rotateOne(int[] arr){
    //     int num=arr[arr.length-1];
    //     for(int i=arr.length-2;i>=0;i--){
    //         arr[i+1]=arr[i];
    //     }
    //     arr[0]=num;
    //     display(arr);
    // }  
    
    // public static void reversebyK(int[] arr,int k){
    //     k=3;
    //     int i;
    //     for(int j=1;j<k;j++)
    //         rotateOne(arr);
    // }
    // public static void main(String[] args){
    //     int[] arr={1,2,3,4,5};
    //     reversebyK(arr, 3);
    // }
    // static void rotatebyK(int[] arr,int k){
    //     int[] num=new int[arr.length];
    //     int n=arr.length;
    //     k%=n;
    //     for(int i=0;i<n-k;i++){
    //         num[i+k]=arr[i];
    //     }
    //     for(int i=0;i<k;i++) {
    //         num[i]=arr[n-k+i];
    //     } 
    //     for(int i=0;i<n;i++){
    //         arr[i]=num[i];
    //     }
    //     display(arr);
    // }
    // public void rotate(int[] arr, int k) {  
    //     k%=arr.length;
    //     rotatebyK(arr,k);   
    // } 
    static void rotatebyK(int[] arr,int k){
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length-k-1;i++){
            temp[arr.length+1]=arr[i];
             
            }
            //arr=temp;
            for(int i=0;i<arr.length-k;i++){
                temp[i]=arr[arr.length-k+i];
            }
            for(int i=0;i<k;i++){
                arr[i]=temp[i];
            }
            display(arr);
        }

    
    public static void main(String[] args){
             int[] arr={1,2,3,4,5};
            rotatebyK(arr, 2);
        }
}
