public class solution17 {
    public static boolean main(String[] args) {
        boolean answer = true;
        String[] s = {"p","P","o","o","o","y","Y"};
        for(int i = 0 ; i < s.length; i++){
            if(s[i] == "p" || s[i] == "y"){
                answer = true;
            }else{
                answer = false;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
