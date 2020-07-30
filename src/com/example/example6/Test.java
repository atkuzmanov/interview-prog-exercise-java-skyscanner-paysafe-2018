package com.example.example6;

/*
What is the result of executing the code below?
 */

public class Test {


        public static String printMsg(){
            return "Test printMsg called";
        }

        public static void main(String args[]){
            Test obj = null;
            System.out.println(obj.printMsg());
        }

}
