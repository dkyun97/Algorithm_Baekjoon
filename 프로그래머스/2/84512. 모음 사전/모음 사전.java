class Solution {
    private static int answer = 0;
    private static String targetWord;
    private static boolean found = false;
    private static final String vowels = "AEIOU";

    public int solution(String word) {
        answer = 0;
        found = false;
        targetWord = word;
        
        dfs("");
        return answer;
    }
    
    private void dfs(String current) {
        if (found) {
            return;
        }

        if (current.equals(targetWord)) {
            found = true;
            return;
        }

        if (current.length() == 5) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            answer++;
            dfs(current + vowels.charAt(i));
            if (found) {
                return;
            }
        }
    }
}