package DAY12.SESSION1;

import java.util.Scanner;

public class WebGraphAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hyperlinkCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = sc.nextInt();

                if (value == 1) {
                    hyperlinkCount++;
                }
            }
        }

        System.out.println("Number of web pages: " + n);
        System.out.println("Number of hyperlinks: " + hyperlinkCount);
    }
}