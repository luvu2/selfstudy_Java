class Solution {
    public static int solution(String name) {
        int answer = 0;
        
        int len = name.length();
        
        // 최소 조작
        int min_move = len-1;
        
        // 위, 아래로 조이스틱 움직이는 경우
        for (int i=0; i < len; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z'- name.charAt(i) + 1);
            //name.charAt(i) -> i번째 str을 char로 변환
            //Math.min(A, B) -> A와 B 중 최솟값 리턴
            // i번째 알파벳을 위, 아래로 조작할 때 최솟값 구하기

            
            // A가 연속으로 등장할 경우
            int next = i+1;
            while(next < len && name.charAt(next) == 'A')
                next++;
            min_move = Math.min(min_move, (i*2)+(len-next));
            // i*2 : 내 위치에서 첫 위치로 돌아가기
            // len-next : A가 연속으로 나오는 지점의 다음(next)을 끝(len)에서 계산
        }
        
        answer += min_move;
        
        return answer;
    }
}