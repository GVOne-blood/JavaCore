import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L1408 {
        public List<String> stringMatching(String[] words) {
            List<String> ans = new ArrayList<>();
            for(int i=0;i<words.length;i++){
                for(int j=0;j<words.length;j++){
                    if(i==j){
                        continue;
                    }
                    if(words[j].contains(words[i])){
                        ans.add(words[i]);
                        break;
                    }
                }
            }
            return ans;
        }
}
