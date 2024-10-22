package lecture11;

public class home {
    public static void main(String[] args) {
        Dogs dog1= new Dogs(
            "shadow", 
            "bark", 
            "black", 
            false, 
            4, 
            1
            
        );
        dog1.Displays();
        Dogs dog2= new Dogs();
        dog2.Displays();
    }
}
