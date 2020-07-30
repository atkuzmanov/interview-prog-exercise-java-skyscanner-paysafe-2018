package com.example.example5;

/*
references:
https://gist.github.com/mmloveaa/5c1766755ee4e74acefd
https://discuss.codechef.com/questions/6816/holes-in-a-string
https://codereview.stackexchange.com/questions/60941/clean-code-attempt-of-holes-problem-on-codechef-com
 */

public class CountHoles {
    /*
     * Complete the 'countHoles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER num as parameter.
     */

    public static int countHoles(int num) {
        String[] digits = Integer.toString(num).split("");

        // int array representing the numbers which signify holes, and the number of holes each number signifies
        // the index of the array is the representation of the number, eg index 8 represents number 8 which has 2 holes
        int[] values = new int[]{1,0,0,0,1,0,1,0,2,1};
        int sum = 0;

        for(String s : digits) {
            int index = Integer.valueOf(s);
            System.out.println(index);
            sum += values[index];
        }
        return sum;
    }
}

