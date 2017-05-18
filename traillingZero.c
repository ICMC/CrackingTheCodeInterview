#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int factorial(int n, int *trail, int *times){
  int val;
  if(n==0){
    return 1;
  }
  val = n*factorial(n-1,trail,times);
  int auxTime = *times;
  int auxTrail = *trail;
  printf("\n Val= %d", val);
  if(val%auxTime == 0){
    auxTrail++;
    *trail = auxTrail;
    auxTime=auxTime*10;
    *times=auxTime;
  }
  return val;
}
int main(){
  int n;
  int fac;
  int times = 10;
  int trail =0;
  printf("What number?: \n");
  scanf("%d",&n);

  fac = factorial(n, &trail, &times);
  printf("Trailing number of %d!(%d) is %d", n, fac, trail);


}
