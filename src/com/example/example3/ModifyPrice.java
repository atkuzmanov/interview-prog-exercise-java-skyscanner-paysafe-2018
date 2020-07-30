package com.example.example3;

/*
references:
https://gist.github.com/mmloveaa/a17f416212d68edd6a4b701b47663331
https://github.com/spdeepak/hackerrank/blob/master/src/main/java/com/deepaksp/hackerrank/interview/modifyprices/ModifyPrices.java
 */


import java.util.List;

public class ModifyPrice {

        /*
     * Complete the 'verifyItems' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY origItems
     *  2. FLOAT_ARRAY origPrices
     *  3. STRING_ARRAY items
     *  4. FLOAT_ARRAY prices
     */

    public static int verifyItems(List<String> origItems, List<Float> origPrices, List<String> items, List<Float> prices) {
        int count = 0;
        for (String actItems : items) {
            int oItems = origItems.indexOf(actItems);
            float oPrices = origPrices.get(oItems);
            int actItemsIndex = items.indexOf(actItems);
            if (oPrices != prices.get(actItemsIndex)) {
                count++;
            }
        }
        // debug code commented out below
        // System.out.println(count);
        return count;
    }


}
