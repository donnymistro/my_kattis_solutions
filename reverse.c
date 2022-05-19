#include <stdlib.h>
#include <stdio.h>
/**
* This file takes an input that is the number of integer elements,
* followed by a stream of elements based on that input and
* reverses their order after they are stored into an array.
*
*@author Donald Lanoux
*/
int main(void){
  // Declare variables that will bbe used
  int inputSize = 0;
  int counter = 0;
  int temp = 0;
  // Get the first number that is needed to construct the numsArray.
  scanf("%d\n", &inputSize);
  // Construct the array
  int numsArray[inputSize];
  // Now get the rest of the numbers and put them into numsArray.
  while(counter <= inputSize){
    scanf("%d\n", &temp);
    numsArray[counter] = temp;
    counter++;
  }
  // Finally, print out the array in reverse order
  for(int i = inputSize - 1; i >= 0; i--){
    printf("%d\n", numsArray[i]);
  }
return 0;
}
