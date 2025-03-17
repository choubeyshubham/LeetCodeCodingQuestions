package A61_80;

public class Sqrt_x_69 {
    /*





     */


    public static void main(String[] args) {



    }


    public static int mySqrt(long x) {
        long l = 1;
        long r = x + 1;

        while (l < r) {
            final long m = (l + r) / 2;
            if (m > x / m)
                r = m;
            else
                l = m + 1;
        }

        // l := the minimum number s.t. l * l > x
        return (int) l - 1;
    }




}
