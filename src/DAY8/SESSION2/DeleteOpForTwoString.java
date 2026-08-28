package DAY8.SESSION2;
import java.util.Arrays;
public class DeleteOpForTwoString {

        static int lcs(String S1, String S2) {
            int m = S1.length();
            int n = S2.length();

            if(S1.length() == S2.length() && S1 == S2){
                return 0;

            }

            int[][] dp = new int[m + 1][n + 1];

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    else {
                        dp[i][j] = Math.max(dp[i - 1][j],
                                dp[i][j - 1]);
                    }
                }
            }

            int lcs=2*dp[m][n];
            return m+n-lcs;
        }


        public static void main(String[] args)
        {
            String S1 = "a";
            String S2 = "a";
            System.out.println( lcs(S1, S2));
        }
    }

