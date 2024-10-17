package lecture9;

import java.util.ArrayList;

public class DMA {
    static void reverse(ArrayList<Integer> arr){
    int[] temp=new int[arr.size()];
     for(int i=0;i<arr.size();i++){
        temp[arr.size()-1-i]=arr.get(i);
         
        }
        //arr=temp;
        for(int i=0;i<arr.size();i++){
            int temp=arr.get(i);
            arr.set(i,i+1);
            arr.set(i+1,temp);
        }
        
    }
    static void display(int[] arr){
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
  public static void main(String[] args){
   

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(12);
        arr.add(2);
        

        
        System.out.println(arr);
        reverse(arr);
    }    
}
