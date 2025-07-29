import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> array = new ArrayList<>();
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5}; // 이 배열의 길이가 8이므로 student2[i % student2.length]를 사용해야 합니다.
        int[] student3 = {3,3,1,1,2,2,4,4,5,5}; // 이 배열의 길이가 10이므로 student3[i % student3.length]를 사용해야 합니다.
        int[] answer = new int[3];
        
        for(int i = 0;i < answers.length; i++){
            if(student1[i % student1.length] == answers[i]){
                answer[0] += 1;
            }
            if(student2[i % student2.length] == answers[i]){ // 여기가 수정되었습니다.
                answer[1] += 1;
            }
            if(student3[i % student3.length] == answers[i]){ // 여기가 수정되었습니다.
                answer[2] += 1;
            }
        }
        System.out.println(answer[0]);
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < answer.length; i++){
            if(answer[i] > max){
                max = answer[i];
            }
        }
        
        for(int i = 0;i < answer.length; i++){
            if(answer[i] == max){
                array.add(i+1);
            }
        }       
        
    
        int[] result = new int[array.size()];
        for(int i = 0; i < array.size(); i++) {
            result[i] = array.get(i);
        }
        return result;
    }
}