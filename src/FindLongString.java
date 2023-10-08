import java.util.*;


public class FindLongString {
    public int longestSubString(String s){
        int start = 0;
        int end = 0;
        List<Character> stringList = new ArrayList<>();
        int maxLength=0;

        while (end<s.length()){
            if (!stringList.contains(s.charAt(end))){
                stringList.add(s.charAt(end));
                end++;
                maxLength=Math.max(maxLength,stringList.size());
            }else {
                stringList.remove(Character.valueOf(s.charAt(start)));// valuse of is needed because otyherwise s.charAT take ASCCi calue and throw memory outer bounce exception
                start++;
            }
        }
        return maxLength;
    }
}
