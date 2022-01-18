import java.util.*;
public class solution31 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        int temp = 0;
        //만약 앞에것과 뒤에 것이 같다면 나올수 없는 -1을 저장해둠
        for(int i =1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                arr[i-1] = -1;
            }
        }
        // 중복되서 -1로 바꾼 값을 제외하고 arrayList에 넣기
        for (int i : arr) {
            if(i != -1){
                arrayList.add(i);
            }
        }
        //다시 배열에 할당하여 return
        int[] answer = new int[arrayList.size()];
        for(int i =0; i< answer.length; i++){
            answer[i] = arrayList.get(i);
        }

    }
}
