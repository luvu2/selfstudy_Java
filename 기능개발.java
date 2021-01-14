import java.util.*;

class Solution {    
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> periods = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            int days = (100-progresses[i]) / speeds[i];
            if ((100-progresses[i]) % speeds[i] != 0) {
                days ++;
                periods.add(days);
            } else {
                periods.add(days);
            }
        }
        
        ArrayList<Integer> answerList = new ArrayList<>();
        
        int cnt = 1;
        int j=0;
        
        while(true){
            if(periods.get(j) >= periods.get(j+1)){
                periods.remove(j+1);
                cnt++;
            }
            else{
                j++;
                answerList.add(cnt);
                cnt = 1;
            }

            if(periods.size() - 1 == answerList.size()){
                answerList.add(cnt);
                break;
            }
        }
        
        return answerList;
    }
}