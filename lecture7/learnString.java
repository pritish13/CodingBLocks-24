package lecture7;

public class learnString {
    static void compare(int i,int j){
        if(i==j){
            System.out.println("0");
        }
        if(i<j){
            System.out.println("-1");
        }
        if(i>j){
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
         String s1="pritish";
         String s2="jeshav";
         int i=s1.length();
         int j=s2.length();
         compare(i, j);
    }
}
