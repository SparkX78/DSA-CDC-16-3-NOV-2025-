import java.util.HashMap;

public class DSA_78 {
    
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!map.containsKey(ch)) return false;
            map.put(ch, map.get(ch)-1);
            if(map.get(ch) < 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "car";
        String t = "rac";
        System.out.println(isAnagram(s,t));
    }
}

