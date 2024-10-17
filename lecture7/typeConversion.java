package lecture7;

public class typeConversion {
    public static void main(String[] args) {
        String a = "aaaaaaeeeeiiioouuuuuu";
        char[] c = a.toCharArray();
        int vowel =0;
        int count =0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
            vowel++;
            
        }
        System.out.println("Vowels = "+vowel);
    }

} 
