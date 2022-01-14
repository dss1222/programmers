public class solution4 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b){
            for(int i=b; i<=a;i++){
                answer = answer+i;
            }
        }
        else if (b > a){
            for(int j=a; j<=b; j++){
                answer = answer+j;
            }
        }
        else if(a==b){
            answer=a;
        }
        return answer;
    }
}
