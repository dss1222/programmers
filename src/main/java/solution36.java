import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class solution36 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        Character [] arr = new Character [s.length()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        s = "";
        for(int i=0; i<arr.length; i++) {
            s += arr[i];
        }
        System.out.println(s);

    }
}
