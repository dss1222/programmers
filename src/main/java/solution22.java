public class solution22 {
    public static void main(String[] args) {
        int n = 123;
        int a = 0;
        while(n != 0){
            a += n%10;
            n /= 10;
        }
        System.out.println(a);
    }
}
