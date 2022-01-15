public class solution14 {
    public static void main(String[] args) {
        int[] arr={5, 9, 7, 10};
        int divisor = 5;
        int[] answer;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer = arr;
            }
        }
    }
}
