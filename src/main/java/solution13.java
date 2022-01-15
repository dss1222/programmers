public class solution13 {
    public static void main(String[] args) {
        int total = 0;
        int a = 5;
        int b= 24;
        String w[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int m[] = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        for(int i =0;i<a-1;i++){
            total += m[i];
        }
        total += b-1;
        String answer = w[total%7];
        System.out.println(answer);
    }
}
