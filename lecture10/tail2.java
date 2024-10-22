package lecture10;

public class tail2 {
    static int Power(int x,int n,int ans){
        if(n==0)
        return ans;
      return Power(x,n-1, x*ans);
    }
    public static void main(String[] args) {
        int n=4;
        int x=3;
        int ans=Power(x, n, ans=1);
        System.out.println("Power of the function -"+ans);
    }
}
