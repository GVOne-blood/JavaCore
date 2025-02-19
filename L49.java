import java.util.*;

public class L49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
    //Map <String, List<String>> map = new HashMap<>();
        Map <String, List<String>> map = new HashMap<>();
    for (String str : strs){
        char [] temp = str.toCharArray();
        Arrays.sort(temp);
        String s = new String(temp);

      if (!map.containsKey(s)){
          map.put(s, new ArrayList<>());
      }

        map.get(s).add(str);
    }
    return new ArrayList<>(map.values());
    }
}
