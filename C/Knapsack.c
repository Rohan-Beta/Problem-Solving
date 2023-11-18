// knapsack
// greedy algorithm

#include<stdio.h>
#include<stdlib.h>

int main() {

    int arr[5][2];
    int num = 1;
    int sum = 0;
    int s = 0;

    printf("Enter value with weight in descending order\n");

    for(int i = 0; i < 5; i += 1) {
        for(int j = 0; j < 2; j += 1){
            if(j == 0) {
                printf("Enter value of %d index: " , num);
                scanf("%d" ,&arr[i][j]);
            }
            else if(j == 1) {
                printf("Enter weight of %d index: " , num);
                scanf("%d" ,&arr[i][j]);
            }
        }
        num += 1;
    }

    for(int i = 0; i < 5; i += 1) {
        for(int j = 0; j < 2; j += 1) {
            printf("%d " , arr[i][j]);
        }
        printf("\n");
    }

    for(int i = 0; i < 5; i += 1) {
        for(int j = 0; j < 2; j += 1) {

            if(j == 1) {
                sum += arr[i][j];
            }
        }
        if(sum <= 20) { // 20 is the max capacity of total weight
            s += arr[i][0];
        }
        printf("%d " , sum);
    }

    printf("\n");
    printf("sum of weight is: %d" , sum);
    printf("\n");
    printf("sum of value according to their weight %d " , s);
}
