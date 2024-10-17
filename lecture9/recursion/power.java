package lecture9.recursion;

public class power {
    static int Power(int x,int n){
        if(n==0)
        return x*Power(x, 0);
        int p = x*Power(x, n-1);
        return p;
    }
    public static void main(String[] args) {
        int n=3;
        int x=3;
        int p=Power(x, n);
        System.out.println("Power of the function -"+p);
    }
}
