package lecture10;

public class cointoss {
    static void Cointoss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        Cointoss(n-1,ans+"H");
        Cointoss(n-1,ans+"T");
    }
    public static void main(String[] args) {
        int n=100;
        Cointoss(n," ");

    }
}
