package lecture9;

public class wrapperClass {
    
    int[] arr;
    int object;

    wrapperClass(){
        arr = new int[4];
        object = 0;
    }

    public void addElement(int element, int index){
        this.arr[index]= element;
        object++;
    }
    public static void main(String[] args) {
        Integer a1=83;
        Integer a2=66;
        System.out.println(a1==a2);
        Integer a4 = -129;
        Integer a5 = -129;
        System.out.println(a4==a5);
        System.out.println(a4.equals(a5));
        Integer a6 = 254;
        Integer a7 = 254;
        System.out.println(a6==a7);
        System.out.println(a6.equals(a7));
    }
}
