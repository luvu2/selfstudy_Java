class yj_������ȣ {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length();i++) {
            // �빮��
            if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
                // n�� ���� �� > 26
                if((char)(s.charAt(i)+n)>'Z')
                    answer += (char)((s.charAt(i)+n) - 26);
                // n�� ���� �� <= 26
                else
                    answer += (char)(s.charAt(i)+n);
            // �ҹ���
            } else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
                // n�� ���� �� > 26
                if((char)(s.charAt(i)+n)>'z')
                    answer += (char)((s.charAt(i)+n) - 26);
                else
                    answer += (char)(s.charAt(i)+n);
            // ���� ó��
            } else if(s.charAt(i) == ' ')
                answer += " ";
        }
        return answer;
    }
}