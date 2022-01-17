public class solution27 {
    public static void main(String[] args) {
        int num = 626331;
        int answer = 0;

        while(num != 1){
        if(num % 2 == 0){
            num /= 2;
        }else{
            num = 3*num +1;
        }
        answer ++;
        if(answer == 500){
            answer =-1;
            break;
        }
        }
        System.out.println(answer);
    }
}
