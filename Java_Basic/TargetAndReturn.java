//If the target exists → return its index.If it doesn’t exist → return the index where it should be inserted so that the array remains sorted.
public class TargetAndReturn {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6, 7};
        int target = 4;

        int index=-1 ; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
            else if (nums[i] > target) {
               
                index = i;
                break;
            }
        }

        if (index == -1) {
            index = nums.length;
        }

        System.out.println("Index: " + index);
    }
}

				