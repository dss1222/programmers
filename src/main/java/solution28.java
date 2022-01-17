public class solution28 {
    public static void main(String[] args) {
        int x = 12;
        boolean answer;
        String s = String.valueOf(x);
        int sum = 0;
        for(int i=0; i<s.length();i++){
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if(x%sum==0){
            answer = true;
        }else{
            answer = false;
        }
    }
}
