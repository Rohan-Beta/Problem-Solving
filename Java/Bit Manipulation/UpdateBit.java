// Update Bit

// For make bit 0
// operation: And(&) with Not(~)

// For make bit 1
// operation: Or(|)

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        int n = 5; // 0101
        int pos = 1;

        int bitmask = 1 << pos;
        int op = 1;

        if(op == 0) {
            // set bit

            int not = ~(bitmask);
            int newNum = not & n;

            System.out.print(newNum);
        }
        else { // op == 1
            // clear bit

            int newNum = bitmask | n;
            System.out.print(newNum);
        }
    }
}
