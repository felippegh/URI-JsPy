/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/

#include<stdio.h>
#include<stdlib.h>
#include<math.h>
 
int main(){
 
    int distanc;
    double gas;
 
    scanf(" %d %lf",&distanc,&gas);
    gas = distanc / gas;
    printf("%.3lf km/l\n",gas);
 
    return 0;
}