int checkprime(int num){
  int i;
  for(i=2; i<=num; i++){
    if(num % i == 0)
    break;
    else
        continue;
      }
    return i;
}
