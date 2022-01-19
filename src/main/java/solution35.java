import java.util.ArrayList;
import java.util.Collections;
public class solution35 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strings = {"sun","bed", "car"};
        int n = 1;
        for(String string : strings){
            arrayList.add(string.charAt(n)+string);
        }
        Collections.sort(arrayList);

        String[] answer = new String[arrayList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arrayList.get(i).substring(1,arrayList.get(i).length());
            System.out.println(answer[i]);
        }

    }
}
