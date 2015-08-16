/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/

#include<stdio.h>
#include<stdlib.h>
 
int main(){
 
    double vend, sal, total;
    char nome[100];
 
    scanf(" %s %lf %lf",&nome,&sal,&vend);
 
    vend *= 0.15;
    total = sal + vend;
 
    printf("TOTAL = R$ %.2lf\n",total);
 
    return 0;
}