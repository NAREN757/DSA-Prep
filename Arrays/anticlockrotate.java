import java.util.Scanner;

public class anticlockrotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        int n = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr);
        for(Integer ch: arr) {
            System.out.print(ch + " ");
        }
    }   
    public static void rotate(int arr[]) {
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++) {
         arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    } 
}
