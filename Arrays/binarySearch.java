public class binarySearch {

   public static int binary(int numbers[],int key) {
     int start = 0, end = numbers.length-1;
     while(start <= end) {
        int mid = (start + end)/2;
        if(numbers[mid]==key) {
            return mid;
        }
        if(numbers[mid]>=key) {
            end = mid-1;
        }
        if(numbers[mid]<=key) {
            start = mid+1;
        }
     }
     return -1;
   }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60,70};
        int key = 30;
        System.out.println("The index of the key is: " + binary(numbers,key));
    }
}
