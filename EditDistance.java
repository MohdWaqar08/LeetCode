public class EditDistance {
    
    public static int minDistance(String word1, String word2){
        /* Lets assume that our: word1= "abcef" and 
            word2 = "abe" */ 
        //The 3 operations that we can perform are: Add(insert), delete(remove), replace(substitute)
        int n = word1.length();
        int m = word2.length();

        //Making a grid
        int[][] dp = new int[n+1][m+1];
        for(int[] i: dp){
            for(int j: i){
                System.out.println(j);
            }
        }

        for(int i = 1; i<=n; i++){
            dp[i][0] = i;
        }

        for(int j = 1; j<=m; j++){
            dp[0][j] = j;
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){

                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    int left = dp[i-1][j];
                    int top = dp[i][j-1];
                    int topleft = dp[i-1][j-1];

                    dp[i][j] = Math.min(topleft, Math.min(left, top)) + 1;
                }
            }
        }

        return dp[n][m];

    }

    public static void main(String[] args) {
        minDistance("abcef", "abe");
    }

}


