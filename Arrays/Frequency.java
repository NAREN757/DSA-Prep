import java.util.*;

public class Frequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your logic here
        int n = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int visited[] = new int[n];
        for(int i=0;i<n;i++) {
            if(visited[i]==1){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<n;j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j]=1;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
