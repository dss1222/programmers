public class solution12 {
    public static void main(String[] args) {
        int price = 3, money = 20, count = 4, result=10;
        int sum = 0;
        int answer;
        for(int i=1; i<=count; i++){
            sum = 3*i+sum;
        }
        if(money > sum) {
            answer = 0;
        }else{
            answer = sum-money;
        }
        System.out.println(answer);
    }
}
