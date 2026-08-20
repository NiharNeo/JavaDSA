package DAY4.SESSION1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SprialOder2 {
    public static List<Integer> spiralOrder(int arr[][]) {


        List<Integer> res = new ArrayList<>();
        //int res[][] = new int[n][n];

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n*n][n*n];

        for (int i=0;i<n*n;i++){
            for (int j =0;j<n*n;j++){
                arr[i][j] = i+1;

            }
        }

        List<Integer> ans = spiralOrder(arr);
        System.out.println(ans);

    }
}
