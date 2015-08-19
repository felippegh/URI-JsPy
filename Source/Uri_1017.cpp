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
 
    double tempog,media,total;
 
    scanf(" %lf %lf",&tempog,&media);
 
    total = (media * tempog) / 12;
    printf("%.3lf\n",total);
 
    return 0;
}