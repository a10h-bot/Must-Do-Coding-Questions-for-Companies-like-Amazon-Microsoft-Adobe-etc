//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0

// Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

// Input:
// The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

// Output:
// For each test case, in a new line, output a single line containing the reversed String.

// Constraints:
// 1 <= T <= 100
// 1 <= |S| <= 2000

// Example:
// Input:
// 2
// i.like.this.program.very.much
// pqr.mno

// Output:
// much.very.program.this.like.i
// mno.pqr
// ** For More Input/Output Examples Use 'Expected Output' option **
public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        String inputString = "i.like.this.program.very.much";
        reverseWordByWord(inputString);
    }

    private static void reverseWordByWord(String input) {
        String[] strArray = input.split(".");
        int i = 0;
        int j = strArray.length - 1;
        while (i <= j) {
            String temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < strArray.length; k++) {
            System.out.print(strArray[i] + ".");
        }
    }
}