package DAY7.SESSION2;

public class DynamicProgramming {

    static int decode(String s) {
        if (s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        int n = s.length();
        for (int i = 2; i <= n; i++) {
            int oneWay = s.charAt(i - 1) - '0';

            if (oneWay >= 1 && oneWay <= 9) {
                dp[i] = dp[i] + dp[i - 1];
            }

            int twoWays = Integer.parseInt(s.substring(i - 2, i));
            if (twoWays >= 10 && twoWays <= 26) {
                dp[i] = dp[i] + dp[i - 2];

            }


        }
        return dp[n];
    }
        public static void main (String[]args){

        }
    }

