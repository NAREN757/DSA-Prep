public class optimizedmaxSubArray{

    public static int subArray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for(int i =1; i < prefix.length;i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for (int i = 0; i <= numbers.length-1; i++) {
            int start = i;
            for(int j = i ; j <= numbers.length-1; j++) {
                int end = j;
               int currentSum = start == 0 ? prefix[end] : prefix[end]- prefix[start-1];
                
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.err.println(maxSum);
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60,70};
        subArray(numbers);
    }
}