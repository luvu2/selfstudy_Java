class yj_시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length();i++) {
            // 대문자
            if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
                // n을 더한 값 > 26
                if((char)(s.charAt(i)+n)>'Z')
                    answer += (char)((s.charAt(i)+n) - 26);
                // n을 더한 값 <= 26
                else
                    answer += (char)(s.charAt(i)+n);
            // 소문자
            } else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
                // n을 더한 값 > 26
                if((char)(s.charAt(i)+n)>'z')
                    answer += (char)((s.charAt(i)+n) - 26);
                else
                    answer += (char)(s.charAt(i)+n);
            // 공백 처리
            } else if(s.charAt(i) == ' ')
                answer += " ";
        }
        return answer;
    }
}