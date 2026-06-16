public class subArrays {

    public static int subArray(int numbers[]) {
        for (int i = 0; i <= numbers.length-1; i++) {
            int start = i;
            for(int j = i ; j <= numbers.length-1; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k]+" ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60,70};
        subArray(numbers);
    }
}
