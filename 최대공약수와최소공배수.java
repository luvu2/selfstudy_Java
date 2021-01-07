class yj_최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        int max = 1;
		
		int range = Math.min(n, m);
		
		for(int i=1; i<=range; i++) {
			if(n%i==0 && m%i==0) {
				max = i;
			}
		}
        
        int min = n * m / max;
        
        answer = new int[2];
        
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    }
}