package BitManipulation;

//Given a positive integer, output its complement number.
//The complement strategy is to flip the bits of its binary representation.
//
//Example 1:
//Input: 5
//Output: 2
//Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010.

public class NumberComplement {

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num){
        int aux = num;
        int bit = 1;

        while(aux != 0){
            num = num ^ bit;
            bit = bit << 1;
            aux = aux >> 1;
        }

        return num;
    }
}
