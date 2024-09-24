package lecture6;

public class binary {

    static boolean check(int speed, int distance,int time){
        int totalDistance=speed*time;
        return totalDistance>=distance;
    }

    static int speed(int time,int distance,int speed){
        int low=0;
        int high=200;
        int ans=0;
        while(low<high){
           int mid=high-(high-low)/2;
           if(check(mid,distance,time)){
            ans=mid;
            high=mid-1;
           }
           else{
            low=mid+1;
           }
        }
        return ans;
        
    }

    public static void main(String[] args) {
        int distance=100;
        int time = 2;
        int reachCollege=distance/time;
        int Speed=speed(time, distance, reachCollege);
        System.out.println(Speed);
    }
}
