public class solution19 {
    public static void main(String[] args) {
        int n=5;
        String answer="";
        String a ="수";
        String b = "박";
        for(int i=0; i<n; i++){
            if(i %2 == 0){
                answer = answer+a;
            } else{
                answer = answer +b;
            }
        }
        System.out.println(answer);

        }
    }

