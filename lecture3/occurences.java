package lecture3;

import java.util.Arrays;

public class occurences {
    static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
   
        static int countOccurrences(int[] arr,  int target) {
            int first = binarySearch(arr,  target, true);
            if (first == -1) {
                return 0;
            }
            int last = binarySearch(arr,  target, false);
            return last - first + 1;
        }
    
        static int binarySearch(int[] arr,  int target, boolean First) {
            int low = 0, high = arr.length - 1, ans = -1;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (arr[mid] == target) {
                    ans = mid;
                    if (First) {
                        if (mid == 0 || arr[mid - 1] != target) {
                            break;
                        }
                        high = mid - 1;
                    } else {
                        if (mid == arr.length - 1 || arr[mid + 1] != target) {
                            break;
                        }
                        low = mid + 1;
                    }
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return ans;
        }
    
        public static void main(String[] args) {
            int[] arr = {4,2,1,4,2,3,3,1,5};
            Arrays.sort(arr);
            display(arr);
            int target = 3;
            int occurrences = countOccurrences(arr,  target);
            System.out.println("Number of occurrences of " + target + ": " + occurrences);
        }
}
