/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/

#include<stdio.h>
#include<stdlib.h>
 
int main(){
 
    int num, hrs;
    double phr, sal;
 
    scanf(" %d %d %lf",&num,&hrs,&phr);
 
    sal = hrs * phr;
 
    printf("NUMBER = %d\nSALARY = U$ %.2lf\n",num,sal);
 
    return 0;
}