// Clear Bit
// operation: And(&) with Not(~)

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        int n = 5;
        int pos = 2;

        int bitmask = 1 << pos;
        int not = ~(bitmask);

        int newNum = not & n;
        System.out.print(newNum);
    }
}
