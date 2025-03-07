public class ternaryUsecase {

    public static void main(String[] args) {
        // Ternary Operator Example
        int a = 10;
        int b = 20;

        // Ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("The maximum of " + a + " and " + b + " is: " + max);

        // Bitwise Operators Example
        int x = 5;  // Binary: 0101
        int y = 3;  // Binary: 0011

        // Bitwise AND
        int bitwiseAnd = x & y;  // 0101 & 0011 = 0001 (1 in decimal)
        System.out.println("Bitwise AND of " + x + " and " + y + " is: " + bitwiseAnd);

        // Bitwise OR
        int bitwiseOr = x | y;  // 0101 | 0011 = 0111 (7 in decimal)
        System.out.println("Bitwise OR of " + x + " and " + y + " is: " + bitwiseOr);

        // Bitwise XOR
        int bitwiseXor = x ^ y;  // 0101 ^ 0011 = 0110 (6 in decimal)
        System.out.println("Bitwise XOR of " + x + " and " + y + " is: " + bitwiseXor);

        // Bitwise NOT
        int bitwiseNot = ~x;  // ~0101 = 1010 (in two's complement, this is -6 in decimal)
        System.out.println("Bitwise NOT of " + x + " is: " + bitwiseNot);

        // Left Shift
        int leftShift = x << 1;  // 0101 << 1 = 1010 (10 in decimal)
        System.out.println("Left Shift of " + x + " by 1 is: " + leftShift);

        // Right Shift
        int rightShift = x >> 1;  // 0101 >> 1 = 0010 (2 in decimal)
        System.out.println("Right Shift of " + x + " by 1 is: " + rightShift);
    }
}