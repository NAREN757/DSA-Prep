public class arrayPairs {

    public static int pairs(int numbers[]) {
        for(int i = 0; i <= numbers.length-1; i++) {
            int current = numbers[i];
            for(int j = i+1; j <= numbers.length-1; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
            }
            System.out.println();
        }
        return -1;
    }
    public static void main(String[] args) {
    int numbers[] = {10,20,30,40,50,60,70};
    pairs(numbers);
    }
}
