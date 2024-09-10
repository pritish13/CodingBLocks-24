package lecture1;

public class pattern2 {
    public static void main(String[] args){
        

     
    int n=5;
    for(int i=0;i<=n;i++)
    {
       for(int k=1;k<=i;k++){
        System.out.print(" ");
       }
       for(int j=1;j<=n-i;j++){
        System.out.print("* ");
       }
       System.out.println(" ");
    }
    int x=5;
    for(int i=0;i<=x;i++)
    {
       for(int k=1;k<=x-i;k++){
        System.out.print(" ");
       }
       for(int j=1;j<=i;j++){
        System.out.print("* ");
       }
       System.out.println(" ");
    }
   }
}    