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
 
    double a,b,c,tri,cir,tra,qua,ret;
 
    scanf(" %lf %lf %lf",&a,&b,&c);
 
    tri = 0.5 * a * c;
    cir = PI * (c * c);
    tra = ((a + b) * c) / 2;
    qua = b * b;
    ret = a * b;
 
    printf("TRIANGULO: %.3lf\nCIRCULO: %.3lf\nTRAPEZIO: %.3lf\nQUADRADO: %.3lf\nRETANGULO: %.3lf\n",tri,cir,tra,qua,ret);
 
    return 0;
}