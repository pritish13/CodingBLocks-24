package lecture9.recursion;

public class recursion1 {
    static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            int  temp = n*fact(n-1);
            return temp;
        }
    }
    public static void main(String[] args) {
        int n=7;
        int factorial = fact(n);
        System.out.println("Factorial - "+factorial);
    }
}
