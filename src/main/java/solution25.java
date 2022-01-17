import java.util.*;
public class solution25 {
    public static void main(String[] args) {
       long n = 121;
       long answer = 0;
       Double sqrt = Math.sqrt(n);
       if(sqrt == sqrt.intValue()){
           answer = (long)Math.pow(sqrt +1, 2);
       }else answer =  -1;

        System.out.println(answer);
    }
}
