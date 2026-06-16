public class reverseArray {

    public static int reverse(int numbers[]) {
        int first = 0, last = numbers.length-1;
        while(first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
             first++;
             last--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60};
        
        reverse(numbers);
        for(int i = 0; i <= numbers.length-1; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
}
