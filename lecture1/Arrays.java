package lecture1;

public class Arrays {
    public static void main(String[] args){
        int a = 10;
        int[] arr= new int[5];
        arr[0]=5;
        arr[1]=3;
        arr[2]=56;
        boolean[] nums=new boolean[10];
        char[] s=new char[3];
        s[0]='a';
        s[1]='b';
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println(s);

        int n=5;
        int[] table=new int[10];
        for(int i=0;i<table.length;i++){
            table[i]= n*(i+1);
        }
        int m=40;
        for(int j=0;j<=10;j++){
            if(table[j]==m)
            System.out.println(j);

            scanner scan= new scanner();
            String p;
            p=scan.next();
            System.out.println(p);
            

        }
    }
}
