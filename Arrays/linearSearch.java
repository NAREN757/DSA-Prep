public class linearSearch {

    public static int ls(int nums[],int key) {
        for(int i = 0; i <= nums.length; i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
      int nums[] = {10,20,30,40,50};
      int key = 30;
      int index = ls(nums,key);
      if(index==-1) {
        System.out.println("Not found");
      }
      else {
        System.out.println("Key found at index: " + index);
      }
    }
    
}
