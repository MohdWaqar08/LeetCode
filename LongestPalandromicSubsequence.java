public class LongestPalandromicSubsequence {
    
    public static int longestPalandromicSubsequence(String s){
        int n = s.length();
        int[][] dp = new int[n][n];

        //Base Case: single char
        for(int i = 0; i<n; i++){
            dp[i][i] = 1;
        }
        //1
        System.out.println("1\n");
        print2DArray(dp);


        //Fill the table
        for(int len = 2; len <=n; len++){
            for(int i = 0; i<=n-len; i++){
                int j = i+len-1;

                if(s.charAt(i)==s.charAt(j)){
                    if(len==2){
                        //2
                        dp[i][j] = 2;
                        System.out.println("2\n");
                        print2DArray(dp);
                    } else {
                        //3
                        dp[i][j] = dp[i+1][j-1]+2;
                        System.out.println("3\n");
                        print2DArray(dp);
                    }
                } else {
                    //4
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                    System.out.println("4\n");
                    print2DArray(dp);
                }
            }
        }

        return dp[0][n-1];
    }

    public static void main(String[] args) {
        String s = "bbbab";
        int ans = longestPalandromicSubsequence(s);
        System.out.println(ans);
    }

    public static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) { // Loop through rows
            for (int j = 0; j < arr[i].length; j++) { // Loop through columns
                System.out.print(arr[i][j] + " "); // Print element with a space
            }
            System.out.println(); // Start a new line after each row
        }
    }
}
