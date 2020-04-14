package Strings;

// shift[i] = [direction, amount]:
//direction is 0 (left shift) or 1 (right shift).
//amount is the amount by which string s is to be shifted.
//A left shift by 1 means remove the first character of s and append it to the end.
//Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
//Return the final string after all operations.

public class StringShift {
    public static void main(String[] args) {

        System.out.println(shift("abc", new int[][]{{0,1}, {1,2}}));
    }

    public static String shift(String s, int[][] shift){
        for(int i = 0; i < shift.length; i++){
            if(shift[i][0] == 0)
                s = shiftLeft(s, shift[i][1]);
            else
                s = shiftRight(s, shift[i][1]);
        }
        return s;
    }
    public static String shiftLeft(String s, int amount){
        for(int i = 0; i < amount; i++){
            s = s.substring(1) + s.substring(0, 1);
        }
        return s;
    }

    public static String shiftRight(String s, int amount){
        for(int i = 0; i < amount; i++){
            s = s.substring(s.length() - 1) + s.substring(0, s.length() - 1);
        }
        return s;
    }
}
