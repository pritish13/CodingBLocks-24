package lecture10;

public class recursion2 {
    static int fact(int num){
        if(num==1)
        return 1;
      return (num*fact(num-1)) ; 
    }
    public static void main(String[] args) {
        int num=4;
        int factorial=fact(num);
        System.out.println(factorial);
    }
}
