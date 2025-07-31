import java.util.*;
class Solution {
    Set<Integer> numSet = new HashSet<>();
    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        dfs("",numbers,visited);
        return numSet.size();
    }
    
    private void dfs(String current,String str,boolean[] visited){
        if(!current.equals("")){
            int num = Integer.parseInt(current);
            if (isPrime(num)) {
                numSet.add(num);
            }
        }
        for(int i = 0;i < str.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(current + str.charAt(i),str,visited);
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}