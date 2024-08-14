import java.util.Scanner;
public class IT24102296Lab4Q2
{

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double number1,number2,number3,number4;
        System.out.println("Please enter exam marks (out of 100):");
        number1=input.nextDouble();

        if(number1>100)
        {
            System.out.println("Invalid input for exam marks.Terminating program.");
        }

        System.out.println("Please enter lab submission marks (out of 100):");
        number2=input.nextDouble();

        if(number2>100)
        {
            System.out.println("Invalid input for lab submission marks.Terminating program.");
        }

        System.out.println("Please enter the presentage given for the exam:");
        number3=input.nextDouble();

        System.out.println("Please enter the presentage given for the lab submission:");
        number4=input.nextDouble();

        if((number3+number4)>100)
        {
            System.out.println("The presentages must add up to 100.Terminating program.");
        }

        double result=(number1+number2)/2.00;
        System.out.println("Final Exam Mark is:"+result);
    }
}

