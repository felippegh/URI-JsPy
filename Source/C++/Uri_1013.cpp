/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/

#include<stdio.h>
#include<stdlib.h>
 
int main(){
 
    int a,b,c;
 
    scanf(" %d %d %d",&a,&b,&c);
 
    if((a > b)&&(a > c))
        printf("%d eh o maior\n",a);
    else if((b > a)&&(b > c))
        printf("%d eh o maior\n",b);
    else
        printf("%d eh o maior\n",c);
 
    return 0;
}