package lecture10;

public class tail {
    static int fact(int num,int ans){
        if(num==1)
        return ans;
       return fact(num-1,num*ans); 
    }
    public static void main(String[] args) {
        int x=5;
        int ans=fact(x, ans=1);
        System.out.println("Factorial - "+ans);
    }
}
