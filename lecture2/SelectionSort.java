package lecture2;

public class SelectionSort {
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    static int minimumValue(int[] arr, int a){
        int mini= a;
        for(int i=a+1; i<arr.length;i++)
            if(arr[mini]>arr[i])
                mini=i;
        return mini;
    }
    public static void main(String[] args) {
        int[] arr= {6,9,8,7,2,3,5,4};
        
        display(arr);
    }
}

