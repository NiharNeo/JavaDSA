package DAY4.SESSION1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem {


    public static List<Integer> spiralOrder(int[][] arr) {

        List<Integer> res = new ArrayList<>();

        if (arr == null || arr.length == 0) {
            return res;
        }

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {

            // Top row
            for (int i = left; i <= right; i++) {
                res.add(arr[top][i]);
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                res.add(arr[i][right]);
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(arr[bottom][i]);
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(arr[i][left]);
                }
                left++;
            }
        }

        return res;
    }

    public static void main(String[] args){

        int m=3;
        int n=3;
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        List<Integer> ans = spiralOrder(arr);
        System.out.println(ans);

        //System.out.println(arr[2][2]);





    }
}
