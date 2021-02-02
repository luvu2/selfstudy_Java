class Solution {
    public static int solution(String name) {
        int answer = 0;
        
        int len = name.length();
        
        // �ּ� ����
        int min_move = len-1;
        
        // ��, �Ʒ��� ���̽�ƽ �����̴� ���
        for (int i=0; i < len; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z'- name.charAt(i) + 1);
            //name.charAt(i) -> i��° str�� char�� ��ȯ
            //Math.min(A, B) -> A�� B �� �ּڰ� ����
            // i��° ���ĺ��� ��, �Ʒ��� ������ �� �ּڰ� ���ϱ�

            
            // A�� �������� ������ ���
            int next = i+1;
            while(next < len && name.charAt(next) == 'A')
                next++;
            min_move = Math.min(min_move, (i*2)+(len-next));
            // i*2 : �� ��ġ���� ù ��ġ�� ���ư���
            // len-next : A�� �������� ������ ������ ����(next)�� ��(len)���� ���
        }
        
        answer += min_move;
        
        return answer;
    }
}