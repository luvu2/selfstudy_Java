import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            // Step1. array �߶� newArr�� ����
            int [] newArr = new int[commands[i][1] - commands[i][0]+1];
            // commands[i][0] = i
            // commands[i][1] = j
            // commands[i][2] = k
            
            int idx = 0;
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                newArr[idx] = array[j];
                idx++;
            }
            // Step2. newArr ����
            Arrays.sort(newArr);
            // Step3. ���ĵ� newArr �� k��° ���Ҹ� answer�� �ֱ�
            answer[i] = newArr[commands[i][2]-1];
        }
        
        return answer;
    }
}