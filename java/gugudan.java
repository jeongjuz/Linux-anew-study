import java.util.Scanner;
public class gugudan{
public static void main(String[] args){

  System.out.println("Insert number(0:Exit) : ");
  Scanner sc= new Scanner(System.in);
  int a=sc.nextInt();
  if(a>1 && a<10){
  for(int i=1; i<10; i++)
  System.out.println(a+"*"+i+"="+a*i);
  }
  else if(a==0)
  {
    return;
  }
  else
  {
  System.out.println("Insert number 2~9. Retype Again~!!\n");
  }
}

}
