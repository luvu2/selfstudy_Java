import java.util.*;

class yj_����Ž��_01 {
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
        
        // ArrayList�� ����� �ͺ��� ������
        List<Integer> BestStudent = new ArrayList<Integer>();
        
        // Math.max�� 2���� �� ����
        int Best = Math.max(Math.max(GradesArr[0], GradesArr[1]), GradesArr[2]);
        
        // add�� ���ʴ�� ���� ��
        if(Best == GradesArr[0]){
            BestStudent.add(1);
        }
        if(Best == GradesArr[1]){
            BestStudent.add(2);
        }
        if(Best == GradesArr[2]){
            BestStudent.add(3);
        }
        
        // ArrayList ����
        Collections.sort(BestStudent);
        // // ArrayList�� size �迭�� length
        // answer = new int[BestStudent.size()];
        // // �ε��� ������ �߰��� ���� get
        // for(int j=0; j<answer.length; j++){
        //     answer[j] = BestStudent.get(j);
        // }
        
        return BestStudent;
    }
}