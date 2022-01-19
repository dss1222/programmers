import java.util.ArrayList;
public class solution38 {
    public static void main(String[] args) {
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        String[] word = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        String s = "one4seveneight";
        for(int i=0; i<=9; i++){
            s = s.replace(word[i],num[i]);
        }
        int answer = Integer.parseInt(s);
        System.out.println(answer);
    }
}
