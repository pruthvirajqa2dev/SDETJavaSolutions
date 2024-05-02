
import java.util.HashMap;
import java.util.Map;
//Problem Statement:
/*For an input string, write a Java program to print the characters in the string which 
have repeating occurrences*/

class repeatingChar {
    public static void main(String[] args) {
        String s = "characters";
        // find out repeating characters
        // count the occurances of characters, print chars occuring more than once
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> occMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // if character is already present, increment the counter cnt and update map
            // with new value
            if (occMap.containsKey(arr[i])) {
                int cnt = occMap.get(arr[i]);
                occMap.put(arr[i], ++cnt);
            }
            // insert the first occurance
            else {
                occMap.put(arr[i], 1);
            }
        }
        // print the values in format t->2, e->1, s->1......
        for (Map.Entry<Character, Integer> e : occMap.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + "->" + e.getValue());
            }
        }
    }
}