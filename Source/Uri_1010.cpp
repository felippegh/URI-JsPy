/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/

#include<stdio.h>
#include<stdlib.h>
 
int main(){
 
    int cp, up, cs, us;
    double pp, ps, total;
    char nome[100];
 
    scanf(" %d %d %lf %d %d %lf",&cp,&up,&pp,&cs,&us,&ps);
 
    total = (up * pp) + (us * ps);
 
    printf("VALOR A PAGAR: R$ %.2lf\n",total);
 
    return 0;
}