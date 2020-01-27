package ArraysQuestions;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("geeksforgeeks", "forgeeksgeeks"));
    }

    public static boolean isAnagram(String s1, String s2){
        int[] chars = new int[26];

        for(int i : s1.toCharArray()){
            chars[i - 'a']++;
        }

        for(int i : s2.toCharArray()){
            chars[i - 'a']--;
        }

        for(int x : chars){
            if(x != 0)
                return false;
        }
        return true;
    }
}
