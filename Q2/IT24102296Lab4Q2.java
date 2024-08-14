import java.util.Scanner;
public class IT24102296Lab4Q2
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      double number1,number2,number3,number4;

      System.out.println("Please enter exam marks(out of 100):");
      number1=input.nextDouble();

      System.out.println("Please enter lab submission marks(out of 100):");
      number2=input.nextDouble();

      System.out.println("Please enter the presentage given for the exam:");
      number3=input.nextDouble();

      System.out.println("Please enter the presentage given for the lab submission:");
      number4=input.nextDouble();

      Double result=(number1+number2)/2;
      System.out.println("Final exam mark is:"+result);
   }
}
      