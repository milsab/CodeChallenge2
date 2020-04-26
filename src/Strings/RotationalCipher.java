package Strings;

// Given a string and a rotation factor, return an encrypted string.
// input = Zebra-493?
// rotationFactor = 3
// output = Cheud-726?
public class RotationalCipher {
    public static void main(String[] args) {
        System.out.print(rotationalCipher("abcdefghijklmNOPQRSTUVWXYZ0123456789", 39));
    }

    public static String rotationalCipher(String input, int rotationFactor) {

        StringBuilder sb = new StringBuilder();

        for(char c : input.toCharArray()){
            if(c - '0' >= 0 & c - '0' <= 9){
                char ch = (char)(((c + rotationFactor - '0') % 10) + '0');
                sb.append(ch);
            } else if(c - 'a' >= 0 & c - 'a' <= 26){
                char ch = (char)(((c + rotationFactor - 'a') % 26) + 'a');
                sb.append(ch);
            } else if(c - 'A' >= 0 & c - 'A' <= 26) {
                char ch = (char)(((c + rotationFactor - 'A') % 26) + 'A');
                sb.append(ch);
            } else
                sb.append(c);
        }
        return sb.toString();
    }
}
