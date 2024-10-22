package lecture10;

public class recursion3 {
    static void genPar(int n,int left,int right,String ans){
        if(left==n && right==n){
            System.out.println(ans);
            return;
        }
        if(left>n || right>left){
            return;
        }
        genPar(n, left+1, right, ans+"{");
        genPar(n, left, right+1, ans+"}");
    }
    public static void main(String[] args) {
        int n=4;
        genPar(n, 0, 0, " ");
    }
}
