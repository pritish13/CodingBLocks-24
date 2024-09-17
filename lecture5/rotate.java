package lecture5;

public class rotate {
    public static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void rotateOne(int[] arr){
        int num=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=num;
        display(arr);
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        display(arr);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        rotateOne(arr);
        // display(arr);
    }
}
