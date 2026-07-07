public class WordSearch {

    static int m, n;
    static char[][] board;

    public static boolean find(int i, int j, String word, int idx) {

        // Base case: whole word matched
        if (idx == word.length()) return true;

        // Boundary + visited + character mismatch check
        if (i < 0 || j < 0 || i >= m || j >= n ||
            board[i][j] == '$' ||
            board[i][j] != word.charAt(idx)) {
            return false;
        }

        // Mark current cell as visited
        char temp = board[i][j];
        board[i][j] = '$';

        // Explore all 4 directions
        boolean found =
                find(i + 1, j, word, idx + 1) || // down
                find(i - 1, j, word, idx + 1) || // up
                find(i, j + 1, word, idx + 1) || // right
                find(i, j - 1, word, idx + 1);   // left

        // Backtrack (restore original value)
        board[i][j] = temp;

        return found;
    }

    public boolean exist(char[][] b, String word) {
        board = b;
        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && find(i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        
    }
}
