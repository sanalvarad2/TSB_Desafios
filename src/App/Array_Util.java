package App;

import java.util.Arrays;

public class Array_Util {
    public static long median(Long[] l)
    {
        Arrays.sort(l);
        int middle = l.length / 2;
        if (l.length % 2 == 0)
        {
            long left = l[middle - 1];
            long right = l[middle];
            return (left + right) / 2;
        }
        else
        {
            return l[middle];
        }

    }

    public static int average(Long[] l){
        long sum= 0;
        for (Long x: l) {
            sum += x;
        }
        int avg = (int)(sum/l.length);
        return avg;
    }

    public static String getMatch(Long[] l, Long[] match){
        String retVal = "";
        Arrays.sort(l);
        for (long ma: match ) {
            if( Arrays.binarySearch(l, ma) >= 0){
                retVal += "1";
            }else {
                retVal += "0";
            }
        }
        return retVal;
    }

}
