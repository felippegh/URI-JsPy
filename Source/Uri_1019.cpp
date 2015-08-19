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
 
    int n, hor,minu;
 
    scanf(" %d",&n);
 
    hor = (n / 3600);
    n -= hor * 3600;
    minu = n / 60;
    n -= minu * 60;
 
    printf("%d:%d:%d\n",hor,minu,n);
 
    return 0;
}