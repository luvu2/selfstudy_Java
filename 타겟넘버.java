class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = DFS(numbers, 0, 0, target);
        return answer;
    }
    
    public int DFS(int[] numbers, int idx, int sum, int target) {
        if (idx == numbers.length) {
          return (sum == target) ? 1 : 0;
        } else {
             return DFS(numbers, idx+1, sum + numbers[idx], target)
                    + DFS(numbers, idx+1, sum - numbers[idx], target);   
        }
    }
}