package ArraysQuestions;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(find("aaaabbaa"));
    }
    static int start;
    static int maxLength = Integer.MIN_VALUE;
    public static String find(String s){
        for(int i = 0; i < s.length(); i++){
            helper(s, i - 1, i + 1);
            helper(s, i, i + 1);
        }

        return s.substring(start, start + maxLength);
    }

    public static void helper(String s, int head, int tail){
        while(head >= 0 && tail < s.length() && s.charAt(head) == s.charAt(tail)){

            int len = tail - head + 1;
            if(len > maxLength){
                maxLength = len;
                start = head;
            }
            head--;
            tail++;
        }
    }
}
