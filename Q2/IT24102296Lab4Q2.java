import java.util.Scanner;
public class IT24102296Lab4Q2
{

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter exam marks (out of 100):");
        double examMarks=input.nextDouble();

        if(examMarks>100|| examMarks<0)
        {
            System.out.println("Invalid input for exam marks.Terminating program.");
	    return;
        }

        System.out.println("Please enter lab submission marks (out of 100):");
        double labSubmissionmark=input.nextDouble();

        if(labSubmissionmark>100|| labSubmissionmark<0)
        {
            System.out.println("Invalid input for lab submission marks.Terminating program.");
	    return;
        }

        System.out.println("Please enter the presentage given for the exam:");
        double examPresentage=input.nextDouble();

        System.out.println("Please enter the presentage given for the lab submission:");
        double labSubmissionpresentage=input.nextDouble();

        if((examPresentage + labSubmissionpresentage!=100))
        {
            System.out.println("The presentages must add up to 100.Terminating program.");
	    return;
        }

        double finalExammark= ((examMarks*examPresentage/100)+(labSubmissionmark*labSubmissionpresentage/100));
        System.out.println("Final Exam Mark is:"+finalExammark);
    }
}