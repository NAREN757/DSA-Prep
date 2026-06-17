public class maxSubArray{

    public static int subArray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= numbers.length-1; i++) {
            int start = i;
            for(int j = i ; j <= numbers.length-1; j++) {
                int end = j;
               int currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println(" ");
            System.err.println(maxSum);
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60,70};
        subArray(numbers);
    }
}