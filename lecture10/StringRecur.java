package lecture10;

public class StringRecur {
    static void Subseq(String ques,String ans){
        if(ques.length()==0){
           System.out.println(ans);
           return;  }
        
          

          char ch=ques.charAt(0);
          Subseq(ques.substring(1),ans+ch);
          Subseq(ques.substring(1), ans);
        }


    
    
    public static void main(String[] args) {
        String  name = "abc";
        Subseq(name," ");
    }
}
