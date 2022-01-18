import java.util.ArrayList;

public class solution33 {
    public static void main(String[] args) {
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,45,1,6,19};
        int min = 0;
        int max = 0;
        int[] rank = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if( lottos[i] == win_nums[j]){
                    min++;
                }
            }
        }
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(lottos[i]==0){
                    if(lottos[i] != win_nums[j]){
                        lottos[i] = win_nums[j];
                    }
                }
            }
        }
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(lottos[i]==win_nums[j]){
                    max++;
                }
            }
        }
        rank[0] = max;
        rank[1] = min;
        for(int i = 0 ; i<2; i++){
            if(rank[i]==6){
                rank[i] = 1;
            }else if(rank[i]==5){
                rank[i] = 2;
            }else if(rank[i]==4){
                rank[i] = 3;
            }else if(rank[i]==3){
                rank[i] = 4;
            }else if(rank[i]==2){
                rank[i] = 5;
            }else{
                rank[i] = 6;
            }
            System.out.println(rank[i]);
        }
    }
}
