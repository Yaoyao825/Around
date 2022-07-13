import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String str = "one two two three go go go big small big how sample test text to do it default returns string string is is in seconds since what is the end end ";

        Map<String, Integer> map = new HashMap<>();
        String word[] = str.split(" ");
        for (String t : word) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();
        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            if (map.get(key) >= 2) {
                System.out.println(key.repeat(map.get(key)));
            }
        }
    }
}

/*
The results I got don't have space in between the words,
Words can be separated with a space by using Apache Commons Lang, my laptop was not able to download,
so I attached the code below, this could be used for the second for loop:
        for (Map.Entry<String, Integer> entry :
        map.entrySet()) {
        int n = entry.getValue();
        if (entry.getValue() >= 2)
        StringUtils.repeat("entry.getKey()"," ",n);
        }*/
