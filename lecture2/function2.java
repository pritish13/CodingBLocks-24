package lecture2;

public class function2 {
    static int sum(int[] arr){
        int sum=0;
        for(int x:arr){
            sum=sum+x;
        }
        return sum;
    }
    static void display(int[] arr,int x,int y){
        for(int i=x;i<=y;i++){
            System.out.print(arr[i]+" ");
            System.out.println("Sum = "+sum(arr));
        }
        
    }
    
    static void findsum(int[] arr){
        for(int x:arr){
            System.out.print("Sum = "+sum(arr));
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int i=1;
        int j=5;
        display(arr,i,j);
        
    } 
   
}
