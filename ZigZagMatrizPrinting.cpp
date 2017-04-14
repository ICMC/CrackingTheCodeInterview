#include <iostream>
#include <cstdlib>
/*
Suppose you have a matrix in the form of a 2 dimensional array.
Write a method to read the rows of the matrix alternatively from
right to left, left to right so on and return them as
a 1 dimensional array.

for eg:
1 2 3
4 5 6
7 8 9

should return 1 2 3 6 5 4 7 8 9
*/
int main(){
  int i, j;

  int matriz[4][4];
  // initializing matriz
  for(i=0; i<4; i++){
    for(j=0; j<4; j++){
      std::cout << "matriz[" << i << "]["<<j<<"] \n";
      std::cin >> matriz[i][j];
    }
  }
  // printing matriz
  for(i=0; i< 4; i++){
    for(j=0; j<4 ; j++){
      std::cout<< matriz[i][j]<< " ";
    }
    i++;
    for(j=3; j>=0; j--){
      std::cout << matriz[i][j] <<" ";
    }
  }

  return 0;
}
