import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            // Step1. array 잘라서 newArr에 저장
            int [] newArr = new int[commands[i][1] - commands[i][0]+1];
            // commands[i][0] = i
            // commands[i][1] = j
            // commands[i][2] = k
            
            int idx = 0;
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                newArr[idx] = array[j];
                idx++;
            }
            // Step2. newArr 정렬
            Arrays.sort(newArr);
            // Step3. 정렬된 newArr 중 k번째 원소를 answer에 넣기
            answer[i] = newArr[commands[i][2]-1];
        }
        
        return answer;
    }
}