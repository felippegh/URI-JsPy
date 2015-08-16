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
 
    int x1,y1,x2,y2;
    double dis;
 
    scanf(" %d %d",&x1,&y1);
    scanf(" %d %d",&x2,&y2);
 
    dis = sqrt(pow(x2 - x1,2) + pow(y2 - y1,2));
    printf("%.4lf\n",dis);
 
    return 0;
}