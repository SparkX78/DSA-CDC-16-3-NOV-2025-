import java.util.*;
public class DSA_76 {
    public static int[] intersection_Array(int[] nums1, int[] nums2){
        HashMap<Integer, Boolean> map = new HashMap<>();
        HashSet<Integer> result = new HashSet<>();
        for(int num: nums1){
            map.put(num, true);
        }
        for(int num: nums2){
            if(map.containsKey(num)){
                result.add(num);
            }
        }
        int[] output = new int[result.size()];
        int i = 0;
        for(int num : result){
            output[i++] = num;
        }
        return output;
    }
    public static void main(String args[]){
        int[] nums1 = {2, 8, 1, 0, 7};
        int[] nums2 = {5, 9, 17, 1, 0};
        int[] result = intersection_Array(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
