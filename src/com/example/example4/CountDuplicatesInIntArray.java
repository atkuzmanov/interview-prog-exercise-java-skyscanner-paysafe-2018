package com.example.example4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
references:
https://stackoverflow.com/questions/17630727/counting-repeated-elements-in-an-integer-array
http://www.snippetexample.com/2015/03/count-duplicate-pairs-of-integer-in-given-array/
https://codereview.stackexchange.com/questions/203102/count-duplicates-in-a-javascript-array
 */

public class CountDuplicatesInIntArray {
       /*
     * Complete the 'countDuplicates' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static int countDuplicates(List<Integer> numbers) {
        // HashMap is good enough as we don't need TreeMap which offers natural ordering
        // Using as key each number from the list
        // Using as value the count of times this number has been encountered in the list of numbers
        Map<Integer, Integer> reps = new HashMap<Integer, Integer>();
        int result = 0;

        for(int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);

            // Using each number from the list as key
            // Maps have a unique set of keys
            // If the map already contains this integer, increment the count - the number of times this integer is encountered
            // else add it with value = 1
            if(reps.containsKey(current)) {
                reps.put(current, reps.get(current) + 1);
            } else {
                reps.put(current, 1);
            }
        }

        // Filtere trought the map and increment the duplicate counter for each key, who's value is more than 1
        // This means the key has been encountered more than once
        for(Map.Entry<Integer, Integer> e : reps.entrySet()) {
            if(e.getValue() > 1) {
                result += 1;
            }
        }

        return result;
    }
}
