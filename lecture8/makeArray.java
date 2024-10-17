package lecture8;

import java.util.Arrays;

public class makeArray {
    static void display(int arr[][]){
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=(arr[0].length*i)+(j+1);
            System.out.print(arr[i][j]+" ");
        }
        System.out.println(" ");
       }

    }
    //sorting the elements of the rows in the matrix row wise
    static void row_wise_sort(int[][] arr){
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
    }
    static void column_wise_sort(int[][] arr,int a,int b){

    }
    public static int[] linearSearch(int[][] arr,int element){
        int[] ans=new int[2];//0th index-->i,1->j
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==element){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
      
    static void array_sort(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        int[] nums=new int[rows*cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=nums[cols*i+j];
              
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=nums[cols*1+j];  
                System.out.print(nums+" "); 
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        
        int[][] arr={{1,4,7,2},{5,9,4,6},{9,15,63,0}};
        // int value=4;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j]=(arr[0].length*i)+(j+1);;
        //         // arr[2][j]+=value;
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println(" ");
        // }
       int nums[] = linearSearch(arr, 15);
       System.out.println(nums[0]+" "+nums[1]);
        
        
    }
}
