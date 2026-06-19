public class sortedMatrix {

    public static boolean sortMatrix(int arr[][], int key) {
        int row = 0, col = arr[0].length-1;

        while(row < arr.length && col >= 0) {
            if(key == arr[row][col]) {
                System.out.println("The key found at: " + "(" + row + "," + col + ")");
                return true;
            }
            // moving to left--
            else if(key < arr[row][col]) {
             col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not Found!");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},
                      {15,25,35,45,},
                      {27,29,37,48},
                      {32,33,39,50}};
        int key = 37;
        sortMatrix(arr, key);
    }
}
