// Set Bit
// operation: or(|)

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        int n = 5; // 0101
        int pos = 1;

        int bitmask = 1 << pos;
        int newNum = bitmask | n;

        System.out.print(newNum);
    }
}
