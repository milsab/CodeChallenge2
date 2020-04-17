package ArraysQuestions;


//Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:
//
//Any left parenthesis '(' must have a corresponding right parenthesis ')'.
//Any right parenthesis ')' must have a corresponding left parenthesis '('.
//Left parenthesis '(' must go before the corresponding right parenthesis ')'.
//'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
//An empty string is also valid.


public class ValidParenthesisString {
    public static void main(String[] args) {
        System.out.println(checkValidity("(*)))*"));
    }

    public static boolean checkValidity(String s){
        int low = 0;
        int high = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                low++;
                high++;
            } else if(c == ')'){
                low = Math.max(low - 1, 0);
                high--;
            } else{
                low = Math.max(low - 1, 0);
                high++;
            }
            if(high < 0)
                return false;
        }
        return low == 0;
    }
}
