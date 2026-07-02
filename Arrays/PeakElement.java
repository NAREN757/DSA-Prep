import java.util.*;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your code here...
         int n = sc.nextInt();
         sc.nextLine();
         int nums[] = new int[n];
         for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
         }
         System.out.println(findPeakElement(nums));
    }


    public static int findPeakElement(int nums[]){
        int n = nums.length;
        for(int i=0;i<n;i++) {

        if(n==1) {
            return 0;
        }
        else if( i == 0) {
            if(nums[i] > nums[i+1]){
            return 0;
        }
        }
        else if(i == n-1) {
            if(nums[n-1] > nums[n-2]){
            return n-1;
        }
        }
        else {
           if(nums[i] > nums[i+1] && nums[i] > nums[i-1]){
            return i;
        }
        }
        }
        return -1;
}
}
