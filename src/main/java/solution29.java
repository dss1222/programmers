public class solution29 {
    public static void main(String[] args) {
        String ans="";
        int x = 45;
        while(x>0){
            ans=(x%3)+ans;
            x /=3;
        }
        StringBuffer sb = new StringBuffer(ans);
        String reverse = sb.reverse().toString();
        int answer = 0;
        for(int i=0; i<reverse.length(); i++){
            answer += (int)(Integer.parseInt(String.valueOf(reverse.charAt(reverse.length()-1-i)))*Math.pow(3,i));
        }
        System.out.println(answer);
    }
}
