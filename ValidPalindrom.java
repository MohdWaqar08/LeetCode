public class ValidPalindrom {
    
    public static boolean isPalindrome(String s) {
        int n  = s.length();
        if(n == 1){
            return true;
        }

        String newStr = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int len = newStr.length();

        int left = 0;
        int right = len-1;
        while(left<=right){
            if(newStr.charAt(left) == newStr.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
