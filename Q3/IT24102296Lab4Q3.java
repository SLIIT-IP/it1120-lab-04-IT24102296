import java.util.Scanner;
public class IT24102296Lab4Q3
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      int number;

      System.out.print("Enter a number:");
      number=input.nextInt();

      String result=(number>0)?"The number is:Possitive"
                    :(number<0)?"The number is :Negative"
                    :"The number is zero";
      
      System.out.println(result);
   }
}
