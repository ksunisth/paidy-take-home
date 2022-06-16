/**
 * Problem:
 * Write a function that takes an Integer and 
 * returns it as a string with the correct ordinal 
 * indicator suffix (in English).
 */
package prob_1;

class P1 {
    public String intToStr(int num) {
        String ret = Integer.toString(num);
        String suff;
        int tenthNum = num % 10;
        int hundredthNum = num % 100;

        if (tenthNum == 1 && hundredthNum != 11) {
            suff = "st";
        } else if (tenthNum == 2 && hundredthNum != 12) {
            suff = "nd";
        } else if (tenthNum == 3 && hundredthNum != 13) {
            suff = "rd";
        } else {
            suff = "th";
        }

        ret = ret.concat(suff);
        return ret;
    }
}
