import java.util.*;
public class DSA_73 {
    public static int[] twoSumMap(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i< nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int[] nums = {21, 9, 11, 10, 15};
        int target = 20;
        int[] result = twoSumMap(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
