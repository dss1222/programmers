import java.util.*;
import java.io.*;
public class solution24 {
    public static void main(String[] args) {
        long n = 118372;
        String s = String.valueOf(n);
        String ansnum= "";
        long answer;
        char[] arr = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] += s.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            ansnum += arr[i];
        }
        System.out.println(ansnum);
    }
}