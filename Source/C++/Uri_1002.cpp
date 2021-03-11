/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/
#include<stdio.h>
#include<stdlib.h>
#define PI 3.14159
 
int main(){
 
    double r,A;
 
    scanf("%lf",&r);
    A = (PI *( r * r));
    printf("A=%.4lf\n",A);
 
    return 0;
}