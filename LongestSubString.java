import java.util.HashSet;

public class LongestSubString {
    
    public static void lengthofSubString(String s){
        //s = "abcabcbb"

        //Sliding Window
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right<s.length()){
            char elm = s.charAt(right);
            char elm2 = s.charAt(left);
            if(hs.contains(elm)){
                hs.remove(elm2);
                left++;
            } else {
                hs.add(elm);
                maxLength = Math.max(maxLength, hs.size());
                right++;
            }
        }

        return maxLength;
        
        


    }

    public static void main(String[] args) {
        
    }

}
