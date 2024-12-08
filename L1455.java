import java.util.Arrays;

class L1455 {

    public void isPrefixOfWord(String sentence, String searchWord) {
        String [] temp = sentence.split(" ");
        System.out.println(Arrays.deepToString(temp));
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].startsWith(searchWord)) {
                System.out.println(i + 1);
                return;
            }
        }
        
    }
}