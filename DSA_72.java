import java.util.*;
public class DSA_72 {
    static class HashMap{
        private static int[] map;

        public HashMap(){
            map = new int[1000001];
            Arrays.fill(map, -1);
        }

        public static void put(int key, int value){
            map[key] = value;
        }

        public static int get(int key){
            return map[key];
        }

        public static void remove(int key){
            map[key] = -1;
        }
    }

    public static void main(String args[]){
        HashMap Hmap = new HashMap();
        Hmap.put(1, 20);
        Hmap.put(2, 12);
        Hmap.put(3, 14);
        Hmap.put(6, 19);

        System.out.println("THE VALUE FOR KEY 1 : "+ Hmap.get(1));
        System.out.println("THE VALUE FOR KEY 2 : "+ Hmap.get(2));
        System.out.println("THE VALUE FOR KEY 3 : "+ Hmap.get(3));
        System.out.println("THE VALUE FOR KEY 6 : "+ Hmap.get(6));
        System.out.println("THE VALUE FOR KEY 99 : "+ Hmap.get(99));

        Hmap.remove(6);
        System.out.println("THE VALUE FOR KEY 6 : "+ Hmap.get(6));

    }
}
