public class planidrome {

    public static boolean isPalindrome(String name) {
        int n = name.length();
        for(int i = 0; i < name.length()/2;i++) {
            if(name.charAt(i)!= name.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "NooN";
        System.out.println(isPalindrome(name));
    }
}
