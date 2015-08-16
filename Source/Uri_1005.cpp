/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/

#include<stdio.h>
#include<stdlib.h>
 
int main(){
 
    double f,s,media;
 
    scanf(" %lf %lf",&f,&s);
 
    media = ((f * 0.35) + (s * 0.75)) / 1.1;
 
    printf("MEDIA = %.5lf\n",media);
 
    return 0;
}