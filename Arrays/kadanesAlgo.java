public class kadanesAlgo {

    public static void kadanes(int numbers[]) {
        int currentSum = 0;
        int maxSum = 0;
        for(int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            if(currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("Max sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,50,70};
        kadanes(numbers);
    }
}
