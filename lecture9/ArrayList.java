package lecture9;
public class ArrayList {
    static void reverse(int[] arr){
        int[] temp=new int[arr.length];
         for(int i=0;i<arr.length;i++){
            temp[arr.length-1-i]=arr[i];
             
            }
            //arr=temp;
            for(int i=0;i<arr.length;i++){
                arr[i]=temp[i];
            }
            
        }
        static void display(int[] arr){
            for(int i:arr){
                System.out.println(i+" ");
            }
        }
      public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<>();
    
    
    }
}
