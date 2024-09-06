package lecture2;

public class ArraySum {

    static int sum(int[] arr){
        int sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        display(arr);
    } 
    static void display(int[] arr){
        for(int i:arr){
            System.out.println(i+" ");
            
        }
        System.out.println("Sum = "+sum(arr));
    }
    static int reverse(int[] arr){
       int[] tmep=new int[arr.length]
        for(int i=(arr.length -1);i>=0;i--){
            for(j=0;j<ar.lenght;j++){
                temp[j]=arr[i];
            }
        }
        System.out.println("Reverse array = ");
        for(int i=0;i<=temp[j].length;i++){
            System.out.println(temp[i+" "]);
        }
        return 0;
        
    }
    
}
