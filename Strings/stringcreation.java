import java.util.*;
public class stringcreation {

    public static void charprint(String fullname) {
        for(int i=0;i < fullname.length();i++) {
            System.out.print(fullname.charAt(i) + " ");
        }
        System.out.println();
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) { 

        // declaring an String
        String str = "Google";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);

        // taking string input
        System.out.println("Enter your firstname: ");
        String firstname;
        String lastname;
        String fullname;
        firstname = sc.nextLine();
        System.out.println("Enter your lastname: ");
        lastname = sc.nextLine();
        fullname = firstname + " " + lastname;

        // String concatination
        System.out.println("Hello! " + fullname + " Welcome to Google");

        // finding length using fun
        System.out.println(fullname.length());

        charprint(fullname);
        sc.close();
    }
}
