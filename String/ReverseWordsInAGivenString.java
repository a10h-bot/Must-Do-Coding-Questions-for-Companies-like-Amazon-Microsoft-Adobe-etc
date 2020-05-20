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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOftestCases = sc.nextInt() + 1;
        int count = 0;
        // final List<String> stringInputList = new ArrayList<>(noOftestCases);
        final String[] inputStringArray = new String[noOftestCases];
        int l = 0;
        while (noOftestCases-- > count) {
            String temp = sc.nextLine();
            // stringInputList.add(temp);
            inputStringArray[l++] = temp;
        }
        for (int i = 0; i < inputStringArray.length; i++) {
            System.out.println(reverseWordByWord(inputStringArray[i]));
        }
        // Arrays.stream(inputStringArray).forEach(System.out::println);
    }

    private static String reverseWordByWord(String input) {
        String[] strArray = input.split("\\.");
        int i = 0;
        int j = strArray.length - 1;
        StringBuilder outputString = new StringBuilder();
        while (i <= j) {
            String temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < strArray.length; k++) {
            if (k == strArray.length - 1) {
                outputString.append(strArray[k]);
            } else {
                outputString.append(strArray[k] + ".");
            }

        }

        return outputString.toString();
    }
}