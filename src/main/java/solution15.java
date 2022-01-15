public class solution15 {
    public static void main(String[] args) {
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};
        int temp=0;
        int sum=0;
        for(int i=0; i<a.length; i++){
            temp=a[i]*b[i];
            sum = sum+temp;
        }
        System.out.println(sum);
        }
}
