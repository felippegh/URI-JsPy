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
 
    int n, anos, meses;
 
    scanf(" %d",&n);
 
    anos = (n / 365);
    n -= anos * 365;
    meses = n / 30;
    n -= meses * 30;
 
    printf("%d ano(s)\n",anos);
    printf("%d mes(es)\n",meses);
    printf("%d dia(s)\n",n);
 
    return 0;
}