#include <stdio.h>
#include "libprime.h"
int main() {
  while (1){
    int num;
    printf("\ninput integer => ");
    scanf("%d",&num);
    if(num== 0)
    break;

    if(checkprime(num)==num)
    printf("%d is a prime number",num);

    else
    printf("%d is not prime number",num);
}
  return 0;

}
