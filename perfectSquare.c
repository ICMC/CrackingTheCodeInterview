#include <stdlib.h>
#include <stdio.h>
#include <math.h>

/**What is the smallest number *n* by which the given number *x* must be divided
to make it into a perfect square?
n = find_number( x )
*/
int perfectSquare(int x){
  int aux;
  float n, y,y2, aux2;
  n=1;
  while(n<=x){
    y = x/n;
    printf("y/n = %f \n", y);
    y = sqrt(y);
    printf("sqrt(y)= %f\n", y);
    y2 =y;
    aux = (int) y;
    printf("y: %f\n", y);
    printf("aux=%d\n",aux);

    aux2 = (float) aux;
    printf("%f - %f\n", y2, aux2);
    if((y2-aux2) == 0){
      return n;
    }
    n++;
  }
}

int main(){
  int n, x;
  printf("Give a value to check:\n" );
  scanf("%d", &x);

  n = perfectSquare(x);

  printf("%d must be divided by %d to be a perfect square!", x, n);
  return 0;
}
