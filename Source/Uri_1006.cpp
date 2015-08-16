/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/

#include<stdio.h>
#include<stdlib.h>
 
int main(){
 
    double f, s, t,media;
 
    scanf(" %lf %lf %lf",&f,&s,&t);
 
    media = ((f * 2) + (s * 3) + (t * 5)) / 10;
 
    printf("MEDIA = %.1lf\n",media);
 
    return 0;
}