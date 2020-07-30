package com.example.example1;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// WIP PSEUDO CODE, NOT ACTUALLY WORKING

public class SkyscannerInterviewStringBrackets20181012 {


    public static void main(String args[] ) throws Exception {

    }


    static void printBrackets(int numberOfBrackets, StringBuilder sb) {
        if(isStringOfBracketsValid(sb.toString())) {

            sb.append(")");
            printBrackets(numberOfBrackets-1, sb);

            sb.deleteCharAt(sb.toString().length()-1);

            sb.append("(");


            printBrackets(numberOfBrackets-1, sb);

        } else {
            return;
        }

        // (()
        // ()()

    }


    static boolean isStringOfBracketsValid(String toValidate) {
        if(toValidate.isEmpty()) return false;

        Stack<Character> bracketStack = new Stack<Character>();

        char[] brackets = toValidate.toCharArray();

        int leftBracketCounter = 0;
        int rightBracketCounter = 0;

        for(char c : brackets) {
            if(c == '(') {
                bracketStack.push(c);
                leftBracketCounter++;
            } else {
                if(bracketStack.isEmpty()) return false;

                char topOfBrackets = bracketStack.pop();

                if(topOfBrackets == '(') return false;
            }
            rightBracketCounter++;
        }

        return bracketStack.isEmpty();
    }


    // "()"
    // Invalid examples:
    // "(()"
    // ")()"
    // "("
    // ")"
    // "(((((())))))"

}

