import java.util.*;


public class FindLongString {
    int longestSubString(String s){
        int start = 0;
        int end = 0;
        List<Character> string = new ArrayList<>();
        int maxLength=0;

        if (!s.equals("")){
            List<Character> characterList = new ArrayList<>();
            for(int i =0; i<s.length(); i++){
                characterList.add(s.charAt(i));
            }

            for (Character x : characterList){
                string.add(x);
                

            }
        }

        return maxLength;
    }
}
