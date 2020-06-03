import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * hashmapInbuild
 */

public class hashmapInbuild {

    public static void main(String[] args) {
        HashMap<String, Integer> Map = new HashMap<>();

        // adding value to HashMap

        Map.put("India", 500);
        Map.put("USA", 200);
        Map.put("China", 300);

        // getting value

        System.out.println(Map.get("India")); // 500
        System.out.println(Map.get("China")); // 300
        System.out.println(Map.get("USA")); // 200

        System.out.println(Map.get("RSA")); // null as it doesnot exists

        // Deleting value

        System.out.println("*******Deleting Value******");
        System.out.println(Map.remove("China"));// returns and delete the value

        System.out.println(Map.remove("nepal"));// returns null key is not there

        // Updating Value

        System.out.println("*******Updating Value******");
        Map.put("India", 400);
        System.out.println(Map.get("India"));

        // Checking Key

        System.out.println("******Checking Key*******");
        System.out.println(Map.containsKey("India")); // true

        // Key Value Pair print
        System.out.println("******Key Value Pair print*******");
        System.out.println(Map);

        // to Get all The Keys in map
        System.out.println("******Keys*******");
        Set<String> keys = Map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        // to Get all The Values in map
        System.out.println("******Values*******");
        Collection<Integer> values = Map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        // entrySet both keys and Values together
        System.out.println("******EntrySet*******");
        Set<Map.Entry<String, Integer>> entries = Map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }

        // get maximum frequency character

        System.out.println("***get maximum frequency character***");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = s.nextLine();
        System.out.println(maxfrequencychar(str));

        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 9, 8, 7, 6, 5, 4 };
        System.out.println(getIntersection(arr1, arr2));
    }

    public static char maxfrequencychar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            if (map.containsKey(cc)) {
                int ov = map.get(cc);
                int nv = ov + 1;
                map.put(cc, nv);
            } else {
                map.put(cc, 1);
            }
        }

        char maxchar = '\0';
        int max = 0;
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxchar = entry.getKey();
            }
        }
        return maxchar;
    }

    public static ArrayList<Integer> getIntersection(int[] a, int[] b) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], false);
        }
        for (int j = 0; j < b.length; j++) {
            if (map.containsKey(b[j])) {
                map.put(a[j], true);
            }
        }

        Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
        for (Map.Entry<Integer, Boolean> entry : entries) {
            if (entry.getValue()) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}