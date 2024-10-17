package lecture9.recursion;

public class fibonacci {
    static int fibo(int n){
        if(n==0||n==1)
            return n;
        
        
            int temp=fibo(n-2)+fibo(n-1);
        
        
        return temp;
    } 
    public static void main(String[] args) {
        int n=6;
        int fibonacci = fibo(n);
        System.out.println("Fibonacci series - "+fibonacci);
    }
}
