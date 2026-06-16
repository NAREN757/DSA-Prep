import java.util.*;
public class creatingArray{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[20];
        int mark[] = {10,20,30};
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        System.out.println(mark[2]);
        System.out.println(marks.length);
        sc.close();
    }
}
