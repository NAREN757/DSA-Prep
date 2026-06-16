public class smallestNumber {

    public static int getSmallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
         int arr[] = {1,3,6,7,9,2,4,5};
         System.out.println("The smallest number in the array is: " + getSmallest(arr));
    }
}
