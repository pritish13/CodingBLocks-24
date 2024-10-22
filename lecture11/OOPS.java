package lecture11;

public class OOPS {
    private String username;
    private String password;
    public char[] getUsername;
    public String getUsername(boolean key) {
        if(key)
        return username;
        else
        return "nice try";
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(int key){
        if(key==0){
        return password;
        }
        else{
        return "nice try";
        }
    }
    public void setPassword(String password){
        this.password = password;
    }
   
    
}
