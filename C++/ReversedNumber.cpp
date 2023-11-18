// revered number
// c++

#include<iostream>
using namespace std;

int main() {

    int n = 1234;

    int reversed = 0;
    int lastdigit;

    while(n > 0) {
        lastdigit = n % 10;
        reversed = reversed*10 + lastdigit;

        n /= 10;
    }
    cout << reversed;
}
