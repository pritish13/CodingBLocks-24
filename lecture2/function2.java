package lecture2;

public class function2 {
    
    static int display(int[] arr,int x,int y){
        for(int i=x;i<=y;i++){
            System.out.print(arr[i]+" ");
           
        }
        return y;
        
    }
    
    static void findsum(int[] arr,int i,int j){
        int sum= display(arr, i, j);
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int i=1;
        int j=5;
        display(arr,i,j);
        sum(arr, i, j);
        
        
    }

    private static void sum(int[] arr, int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    } 
   
}
