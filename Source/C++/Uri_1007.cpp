/*
 *Solved by: Felippe George Haeitmann
 *Email: felippegeorge@utexas.edu
 *Problem source: urionlinejudge.com.br
 *
 
**/

#include<stdio.h>
#include<stdlib.h>
 
int main(){
 
    int pri, seg, ter, qua, dif;
 
    scanf(" %d %d %d %d",&pri,&seg,&ter,&qua);
 
    dif = ((pri * seg) - (ter * qua));
 
    printf("DIFERENCA = %d\n",dif);
 
    return 0;
}