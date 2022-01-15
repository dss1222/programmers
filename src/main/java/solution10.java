import java.util.Scanner;
public class solution10 {
    public static void main(String[] args) {
        int[][] arr1={{1,2}, {2,3}}, arr2={{3,4},{5,6}};
        int[][] arr = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                arr[i][j] = arr1[i][j]+arr2[i][j];
                System.out.println(arr[i][j]);
            }
        }

    }
}
