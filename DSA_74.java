import java.util.*;
public class DSA_74 {
    public static char maxOccuring(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0 )+1);
        }
        char maxchar = '\0';
        int maxcount = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet() ){
            char ch1 = entry.getKey();
            int count = entry.getValue();
            if(count > maxcount || count == maxcount && ch1 < maxchar){
                maxchar = ch1;
                maxcount = count;
            }
        }
        return maxchar;

    }
    public static void main(String args[]){
        String str = "PALLINDROME";
        System.out.println("THE MAXIMUM OCCURING CHAR IN THE STRING : "+ str + " : "+maxOccuring(str));
    }
}
