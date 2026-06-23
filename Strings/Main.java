import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Format and print a large integer with commas
        int num1 = sc.nextInt();
        double  pi = sc.nextDouble();
        System.out.println("Formatted integer: " + String.format("%,d",num1));
        // TODO: Format and print a floating-point number with 2 decimal places
        System.out.println("Formatted Pi: " + String.format("%.2f",pi));
        // TODO: Format and print the current date in the format "Day, Month Date Year"
        Date date = new Date(124 ,8 ,24);
        SimpleDateFormat sdf = new SimpleDateFormat("E, MMM dd yyyy");
        System.out.println("date: " + sdf.format(date));
    }
}