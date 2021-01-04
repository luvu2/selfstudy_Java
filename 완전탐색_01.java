import java.util.*;

class yj_완전탐색_01 {
    public List<Integer> Solution(int[] answers) {
//        int[] answer = {};

        int Student1[] = {1,2,3,4,5};
        int Student2[] = {2,1,2,3,2,4,2,5};
        int Student3[] = {3,3,1,1,2,2,4,4,5,5};
        
        int GradesArr[] = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == Student1[i % Student1.length]){
                GradesArr[0] ++ ;
            }
            if(answers[i] == Student2[i % Student2.length]){
                GradesArr[1] ++ ;
            }
            if(answers[i] == Student3[i % Student3.length]){
                GradesArr[2] ++ ;
            }
        }
        
        // ArrayList로 만드는 것보다 유연함
        List<Integer> BestStudent = new ArrayList<Integer>();
        
        // Math.max는 2개만 비교 가능
        int Best = Math.max(Math.max(GradesArr[0], GradesArr[1]), GradesArr[2]);
        
        // add는 차례대로 넣을 때
        if(Best == GradesArr[0]){
            BestStudent.add(1);
        }
        if(Best == GradesArr[1]){
            BestStudent.add(2);
        }
        if(Best == GradesArr[2]){
            BestStudent.add(3);
        }
        
        // ArrayList 정렬
        Collections.sort(BestStudent);
        // // ArrayList는 size 배열은 length
        // answer = new int[BestStudent.size()];
        // // 인덱스 값으로 추가할 때는 get
        // for(int j=0; j<answer.length; j++){
        //     answer[j] = BestStudent.get(j);
        // }
        
        return BestStudent;
    }
}