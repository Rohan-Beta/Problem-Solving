// Get Bit
// operation: and(&)

// 0 1 0 1
// 1 0 0 0

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        int n = 5; // 0101
        int pos = 2;
        int bitmask = 1 << pos;

        if((bitmask & n) == 0) {
            System.out.print("zero");
        }
        else {
            System.out.print("one");
        }
    }
}
