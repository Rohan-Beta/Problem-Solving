// Clear Bit
// operation: And(&) with Not(~)

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        int n = 5;
        int pos = 2;

        int bitmask = 1 << pos;
        int n1 = ~(bitmask);

        int newNum = n1 & n;
        System.out.print(newNum);
    }
}
