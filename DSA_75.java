import java.util.*;
public class DSA_75 {
    public static int missing_no(int[] nums){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int num: nums){
            map.put(num, true);
        }
        for(int i = 0; i<= nums.length; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] nums = {4, 2, 0, 3, 5};
        System.out.println("THE MISSING NUMBER : "+ missing_no(nums));
    }
}
