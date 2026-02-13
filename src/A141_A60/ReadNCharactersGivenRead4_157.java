package A141_A60;

public class ReadNCharactersGivenRead4_157  {
    /*



     */

    static void main() {



    }


    public static int read(char[] buf, int n) {
        char[] buf4 = new char[4];
        int i4 = 0; // buf4's index
        int n4 = 0; // buf4's size
        int i = 0;  // buf's index

        while (i < n) {
            if (i4 == n4) {     // All the characters in the buf4 are consumed.
                i4 = 0;           // Reset the buf4's index.
                n4 = read4(buf4); // Read <= 4 characters from the file to the buf4.
                if (n4 == 0)      // Reach the EOF.
                    return i;
            }
            buf[i++] = buf4[i4++];
        }

        return i;
    }


}
