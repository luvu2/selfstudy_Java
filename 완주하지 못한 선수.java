import java.util.HashMap;

class yj_ÇØ½Ã_01 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        
        for(String i : participant) {
            people.put(i, people.getOrDefault(i, 0) + 1);
        }
        for(String i : completion) {
            people.put(i, people.getOrDefault(i, 0) - 1);
        }
        
        for(String j : people.keySet()) {
            if(people.get(j) != 0) {
                answer = j;
            }
        }
        
        return answer;
    }
}